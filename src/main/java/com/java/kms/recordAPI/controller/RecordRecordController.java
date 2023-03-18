package com.java.kms.recordAPI.controller;

import ch.qos.logback.core.model.Model;
import com.java.kms.recordAPI.service.RecordRecordService;
import com.java.kms.recordAPI.vo.RecordVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class RecordRecordController {


    @RequestMapping("record/record/main")
    @ResponseBody
    public ArrayList<RecordVo> recordMain(Model model){

        ArrayList<RecordVo> personList = RecordRecordService.recordMain();

        return personList;
    }

}
