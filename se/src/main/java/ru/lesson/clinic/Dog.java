package ru.lesson.clinic;

public class Dog implements Pet{
    //private final String name;
    //private final Animal animal;
    //public String name;
    private final Pet pet;

    public Dog(final Pet pet){
        this.pet = pet;
    }

    //public Dog (String name){
    //	this.name = name;
    //}

    @Override
    public String getName(){
        //return this.pet.name;
        //return this.name;
        return this.pet.getName();
    }

    @Override
    public void setName(String name){
        //this.animal.name = "name";
        //System.out.println("name");
        //this.pet.name = name;
        this.pet.setName(name);
    }

    //@Override
    //public String getName(){
    //	return this.animal.getName();
    //}

    //@Override
    //public void setName(String "name"){
    //	this.animal.name = "name";
    //}
}
