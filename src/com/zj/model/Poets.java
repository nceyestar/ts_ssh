/* ----------------------------------------------------------------------------------------
 * 说明：唐诗作者表对应类
 * 作者：朱军
 * 时间：2015.5.29
 ----------------------------------------------------------------------------------------- */
package com.zj.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Poets entity. @author MyEclipse Persistence Tools
 */

public class Poets implements java.io.Serializable
{

	// Fields

	private Integer id;
	private String name;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Set poetrieses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Poets()
	{
	}

	/** full constructor */
	public Poets(String name, Timestamp createdAt, Timestamp updatedAt, Set poetrieses)
	{
		this.name = name;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.poetrieses = poetrieses;
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

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
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

	public Set getPoetrieses()
	{
		return this.poetrieses;
	}

	public void setPoetrieses(Set poetrieses)
	{
		this.poetrieses = poetrieses;
	}

}