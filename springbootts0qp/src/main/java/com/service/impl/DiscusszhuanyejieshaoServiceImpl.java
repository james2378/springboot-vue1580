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


import com.dao.DiscusszhuanyejieshaoDao;
import com.entity.DiscusszhuanyejieshaoEntity;
import com.service.DiscusszhuanyejieshaoService;
import com.entity.vo.DiscusszhuanyejieshaoVO;
import com.entity.view.DiscusszhuanyejieshaoView;

@Service("discusszhuanyejieshaoService")
public class DiscusszhuanyejieshaoServiceImpl extends ServiceImpl<DiscusszhuanyejieshaoDao, DiscusszhuanyejieshaoEntity> implements DiscusszhuanyejieshaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhuanyejieshaoEntity> page = this.selectPage(
                new Query<DiscusszhuanyejieshaoEntity>(params).getPage(),
                new EntityWrapper<DiscusszhuanyejieshaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhuanyejieshaoEntity> wrapper) {
		  Page<DiscusszhuanyejieshaoView> page =new Query<DiscusszhuanyejieshaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszhuanyejieshaoVO> selectListVO(Wrapper<DiscusszhuanyejieshaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszhuanyejieshaoVO selectVO(Wrapper<DiscusszhuanyejieshaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszhuanyejieshaoView> selectListView(Wrapper<DiscusszhuanyejieshaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhuanyejieshaoView selectView(Wrapper<DiscusszhuanyejieshaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
