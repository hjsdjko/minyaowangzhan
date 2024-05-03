package com.entity.model;

import com.entity.GequEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 歌曲
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GequModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 逻辑删除
     */
    private Integer gequDelete;


    /**
     * 歌曲简介
     */
    private String gequContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：歌名
	 */
    public String getGequName() {
        return gequName;
    }


    /**
	 * 设置：歌名
	 */
    public void setGequName(String gequName) {
        this.gequName = gequName;
    }
    /**
	 * 获取：歌曲封面
	 */
    public String getGequPhoto() {
        return gequPhoto;
    }


    /**
	 * 设置：歌曲封面
	 */
    public void setGequPhoto(String gequPhoto) {
        this.gequPhoto = gequPhoto;
    }
    /**
	 * 获取：歌曲类型
	 */
    public Integer getGequTypes() {
        return gequTypes;
    }


    /**
	 * 设置：歌曲类型
	 */
    public void setGequTypes(Integer gequTypes) {
        this.gequTypes = gequTypes;
    }
    /**
	 * 获取：歌曲文件
	 */
    public String getGequMusic() {
        return gequMusic;
    }


    /**
	 * 设置：歌曲文件
	 */
    public void setGequMusic(String gequMusic) {
        this.gequMusic = gequMusic;
    }
    /**
	 * 获取：赞数量
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 设置：赞数量
	 */
    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩数量
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 设置：踩数量
	 */
    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getGequClicknum() {
        return gequClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setGequClicknum(Integer gequClicknum) {
        this.gequClicknum = gequClicknum;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getGequDelete() {
        return gequDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setGequDelete(Integer gequDelete) {
        this.gequDelete = gequDelete;
    }
    /**
	 * 获取：歌曲简介
	 */
    public String getGequContent() {
        return gequContent;
    }


    /**
	 * 设置：歌曲简介
	 */
    public void setGequContent(String gequContent) {
        this.gequContent = gequContent;
    }
    /**
	 * 获取：上传时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：上传时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
