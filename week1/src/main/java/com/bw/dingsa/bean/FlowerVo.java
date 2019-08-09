package com.bw.dingsa.bean;

import java.util.Arrays;

public class FlowerVo {
	private String fname;
	private String[] ids;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String[] getIds() {
		return ids;
	}
	public void setIds(String[] ids) {
		this.ids = ids;
	}
	@Override
	public String toString() {
		return "FlowerVo [fname=" + fname + ", ids=" + Arrays.toString(ids) + "]";
	}
	public FlowerVo(String fname, String[] ids) {
		super();
		this.fname = fname;
		this.ids = ids;
	}
	public FlowerVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
