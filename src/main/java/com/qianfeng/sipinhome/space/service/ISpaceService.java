package com.qianfeng.sipinhome.space.service;

import com.qianfeng.sipinhome.space.dto.SpaceInspiration1;
import com.qianfeng.sipinhome.space.dto.SpaceInspiration2;

import java.util.List;

public interface ISpaceService {
    /**
     * 根据id查客厅类的套餐
     * @param spaceId
     * @return
     */
    List<SpaceInspiration1> queryLivingById(int spaceId);

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
    List<SpaceInspiration2> queryBedById(int spaceId);

    /**
     * 查询所有的卧室类的套餐
     * @return
     */
    List<SpaceInspiration2> queryBedAll();
}
