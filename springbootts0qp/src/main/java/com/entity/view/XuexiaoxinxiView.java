package com.entity.view;

import com.entity.XuexiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学校信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-25 14:58:11
 */
@TableName("xuexiaoxinxi")
public class XuexiaoxinxiView  extends XuexiaoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuexiaoxinxiView(){
	}
 
 	public XuexiaoxinxiView(XuexiaoxinxiEntity xuexiaoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, xuexiaoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
