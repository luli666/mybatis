package com.offcn.mybatis.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class DateSourceConfig {

    @ConfigurationProperties(prefix = "sping.datasource")
    public DataSource getDataSource(){
        return new DruidDataSource();
    }
}
