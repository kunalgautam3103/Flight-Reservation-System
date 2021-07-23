package com.company;

public class TouristTicket {
    private String pnrNumber;
     private  Passenger passenger;
     Flight flight;
    private String from;
    private String to;
    private String depatureTime;
    private  String arrivalTime;
    private  String seatNo;
    private  float price;
    private  boolean cancelled;
    private String status;
    private String duration;
    private String hotelAddress;
    private String [] location;

    public TouristTicket(String pnrNumber,Passenger passenger,Flight flight,String from,String to, String depatureTime,String arrivalTime,String seatNo,float price,String hotelAddress, String[] location){
        this.pnrNumber=pnrNumber;
        this.passenger=passenger;
        this.flight=flight;
        this.from=from;
        this.to=to;
        this.depatureTime=depatureTime;
        this.arrivalTime=arrivalTime;
        this.seatNo=seatNo;
        this.price=price;
        this.hotelAddress=hotelAddress;
        this.location=location;


    }
    public String checkStatus(){
        this.status="confirmed";
        return status;
    }
    public void cancel(){
        cancelled=true;

    }
    public void getFlightDuration(){
        this.duration="2 Hour";
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public String[] getLocation() {
        return location;
    }
    public void getFlightDetails(){
        System.out.println("Flight name "+ this.flight.getFlightNumber());
        System.out.println("Flight company "+ this.flight.getAirline());
        System.out.println("flight capacity "+ this.flight.getCapacity());
        System.out.println("seated booked "+ this.flight.getSeatbooked());

    }
    public void getPassengerDetails(){
        System.out.println(this.passenger.getContact());
        System.out.println(this.passenger.getAddress());
    }
}
