import java.time.LocalDate;

public class Officer {
    private static int idCounter = 1;

    private int officerId;
    private String name;
    private String department;
    private String badgeNumber;
    private String rank;
    private LocalDate joinDate;

    public Officer(String name, String department,
            String badgeNumber, String rank) {

        if (name.isEmpty() || department.isEmpty())
            throw new IllegalArgumentException("Invalid details");

        if (!rank.matches("Inspector|Sergeant|Constable"))
            throw new IllegalArgumentException("Invalid rank");

        this.officerId = idCounter;
        this.name = name;
        this.department = department;
        this.badgeNumber = badgeNumber;
        this.rank = rank;
        this.joinDate = LocalDate.now();
        idCounter++;
    }

    public int getOfficerId() {
        return officerId;
    }

    public void setOfficerId(int officerId) {
        this.officerId = officerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    
}
