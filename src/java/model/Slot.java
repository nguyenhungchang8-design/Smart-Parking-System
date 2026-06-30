package model;

public class Slot {
    private int slotId;
    private int lotId;
    private int floorNumber;
    private String slotCode;
    private String vehicleType;
    private String status;

    public Slot() {
    }

    public Slot(int slotId, int lotId, int floorNumber, String slotCode, String vehicleType, String status) {
        this.slotId = slotId;
        this.lotId = lotId;
        this.floorNumber = floorNumber;
        this.slotCode = slotCode;
        this.vehicleType = vehicleType;
        this.status = status;
    }

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public int getLotId() {
        return lotId;
    }

    public void setLotId(int lotId) {
        this.lotId = lotId;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public String getSlotCode() {
        return slotCode;
    }

    public void setSlotCode(String slotCode) {
        this.slotCode = slotCode;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Slot{" +
                "slotId=" + slotId +
                ", lotId=" + lotId +
                ", floorNumber=" + floorNumber +
                ", slotCode='" + slotCode + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
