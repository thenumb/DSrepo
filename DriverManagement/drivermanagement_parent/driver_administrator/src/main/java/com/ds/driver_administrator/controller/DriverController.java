package com.ds.driver_administrator.controller;

import com.ds.driver_administrator.commos.RequestBean;
import com.ds.driver_administrator.commos.ResponseBean;

import com.ds.driver_administrator.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/driver")
public class DriverController {

    @Autowired
    DriverService driverService;
    /**
     * 存储信息
     * @param requestBean
     * @return
     */
    @RequestMapping("/saveDriver")
    @ResponseBody
    public ResponseBean saveDriverMsg(RequestBean requestBean){
        return null;
    }

    /**
     * 通过司机id查询信息
     * @param DriverId
     * @return
     */
    @GetMapping("/queryDriverById/{DriverId}")
    @ResponseBody
    public ResponseBean queryDriverMsgById(@PathVariable("DriverId") String DriverId){
        System.out.println("hahaha");return null;
    }

    /**
     * 通过传入司机对象查询信息
     * @return
     */
    @RequestMapping("/queryDriverByDriver")
    @ResponseBody
    public ResponseBean queryDriverMsg(RequestBean requestBean){
        return null;
    }

}
