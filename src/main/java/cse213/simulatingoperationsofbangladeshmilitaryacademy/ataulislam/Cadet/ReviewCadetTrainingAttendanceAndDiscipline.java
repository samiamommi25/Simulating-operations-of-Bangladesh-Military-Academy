package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam.Cadet;

import java.time.LocalDate;

public class ReviewCadetTrainingAttendanceAndDiscipline {
    private String cadetId;
    private String cadetName;
    private String company;
    private String platoon;
    private LocalDate reportingDate;
    private String attendanceStatus;

    public ReviewCadetTrainingAttendanceAndDiscipline(String cadetId, String cadetName, String company, String platoon, LocalDate reportingDate, String attendanceStatus) {
        this.cadetId = cadetId;
        this.cadetName = cadetName;
        this.company = company;
        this.platoon = platoon;
        this.reportingDate = reportingDate;
        this.attendanceStatus = attendanceStatus;
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

    public LocalDate getReportingDate() {
        return reportingDate;
    }

    public void setReportingDate(LocalDate reportingDate) {
        this.reportingDate = reportingDate;
    }

    public String getAttendanceStatus() {
        return attendanceStatus;
    }

    public void setAttendanceStatus(String attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }

    @Override
    public String toString() {
        return "ReviewCadetTrainingAttendanceAndDiscipline{" +
                "cadetId='" + cadetId + '\'' +
                ", cadetName='" + cadetName + '\'' +
                ", company='" + company + '\'' +
                ", platoon='" + platoon + '\'' +
                ", reportingDate=" + reportingDate +
                ", attendanceStatus='" + attendanceStatus + '\'' +
                '}';
    }
}
