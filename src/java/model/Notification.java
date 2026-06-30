package model;

import java.util.Date;

public class Notification {
    private int notificationId;
    private int accountId;
    private Integer lotId; // Nullable
    private String type;
    private String title;
    private String message;
    private boolean isRead;
    private Date createdAt;

    public Notification() {
    }

    public Notification(int notificationId, int accountId, Integer lotId, String type, String title, String message, boolean isRead, Date createdAt) {
        this.notificationId = notificationId;
        this.accountId = accountId;
        this.lotId = lotId;
        this.type = type;
        this.title = title;
        this.message = message;
        this.isRead = isRead;
        this.createdAt = createdAt;
    }

    public int getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public Integer getLotId() {
        return lotId;
    }

    public void setLotId(Integer lotId) {
        this.lotId = lotId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "notificationId=" + notificationId +
                ", accountId=" + accountId +
                ", lotId=" + lotId +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", isRead=" + isRead +
                ", createdAt=" + createdAt +
                '}';
    }
}
