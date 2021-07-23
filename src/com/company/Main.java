package com.company;

public class Main {

    public static void main(String[] args) {
        Flight flight1=new Flight("Air001","AirIndia",100);
        System.out.println(flight1.getAirline());
        System.out.println(flight1.getFlightNumber());
        System.out.println(flight1.getCapacity());

        Passenger passenger1= new Passenger(1,"sham","123234444","sham@gmail.com","sec13","delhi","new delhi");
        Passenger passenger4= new Passenger(1,"sham","123234444","sham@gmail.com","sec13","delhi","new delhi");

        RegularTicket passenger2= new RegularTicket("0001",passenger1,flight1,"delhi","mumbai","9 Am","12 Pm","A001",1200,"water");
         passenger2.getFlightDetails();
         passenger2.getPassengerDetails();


        String[] loc= {"pune"};
        TouristTicket passenger3= new TouristTicket("0001",passenger4,flight1,"delhi","mumbai","9 Am","12 Pm","A001",1200,"5star",loc);
       passenger3.getPassengerDetails();
       passenger3.getFlightDetails();





    }
}
