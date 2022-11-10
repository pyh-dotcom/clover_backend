package com.example.clover_backend.service;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class WriteInfo {
    public void writeStockCode(String stockCode) throws IOException{
        JSONObject obj = new JSONObject();
        obj.put("stock_code", stockCode);

        FileWriter file = new FileWriter("/home/ubuntu/Python/info.json");
        //FileWriter file = new FileWriter("info.json");
        file.write(obj.toJSONString());
        file.flush();
        file.close();
    }
}
