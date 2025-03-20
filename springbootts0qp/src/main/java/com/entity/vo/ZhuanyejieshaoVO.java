package com.entity.vo;

import com.entity.ZhuanyejieshaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 专业介绍
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-01-25 14:58:11
 */
public class ZhuanyejieshaoVO  implements Serializable {
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
