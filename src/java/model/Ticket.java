package model;

import java.util.Date;

public class Ticket {
    private int ticketId;
    private int lotId;
    private int slotId;
    private Integer accountId; // Nullable
    private String licensePlate;
    private String vehicleType;
    private Date checkInTime;
    private Date checkOutTime; // Nullable
    private String status;
    private int createdBy;

    public Ticket() {
    }

    public Ticket(int ticketId, int lotId, int slotId, Integer accountId, String licensePlate, String vehicleType, Date checkInTime, Date checkOutTime, String status, int createdBy) {
        this.ticketId = ticketId;
        this.lotId = lotId;
        this.slotId = slotId;
        this.accountId = accountId;
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.status = status;
        this.createdBy = createdBy;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getLotId() {
        return lotId;
    }

    public void setLotId(int lotId) {
        this.lotId = lotId;
    }

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Date getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Date checkInTime) {
        this.checkInTime = checkInTime;
    }

    public Date getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(Date checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", lotId=" + lotId +
                ", slotId=" + slotId +
                ", accountId=" + accountId +
                ", licensePlate='" + licensePlate + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", checkInTime=" + checkInTime +
                ", checkOutTime=" + checkOutTime +
                ", status='" + status + '\'' +
                ", createdBy=" + createdBy +
                '}';
    }
}
