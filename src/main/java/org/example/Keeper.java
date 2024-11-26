package org.example;

// Keeper: a subclass of Park
// Keeper also need to have phone number

class Keeper extends Park{
    private String PhoneNum;

    public Keeper(String name,int id,String PhoneNum){
        super(name,id); // inherits from class Park
        this.PhoneNum = PhoneNum;
    }

    // getter to get phone number from instances of Keeper
    public String getPhoneNum(){
        return PhoneNum;
    }
}
