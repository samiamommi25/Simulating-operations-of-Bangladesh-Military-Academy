package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam.Cadet;

import java.time.LocalDate;

public class ReviewPhysicalFitness {
    private int sl;
    private String cadetId;
    private String cadetName;
    private String company;
    private String platoon;
    private String reportType;
    private double pftScore;
    private LocalDate testDate;
    private String performance;

    public ReviewPhysicalFitness(int sl, String cadetId, String cadetName, String company, String platoon, String reportType, double pftScore, LocalDate testDate, String performance) {

        this.sl = sl;
        this.cadetId = cadetId;
        this.cadetName = cadetName;
        this.company = company;
        this.platoon = platoon;
        this.reportType = reportType;
        this.pftScore = pftScore;
        this.testDate = testDate;
        this.performance = performance;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
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

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public double getPftScore() {
        return pftScore;
    }

    public void setPftScore(double pftScore) {
        this.pftScore = pftScore;
    }

    public LocalDate getTestDate() {
        return testDate;
    }

    public void setTestDate(LocalDate testDate) {
        this.testDate = testDate;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    @Override
    public String toString() {
        return "ReviewPhysicalFitness{" +
                "sl=" + sl +
                ", cadetId='" + cadetId + '\'' +
                ", cadetName='" + cadetName + '\'' +
                ", company='" + company + '\'' +
                ", platoon='" + platoon + '\'' +
                ", reportType='" + reportType + '\'' +
                ", pftScore=" + pftScore +
                ", testDate=" + testDate +
                ", performance='" + performance + '\'' +
                '}';
    }
}
