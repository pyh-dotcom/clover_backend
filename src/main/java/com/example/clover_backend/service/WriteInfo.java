package com.example.clover_backend.service;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
@Service
public class WriteInfo {
    public void writeStockCode(String stock_code) throws IOException{
        JSONObject obj = new JSONObject();
        obj.put("stock_code", stock_code);

        FileWriter file = new FileWriter("/home/ubuntu/Clover_Project/Python/info.json");
        //FileWriter file = new FileWriter("info.json");
        //file.write(String.valueOf(stock_code));

        file.write(obj.toJSONString());
        file.flush();
        file.close();
    }
}
