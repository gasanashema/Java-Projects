package bank;

public class Loan {
    private int loanId;
    private double requestedAmount;
    private double approvedAmount;
    
    public Loan(int loanId, double requestedAmount, double approvedAmount) {
        this.loanId = 0;
        this.requestedAmount = 0;
        this.approvedAmount = 0;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public double getRequestedAmount() {
        return requestedAmount;
    }

    public void setRequestedAmount(double requestedAmount) {
        this.requestedAmount = requestedAmount;
    }

    public double getApprovedAmount() {
        return approvedAmount;
    }

    public void setApprovedAmount(double approvedAmount) {
        this.approvedAmount = approvedAmount;
    }
}
