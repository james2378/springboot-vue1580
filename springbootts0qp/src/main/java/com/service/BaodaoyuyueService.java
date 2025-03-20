package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaodaoyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaodaoyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaodaoyuyueView;


/**
 * 报道预约
 *
 * @author 
 * @email 
 * @date 2023-01-25 14:58:11
 */
public interface BaodaoyuyueService extends IService<BaodaoyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaodaoyuyueVO> selectListVO(Wrapper<BaodaoyuyueEntity> wrapper);
   	
   	BaodaoyuyueVO selectVO(@Param("ew") Wrapper<BaodaoyuyueEntity> wrapper);
   	
   	List<BaodaoyuyueView> selectListView(Wrapper<BaodaoyuyueEntity> wrapper);
   	
   	BaodaoyuyueView selectView(@Param("ew") Wrapper<BaodaoyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaodaoyuyueEntity> wrapper);
   	

}

