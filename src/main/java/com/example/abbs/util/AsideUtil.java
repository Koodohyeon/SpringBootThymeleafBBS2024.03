package com.example.abbs.util;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:static/data/myKeys.properties")
public class AsideUtil {

    @value("kakaoApikey") private String kakaoApikey;
    @value("roadaddrKey")  private String roadaddrKey;
    @value("openWeatherApikey")  private String openWeatherApikey;
    public String getTodayQuote(String filename) {
        String result = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename), 1024);
            int index = (int) Math.floor(Math.random() * 100);		// 0 ~ 99
            for (int i = 0; i <= index; i++)
                result = br.readLine();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}