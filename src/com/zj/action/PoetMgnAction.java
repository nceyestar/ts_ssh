/* ----------------------------------------------------------------------------------------
 * 说明：唐诗Action
 * 作者：朱军
 * 时间：2015.5.29
 ----------------------------------------------------------------------------------------- */
package com.zj.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zj.model.Poetries;
import com.zj.service.PoetService;

public class PoetMgnAction extends ActionSupport
{
	private  String author;
	private  String title;
	private  String content;
	private  PoetService ps;
	
	
	public PoetService getPs()
	{
		return ps;
	}
	public void setPs(PoetService ps)
	{
		this.ps = ps;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getContent()
	{
		return content;
	}
	public void setContent(String content)
	{
		this.content = content;
	}
	
	// 基于作者姓名查询的 action 
	public String showTSListByAuthor()
	{
		List pList=ps.findByAuthor(author);
		if (pList.size()>0)
		{
			Map request=(Map)ActionContext.getContext().get("request");
			request.put("PoetList", pList);
			return "success";
		}
		else
		{
			return "fail";
		}
	}
	
	// 基于标题查询诗的Action
	public String showTSbyTitle()
	{
		Poetries tmpPoet=ps.findByTitle(title);
		if(tmpPoet!=null)
		{
			Map request=(Map)ActionContext.getContext().get("request");
			request.put("title", tmpPoet.getTitle());
			request.put("content", tmpPoet.getContent());
			request.put("author", tmpPoet.getAuthor());

			return "success";
		}
		else
		{
			return "fail";
		}
		
	}
	
	// 基于内容查询诗的信息
	public String showTSContext()
	{
		Poetries tmpPoet=ps.findByContent(content);
		if(tmpPoet!=null)
		{
			Map request=(Map)ActionContext.getContext().get("request");
			request.put("title", tmpPoet.getTitle());
			request.put("content", tmpPoet.getContent());
			request.put("author", tmpPoet.getAuthor());

			return "success";
		}
		else
		{
			return "fail";
		}
	}
	
}
