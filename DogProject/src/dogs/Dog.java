/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogs;

/**
 *
 * @author ajay
 */
public class Dog {
    //varibles
    private String name;
    private int age;
    private String breed;
    //constructors
    public Dog(String nameIn, int ageIn, String breedIn){
        name = nameIn;
        age = ageIn;
        breed = breedIn;        
    }
    //accessor or getters
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getBreed(){
        return breed;
    }
    //setters
    
    public void setName(String nameIn){
         name = nameIn;
    }
    
    public void setAge(int ageIn){
        age = ageIn;
    }
    
    public void setBreed(String breedIn){
        breed = breedIn;
    }
    
    public String toString(){
        return name+"-"+age+"-"+breed;
    }
    
    public int incrementAge(){
        age = age+1;
        return age;
    }
    
    
    //methods
}
