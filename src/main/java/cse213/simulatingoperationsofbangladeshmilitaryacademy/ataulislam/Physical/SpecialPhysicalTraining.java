package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam.Physical;

import java.time.LocalDate;

public class SpecialPhysicalTraining {
    private String select;
    private String cadetId;
    private String cadetName;
    private String company;
    private String platoon;
    private LocalDate pftTestDate;
    private String testLocation;
    private String additionalInstructions;

    public SpecialPhysicalTraining(String select, String cadetId, String cadetName, String company, String platoon, LocalDate pftTestDate, String testLocation, String additionalInstructions) {
        this.select = select;
        this.cadetId = cadetId;
        this.cadetName = cadetName;
        this.company = company;
        this.platoon = platoon;
        this.pftTestDate = pftTestDate;
        this.testLocation = testLocation;
        this.additionalInstructions = additionalInstructions;
    }

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
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

    public LocalDate getPftTestDate() {
        return pftTestDate;
    }

    public void setPftTestDate(LocalDate pftTestDate) {
        this.pftTestDate = pftTestDate;
    }

    public String getTestLocation() {
        return testLocation;
    }

    public void setTestLocation(String testLocation) {
        this.testLocation = testLocation;
    }

    public String getAdditionalInstructions() {
        return additionalInstructions;
    }

    public void setAdditionalInstructions(String additionalInstructions) {
        this.additionalInstructions = additionalInstructions;
    }

    @Override
    public String toString() {
        return "SpecialPhysicalTraining{" +
                "select='" + select + '\'' +
                ", cadetId='" + cadetId + '\'' +
                ", cadetName='" + cadetName + '\'' +
                ", company='" + company + '\'' +
                ", platoon='" + platoon + '\'' +
                ", pftTestDate=" + pftTestDate +
                ", testLocation='" + testLocation + '\'' +
                ", additionalInstructions='" + additionalInstructions + '\'' +
                '}';
    }
}
