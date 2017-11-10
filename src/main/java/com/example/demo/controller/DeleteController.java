package com.example.demo.controller;

import com.example.demo.config.SpringContextUtil;
import com.example.demo.repository.BaseRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by song on 2017/11/10.
 */
@RestController
public class DeleteController {
    @RequestMapping(method = RequestMethod.POST, value = "/api/delete/{model}")
    @Transactional
    public String objectDelete(@RequestBody List<Long> ids, @PathVariable String model){
        System.out.println(ids);
        BaseRepository repository = (BaseRepository) SpringContextUtil.getBean(model+"Repository");
        repository.deleteByIdIn(ids);
        return "success";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/api/delete/hellos")
    public String objectDelete(){
        return "hellos";
    }
}