package com.ds.driver_administrator;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages={"com.ds.driver_administrator.dao"})
public class DriverAdministratorApplication {
    public static void main(String[] args) {
        SpringApplication.run(DriverAdministratorApplication.class);
    }
}
