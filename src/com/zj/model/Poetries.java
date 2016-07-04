/* ----------------------------------------------------------------------------------------
 * 说明：唐诗明细表对应类
 * 作者：朱军
 * 时间：2015.5.29
 ----------------------------------------------------------------------------------------- */

package com.zj.model;

import java.sql.Timestamp;

/**
 * Poetries entity. @author MyEclipse Persistence Tools
 */

public class Poetries implements java.io.Serializable
{

	// Fields

	private Integer id;
	private Poets poets;
	private String content;
	private String title;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private String author;

	// Constructors

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	/** default constructor */
	public Poetries()
	{
	}

	/** full constructor */
	public Poetries(Poets poets, String content, String title, Timestamp createdAt, Timestamp updatedAt)
	{
		this.poets = poets;
		this.content = content;
		this.title = title;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	// Property accessors

	public Integer getId()
	{
		return this.id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public Poets getPoets()
	{
		return this.poets;
	}

	public void setPoets(Poets poets)
	{
		this.poets = poets;
	}

	public String getContent()
	{
		return this.content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public String getTitle()
	{
		return this.title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public Timestamp getCreatedAt()
	{
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt)
	{
		this.createdAt = createdAt;
	}

	public Timestamp getUpdatedAt()
	{
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt)
	{
		this.updatedAt = updatedAt;
	}

}