package com.mission.shop.product.service.impl.category;

import java.util.List;

import com.mission.shop.base.common.exception.SystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mission.shop.base.common.exception.BusinessException;
import com.mission.shop.product.common.constants.ProductConstants;
import com.mission.shop.product.dao.mapper.CategoryMapper;
import com.mission.shop.product.dao.model.Category;
import com.mission.shop.product.dao.model.CategoryExample;
import com.mission.shop.product.service.category.CategoryService;

/**
 * 
 * @author hexizheng@163.com
 * 
 */
@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryMapper categoryMapper;

	@Override
	public Category queryTopCategory() {
		CategoryExample example = new CategoryExample();
		example.createCriteria().andLevelEqualTo(ProductConstants.PROUCT_CAT_TOP_LEVEL)
                .andStatusEqualTo(ProductConstants.NORMAL_STATUS);
		List<Category> list = categoryMapper.selectByExample(example);
		if(list.isEmpty()){
			throw new SystemException("顶层商品分类为空");
		}else if(list.size()>1){
			throw new SystemException("数据逻辑出错同时存在多个顶层分类");
		}else{
			return list.get(0);
		}
	}
	@Override
	public Category queryCategory(short level,String categeryName) {
		CategoryExample example = new CategoryExample();
		example.createCriteria().andLevelEqualTo(level)
                .andStatusEqualTo(ProductConstants.NORMAL_STATUS)
                .andNameEqualTo(categeryName);
		List<Category> list = categoryMapper.selectByExample(example);
		if(list.isEmpty()){
			return null;
		}else if(list.size()>1){
			throw new SystemException("数据逻辑出错同时存在多个分类");
		}else{
			return list.get(0);
		}
	}

	@Override
	public List<Category> queryCategoryByParent(Long parentId) {
		CategoryExample example = new CategoryExample();
		example.createCriteria().andParentIdEqualTo(parentId)
		.andStatusEqualTo(ProductConstants.NORMAL_STATUS);
		example.setOrderByClause(" sort_order ");
		return categoryMapper.selectByExample(example);
	}

	@Override
	public void addCatetories(List<Category> list) throws BusinessException {
		// TODO Auto-generated method stub

	}

}
