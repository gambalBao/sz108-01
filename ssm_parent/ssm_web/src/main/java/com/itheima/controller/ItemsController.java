package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/list")
    public String list(Model model){
		//调用业务查询所有
		//调用业务查询所有
		//我是老大111
		//我才是老大222
        List<Items> list = itemsService.findAll();
        //塞回给页面
        model.addAttribute("items",list);
        return "items";
    }

    @RequestMapping("/save")
    public String save(Items items){
		//调用业务保存
        int save = itemsService.save(items);
        return "redirect:/items/list";
    }
}
