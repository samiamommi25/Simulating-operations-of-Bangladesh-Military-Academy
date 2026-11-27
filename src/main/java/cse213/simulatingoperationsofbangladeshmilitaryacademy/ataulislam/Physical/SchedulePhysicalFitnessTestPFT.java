package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam.Physical;

import java.time.LocalDate;

public class SchedulePhysicalFitnessTestPFT {
    private String companyName;
    private String platoonName;
    private LocalDate pftTestDate;
    private String testLocation;
    private String additionalInstructions;

    public SchedulePhysicalFitnessTestPFT(String companyName, String platoonName, LocalDate pftTestDate, String testLocation, String additionalInstructions) {
        this.companyName = companyName;
        this.platoonName = platoonName;
        this.pftTestDate = pftTestDate;
        this.testLocation = testLocation;
        this.additionalInstructions = additionalInstructions;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPlatoonName() {
        return platoonName;
    }

    public void setPlatoonName(String platoonName) {
        this.platoonName = platoonName;
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
        return "SchedulePhysicalFitnessTestPFT{" +
                "companyName='" + companyName + '\'' +
                ", platoonName='" + platoonName + '\'' +
                ", pftTestDate=" + pftTestDate +
                ", testLocation='" + testLocation + '\'' +
                ", additionalInstructions='" + additionalInstructions + '\'' +
                '}';
    }
}
