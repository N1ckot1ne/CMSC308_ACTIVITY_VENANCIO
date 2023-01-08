/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paking_package;

/**
 *
 * @author nicko
 */
public class Hooman {
    // attributes
    private String name, skills;
    private int age;

    public void getName() {
        System.out.println("Name: " + name);
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void getSkills() {
        System.out.println("Skills: " + skills);
    }
    
    public void setSkills(String newSkills) {
        this.skills = newSkills;
    }
    
    public void getAge() {
        System.out.println("Age: " + age);
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    // constructor
    public Hooman() {
        System.out.println("Person has been created!");
    }

    // method
    public void Introduce() {
        System.out.println("Hi. My name is " + name + ". I am " + age + " years old.");
    }
}