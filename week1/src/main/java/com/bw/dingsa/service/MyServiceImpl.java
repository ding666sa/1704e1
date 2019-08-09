package com.bw.dingsa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bw.dingsa.bean.Flower;
import com.bw.dingsa.bean.FlowerVo;
import com.bw.dingsa.mapper.FlowerMapper;

@Service
@Transactional
public class MyServiceImpl implements MyService {

	@Autowired
	private FlowerMapper fm;

	public List<Flower> findAll(FlowerVo fv) {
		return fm.selectAll(fv);
	}

	public int addFlower(Flower flower) {
		return fm.insertFlower(flower);
	}

	public int removeById(int fid) {
		return fm.deleteById(fid);
	}

	public Flower showById(int fid) {
		return fm.selectById(fid);
	}

	public int removeByIds(int ids) {
		return fm.deleteByIds(ids);
	}

	public int changeFlower(Flower flower) {
		return fm.updateFlower(flower);
	}

	
}
