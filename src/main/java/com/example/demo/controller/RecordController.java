package com.example.demo.controller;

import com.example.demo.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by song on 2017/11/7.
 */
@RestController
public class RecordController {
    @Autowired
    RecordRepository recordRepository;
//    @RequestMapping("/records")
//    public List<Record> getRecord(){
//        return
//    }
}
