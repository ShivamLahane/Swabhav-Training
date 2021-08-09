package com.techlabs.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Actor
{
	@Id
	private int id;
	private String name;
	@ManyToMany
	@JoinTable
	private Set<Movie> movies;
	
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
	
	public Set<Movie> getMovies()
	{
		return movies;
	}
	
	public void setMovies(Set<Movie> movies)
	{
		this.movies = movies;
	}
	
}
