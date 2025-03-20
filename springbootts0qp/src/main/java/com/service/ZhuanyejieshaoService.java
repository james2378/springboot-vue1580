package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuanyejieshaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuanyejieshaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuanyejieshaoView;


/**
 * 专业介绍
 *
 * @author 
 * @email 
 * @date 2023-01-25 14:58:11
 */
public interface ZhuanyejieshaoService extends IService<ZhuanyejieshaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuanyejieshaoVO> selectListVO(Wrapper<ZhuanyejieshaoEntity> wrapper);
   	
   	ZhuanyejieshaoVO selectVO(@Param("ew") Wrapper<ZhuanyejieshaoEntity> wrapper);
   	
   	List<ZhuanyejieshaoView> selectListView(Wrapper<ZhuanyejieshaoEntity> wrapper);
   	
   	ZhuanyejieshaoView selectView(@Param("ew") Wrapper<ZhuanyejieshaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuanyejieshaoEntity> wrapper);
   	

}

