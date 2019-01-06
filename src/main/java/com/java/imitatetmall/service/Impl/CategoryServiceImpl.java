package com.java.imitatetmall.service.Impl;

import com.java.imitatetmall.mapper.CategoryMapper;
import com.java.imitatetmall.pojo.Category;
import com.java.imitatetmall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author GeChen
 * @date 2019/1/6 13:57
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    @Override
    public List<Category> list() {
        return categoryMapper.list();
    }
}
