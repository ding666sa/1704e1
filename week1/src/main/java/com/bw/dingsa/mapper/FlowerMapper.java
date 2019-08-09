package com.bw.dingsa.mapper;

import java.util.List;

import com.bw.dingsa.bean.Flower;
import com.bw.dingsa.bean.FlowerVo;

public interface FlowerMapper {
	//查询全部
	public List<Flower> selectAll(FlowerVo fv);
	
	//添加
	public int insertFlower(Flower flower);
	
	//删除
	public int deleteById(int fid);
	
	//根据id查询
	public Flower selectById(int fid);
	
	//批量删除
	public int deleteByIds(int ids);
	
	//修改
	public int updateFlower(Flower flower);
}
