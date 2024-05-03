package com.entity.vo;

import com.entity.GequEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 歌曲
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gequ")
public class GequVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 歌名
     */

    @TableField(value = "gequ_name")
    private String gequName;


    /**
     * 歌曲封面
     */

    @TableField(value = "gequ_photo")
    private String gequPhoto;


    /**
     * 歌曲类型
     */

    @TableField(value = "gequ_types")
    private Integer gequTypes;


    /**
     * 歌曲文件
     */

    @TableField(value = "gequ_music")
    private String gequMusic;


    /**
     * 赞数量
     */

    @TableField(value = "zan_number")
    private Integer zanNumber;


    /**
     * 踩数量
     */

    @TableField(value = "cai_number")
    private Integer caiNumber;


    /**
     * 点击次数
     */

    @TableField(value = "gequ_clicknum")
    private Integer gequClicknum;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "gequ_delete")
    private Integer gequDelete;


    /**
     * 歌曲简介
     */

    @TableField(value = "gequ_content")
    private String gequContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：歌名
	 */
    public String getGequName() {
        return gequName;
    }


    /**
	 * 获取：歌名
	 */

    public void setGequName(String gequName) {
        this.gequName = gequName;
    }
    /**
	 * 设置：歌曲封面
	 */
    public String getGequPhoto() {
        return gequPhoto;
    }


    /**
	 * 获取：歌曲封面
	 */

    public void setGequPhoto(String gequPhoto) {
        this.gequPhoto = gequPhoto;
    }
    /**
	 * 设置：歌曲类型
	 */
    public Integer getGequTypes() {
        return gequTypes;
    }


    /**
	 * 获取：歌曲类型
	 */

    public void setGequTypes(Integer gequTypes) {
        this.gequTypes = gequTypes;
    }
    /**
	 * 设置：歌曲文件
	 */
    public String getGequMusic() {
        return gequMusic;
    }


    /**
	 * 获取：歌曲文件
	 */

    public void setGequMusic(String gequMusic) {
        this.gequMusic = gequMusic;
    }
    /**
	 * 设置：赞数量
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 获取：赞数量
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩数量
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 获取：踩数量
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getGequClicknum() {
        return gequClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setGequClicknum(Integer gequClicknum) {
        this.gequClicknum = gequClicknum;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getGequDelete() {
        return gequDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setGequDelete(Integer gequDelete) {
        this.gequDelete = gequDelete;
    }
    /**
	 * 设置：歌曲简介
	 */
    public String getGequContent() {
        return gequContent;
    }


    /**
	 * 获取：歌曲简介
	 */

    public void setGequContent(String gequContent) {
        this.gequContent = gequContent;
    }
    /**
	 * 设置：上传时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：上传时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
