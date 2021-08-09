package com.techlabs.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Movie
{
	@Id
	private int id;
	private String name;
	@ManyToMany(mappedBy = "movies")
	private Set<Actor> actors;
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public Set<Actor> getActors()
	{
		return actors;
	}
	
	public void setActors(Set<Actor> actors)
	{
		this.actors = actors;
	}
	
}
