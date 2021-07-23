package com.company;

public class Passenger {
   private  static int idCounter;
    private int id;
    private Contact contact;
    private Address address;

    static{
        idCounter=0;
    }


    public class Contact {
        private String name, pnone, email;

        public Contact(String name, String pnone, String email) {
            this.name = name;
            this.pnone = pnone;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPnone(String pnone) {
            this.pnone = pnone;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPnone() {
            return pnone;
        }

        public String getEmail() {
            return email;
        }
    }


    public class Address {
        private String street;
        private  String city;
        private String state;

        public Address(String street,String city,String state){
            this.state=state;
            this.city=city;
            this.street=street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getStreet() {
            return street;
        }

        public String getCity() {
            return city;
        }

        public String getState() {
            return state;
        }
    }
    public Passenger(int id ,String name, String phone,String email,String street, String city, String state){
        this.id=++idCounter;
        this.contact=new Contact(name ,phone ,email);
        this.address=new Address(street, city, state);

    }
    public int getId() {
        return id;
    }
    public int getPassengerCount(){
        return idCounter;
    }
    public String getContact(){
        return  contact.name+", "+contact.pnone+", "+contact.email;
    }
    public String getAddress(){
        return  address.street+", "+address.city+", "+address.state;
    }



}
