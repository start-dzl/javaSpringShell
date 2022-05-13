package com.example.springshell.commands;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellComponent;

import java.util.Objects;
import java.util.Scanner;

@ShellComponent
public class MyCommands {
    @Autowired
    private MongoTemplate mongoTemplate;


    @ShellMethod("Add two integers together.")
    public String add(int a) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("第"+ i +"次请问" +"要加一吗 yes/no");
            String name = sc.nextLine();
            System.out.println(name);
            if(Objects.equals(name, "yes")) {
               a = a + 1;
            }
        }

        return "end" + a;
    }

    @ShellMethod("Add two integers together.")
    public Long mo(int a) {
        return mongoTemplate.count(new Query(),"t_person");
    }
}
