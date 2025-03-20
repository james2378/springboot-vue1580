package com.entity.view;

import com.entity.BaodaoyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 报道预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-25 14:58:11
 */
@TableName("baodaoyuyue")
public class BaodaoyuyueView  extends BaodaoyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaodaoyuyueView(){
	}
 
 	public BaodaoyuyueView(BaodaoyuyueEntity baodaoyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, baodaoyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
