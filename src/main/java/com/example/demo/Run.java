package com.example.demo;

import convertHtmlToObject.RawData;
import convertHtmlToObject.RawScheduleDetail;
import convertHtmlToObject.RawStudent;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Run {

    @RequestMapping("/hello1")
    public String show(){
        return "hello1";
    }

    @RequestMapping("")
    public List<RawScheduleDetail> getList(){
        RawData rawData = new RawData();
        List<RawScheduleDetail> list = new ArrayList<RawScheduleDetail>();
        try {
            list = rawData.getListRawScheduleDetails("cnp09");
        } catch (IOException e) {
            list = null;
        }
        return list;
    }

    @RequestMapping("/api/student/Default.aspx")
    public List<RawStudent> rawStudentList(@RequestParam(name="page") String page, @RequestParam(name = "malop") String malop, @RequestParam(name = "mand") String mand) {
        RawData rawData = new RawData();
        List<RawStudent> list = new ArrayList<RawStudent>();
        String s = "http://daotao.vnua.edu.vn/Default.aspx?page="+page+"&malop="+malop+"&mand="+mand;
        System.out.println(s);
        list = rawData.getAListStudent("http://daotao.vnua.edu.vn/Default.aspx?page="+page+"&malop="+malop+"&mand="+mand);
        return list;
    }
}
