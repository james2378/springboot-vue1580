package com.dao;

import com.entity.BaodaoyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaodaoyuyueVO;
import com.entity.view.BaodaoyuyueView;


/**
 * 报道预约
 * 
 * @author 
 * @email 
 * @date 2023-01-25 14:58:11
 */
public interface BaodaoyuyueDao extends BaseMapper<BaodaoyuyueEntity> {
	
	List<BaodaoyuyueVO> selectListVO(@Param("ew") Wrapper<BaodaoyuyueEntity> wrapper);
	
	BaodaoyuyueVO selectVO(@Param("ew") Wrapper<BaodaoyuyueEntity> wrapper);
	
	List<BaodaoyuyueView> selectListView(@Param("ew") Wrapper<BaodaoyuyueEntity> wrapper);

	List<BaodaoyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<BaodaoyuyueEntity> wrapper);
	
	BaodaoyuyueView selectView(@Param("ew") Wrapper<BaodaoyuyueEntity> wrapper);
	

}
