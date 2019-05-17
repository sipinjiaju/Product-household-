package com.qianfeng.sipinhome.space.service.Impl;

import com.qianfeng.sipinhome.space.dao.SpaceMapper;
import com.qianfeng.sipinhome.space.dto.SpaceInspiration1;
import com.qianfeng.sipinhome.space.dto.SpaceInspiration2;
import com.qianfeng.sipinhome.space.service.ISpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpaceServiceImpl implements ISpaceService {

    @Autowired
    private SpaceMapper spaceMapper;

    @Override
    public List<SpaceInspiration1> queryLivingById(int spaceId) {
        List<SpaceInspiration1> spaceInspirations = spaceMapper.queryLivingById(spaceId);
        return spaceInspirations;
    }

    @Override
    public List<SpaceInspiration1> queryLivingAll() {
        List<SpaceInspiration1> spaceInspirations = spaceMapper.queryLivingAll();
        return spaceInspirations;
    }

    @Override
    public List<SpaceInspiration2> queryBedById(int spaceId) {
        List<SpaceInspiration2> spaceInspirations = spaceMapper.queryBedById(spaceId);
        return spaceInspirations;
    }

    @Override
    public List<SpaceInspiration2> queryBedAll() {
        List<SpaceInspiration2> spaceInspirations = spaceMapper.queryBedAll();
        return spaceInspirations;
    }
}
