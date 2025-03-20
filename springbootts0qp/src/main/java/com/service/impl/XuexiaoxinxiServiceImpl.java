package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XuexiaoxinxiDao;
import com.entity.XuexiaoxinxiEntity;
import com.service.XuexiaoxinxiService;
import com.entity.vo.XuexiaoxinxiVO;
import com.entity.view.XuexiaoxinxiView;

@Service("xuexiaoxinxiService")
public class XuexiaoxinxiServiceImpl extends ServiceImpl<XuexiaoxinxiDao, XuexiaoxinxiEntity> implements XuexiaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexiaoxinxiEntity> page = this.selectPage(
                new Query<XuexiaoxinxiEntity>(params).getPage(),
                new EntityWrapper<XuexiaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexiaoxinxiEntity> wrapper) {
		  Page<XuexiaoxinxiView> page =new Query<XuexiaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuexiaoxinxiVO> selectListVO(Wrapper<XuexiaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuexiaoxinxiVO selectVO(Wrapper<XuexiaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuexiaoxinxiView> selectListView(Wrapper<XuexiaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexiaoxinxiView selectView(Wrapper<XuexiaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
