/* ----------------------------------------------------------------------------------------
 * 说明：唐诗业务处理
 * 作者：朱军
 * 时间：2015.5.29
 ----------------------------------------------------------------------------------------- */

package com.zj.service;

import java.util.List;

import com.zj.dao.PoetDBService;
import com.zj.model.Poetries;

public class PoetService
{
	private PoetDBService dbs;

	public PoetDBService getDbs()
	{
		return dbs;
	}

	public void setDbs(PoetDBService dbs)
	{
		this.dbs = dbs;
	}
	
	public List findByAuthor(String author)
	{
		return dbs.findByAuthor(author);
	}
	
	public Poetries findByTitle(String title)
	{
		return dbs.findByTitle(title);
	}
	
	public Poetries findByContent(String content)
	{
		return dbs.findByContent(content);
	}
	
	public String findAuthor(int authorID)
	{
		return dbs.findAuthor(authorID);
	}
	
	
	
	

}
