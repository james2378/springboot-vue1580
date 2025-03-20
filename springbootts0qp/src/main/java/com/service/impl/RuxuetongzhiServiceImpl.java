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


import com.dao.RuxuetongzhiDao;
import com.entity.RuxuetongzhiEntity;
import com.service.RuxuetongzhiService;
import com.entity.vo.RuxuetongzhiVO;
import com.entity.view.RuxuetongzhiView;

@Service("ruxuetongzhiService")
public class RuxuetongzhiServiceImpl extends ServiceImpl<RuxuetongzhiDao, RuxuetongzhiEntity> implements RuxuetongzhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RuxuetongzhiEntity> page = this.selectPage(
                new Query<RuxuetongzhiEntity>(params).getPage(),
                new EntityWrapper<RuxuetongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RuxuetongzhiEntity> wrapper) {
		  Page<RuxuetongzhiView> page =new Query<RuxuetongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RuxuetongzhiVO> selectListVO(Wrapper<RuxuetongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RuxuetongzhiVO selectVO(Wrapper<RuxuetongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RuxuetongzhiView> selectListView(Wrapper<RuxuetongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RuxuetongzhiView selectView(Wrapper<RuxuetongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
