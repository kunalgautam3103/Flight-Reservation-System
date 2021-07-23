package com.company;

public abstract class Ticket {
    private String pnrNumber;
    private Flight flight;
    private Passenger passenger;
    private String from;
    private String to;
    private String depatureTime;
    private  String arrivalTime;
    private  String seatNo;
    private  float price;
    private  boolean cancelled;
    private String status;
    private String duration;

    public Ticket(Passenger passenger,Flight flight,String from,String to, String depatureTime,String arrivalTime,String seatNo,float price){
        this.passenger=passenger;
        this.flight=flight;
        this.from=from;
        this.to=to;
        this.depatureTime=depatureTime;
        this.arrivalTime=arrivalTime;
        this.seatNo=seatNo;
        this.price=price;

    }



    public void setPnrNumber(String pnrNumber) {
        this.pnrNumber = "A11103";
    }
    public String getPnrNumber(){
        return this.pnrNumber;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDepatureTime() {
        return depatureTime;
    }

    public void setDepatureTime(String depatureTime) {
        this.depatureTime = depatureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public String getStatus() {
        return status;
    }

    public String checkStatus(){
        this.status="confirmed";
        return status;
    }
    public void cancel(){
        cancelled=true;

    }
    public void setFlightDetails(Flight flight){
        this.flight=flight;
        this.flight.setSeatbooked();

    }

    public void getFlightDetails(){
        System.out.println("Flight name "+ this.flight.getFlightNumber()+" , Airlines "+ this.flight.getAirline()+", flight capacity "+ this.flight.getCapacity());

    }
    public void getPassengerDetails(){

        System.out.println(this.passenger.getContact());
        System.out.println(this.passenger.getAddress());
    }
}
