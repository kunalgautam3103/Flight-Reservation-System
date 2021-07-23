package com.company;

public class RegularTicket extends Ticket{

    private  String specialservice;

    public RegularTicket(Passenger passenger,Flight flight,String from,String to, String depatureTime,String arrivalTime,String seatNo,float price,String specialservice){
        super(passenger,flight,from,to,depatureTime,arrivalTime,seatNo,price);
        this.specialservice=specialservice;

    }
    public String getSpecialService(){
        return specialservice;
    }
    public void updateSpecialServices(){
        this.specialservice=specialservice;
    }


}
