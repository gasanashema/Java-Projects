package auca;

public class GishushuCampus {
    private int id;
    private String gishushuAddress;
    private String gishushuPhone;
    private String gishushuEmail;
    public GishushuCampus(int id, String gishushuAddress, String gishushuPhone, String gishushuEmail) {
        this.id = id;
        this.gishushuAddress = gishushuAddress;
        this.gishushuPhone = gishushuPhone;
        this.gishushuEmail = gishushuEmail;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getGishushuAddress() {
        return gishushuAddress;
    }
    public void setGishushuAddress(String gishushuAddress) {
        if(gishushuAddress.isEmpty() || gishushuAddress.equalsIgnoreCase("gishushu")){
            System.out.println("You should provide address");
        }
        this.gishushuAddress = gishushuAddress;
    }
    public String getGishushuPhone() {
        return gishushuPhone;
    }
    public void setGishushuPhone(String gishushuPhone) {
        if (!gishushuPhone.endsWith("8449")) {
            System.out.println("Incorrect phone number");
        }
        this.gishushuPhone = gishushuPhone;
    }
    public String getGishushuEmail() {
        return gishushuEmail;
    }
    public void setGishushuEmail(String gishushuEmail) {
        if (!gishushuEmail.contains("auca@")) {
            System.out.println("Invalid email");
            return;
        }
        this.gishushuEmail = gishushuEmail;
    }


}
