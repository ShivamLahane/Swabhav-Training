package com.techlabs.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Tenant
{
	private String name;
	@Id
	@OneToOne
	@JoinColumn
	private User cto;
	private boolean isActiveSubsscriber;
	private String subsscriptionExpiryDate; 
	
	@OneToMany(mappedBy = "tenant", cascade = CascadeType.ALL)
	private Set<User> users;
	
	public String getSubsscriptionExpiryDate()
	{
		return subsscriptionExpiryDate;
	}

	public void setSubsscriptionExpiryDate(String subsscriptionExpiryDate)
	{
		this.subsscriptionExpiryDate = subsscriptionExpiryDate;
	}
	
	public boolean isActiveSubsscriber()
	{
		return isActiveSubsscriber;
	}
	
	public void setActiveSubsscriber(boolean isActiveSubsscriber)
	{
		this.isActiveSubsscriber = isActiveSubsscriber;
	}
	
	public Set<User> getUsers()
	{
		return users;
	}
	public void setUsers(Set<User> users)
	{
		this.users = users;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public User getCto()
	{
		return cto;
	}
	public void setCto(User cto)
	{
		this.cto = cto;
	}
	
}
