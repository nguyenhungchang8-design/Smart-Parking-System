package model;

import java.math.BigDecimal;
import java.util.Date;

public class Payment {
    private int paymentId;
    private int ticketId;
    private BigDecimal amount;
    private String paymentMethod;
    private String status;
    private Date paidAt; // Nullable
    private Date createdAt;

    public Payment() {
    }

    public Payment(int paymentId, int ticketId, BigDecimal amount, String paymentMethod, String status, Date paidAt, Date createdAt) {
        this.paymentId = paymentId;
        this.ticketId = ticketId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.status = status;
        this.paidAt = paidAt;
        this.createdAt = createdAt;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getPaidAt() {
        return paidAt;
    }

    public void setPaidAt(Date paidAt) {
        this.paidAt = paidAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", ticketId=" + ticketId +
                ", amount=" + amount +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", status='" + status + '\'' +
                ", paidAt=" + paidAt +
                ", createdAt=" + createdAt +
                '}';
    }
}
