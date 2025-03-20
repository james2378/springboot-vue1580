package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxuexiaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxuexiaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxuexiaoxinxiView;


/**
 * 学校信息评论表
 *
 * @author 
 * @email 
 * @date 2023-01-25 14:58:11
 */
public interface DiscussxuexiaoxinxiService extends IService<DiscussxuexiaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxuexiaoxinxiVO> selectListVO(Wrapper<DiscussxuexiaoxinxiEntity> wrapper);
   	
   	DiscussxuexiaoxinxiVO selectVO(@Param("ew") Wrapper<DiscussxuexiaoxinxiEntity> wrapper);
   	
   	List<DiscussxuexiaoxinxiView> selectListView(Wrapper<DiscussxuexiaoxinxiEntity> wrapper);
   	
   	DiscussxuexiaoxinxiView selectView(@Param("ew") Wrapper<DiscussxuexiaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxuexiaoxinxiEntity> wrapper);
   	

}

