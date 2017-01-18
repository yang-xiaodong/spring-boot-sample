package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Program {

    public static void main(String[] args) {

//        SpringApplication.run(Program.class, args);

    List<String> strList = new ArrayList<>();
        strList.add("hello world");
                strList.add("hello world");
                strList.add("hello world");
                strList.add("hello world");
                strList.add("hello yang");

                int i = strList.indexOf("hello yang");
                System.out.println(i);



                }
                }
