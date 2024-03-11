package com.example.abbs.controller;

import com.example.abbs.util.AsideUtil;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/aside")
public class AsideController {
    @Autowired private AsideUtil asideUtil;
    @ResponseBody
    @GetMapping("/stateMsg")
    public String changeStateMsg(String stateMsg, HttpSession session) {
        session.setAttribute("stateMsg", stateMsg);
        return "1";
    }

    @ResponseBody
    @GetMapping("/weather")
    public String weather(HttpSession session) {
        String location = (String) session.getAttribute("location") + "청";
        String roadAddr = asideUtil.getRoadAddr(location);
        Map<String, String> map = asideUtil.getGeocode(roadAddr);
        String result = asideUtil.getWeather(map.get("lon"), map.get("lat"));
        return result;
      //  return "lon=" + map.get("lon") + ", lat=" + map.get("lat");
    }


}
