package org.example;
import java.util.Date;


public class Reservations {
    private int reservationId;
    private Date startDate;
    private Date endDate;
    private int roomId;
    private String guestName;
    private int numberOfGuests;

    // Constructor
    public Reservations(int reservationId, Date startDate, Date endDate, int roomId, String guestName, int numberOfGuests) {
        this.reservationId = reservationId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.roomId = roomId;
        this.guestName = guestName;
        this.numberOfGuests = numberOfGuests;
    }

    // Getters and Setters
    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }


}
