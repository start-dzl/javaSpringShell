package com.example.springshell.commands;

import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellComponent;

import java.util.Objects;
import java.util.Scanner;

@ShellComponent
public class MyCommands {

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
}
