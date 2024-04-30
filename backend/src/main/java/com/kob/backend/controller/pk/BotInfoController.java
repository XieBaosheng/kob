package com.kob.backend.controller.pk;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RestController

@RequestMapping("/pk/")
public class BotInfoController {

    @RequestMapping("getBotInfo/")
    public List<Map<String, String>> getBotInfo(){
        List<Map<String, String>> list = new LinkedList<>();
        Map<String, String> bot1 = new HashMap<>();
        bot1.put("name", "a");
        bot1.put("score", "1500");
        Map<String, String> bot2 = new HashMap<>();
        bot2.put("name", "a");
        bot2.put("score", "1500");
        list.add(bot1);
        list.add(bot2);
        return list;
    }
}
