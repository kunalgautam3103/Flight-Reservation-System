package com.company;

public class Main {

    public static void main(String[] args) {
        Flight flight1=new Flight("Air001","AirIndia",100);
        System.out.println(flight1.getAirline());
        System.out.println(flight1.getFlightNumber());
        System.out.println(flight1.getCapacity());

        Passenger passenger1= new Passenger(1,"sham","123234444","sham@gmail.com","sec13","delhi","new delhi");
        Passenger passenger4= new Passenger(1,"amam","122234444","aman@gmail.com","sec13","sonipat","haryana");

        RegularTicket passenger2= new RegularTicket(passenger1,flight1,"delhi","mumbai","9 Am","12 Pm","A001",1200,"water");
        System.out.println("seat no "+passenger2.getSeatNo());
        passenger2.getPassengerDetails();
        passenger2.getFlightDetails();
        System.out.println(passenger2.getSpecialService());



        String[] loc= {"pune","mumbai"};
        TouristTicket passenger3= new TouristTicket(passenger4,flight1,"delhi","mumbai","9 Am","12 Pm","A001",1200,"5star",loc);
        System.out.println(passenger3.getPnrNumber());
        passenger3.getPassengerDetails();
       passenger3.getFlightDetails();
        System.out.println("hotel Address "+passenger3.getHotelAddress()+" Location "+passenger3.getLocation());





    }
}
