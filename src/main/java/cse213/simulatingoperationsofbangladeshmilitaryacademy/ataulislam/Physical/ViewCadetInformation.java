package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam.Physical;

public class ViewCadetInformation {
    private String cadetId;
    private String cadetName;
    private String company;
    private String platoon;
    private String rank;
    private String status;

    public ViewCadetInformation(String cadetId, String cadetName, String company, String platoon, String rank, String status) {
        this.cadetId = cadetId;
        this.cadetName = cadetName;
        this.company = company;
        this.platoon = platoon;
        this.rank = rank;
        this.status = status;
    }

    public String getCadetId() {
        return cadetId;
    }

    public void setCadetId(String cadetId) {
        this.cadetId = cadetId;
    }

    public String getCadetName() {
        return cadetName;
    }

    public void setCadetName(String cadetName) {
        this.cadetName = cadetName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPlatoon() {
        return platoon;
    }

    public void setPlatoon(String platoon) {
        this.platoon = platoon;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ViewCadetInformation{" +
                "cadetId='" + cadetId + '\'' +
                ", cadetName='" + cadetName + '\'' +
                ", company='" + company + '\'' +
                ", platoon='" + platoon + '\'' +
                ", rank='" + rank + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
