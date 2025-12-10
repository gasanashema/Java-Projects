import java.time.LocalDate;

public class Insurance {
    private static int idCounter = 1;

    private int insuranceId;
    private int vehicleId;
    private String provider;
    private double premiumAmount;
    private LocalDate validFrom;
    private LocalDate validTo;

    public Insurance(int vehicleId, String provider, double premiumAmount, LocalDate validFrom,
            LocalDate validTo) {

        if (premiumAmount <= 0)
            throw new IllegalArgumentException("Invalid premium");
        if (provider.isEmpty())
            throw new IllegalArgumentException("Provider required");
        if (!validTo.isAfter(validFrom))
            throw new IllegalArgumentException("Invalid dates");

        this.insuranceId = idCounter;
        this.vehicleId = vehicleId;
        this.provider = provider;
        this.premiumAmount = premiumAmount;
        this.validFrom = validFrom;
        this.validTo = validTo;

        idCounter++;
    }

    public int getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(int insuranceId) {
        this.insuranceId = insuranceId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(double premiumAmount) {
        this.premiumAmount = premiumAmount;
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

    

}
