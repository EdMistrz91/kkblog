package com.GamingBlog.gamingblog;

import com.GamingBlog.gamingblog.service.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class GamingBlogApplication implements CommandLineRunner {

    @Resource
    StorageService storageService;

    public static void main(String[] args) {
        SpringApplication.run(GamingBlogApplication.class, args);
    }

    @Override
    public void run(final String... args) throws Exception {
        storageService.init();
    }
}
