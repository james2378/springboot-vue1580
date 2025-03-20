package com.entity.view;

import com.entity.RuxuetongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 入学通知
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-25 14:58:11
 */
@TableName("ruxuetongzhi")
public class RuxuetongzhiView  extends RuxuetongzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RuxuetongzhiView(){
	}
 
 	public RuxuetongzhiView(RuxuetongzhiEntity ruxuetongzhiEntity){
 	try {
			BeanUtils.copyProperties(this, ruxuetongzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
