package com.dao;

import com.entity.GequCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GequCollectionView;

/**
 * 歌曲收藏 Dao 接口
 *
 * @author 
 */
public interface GequCollectionDao extends BaseMapper<GequCollectionEntity> {

   List<GequCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
