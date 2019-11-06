package com.offcn.mybatis;

import com.offcn.mybatis.bean.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class MybatisApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    void contextLoads() {
        redisTemplate.opsForValue().set("hello", "hello redis");
        String hello = (String) redisTemplate.opsForValue().get("hello");
        System.out.println(hello);

        Book book = new Book();
        book.setBid(10);
        book.setBname("雪中悍刀行");
        book.setPrice(28.8);
        book.setAuthor("烽火戏诸侯");
        redisTemplate.opsForValue().set("book", book);
        Book book1 = (Book) redisTemplate.opsForValue().get("book");
        System.out.println(book1);
    }

}
