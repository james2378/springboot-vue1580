package com.entity.vo;

import com.entity.BaodaoyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 报道预约
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-01-25 14:58:11
 */
public class BaodaoyuyueVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 报道时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date baodaoshijian;
		
	/**
	 * 来往方式
	 */
	
	private String laiwangfangshi;
		
	/**
	 * 宿舍号
	 */
	
	private String sushehao;
		
	/**
	 * 床位号
	 */
	
	private String chuangweihao;
		
	/**
	 * 报道说明
	 */
	
	private String baodaoshuoming;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：报道时间
	 */
	 
	public void setBaodaoshijian(Date baodaoshijian) {
		this.baodaoshijian = baodaoshijian;
	}
	
	/**
	 * 获取：报道时间
	 */
	public Date getBaodaoshijian() {
		return baodaoshijian;
	}
				
	
	/**
	 * 设置：来往方式
	 */
	 
	public void setLaiwangfangshi(String laiwangfangshi) {
		this.laiwangfangshi = laiwangfangshi;
	}
	
	/**
	 * 获取：来往方式
	 */
	public String getLaiwangfangshi() {
		return laiwangfangshi;
	}
				
	
	/**
	 * 设置：宿舍号
	 */
	 
	public void setSushehao(String sushehao) {
		this.sushehao = sushehao;
	}
	
	/**
	 * 获取：宿舍号
	 */
	public String getSushehao() {
		return sushehao;
	}
				
	
	/**
	 * 设置：床位号
	 */
	 
	public void setChuangweihao(String chuangweihao) {
		this.chuangweihao = chuangweihao;
	}
	
	/**
	 * 获取：床位号
	 */
	public String getChuangweihao() {
		return chuangweihao;
	}
				
	
	/**
	 * 设置：报道说明
	 */
	 
	public void setBaodaoshuoming(String baodaoshuoming) {
		this.baodaoshuoming = baodaoshuoming;
	}
	
	/**
	 * 获取：报道说明
	 */
	public String getBaodaoshuoming() {
		return baodaoshuoming;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
