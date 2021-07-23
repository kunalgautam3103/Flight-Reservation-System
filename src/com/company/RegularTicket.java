package com.company;

public class RegularTicket {
    private String pnrNumber;
    private String from;
    private String to;
    private String depatureTime;
    private  String arrivalTime;
    private  String seatNo;
    private  float price;
    private  boolean cancelled;
    private String status;
    private String duration;
    private  String specialservice;

    public RegularTicket(String pnrNumber,String from,String to, String depatureTime,String arrivalTime,String seatNo,float price,String specialservice){
        this.pnrNumber=pnrNumber;
        this.from=from;
        this.to=to;
        this.depatureTime=depatureTime;
        this.arrivalTime=arrivalTime;
        this.seatNo=seatNo;
        this.price=price;
        this.specialservice=specialservice;

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
    public String getSpeacialService(){
        return specialservice;
    }
}
