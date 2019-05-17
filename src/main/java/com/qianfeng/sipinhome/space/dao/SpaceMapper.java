package com.qianfeng.sipinhome.space.dao;

import com.qianfeng.sipinhome.space.dto.SpaceInspiration1;
import com.qianfeng.sipinhome.space.dto.SpaceInspiration2;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SpaceMapper {
    List<SpaceInspiration1> queryLivingById(@Param("spaceId") int spaceId);
    List<SpaceInspiration1> queryLivingAll();
    List<SpaceInspiration2> queryBedById(@Param("spaceId") int spaceId);
    List<SpaceInspiration2> queryBedAll();
}
