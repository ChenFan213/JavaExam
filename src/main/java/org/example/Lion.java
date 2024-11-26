package org.example;

// Lion: a subclass of Park
// Lion also need to have age

class Lion extends Park{
    private int age;

    public Lion(String name,int id,int age){
        super(name,id); // inherits from class Park
        this.age = age;
    }

    // getter to get age of Lion
    public int getAge(){
        return age;
    }
}
