package ru.lesson.clinic;

public class  Animal implements Pet{

    public String name;

    public Animal(String name){
        this.name = name;
        //System.out.println(name);
    }


    public String getName(){
        //System.out.println(this.name);
        return this.name;

    }

    public void setName(String name){
        this.name = name;
        //System.out.println(name);
    }
}
