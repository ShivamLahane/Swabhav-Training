package com.techlab.comparators;

import java.util.Comparator;

public class SortByName implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) 
	{
		int value = 0;
		char s1Name[] = s1.getName().toCharArray();
		char s2Name[] = s2.getName().toCharArray();
		int i = 0, j = 0;
		while(i < s1Name.length && j < s2Name.length)
		{
			if ((int)s1Name[i] > (int)s2Name[i])
			{
				return 1;
			}
			else if ((int)s1Name[i] < (int)s2Name[i])
			{
				return -1;
			}
			i++;
			j++;
		}
		if (s1Name.length == s2Name.length) value = 0;
		else if (s1Name.length > s2Name.length) value = 1;
		else if (s2Name.length > s1Name.length) value = -1;
		return value;
	}

}
