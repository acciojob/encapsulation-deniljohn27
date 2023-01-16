package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly r=new RWOnly();
        //r.name="Denil";
        //System.out.print(r.name);
         r.setName("Denil");
         r.getName();
    }
}