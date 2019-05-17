package com.qianfeng.sipinhome.bedroom.mapper;

import com.qianfeng.sipinhome.bedroom.vo.BedroomVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BeedroomMapper {
    List<BedroomVo>querybedroomList();
}
