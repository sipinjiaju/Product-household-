package com.qianfeng.sipinhome;

import com.qianfeng.sipinhome.space.service.Impl.SpaceServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SipinhomeApplicationTests {

    @Autowired
    private SpaceServiceImpl spaceService;

    @Test
    public void contextLoads() {
//        List<SpaceInspiration1> spaceInspirations = spaceService.query();
//        System.out.println(spaceInspirations);
    }

}
