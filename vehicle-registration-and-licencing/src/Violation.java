import java.time.LocalDate;

public class Violation {
    private static int idCounter = 1;

    private int violationId;
    private String vehicleId;
    private String violationType;
    private double fineAmount;
    private LocalDate date;
    private String officerId;

    public Violation(String vehicleId, String violationType,
            double fineAmount, String officerId) {

        if (fineAmount <= 0)
            throw new IllegalArgumentException("Invalid fine");
        if (!violationType.matches("Speeding|NoInsurance|ExpiredTax"))
            throw new IllegalArgumentException("Invalid violation type");

        this.violationId = idCounter;
        this.vehicleId = vehicleId;
        this.violationType = violationType;
        this.fineAmount = fineAmount;
        this.officerId = officerId;
        this.date = LocalDate.now();

        idCounter++;
    }

    public int getViolationId() {
        return violationId;
    }

    public void setViolationId(int violationId) {
        this.violationId = violationId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getViolationType() {
        return violationType;
    }

    public void setViolationType(String violationType) {
        this.violationType = violationType;
    }

    public double getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(double fineAmount) {
        this.fineAmount = fineAmount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getOfficerId() {
        return officerId;
    }

    public void setOfficerId(String officerId) {
        this.officerId = officerId;
    }

    
}
