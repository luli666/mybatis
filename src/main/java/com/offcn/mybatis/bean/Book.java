package com.offcn.mybatis.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

@Data
public class Book implements Serializable {
    private Integer bid;
    private String bname;
    private Double price;
    private String author;
    private String image;
}
