public interface EnforcementOperations {
    void recordViolation();

    void suspendRegistration();

    void blacklistVehicle();

    void verifyDocuments();

    void calculatePenalty();

    void generateEnforcementReport();
}
