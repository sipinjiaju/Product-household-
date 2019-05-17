package com.qianfeng.sipinhome.space.service.Impl;

import com.qianfeng.sipinhome.space.dao.SpaceMapper;
import com.qianfeng.sipinhome.space.dto.SpaceInspiration;
import com.qianfeng.sipinhome.space.service.ISpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpaceServiceImpl implements ISpaceService {
    
    @Autowired
    private SpaceMapper spaceMapper;
    
    @Override
    public List<SpaceInspiration> query() {
        List<SpaceInspiration> spaceInspirations = spaceMapper.query();
        return spaceInspirations;
    }
}
