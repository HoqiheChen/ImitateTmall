package com.java.imitatetmall.controller;

import com.java.imitatetmall.pojo.Category;
import com.java.imitatetmall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author GeChen
 * @date 2019/1/6 13:59
 */
@Controller
@RequestMapping("")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping("admin_category_list")
    public String list(Model model){
        List<Category> cs = categoryService.list();
        model.addAttribute("cs",cs);
        return "admin/listCategory";
    }
}
