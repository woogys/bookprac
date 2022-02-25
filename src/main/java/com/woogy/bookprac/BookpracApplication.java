package com.woogy.bookprac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableJpaAuditing이 삭제됨
@SpringBootApplication
public class BookpracApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookpracApplication.class, args);
    }

}
