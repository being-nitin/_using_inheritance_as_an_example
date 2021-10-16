package com.nitincodes;

public class Main {

    public static void main(String[] args) {
	// write your code here
        child c1 = new child();
        child c2 = new child();
        c1.age = 56;
        c1.height = 456;
        c1.name = "nitin";
        c1.run();
        c1.walk();
        c2.age = 58;
        c2.height = 446;
        c2.name = "nikhil";
        c2.run();
        c2.walk();
    }
}

class child extends Parent{
    }
class Parent{
    int height;
    int age;
    String name;

    public void walk(){
        System.out.println(name+"is having height "+height+" and age "+age+" is walking");
    }
    public void run(){
        System.out.println(name+" is having height "+height+" and age"+age+" is running");
    }
}
