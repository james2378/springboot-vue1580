package com.dao;

import com.entity.DiscussxuexiaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxuexiaoxinxiVO;
import com.entity.view.DiscussxuexiaoxinxiView;


/**
 * 学校信息评论表
 * 
 * @author 
 * @email 
 * @date 2023-01-25 14:58:11
 */
public interface DiscussxuexiaoxinxiDao extends BaseMapper<DiscussxuexiaoxinxiEntity> {
	
	List<DiscussxuexiaoxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussxuexiaoxinxiEntity> wrapper);
	
	DiscussxuexiaoxinxiVO selectVO(@Param("ew") Wrapper<DiscussxuexiaoxinxiEntity> wrapper);
	
	List<DiscussxuexiaoxinxiView> selectListView(@Param("ew") Wrapper<DiscussxuexiaoxinxiEntity> wrapper);

	List<DiscussxuexiaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxuexiaoxinxiEntity> wrapper);
	
	DiscussxuexiaoxinxiView selectView(@Param("ew") Wrapper<DiscussxuexiaoxinxiEntity> wrapper);
	

}
