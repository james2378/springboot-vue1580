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


import com.dao.ZhuanyejieshaoDao;
import com.entity.ZhuanyejieshaoEntity;
import com.service.ZhuanyejieshaoService;
import com.entity.vo.ZhuanyejieshaoVO;
import com.entity.view.ZhuanyejieshaoView;

@Service("zhuanyejieshaoService")
public class ZhuanyejieshaoServiceImpl extends ServiceImpl<ZhuanyejieshaoDao, ZhuanyejieshaoEntity> implements ZhuanyejieshaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuanyejieshaoEntity> page = this.selectPage(
                new Query<ZhuanyejieshaoEntity>(params).getPage(),
                new EntityWrapper<ZhuanyejieshaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuanyejieshaoEntity> wrapper) {
		  Page<ZhuanyejieshaoView> page =new Query<ZhuanyejieshaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuanyejieshaoVO> selectListVO(Wrapper<ZhuanyejieshaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuanyejieshaoVO selectVO(Wrapper<ZhuanyejieshaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuanyejieshaoView> selectListView(Wrapper<ZhuanyejieshaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuanyejieshaoView selectView(Wrapper<ZhuanyejieshaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
