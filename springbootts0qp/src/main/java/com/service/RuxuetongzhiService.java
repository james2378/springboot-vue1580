package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RuxuetongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RuxuetongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RuxuetongzhiView;


/**
 * 入学通知
 *
 * @author 
 * @email 
 * @date 2023-01-25 14:58:11
 */
public interface RuxuetongzhiService extends IService<RuxuetongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RuxuetongzhiVO> selectListVO(Wrapper<RuxuetongzhiEntity> wrapper);
   	
   	RuxuetongzhiVO selectVO(@Param("ew") Wrapper<RuxuetongzhiEntity> wrapper);
   	
   	List<RuxuetongzhiView> selectListView(Wrapper<RuxuetongzhiEntity> wrapper);
   	
   	RuxuetongzhiView selectView(@Param("ew") Wrapper<RuxuetongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RuxuetongzhiEntity> wrapper);
   	

}

