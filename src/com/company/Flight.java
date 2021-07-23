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
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }


    public String getAirline() {
        return airline;
    }
    public void setAirline(String airline) {
        this.airline = airline;
    }



    public int getCapacity() {
        return capacity;
    }


    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setSeatbooked() {
        this.seatbooked=10;
    }

    public int getSeatbooked() {
        return seatbooked;
    }


}
