package src.Ticket_runner;

public class Ticket_Runner {


    public static void main(String args []){

    TicketMachine myTicket = new TicketMachine(500);

    myTicket.insertMoney(400);
    myTicket.printTicket();
    System.out.println(myTicket.getBalance());








    }



}
