package ru.lesson.clinic;

public class CatDog implements Pet{
    public final Pet cat;
    private final Pet dog;
    //public final String name;

    public CatDog(Pet cat, Pet dog){
        this.cat = cat;
        this.dog = dog;
    }

    @Override
    public String getName(){
        //return this.cat.name;
        return this.cat.getName();

    }

    @Override
    public void setName(String name){
        //this.cat.name = name;
        //this.dog.name = name;
        this.cat.setName(name);
        this.dog.setName(name);
    }
}
