package ru.lesson.clinic;

public class Client {
    private String id;
    private Pet pet;

    public Client(String id, Pet pet){
        this.id = id;
        this.pet = pet;
    }
    public String getNameClient(){
        return this.id;
    }
    public Pet getPet(){
        return this.pet;
    }

    public void setNameClient(String name){
        this.id = name;
    }


    public void delPet(){
        this.pet = null;
    }
}
