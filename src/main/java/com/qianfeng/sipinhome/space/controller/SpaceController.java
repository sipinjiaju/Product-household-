package com.qianfeng.sipinhome.space.controller;

import com.qianfeng.sipinhome.space.dto.SpaceInspiration;
import com.qianfeng.sipinhome.space.service.ISpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/space")
public class SpaceController {

    @Autowired
    private ISpaceService spaceService;

    @RequestMapping("query")
    @ResponseBody
    public List<SpaceInspiration> query(){
        List<SpaceInspiration> spaceInspirations = spaceService.query();
        return spaceInspirations;
    }
}
