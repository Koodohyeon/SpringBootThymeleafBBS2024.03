package com.example.abbs.util;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.stereotype.Service;

@Service
public class AsideUtil {

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