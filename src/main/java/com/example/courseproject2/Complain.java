package com.example.courseproject2;

public class Complain {
    private String reason;
    private String complaint;
    private String clientName;

    public Complain(String reason, String complaint, String clientName) {
        this.reason = reason;
        this.complaint = complaint;
        this.clientName =clientName;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}
