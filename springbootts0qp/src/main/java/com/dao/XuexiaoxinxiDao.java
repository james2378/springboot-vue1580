package com.dao;

import com.entity.XuexiaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexiaoxinxiVO;
import com.entity.view.XuexiaoxinxiView;


/**
 * 学校信息
 * 
 * @author 
 * @email 
 * @date 2023-01-25 14:58:11
 */
public interface XuexiaoxinxiDao extends BaseMapper<XuexiaoxinxiEntity> {
	
	List<XuexiaoxinxiVO> selectListVO(@Param("ew") Wrapper<XuexiaoxinxiEntity> wrapper);
	
	XuexiaoxinxiVO selectVO(@Param("ew") Wrapper<XuexiaoxinxiEntity> wrapper);
	
	List<XuexiaoxinxiView> selectListView(@Param("ew") Wrapper<XuexiaoxinxiEntity> wrapper);

	List<XuexiaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XuexiaoxinxiEntity> wrapper);
	
	XuexiaoxinxiView selectView(@Param("ew") Wrapper<XuexiaoxinxiEntity> wrapper);
	

}
