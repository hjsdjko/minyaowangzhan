package com.dao;

import com.entity.GequEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GequView;

/**
 * 歌曲 Dao 接口
 *
 * @author 
 */
public interface GequDao extends BaseMapper<GequEntity> {

   List<GequView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
