import java.time.LocalDate;

public class OwnershipTransfer {
    private static int idCounter = 1;

    private int transferId;
    private String vehicleId;
    private String oldOwnerId;
    private String newOwnerId;
    private LocalDate transferDate;
    private double fee;

    public OwnershipTransfer(String vehicleId, String oldOwnerId,
            String newOwnerId, double fee) {

        if (oldOwnerId.equals(newOwnerId))
            throw new IllegalArgumentException("Owners must differ");
        if (fee <= 0)
            throw new IllegalArgumentException("Invalid fee");

        this.transferId = idCounter;
        this.vehicleId = vehicleId;
        this.oldOwnerId = oldOwnerId;
        this.newOwnerId = newOwnerId;
        this.transferDate = LocalDate.now();
        this.fee = fee;
        idCounter++;
    }

    public int getTransferId() {
        return transferId;
    }

    public void setTransferId(int transferId) {
        this.transferId = transferId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getOldOwnerId() {
        return oldOwnerId;
    }

    public void setOldOwnerId(String oldOwnerId) {
        this.oldOwnerId = oldOwnerId;
    }

    public String getNewOwnerId() {
        return newOwnerId;
    }

    public void setNewOwnerId(String newOwnerId) {
        this.newOwnerId = newOwnerId;
    }

    public LocalDate getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(LocalDate transferDate) {
        this.transferDate = transferDate;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

}
