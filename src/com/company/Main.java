package com.company;

public class Main {
      public static void printTicketDetails(Ticket ticket){
          System.out.println("PNR Number "+ ticket.getPnrNumber());
      }

    public static void main(String[] args) {
        Flight flight1=new Flight("Air001","AirIndia",100);
        System.out.println("Airline : "+flight1.getAirline()+" Flight Number: "+flight1.getFlightNumber()+" Flight capacity: "+flight1.getCapacity());


        Passenger passenger1= new Passenger(1,"sham","123234444","sham@gmail.com","sec13","delhi","new delhi");
        Passenger passenger2= new Passenger(1,"amam","122234444","aman@gmail.com","sec13","sonipat","haryana");

        Ticket t1= new RegularTicket(passenger1,flight1,"delhi","mumbai","9 Am","12 Pm","A001",1200,"water");
        printTicketDetails(t1);
        t1.getPassengerDetails();
        t1.getFlightDetails();




        String[] loc= {"pune","mumbai"};
        Ticket t2= new TouristTicket(passenger2,flight1,"delhi","mumbai","9 Am","12 Pm","A001",1200,"5star",loc);
        printTicketDetails(t2);
        t2.getPassengerDetails();
        t2.getFlightDetails();
        System.out.println("Number of passenger "+ passenger2.getPassengerCount());







    }

}
