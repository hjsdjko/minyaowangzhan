package com.entity.view;

import com.entity.GequEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 歌曲
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("gequ")
public class GequView extends GequEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 歌曲类型的值
		*/
		private String gequValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public GequView() {

	}

	public GequView(GequEntity gequEntity) {
		try {
			BeanUtils.copyProperties(this, gequEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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











}
