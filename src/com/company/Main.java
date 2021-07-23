package com.company;

public class Main {

    public static void main(String[] args) {
        Flight flight=new Flight("Air001","AirIndia",100);
        System.out.println(flight.getAirline());
        System.out.println(flight.getFlightNumber());
        System.out.println(flight.getCapacity());

        Passenger passenger1= new Passenger(1);
        System.out.println(passenger1.getId());

        RegularTicket passenger2= new RegularTicket("0001","delhi","mumbai","9 Am","12 Pm","A001",1200,"water");

        System.out.println(passenger2.checkStatus());
        System.out.println(passenger2.getSpeacialService());

        String[] loc= {"pune"};
        TouristTicket passenger3= new TouristTicket("0001","delhi","mumbai","9 Am","12 Pm","A001",1200,"5star",loc);
        System.out.println(passenger3.getHotelAddress());
        System.out.println(passenger3.getLocation());

        Contact pass = new Contact("aman","9999789","anam31@gmai.com");
        System.out.println(pass.getEmail());
        System.out.println(pass.getPnone());

        Address pass1= new Address("sec12","sonipat","haryana");
        System.out.println(pass1.getCity());
        System.out.println(pass1.getStreet());


    }
}
