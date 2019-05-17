package com.qianfeng.sipinhome.space.service;

import com.qianfeng.sipinhome.space.dto.SpaceInspiration1;
import com.qianfeng.sipinhome.space.dto.SpaceInspiration2;

import java.util.List;

public interface ISpaceService {
    List<SpaceInspiration1> queryLivingById(int spaceId);
    List<SpaceInspiration1> queryLivingAll();
    List<SpaceInspiration2> queryBedById(int spaceId);
    List<SpaceInspiration2> queryBedAll();
}
