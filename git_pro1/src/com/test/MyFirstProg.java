package com.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MyFirstProg {

	public static void main(String[] args) {
		
		String input="Hello How Are You ";
		
		
		List<String> originalList=Arrays.asList(input.split(" "));
		List<String> tempList=originalList;
		
		int index=0;
		StringBuilder sb=null;
		for(String s:originalList)
		{
			sb=new StringBuilder();
			for(int i=index;i<tempList.size();i++)
			{
				sb.append(tempList.get(i)+"-");
				//sb.append("-");
					
			}
			
			System.out.println(sb);
			index++;
		}

	}

}
