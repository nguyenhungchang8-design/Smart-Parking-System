package model;

import java.util.Date;

public class Reservation {
    private int reservationId;
    private int accountId;
    private int slotId;
    private Date reservedFrom;
    private Date reservedTo;
    private String status;
    private Date createdAt;

    public Reservation() {
    }

    public Reservation(int reservationId, int accountId, int slotId, Date reservedFrom, Date reservedTo, String status, Date createdAt) {
        this.reservationId = reservationId;
        this.accountId = accountId;
        this.slotId = slotId;
        this.reservedFrom = reservedFrom;
        this.reservedTo = reservedTo;
        this.status = status;
        this.createdAt = createdAt;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public Date getReservedFrom() {
        return reservedFrom;
    }

    public void setReservedFrom(Date reservedFrom) {
        this.reservedFrom = reservedFrom;
    }

    public Date getReservedTo() {
        return reservedTo;
    }

    public void setReservedTo(Date reservedTo) {
        this.reservedTo = reservedTo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", accountId=" + accountId +
                ", slotId=" + slotId +
                ", reservedFrom=" + reservedFrom +
                ", reservedTo=" + reservedTo +
                ", status='" + status + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
