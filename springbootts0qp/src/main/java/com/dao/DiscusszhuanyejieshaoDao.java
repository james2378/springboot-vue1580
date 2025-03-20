package com.dao;

import com.entity.DiscusszhuanyejieshaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszhuanyejieshaoVO;
import com.entity.view.DiscusszhuanyejieshaoView;


/**
 * 专业介绍评论表
 * 
 * @author 
 * @email 
 * @date 2023-01-25 14:58:11
 */
public interface DiscusszhuanyejieshaoDao extends BaseMapper<DiscusszhuanyejieshaoEntity> {
	
	List<DiscusszhuanyejieshaoVO> selectListVO(@Param("ew") Wrapper<DiscusszhuanyejieshaoEntity> wrapper);
	
	DiscusszhuanyejieshaoVO selectVO(@Param("ew") Wrapper<DiscusszhuanyejieshaoEntity> wrapper);
	
	List<DiscusszhuanyejieshaoView> selectListView(@Param("ew") Wrapper<DiscusszhuanyejieshaoEntity> wrapper);

	List<DiscusszhuanyejieshaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhuanyejieshaoEntity> wrapper);
	
	DiscusszhuanyejieshaoView selectView(@Param("ew") Wrapper<DiscusszhuanyejieshaoEntity> wrapper);
	

}
