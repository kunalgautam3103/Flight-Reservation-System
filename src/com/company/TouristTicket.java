package com.company;

public class TouristTicket extends Ticket {

    private String hotelAddress;
    private String [] location;

    public TouristTicket(Passenger passenger,Flight flight,String from,String to, String depatureTime,String arrivalTime,String seatNo,float price,String hotelAddress, String[] location){
        super(passenger, flight,from,to,depatureTime,arrivalTime,seatNo,price);
        this.setPnrNumber("p00001");
        this.hotelAddress=hotelAddress;
        this.location=location;


    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public String getLocation() {
        return this.location[0];
    }

    public void removeLocation(){
        this.location=null;

    }
    public  void  addLocation(String[] location){
      for(int i =0; i<5;i++){
          location[i]=location[i];
      }
    }


}
