package Fahrkartenautomat;

public class Ticket {
    private double ticketCost;
    private String ticketname;
    private int ticketID;

    public Ticket() {

    }

    public Ticket(int ticketID, String ticketname, double ticketCost) {
        this.ticketCost = ticketCost;
        this.ticketname = ticketname;
        this.ticketID = ticketID;
    }

    public double getTicketCost() {
        return ticketCost;
    }

    public String getTicketname() {
        return ticketname;
    }

    public void setTicketCost(double ticketCost) {
        this.ticketCost = ticketCost;
    }

    public void setTicketname(String ticketname) {
        this.ticketname = ticketname;
    }

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    @Override
    public String toString() {
        return "Ticket{" + "ID='" + ticketID + '\'' + ", Ticketname='" + ticketname + '\'' + ", Ticketcost='" + ticketCost + '\'' + '}';
    }
}
