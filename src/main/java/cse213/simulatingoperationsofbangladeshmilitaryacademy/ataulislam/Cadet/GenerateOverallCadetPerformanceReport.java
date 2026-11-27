package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam.Cadet;

import java.time.LocalDate;

public class GenerateOverallCadetPerformanceReport {
    private String reportId;
    private String reportCategory;
    private String company;
    private String platoon;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate generatedDate;

    public GenerateOverallCadetPerformanceReport(String reportId, String reportCategory, String company, String platoon, LocalDate startDate, LocalDate endDate, LocalDate generatedDate) {
        this.reportId = reportId;
        this.reportCategory = reportCategory;
        this.company = company;
        this.platoon = platoon;
        this.startDate = startDate;
        this.endDate = endDate;
        this.generatedDate = generatedDate;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getReportCategory() {
        return reportCategory;
    }

    public void setReportCategory(String reportCategory) {
        this.reportCategory = reportCategory;
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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getGeneratedDate() {
        return generatedDate;
    }

    public void setGeneratedDate(LocalDate generatedDate) {
        this.generatedDate = generatedDate;
    }

    @Override
    public String toString() {
        return "GenerateOverallCadetPerformanceReport{" +
                "reportId='" + reportId + '\'' +
                ", reportCategory='" + reportCategory + '\'' +
                ", company='" + company + '\'' +
                ", platoon='" + platoon + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", generatedDate=" + generatedDate +
                '}';
    }
}
