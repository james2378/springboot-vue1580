package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhuanyejieshaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhuanyejieshaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhuanyejieshaoView;


/**
 * 专业介绍评论表
 *
 * @author 
 * @email 
 * @date 2023-01-25 14:58:11
 */
public interface DiscusszhuanyejieshaoService extends IService<DiscusszhuanyejieshaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhuanyejieshaoVO> selectListVO(Wrapper<DiscusszhuanyejieshaoEntity> wrapper);
   	
   	DiscusszhuanyejieshaoVO selectVO(@Param("ew") Wrapper<DiscusszhuanyejieshaoEntity> wrapper);
   	
   	List<DiscusszhuanyejieshaoView> selectListView(Wrapper<DiscusszhuanyejieshaoEntity> wrapper);
   	
   	DiscusszhuanyejieshaoView selectView(@Param("ew") Wrapper<DiscusszhuanyejieshaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhuanyejieshaoEntity> wrapper);
   	

}

