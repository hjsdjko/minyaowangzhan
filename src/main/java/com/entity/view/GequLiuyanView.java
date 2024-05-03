package com.entity.view;

import com.entity.GequLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 歌曲留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("gequ_liuyan")
public class GequLiuyanView extends GequLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 gequ
			/**
			* 歌名
			*/
			private String gequName;
			/**
			* 歌曲封面
			*/
			private String gequPhoto;
			/**
			* 歌曲类型
			*/
			private Integer gequTypes;
				/**
				* 歌曲类型的值
				*/
				private String gequValue;
			/**
			* 歌曲文件
			*/
			private String gequMusic;
			/**
			* 赞数量
			*/
			private Integer zanNumber;
			/**
			* 踩数量
			*/
			private Integer caiNumber;
			/**
			* 点击次数
			*/
			private Integer gequClicknum;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer gequDelete;
			/**
			* 歌曲简介
			*/
			private String gequContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

	public GequLiuyanView() {

	}

	public GequLiuyanView(GequLiuyanEntity gequLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, gequLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}













				//级联表的get和set gequ

					/**
					* 获取： 歌名
					*/
					public String getGequName() {
						return gequName;
					}
					/**
					* 设置： 歌名
					*/
					public void setGequName(String gequName) {
						this.gequName = gequName;
					}

					/**
					* 获取： 歌曲封面
					*/
					public String getGequPhoto() {
						return gequPhoto;
					}
					/**
					* 设置： 歌曲封面
					*/
					public void setGequPhoto(String gequPhoto) {
						this.gequPhoto = gequPhoto;
					}

					/**
					* 获取： 歌曲类型
					*/
					public Integer getGequTypes() {
						return gequTypes;
					}
					/**
					* 设置： 歌曲类型
					*/
					public void setGequTypes(Integer gequTypes) {
						this.gequTypes = gequTypes;
					}


						/**
						* 获取： 歌曲类型的值
						*/
						public String getGequValue() {
							return gequValue;
						}
						/**
						* 设置： 歌曲类型的值
						*/
						public void setGequValue(String gequValue) {
							this.gequValue = gequValue;
						}

					/**
					* 获取： 歌曲文件
					*/
					public String getGequMusic() {
						return gequMusic;
					}
					/**
					* 设置： 歌曲文件
					*/
					public void setGequMusic(String gequMusic) {
						this.gequMusic = gequMusic;
					}

					/**
					* 获取： 赞数量
					*/
					public Integer getZanNumber() {
						return zanNumber;
					}
					/**
					* 设置： 赞数量
					*/
					public void setZanNumber(Integer zanNumber) {
						this.zanNumber = zanNumber;
					}

					/**
					* 获取： 踩数量
					*/
					public Integer getCaiNumber() {
						return caiNumber;
					}
					/**
					* 设置： 踩数量
					*/
					public void setCaiNumber(Integer caiNumber) {
						this.caiNumber = caiNumber;
					}

					/**
					* 获取： 点击次数
					*/
					public Integer getGequClicknum() {
						return gequClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setGequClicknum(Integer gequClicknum) {
						this.gequClicknum = gequClicknum;
					}

					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getGequDelete() {
						return gequDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setGequDelete(Integer gequDelete) {
						this.gequDelete = gequDelete;
					}

					/**
					* 获取： 歌曲简介
					*/
					public String getGequContent() {
						return gequContent;
					}
					/**
					* 设置： 歌曲简介
					*/
					public void setGequContent(String gequContent) {
						this.gequContent = gequContent;
					}
















				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}



}
