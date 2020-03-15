package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {

	
	
	
	
	public static void main(String[] args) {
		
		 Map<String,String> dbMap=new HashMap<String,String>();
		 dbMap.put("You All", "You-All");
		 dbMap.put("You", "You");
		 dbMap.put("Hello How Are You All", "Hello-How-Are-You-All");
		 dbMap.put("How Are You", "How-Are-You");
		 dbMap.put("How1", "How1");
		 dbMap.put("How2", "How2");
		 
		String input="Hello How Are You All";
		List<String> originalList=Arrays.asList(input.split(" "));
		List<String> tempList=originalList;
		int indexes=input.split(" ").length;
	List<DerivationVo> derivationVos=new ArrayList<DerivationVo>();
		int k=indexes;
		StringBuilder sb=null;
		DerivationVo vo=null;
		for(int i=0;i<originalList.size();i++)
		{
			k=indexes;
			for(int ind=0;ind<indexes;ind++){
			sb=new StringBuilder();
			vo=new  DerivationVo();
			for(int j=i;j<k;j++)
			{
				sb.append(tempList.get(j)+" ");
			}
				if(!"".equals(sb.toString()))
				{
					vo.setSqNo(sb.toString().split(" ").length);
					vo.setValue(sb.toString().trim());
					vo.setIndex(i);
					derivationVos.add(vo);
				}
			k--; 
			
			}
		}
		
		Collections.sort(derivationVos);
		
		System.out.println(derivationVos.toString());
		for(DerivationVo  vos:derivationVos)
		{
			 if(dbMap.containsKey(vos.getValue()))
			 {
				// String dataypeCode=dbMap.get(vos.getValue());
				 
				 //tempList.remove(vos.getValue());
				 
				 System.out.println(dbMap.get(vos.getValue()));
			 }
			
		}

		//System.out.println(tempList);
		
	}

}
