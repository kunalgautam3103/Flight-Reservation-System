package com.company;

public class Flight {
    private String flightNumber ;
    private  String airline;
    private  int capacity;
    private  int seatbooked;

    public Flight(String flightNumber,String airline,int capacity){
        this.flightNumber=flightNumber;
        this.airline=airline;
        this.capacity=capacity;
    }

    public String getFlightNumber() {
        return flightNumber;
    }


    public String getAirline() {
        return airline;
    }



    public int getCapacity() {
        return capacity;
    }


    public int getSeatbooked() {
        return seatbooked;
    }


}
