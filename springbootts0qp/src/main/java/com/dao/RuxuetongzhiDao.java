package com.dao;

import com.entity.RuxuetongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RuxuetongzhiVO;
import com.entity.view.RuxuetongzhiView;


/**
 * 入学通知
 * 
 * @author 
 * @email 
 * @date 2023-01-25 14:58:11
 */
public interface RuxuetongzhiDao extends BaseMapper<RuxuetongzhiEntity> {
	
	List<RuxuetongzhiVO> selectListVO(@Param("ew") Wrapper<RuxuetongzhiEntity> wrapper);
	
	RuxuetongzhiVO selectVO(@Param("ew") Wrapper<RuxuetongzhiEntity> wrapper);
	
	List<RuxuetongzhiView> selectListView(@Param("ew") Wrapper<RuxuetongzhiEntity> wrapper);

	List<RuxuetongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<RuxuetongzhiEntity> wrapper);
	
	RuxuetongzhiView selectView(@Param("ew") Wrapper<RuxuetongzhiEntity> wrapper);
	

}
