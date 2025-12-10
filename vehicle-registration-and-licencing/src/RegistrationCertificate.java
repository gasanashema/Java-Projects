import java.time.LocalDate;

public class RegistrationCertificate {
    private static int idCounter = 1;

    private int certificateId;
    private String vehicleId;
    private LocalDate issueDate;
    private LocalDate expiryDate;
    private String status;
    private String issuedBy;

    public RegistrationCertificate(String vehicleId,
            LocalDate issueDate, LocalDate expiryDate,
            String status, String issuedBy) {

        if (!expiryDate.isAfter(issueDate))
            throw new IllegalArgumentException("Invalid expiry date");

        if (!status.matches("Active|Expired|Suspended"))
            throw new IllegalArgumentException("Invalid status");

        this.certificateId = idCounter;
        this.vehicleId = vehicleId;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
        this.status = status;
        this.issuedBy = issuedBy;
        idCounter++;
    }

    public int getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(int certificateId) {
        this.certificateId = certificateId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }
    
}
