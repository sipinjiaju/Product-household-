package com.qianfeng.sipinhome.space.dao;

import com.qianfeng.sipinhome.space.dto.SpaceInspiration1;
import com.qianfeng.sipinhome.space.dto.SpaceInspiration2;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SpaceMapper {
    /**
     * 根据id查客厅类的套餐
     * @param spaceId
     * @return
     */
    List<SpaceInspiration1> queryLivingById(@Param("spaceId") int spaceId);

    /**
     * 查询所有的客厅类的套餐
     * @return
     */
    List<SpaceInspiration1> queryLivingAll();

    /**
     * 根据id查卧室类的套餐
     * @param spaceId
     * @return
     */
    List<SpaceInspiration2> queryBedById(@Param("spaceId") int spaceId);

    /**
     * 查询所有的卧室类的套餐
     * @return
     */
    List<SpaceInspiration2> queryBedAll();
}
