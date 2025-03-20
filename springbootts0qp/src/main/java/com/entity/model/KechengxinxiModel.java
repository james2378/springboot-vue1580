package com.entity.model;

import com.entity.KechengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 课程信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-01-25 14:58:11
 */
public class KechengxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
		
	/**
	 * 课程一
	 */
	
	private String kechengyi;
		
	/**
	 * 课程二
	 */
	
	private String kechenger;
		
	/**
	 * 课程三
	 */
	
	private String kechengsan;
		
	/**
	 * 课程四
	 */
	
	private String kechengsi;
		
	/**
	 * 课程五
	 */
	
	private String kechengwu;
		
	/**
	 * 课程六
	 */
	
	private String kechengliu;
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
				
	
	/**
	 * 设置：课程一
	 */
	 
	public void setKechengyi(String kechengyi) {
		this.kechengyi = kechengyi;
	}
	
	/**
	 * 获取：课程一
	 */
	public String getKechengyi() {
		return kechengyi;
	}
				
	
	/**
	 * 设置：课程二
	 */
	 
	public void setKechenger(String kechenger) {
		this.kechenger = kechenger;
	}
	
	/**
	 * 获取：课程二
	 */
	public String getKechenger() {
		return kechenger;
	}
				
	
	/**
	 * 设置：课程三
	 */
	 
	public void setKechengsan(String kechengsan) {
		this.kechengsan = kechengsan;
	}
	
	/**
	 * 获取：课程三
	 */
	public String getKechengsan() {
		return kechengsan;
	}
				
	
	/**
	 * 设置：课程四
	 */
	 
	public void setKechengsi(String kechengsi) {
		this.kechengsi = kechengsi;
	}
	
	/**
	 * 获取：课程四
	 */
	public String getKechengsi() {
		return kechengsi;
	}
				
	
	/**
	 * 设置：课程五
	 */
	 
	public void setKechengwu(String kechengwu) {
		this.kechengwu = kechengwu;
	}
	
	/**
	 * 获取：课程五
	 */
	public String getKechengwu() {
		return kechengwu;
	}
				
	
	/**
	 * 设置：课程六
	 */
	 
	public void setKechengliu(String kechengliu) {
		this.kechengliu = kechengliu;
	}
	
	/**
	 * 获取：课程六
	 */
	public String getKechengliu() {
		return kechengliu;
	}
			
}
