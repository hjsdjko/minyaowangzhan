package com.dao;

import com.entity.GequLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GequLiuyanView;

/**
 * 歌曲留言 Dao 接口
 *
 * @author 
 */
public interface GequLiuyanDao extends BaseMapper<GequLiuyanEntity> {

   List<GequLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
