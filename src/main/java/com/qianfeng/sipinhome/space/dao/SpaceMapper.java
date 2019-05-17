package com.qianfeng.sipinhome.space.dao;

import com.qianfeng.sipinhome.space.dto.SpaceInspiration;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SpaceMapper {
    List<SpaceInspiration> query();
}
