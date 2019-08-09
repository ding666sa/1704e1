package com.bw.dingsa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.dingsa.bean.Flower;
import com.bw.dingsa.bean.FlowerVo;
import com.bw.dingsa.service.MyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class MyController {

	@Autowired
	private MyService service;
	
	@RequestMapping("list.do")
	public String saylist(Model model,@RequestParam(defaultValue="1") int pageNum,FlowerVo fv){
		int pageSize = 3;
		
		PageHelper.startPage(pageNum, pageSize);
		
		List<Flower> list = service.findAll(fv);
		
		PageInfo<Flower> pageInfo = new PageInfo<Flower>(list);
		model.addAttribute("list", list);
		model.addAttribute("pageInfo", pageInfo);
		model.addAttribute("fv", fv);
		return "list";
	}
	
	@RequestMapping("add.do")
	
	public Object sayadd(Flower flower){
		int addFlower = service.addFlower(flower);
		if(addFlower>0){
			return "redirect:list.do";
		}else{
			return "add";
		}
	}
	
	@RequestMapping("del.do")
	public Object saydel(int fid){
		System.err.println(fid);
		int x = service.removeById(fid);
		if(x>0){
			return "redirect:list.do";
		}else{
			return "del";
		}
	}
	
	@RequestMapping("show.do")
	public Object sayshow(int fid,Model model){
		Flower flower = service.showById(fid);
		System.out.println(flower);
		
		model.addAttribute("flower", flower);
		return flower;
	}
	
	@RequestMapping("dels.do")
	@ResponseBody
	public Object saydels(int ids){
		int removeByIds = service.removeByIds(ids);
		if(removeByIds>0){
			return true;
		}else{
			return false;
		}
	}
	
	@RequestMapping("update.do")
	public Object sayupdate(Flower flower){
		int x = service.changeFlower(flower);
		if(x>0){
			return "redirect:list.do";
		}else{
			return "update";
		}
	}
}
