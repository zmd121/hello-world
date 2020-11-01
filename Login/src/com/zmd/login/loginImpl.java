package com.zmd.login;

import org.omg.CORBA.ARG_OUT;

import java.util.ArrayList;
import java.util.Scanner;

public class loginImpl {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入登录口令");
        String s=scanner.nextLine();
        for (String m:arr){
            if (m.equals("1"));
            System.out.println("口令正确，登陆成功");
        }

    }

}
