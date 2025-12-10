import java.time.LocalDate;

public class Penalty {
    private static int idCounter = 1;

    private int penaltyId;
    private String violationId;
    private double amount;
    private LocalDate issuedDate;
    private LocalDate dueDate;
    private String paymentStatus;

    public Penalty(String violationId, double amount,
            LocalDate dueDate, String status) {

        if (amount <= 0)
            throw new IllegalArgumentException("Invalid amount");
        if (!dueDate.isAfter(LocalDate.now()))
            throw new IllegalArgumentException("Invalid due date");
        if (!status.matches("Paid|Unpaid|Late"))
            throw new IllegalArgumentException("Invalid status");

        this.penaltyId = idCounter;
        this.violationId = violationId;
        this.amount = amount;
        this.issuedDate = LocalDate.now();
        this.dueDate = dueDate;
        this.paymentStatus = status;
        idCounter++;
    }

    public int getPenaltyId() {
        return penaltyId;
    }

    public void setPenaltyId(int penaltyId) {
        this.penaltyId = penaltyId;
    }

    public String getViolationId() {
        return violationId;
    }

    public void setViolationId(String violationId) {
        this.violationId = violationId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(LocalDate issuedDate) {
        this.issuedDate = issuedDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    
}
