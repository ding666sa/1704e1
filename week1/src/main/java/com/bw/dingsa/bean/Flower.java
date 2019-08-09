package com.bw.dingsa.bean;

public class Flower {
	private int fid;
	private String fname;
	private String introduction;
	private Type type;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Flower [fid=" + fid + ", fname=" + fname + ", introduction=" + introduction + ", type=" + type + "]";
	}
	public Flower(int fid, String fname, String introduction, Type type) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.introduction = introduction;
		this.type = type;
	}
	public Flower() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}