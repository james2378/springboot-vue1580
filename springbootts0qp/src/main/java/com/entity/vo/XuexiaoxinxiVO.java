package com.entity.vo;

import com.entity.XuexiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 学校信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-01-25 14:58:11
 */
public class XuexiaoxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 校园面积
	 */
	
	private String xiaoyuanmianji;
		
	/**
	 * 创办时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chuangbanshijian;
		
	/**
	 * 所在国家
	 */
	
	private String suozaiguojia;
		
	/**
	 * 学校地址
	 */
	
	private String xuexiaodizhi;
		
	/**
	 * 校车安排
	 */
	
	private String xiaocheanpai;
		
	/**
	 * 公交路线
	 */
	
	private String gongjiaoluxian;
		
	/**
	 * 学校简介
	 */
	
	private String xuexiaojianjie;
				
	
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
	 * 设置：校园面积
	 */
	 
	public void setXiaoyuanmianji(String xiaoyuanmianji) {
		this.xiaoyuanmianji = xiaoyuanmianji;
	}
	
	/**
	 * 获取：校园面积
	 */
	public String getXiaoyuanmianji() {
		return xiaoyuanmianji;
	}
				
	
	/**
	 * 设置：创办时间
	 */
	 
	public void setChuangbanshijian(Date chuangbanshijian) {
		this.chuangbanshijian = chuangbanshijian;
	}
	
	/**
	 * 获取：创办时间
	 */
	public Date getChuangbanshijian() {
		return chuangbanshijian;
	}
				
	
	/**
	 * 设置：所在国家
	 */
	 
	public void setSuozaiguojia(String suozaiguojia) {
		this.suozaiguojia = suozaiguojia;
	}
	
	/**
	 * 获取：所在国家
	 */
	public String getSuozaiguojia() {
		return suozaiguojia;
	}
				
	
	/**
	 * 设置：学校地址
	 */
	 
	public void setXuexiaodizhi(String xuexiaodizhi) {
		this.xuexiaodizhi = xuexiaodizhi;
	}
	
	/**
	 * 获取：学校地址
	 */
	public String getXuexiaodizhi() {
		return xuexiaodizhi;
	}
				
	
	/**
	 * 设置：校车安排
	 */
	 
	public void setXiaocheanpai(String xiaocheanpai) {
		this.xiaocheanpai = xiaocheanpai;
	}
	
	/**
	 * 获取：校车安排
	 */
	public String getXiaocheanpai() {
		return xiaocheanpai;
	}
				
	
	/**
	 * 设置：公交路线
	 */
	 
	public void setGongjiaoluxian(String gongjiaoluxian) {
		this.gongjiaoluxian = gongjiaoluxian;
	}
	
	/**
	 * 获取：公交路线
	 */
	public String getGongjiaoluxian() {
		return gongjiaoluxian;
	}
				
	
	/**
	 * 设置：学校简介
	 */
	 
	public void setXuexiaojianjie(String xuexiaojianjie) {
		this.xuexiaojianjie = xuexiaojianjie;
	}
	
	/**
	 * 获取：学校简介
	 */
	public String getXuexiaojianjie() {
		return xuexiaojianjie;
	}
			
}
