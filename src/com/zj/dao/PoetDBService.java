/* ----------------------------------------------------------------------------------------
 * 说明：唐诗数据查询服务
 * 作者：朱军
 * 时间：2015.5.29
 ----------------------------------------------------------------------------------------- */

package com.zj.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.zj.model.Poetries;
import com.zj.model.Poets;

public class PoetDBService
{
	public SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}


	/* -------------------------------------------------------------------------------------- 
 * 功能:根据作者姓名查询诗人诗词
 * ---------------------------------------------------------------------------------------- */
	@Test
	public List findByAuthor(String author) 
	{
		String sql="select a.*  from poetries a  join poets b on b.id=a.poet_id where b.name='"+author+"'";
		
		Session mySession=sessionFactory.openSession();
		Transaction ts=mySession.beginTransaction();
		SQLQuery query=mySession.createSQLQuery(sql);

		query.addEntity(Poetries.class);
		List <Poetries>myList=query.list();
		ts.commit();
		mySession.close();
		return myList;
		}
	
	
	/* -------------------------------------------------------------------------------------- 
	 * 功能:根据诗词标题查询诗词
	 * ---------------------------------------------------------------------------------------- */
	public Poetries findByTitle(String title)
	{
		Session mySession = sessionFactory.openSession();	
		Transaction ts = mySession.beginTransaction();

		Criteria cr=mySession.createCriteria(Poetries.class);
        Criterion con1=Restrictions.like("title","%"+title+"%");     // 增加 title为查询条件
        cr.add(con1);
		List<Poetries> aList=cr.list();

		if(aList.size()>0)
		{
		   ((Poetries) aList.get(0)).setAuthor(aList.get(0).getPoets().getName());
		   ts.commit(); // 提交事务
		   mySession.close();
		   return aList.get(0);
		}
		else
		{
			ts.commit(); // 提交事务
			mySession.close();
			return null;
		}
		
	}
	
	
	/* -------------------------------------------------------------------------------------- 
	 * 功能:根据诗词内容查询诗人诗词
	 * ---------------------------------------------------------------------------------------- */
	public Poetries findByContent(String content)
	{
		Session mySession = sessionFactory.openSession();	
		Transaction ts = mySession.beginTransaction();
        Criteria cr=mySession.createCriteria(Poetries.class);
        Criterion con1=Restrictions.like("content","%"+content+"%");     // 增加 content为查询条件
        cr.add(con1);
		List<Poetries> aList=cr.list();
		
		if(aList.size()>0)
		{
		   ((Poetries) aList.get(0)).setAuthor(aList.get(0).getPoets().getName());
		   ts.commit(); // 提交事务
		   mySession.close();
		   return aList.get(0);
		}
		else
		{
		   ts.commit(); // 提交事务
		   mySession.close();
		   return null;
		}
		
	}
	
	/* -------------------------------------------------------------------------------------- 
	 * 功能:根据诗人id查询诗人姓名
	 * ---------------------------------------------------------------------------------------- */
	public String findAuthor(int authorID)
	{
		Session mySession = sessionFactory.openSession();	
		Transaction ts = mySession.beginTransaction();
        Criteria cr=mySession.createCriteria(Poets.class);
        Criterion con1=Restrictions.eq("id",authorID);     // 增加 ID为查询条件
        cr.add(con1);
		List<Poets> aList=cr.list();
		ts.commit(); // 提交事务
		mySession.close();
		
		if(aList.size()>0)
		{
		   return aList.get(0).getName();
		}
		else
		{
			return null;
		}
	}
	


}
