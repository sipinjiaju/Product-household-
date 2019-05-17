package com.qianfeng.sipinhome.space.controller;

import com.qianfeng.sipinhome.space.dto.SpaceInspiration1;
import com.qianfeng.sipinhome.space.dto.SpaceInspiration2;
import com.qianfeng.sipinhome.space.service.ISpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/space")
public class SpaceController {

    @Autowired
    private ISpaceService spaceService;

    /**
     * 根据id查客厅类的套餐
     * @param spaceId
     * @return
     */
    @RequestMapping("/queryLivingById/{spaceId}")
    @ResponseBody
    public List<SpaceInspiration1> queryLivingById(@PathVariable("spaceId") int spaceId){
        List<SpaceInspiration1> spaceInspirations = spaceService.queryLivingById(spaceId);
        return spaceInspirations;
    }

    /**
     * 查询所有的客厅类的套餐
     * @return
     */
    @RequestMapping("/queryLivingAll")
    @ResponseBody
    public List<SpaceInspiration1> queryLivingAll() {
        List<SpaceInspiration1> spaceInspirations = spaceService.queryLivingAll();
        return spaceInspirations;
    }

    /**
     * 根据id查卧室类的套餐
     * @param spaceId
     * @return
     */
    @RequestMapping("/queryBedById/{spaceId}")
    @ResponseBody
    public List<SpaceInspiration2> queryBedById(@PathVariable("spaceId") int spaceId){
        List<SpaceInspiration2> spaceInspirations = spaceService.queryBedById(spaceId);
        return spaceInspirations;
    }

    /**
     * 查询所有的卧室类的套餐
     * @return
     */
    @RequestMapping("/queryBedAll")
    @ResponseBody
    public List<SpaceInspiration2> queryBedAll() {
        List<SpaceInspiration2> spaceInspirations = spaceService.queryBedAll();
        return spaceInspirations;
    }
}
