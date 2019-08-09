package com.bw.dingsa.service;

import java.util.List;

import com.bw.dingsa.bean.Flower;
import com.bw.dingsa.bean.FlowerVo;

public interface MyService {
	//查询全部
	public List<Flower> findAll(FlowerVo fv);
	
	//添加
	public int addFlower(Flower flower);
	
	//删除
	public int removeById(int fid);
	
	//根据id查询
	public Flower showById(int fid);
	
	//批量删除
	public int removeByIds(int ids);
	
	//修改
	public int changeFlower(Flower flower);
}
