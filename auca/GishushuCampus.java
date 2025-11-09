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
        this.gishushuAddress = gishushuAddress;
    }
    public String getGishushuPhone() {
        return gishushuPhone;
    }
    public void setGishushuPhone(String gishushuPhone) {
        this.gishushuPhone = gishushuPhone;
    }
    public String getGishushuEmail() {
        return gishushuEmail;
    }
    public void setGishushuEmail(String gishushuEmail) {
        this.gishushuEmail = gishushuEmail;
    }


}
