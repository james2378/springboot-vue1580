package com.entity.view;

import com.entity.ZhuanyejieshaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 专业介绍
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-25 14:58:11
 */
@TableName("zhuanyejieshao")
public class ZhuanyejieshaoView  extends ZhuanyejieshaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuanyejieshaoView(){
	}
 
 	public ZhuanyejieshaoView(ZhuanyejieshaoEntity zhuanyejieshaoEntity){
 	try {
			BeanUtils.copyProperties(this, zhuanyejieshaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
