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


import com.dao.DiscussxuexiaoxinxiDao;
import com.entity.DiscussxuexiaoxinxiEntity;
import com.service.DiscussxuexiaoxinxiService;
import com.entity.vo.DiscussxuexiaoxinxiVO;
import com.entity.view.DiscussxuexiaoxinxiView;

@Service("discussxuexiaoxinxiService")
public class DiscussxuexiaoxinxiServiceImpl extends ServiceImpl<DiscussxuexiaoxinxiDao, DiscussxuexiaoxinxiEntity> implements DiscussxuexiaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxuexiaoxinxiEntity> page = this.selectPage(
                new Query<DiscussxuexiaoxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussxuexiaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxuexiaoxinxiEntity> wrapper) {
		  Page<DiscussxuexiaoxinxiView> page =new Query<DiscussxuexiaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxuexiaoxinxiVO> selectListVO(Wrapper<DiscussxuexiaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxuexiaoxinxiVO selectVO(Wrapper<DiscussxuexiaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxuexiaoxinxiView> selectListView(Wrapper<DiscussxuexiaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxuexiaoxinxiView selectView(Wrapper<DiscussxuexiaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
