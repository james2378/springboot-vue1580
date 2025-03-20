package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuexiaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuexiaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexiaoxinxiView;


/**
 * 学校信息
 *
 * @author 
 * @email 
 * @date 2023-01-25 14:58:11
 */
public interface XuexiaoxinxiService extends IService<XuexiaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexiaoxinxiVO> selectListVO(Wrapper<XuexiaoxinxiEntity> wrapper);
   	
   	XuexiaoxinxiVO selectVO(@Param("ew") Wrapper<XuexiaoxinxiEntity> wrapper);
   	
   	List<XuexiaoxinxiView> selectListView(Wrapper<XuexiaoxinxiEntity> wrapper);
   	
   	XuexiaoxinxiView selectView(@Param("ew") Wrapper<XuexiaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexiaoxinxiEntity> wrapper);
   	

}

