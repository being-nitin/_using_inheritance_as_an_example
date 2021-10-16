package com.nitincodes;

public class Main {

    public static void main(String[] args) {
	// write your  code here
        child c1 = new child(23,"ravi");
        child c2 = new child(26,"rahul");
        c1.walk();
        c1.run();
        c2.walk();
        c2.run();
    }
}

class child extends Parent{
    public child(int age, String name) {
        super(age, name);
    }
}
class Parent{
    int height;
    int age;
    String name;
public Parent(int cAge , String cname){
    this.name = cname;
    this.age = cAge;
}
    public void walk(){
        System.out.println(name+"is having height "+height+" and age "+age+" is walking");
    }
    public void run(){
        System.out.println(name+" is having height "+height+" and age"+age+" is running");
    }
}
