package com.ds.driver_administrator.service;

import com.ds.driver_administrator.commos.RequestBean;
import com.ds.driver_administrator.pojo.Driver;

public interface DriverService {
    /**
     * 查询详细信息通过id
     * @param id
     * @return
     */
    RequestBean queryDetailById(String id);

    /**
     * 通过一个对象查询
     * @param driver
     * @return
     */
    RequestBean queryDetailByDriver(Driver driver);

    /**
     * 存储用户信息
     * @param driver
     * @return
     */
    RequestBean saveDriver(Driver driver);
}
