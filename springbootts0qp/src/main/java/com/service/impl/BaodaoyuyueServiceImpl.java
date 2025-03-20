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


import com.dao.BaodaoyuyueDao;
import com.entity.BaodaoyuyueEntity;
import com.service.BaodaoyuyueService;
import com.entity.vo.BaodaoyuyueVO;
import com.entity.view.BaodaoyuyueView;

@Service("baodaoyuyueService")
public class BaodaoyuyueServiceImpl extends ServiceImpl<BaodaoyuyueDao, BaodaoyuyueEntity> implements BaodaoyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaodaoyuyueEntity> page = this.selectPage(
                new Query<BaodaoyuyueEntity>(params).getPage(),
                new EntityWrapper<BaodaoyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaodaoyuyueEntity> wrapper) {
		  Page<BaodaoyuyueView> page =new Query<BaodaoyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaodaoyuyueVO> selectListVO(Wrapper<BaodaoyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaodaoyuyueVO selectVO(Wrapper<BaodaoyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaodaoyuyueView> selectListView(Wrapper<BaodaoyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaodaoyuyueView selectView(Wrapper<BaodaoyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
