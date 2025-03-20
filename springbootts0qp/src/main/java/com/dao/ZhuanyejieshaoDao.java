package com.dao;

import com.entity.ZhuanyejieshaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuanyejieshaoVO;
import com.entity.view.ZhuanyejieshaoView;


/**
 * 专业介绍
 * 
 * @author 
 * @email 
 * @date 2023-01-25 14:58:11
 */
public interface ZhuanyejieshaoDao extends BaseMapper<ZhuanyejieshaoEntity> {
	
	List<ZhuanyejieshaoVO> selectListVO(@Param("ew") Wrapper<ZhuanyejieshaoEntity> wrapper);
	
	ZhuanyejieshaoVO selectVO(@Param("ew") Wrapper<ZhuanyejieshaoEntity> wrapper);
	
	List<ZhuanyejieshaoView> selectListView(@Param("ew") Wrapper<ZhuanyejieshaoEntity> wrapper);

	List<ZhuanyejieshaoView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuanyejieshaoEntity> wrapper);
	
	ZhuanyejieshaoView selectView(@Param("ew") Wrapper<ZhuanyejieshaoEntity> wrapper);
	

}
