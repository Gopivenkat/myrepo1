package com.test;

public class DerivationVo implements Comparable<DerivationVo> {

	private String value;
	private int sqNo;
	private int index;
	
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public int getSqNo() {
		return sqNo;
	}
	public void setSqNo(int sqNo) {
		this.sqNo = sqNo;
	}
	
	
	
	
	@Override
	public String toString() {
		return "DerivationVo [value=" + value + ", sqNo=" + sqNo + ", index=" + index + "]";
	}
	@Override
	public int compareTo(DerivationVo dv) {
		if(sqNo==dv.sqNo)  
			return 0;  
		else if(sqNo>dv.sqNo)  
			return -1;  
		else  
			return 1;  
			}  
	
	
	
	
}
