package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 学校信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-01-25 14:58:11
 */
@TableName("xuexiaoxinxi")
public class XuexiaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XuexiaoxinxiEntity() {
		
	}
	
	public XuexiaoxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 学校名称
	 */
					
	private String xuexiaomingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：学校名称
	 */
	public void setXuexiaomingcheng(String xuexiaomingcheng) {
		this.xuexiaomingcheng = xuexiaomingcheng;
	}
	/**
	 * 获取：学校名称
	 */
	public String getXuexiaomingcheng() {
		return xuexiaomingcheng;
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
