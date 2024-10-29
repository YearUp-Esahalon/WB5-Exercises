package com.pluralsight;

public class Dog  extends Animal{

    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

public void bark(){
        if(super.getWeight() <50) {
            System.out.println("Bark");
        }
        else{
            System.out.println ("W00F");
        }
}




}
