package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam.Physical;

import java.time.LocalDate;

public class MonitorCadetTrainingAttendance {
    private int sl;
    private String cadetId;
    private String cadetName;
    private String company;
    private String platoon;
    private String trainingType;
    private LocalDate trainingDate;
    private String attendanceStatus;

    public MonitorCadetTrainingAttendance(int sl, String cadetId, String cadetName, String company, String platoon, String trainingType, LocalDate trainingDate, String attendanceStatus) {
        this.sl = sl;
        this.cadetId = cadetId;
        this.cadetName = cadetName;
        this.company = company;
        this.platoon = platoon;
        this.trainingType = trainingType;
        this.trainingDate = trainingDate;
        this.attendanceStatus = attendanceStatus;
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

    public String getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(String trainingType) {
        this.trainingType = trainingType;
    }

    public LocalDate getTrainingDate() {
        return trainingDate;
    }

    public void setTrainingDate(LocalDate trainingDate) {
        this.trainingDate = trainingDate;
    }

    public String getAttendanceStatus() {
        return attendanceStatus;
    }

    public void setAttendanceStatus(String attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }

    @Override
    public String toString() {
        return "MonitorCadetTrainingAttendance{" +
                "sl=" + sl +
                ", cadetId='" + cadetId + '\'' +
                ", cadetName='" + cadetName + '\'' +
                ", company='" + company + '\'' +
                ", platoon='" + platoon + '\'' +
                ", trainingType='" + trainingType + '\'' +
                ", trainingDate=" + trainingDate +
                ", attendanceStatus='" + attendanceStatus + '\'' +
                '}';
    }
}
