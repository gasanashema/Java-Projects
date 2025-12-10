import java.time.LocalDate;
import java.time.Period;

public class Owner {
    private int ownerId;
    private String name;
    private int nationalId;
    private String phone;
    private String address;
    private LocalDate dateOfBirth;

    private static int idCounter = 1;

    public Owner(String name, int nationalId, String phone, String address, LocalDate dateOfBirth) {

        if (Period.between(dateOfBirth, LocalDate.now()).getYears() < 18) {
            throw new IllegalArgumentException("Owner must be 18+");
        }
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name required");
        }
        if ((nationalId + "").length() != 16) {
            throw new IllegalArgumentException("National Id must be 16 digits");
        }
        if (phone.length() < 10 || phone.length() > 15) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        if (address.isEmpty()) {
            throw new IllegalArgumentException("Address required");
        }
        this.ownerId = idCounter;
        this.name = name;
        this.nationalId = nationalId;
        this.phone = phone;
        this.address = address;
        this.dateOfBirth = dateOfBirth;

        idCounter++;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNationalId() {
        return nationalId;
    }

    public void setNationalId(int nationalId) {
        this.nationalId = nationalId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
