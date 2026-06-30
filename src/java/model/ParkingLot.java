package model;

import java.sql.Time;
import java.util.Date;

public class ParkingLot {
    private int lotId;
    private int ownerId;
    private String name;
    private String address;
    private int totalFloors;
    private Time openTime;
    private Time closeTime;
    private String status;
    private Date createdAt;

    public ParkingLot() {
    }

    public ParkingLot(int lotId, int ownerId, String name, String address, int totalFloors, Time openTime, Time closeTime, String status, Date createdAt) {
        this.lotId = lotId;
        this.ownerId = ownerId;
        this.name = name;
        this.address = address;
        this.totalFloors = totalFloors;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.status = status;
        this.createdAt = createdAt;
    }

    public int getLotId() {
        return lotId;
    }

    public void setLotId(int lotId) {
        this.lotId = lotId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTotalFloors() {
        return totalFloors;
    }

    public void setTotalFloors(int totalFloors) {
        this.totalFloors = totalFloors;
    }

    public Time getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Time openTime) {
        this.openTime = openTime;
    }

    public Time getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Time closeTime) {
        this.closeTime = closeTime;
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
        return "ParkingLot{" +
                "lotId=" + lotId +
                ", ownerId=" + ownerId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", totalFloors=" + totalFloors +
                ", openTime=" + openTime +
                ", closeTime=" + closeTime +
                ", status='" + status + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
