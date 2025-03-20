package com.entity.model;

import com.entity.ZhuanyejieshaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 专业介绍
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-01-25 14:58:11
 */
public class ZhuanyejieshaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 专业编码
	 */
	
	private String zhuanyebianma;
		
	/**
	 * 专业名称
	 */
	
	private String zhuanyemingcheng;
		
	/**
	 * 专业类别
	 */
	
	private String zhuanyeleibie;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 专业介绍
	 */
	
	private String zhuanyejieshao;
				
	
	/**
	 * 设置：专业编码
	 */
	 
	public void setZhuanyebianma(String zhuanyebianma) {
		this.zhuanyebianma = zhuanyebianma;
	}
	
	/**
	 * 获取：专业编码
	 */
	public String getZhuanyebianma() {
		return zhuanyebianma;
	}
				
	
	/**
	 * 设置：专业名称
	 */
	 
	public void setZhuanyemingcheng(String zhuanyemingcheng) {
		this.zhuanyemingcheng = zhuanyemingcheng;
	}
	
	/**
	 * 获取：专业名称
	 */
	public String getZhuanyemingcheng() {
		return zhuanyemingcheng;
	}
				
	
	/**
	 * 设置：专业类别
	 */
	 
	public void setZhuanyeleibie(String zhuanyeleibie) {
		this.zhuanyeleibie = zhuanyeleibie;
	}
	
	/**
	 * 获取：专业类别
	 */
	public String getZhuanyeleibie() {
		return zhuanyeleibie;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：专业介绍
	 */
	 
	public void setZhuanyejieshao(String zhuanyejieshao) {
		this.zhuanyejieshao = zhuanyejieshao;
	}
	
	/**
	 * 获取：专业介绍
	 */
	public String getZhuanyejieshao() {
		return zhuanyejieshao;
	}
			
}
