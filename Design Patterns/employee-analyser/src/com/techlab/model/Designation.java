package com.techlab.model;

public enum Designation 
{
	MANAGER,CLERK,ANALYST,SALESMAN,PRESIDENT;
	
	public String toString()
	{
		if (this == MANAGER) return "MANAGER";
		else if (this == CLERK) return "CLERK";
		else if (this == SALESMAN) return "SALESMAN";
		else if (this == ANALYST) return "ANALYST";
		else if (this == PRESIDENT) return "PRESIDENT";
		return null;
 	}
}
