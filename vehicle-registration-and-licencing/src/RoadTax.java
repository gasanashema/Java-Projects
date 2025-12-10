import java.time.LocalDate;

public class RoadTax {
    private static int idCounter = 1;

    private int taxId;
    private String vehicleId;
    private double amount;
    private LocalDate validFrom;
    private LocalDate validTo;
    private String status;

    public RoadTax(String vehicleId, double amount,
            LocalDate from, LocalDate to, String status) {

        if (amount <= 0)
            throw new IllegalArgumentException("Invalid amount");
        if (!to.isAfter(from))
            throw new IllegalArgumentException("Invalid dates");
        if (!status.matches("Active|Expired|Pending"))
            throw new IllegalArgumentException("Invalid status");

        this.taxId = idCounter;
        this.vehicleId = vehicleId;
        this.amount = amount;
        this.validFrom = from;
        this.validTo = to;
        this.status = status;

        idCounter++;
    }

    public int getTaxId() {
        return taxId;
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public LocalDate getValidTo() {
        return validTo;
    }

    public void setValidTo(LocalDate validTo) {
        this.validTo = validTo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
