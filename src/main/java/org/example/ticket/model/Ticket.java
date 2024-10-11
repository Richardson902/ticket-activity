package org.example.ticket.model;

import jakarta.persistence.*;

@Entity
@Table(name="tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long ticketId;

    @Column(name ="firstname")
    private String firstName;

    @Column(name ="lastname")
    private String lastName;

    @Column(name="dob")
    private String dob;

    @Column(name="flightnumber")
    private int flightNumber;

    @Column(name="departuretime")
    private String departureTime;

    @Column(name="arrivaltime")
    private String arrivalTime;

    @Column(name="departureairport")
    private String departureAirport;

    @Column(name="arrivalairport")
    private String arrivalAirport;

    // Constructor with all fields
    public Ticket(Long ticketId, String firstName, String lastName, String dob, int flightNumber, String departureTime, String arrivalTime, String departureAirport, String arrivalAirport){
        this.ticketId = ticketId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    // Constructor without ticketId (for creating new tickets as the database will automatically generate the ticketId)
    public Ticket(String firstName, String lastName, String dob, int flightNumber, String departureTime, String arrivalTime, String departureAirport, String arrivalAirport){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    // Default constructor
    public Ticket(){
    }

    // Getters and Setters
    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }
}
