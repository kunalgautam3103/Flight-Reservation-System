package com.company;

public class Contact {
    private String name;
    private  String pnone;
    private  String email;

    public  Contact(String name, String pnone,String email){
        this.name=name;
        this.pnone=pnone;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public String getPnone() {
        return pnone;
    }

    public String getEmail() {
        return email;
    }

}
