package com.ds.driver_administrator.service.Impl;

import com.ds.driver_administrator.commos.RequestBean;
import com.ds.driver_administrator.dao.DriverMapper;
import com.ds.driver_administrator.pojo.Driver;
import com.ds.driver_administrator.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverServiceImpl implements DriverService {
    @Autowired
    DriverMapper driverMapper;

    @Override
    public RequestBean queryDetailById(String id) {
        return null;
    }

    @Override
    public RequestBean queryDetailByDriver(Driver driver) {
        return null;
    }

    @Override
    public RequestBean saveDriver(Driver driver) {
        return null;
    }
}
