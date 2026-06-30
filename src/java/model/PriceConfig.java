package model;

import java.math.BigDecimal;
import java.util.Date;

public class PriceConfig {
    private int priceId;
    private int lotId;
    private String vehicleType;
    private BigDecimal pricePerHour;
    private BigDecimal overtimeFee;
    private Date effectiveFrom;

    public PriceConfig() {
    }

    public PriceConfig(int priceId, int lotId, String vehicleType, BigDecimal pricePerHour, BigDecimal overtimeFee, Date effectiveFrom) {
        this.priceId = priceId;
        this.lotId = lotId;
        this.vehicleType = vehicleType;
        this.pricePerHour = pricePerHour;
        this.overtimeFee = overtimeFee;
        this.effectiveFrom = effectiveFrom;
    }

    public int getPriceId() {
        return priceId;
    }

    public void setPriceId(int priceId) {
        this.priceId = priceId;
    }

    public int getLotId() {
        return lotId;
    }

    public void setLotId(int lotId) {
        this.lotId = lotId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public BigDecimal getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(BigDecimal pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public BigDecimal getOvertimeFee() {
        return overtimeFee;
    }

    public void setOvertimeFee(BigDecimal overtimeFee) {
        this.overtimeFee = overtimeFee;
    }

    public Date getEffectiveFrom() {
        return effectiveFrom;
    }

    public void setEffectiveFrom(Date effectiveFrom) {
        this.effectiveFrom = effectiveFrom;
    }

    @Override
    public String toString() {
        return "PriceConfig{" +
                "priceId=" + priceId +
                ", lotId=" + lotId +
                ", vehicleType='" + vehicleType + '\'' +
                ", pricePerHour=" + pricePerHour +
                ", overtimeFee=" + overtimeFee +
                ", effectiveFrom=" + effectiveFrom +
                '}';
    }
}
