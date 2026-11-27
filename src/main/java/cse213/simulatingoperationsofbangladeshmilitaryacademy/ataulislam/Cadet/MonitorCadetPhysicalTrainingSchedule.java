package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam.Cadet;

import java.time.LocalDate;

public class MonitorCadetPhysicalTrainingSchedule {
    private String scheduleId;
    private String company;
    private String platoon;
    private LocalDate trainingDate;
    private String trainingActivity;
    private String trainingTime;
    private String trainingVenue;
    private String assignedPti;
    private String duration;
    private String confirmationStatus;

    public MonitorCadetPhysicalTrainingSchedule(String scheduleId, String company, String platoon, LocalDate trainingDate, String trainingActivity, String trainingTime, String trainingVenue, String assignedPti, String duration, String confirmationStatus) {
        this.scheduleId = scheduleId;
        this.company = company;
        this.platoon = platoon;
        this.trainingDate = trainingDate;
        this.trainingActivity = trainingActivity;
        this.trainingTime = trainingTime;
        this.trainingVenue = trainingVenue;
        this.assignedPti = assignedPti;
        this.duration = duration;
        this.confirmationStatus = confirmationStatus;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
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

    public LocalDate getTrainingDate() {
        return trainingDate;
    }

    public void setTrainingDate(LocalDate trainingDate) {
        this.trainingDate = trainingDate;
    }

    public String getTrainingActivity() {
        return trainingActivity;
    }

    public void setTrainingActivity(String trainingActivity) {
        this.trainingActivity = trainingActivity;
    }

    public String getTrainingTime() {
        return trainingTime;
    }

    public void setTrainingTime(String trainingTime) {
        this.trainingTime = trainingTime;
    }

    public String getTrainingVenue() {
        return trainingVenue;
    }

    public void setTrainingVenue(String trainingVenue) {
        this.trainingVenue = trainingVenue;
    }

    public String getAssignedPti() {
        return assignedPti;
    }

    public void setAssignedPti(String assignedPti) {
        this.assignedPti = assignedPti;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getConfirmationStatus() {
        return confirmationStatus;
    }

    public void setConfirmationStatus(String confirmationStatus) {
        this.confirmationStatus = confirmationStatus;
    }

    @Override
    public String toString() {
        return "MonitorCadetPhysicalTrainingSchedule{" +
                "scheduleId='" + scheduleId + '\'' +
                ", company='" + company + '\'' +
                ", platoon='" + platoon + '\'' +
                ", trainingDate=" + trainingDate +
                ", trainingActivity='" + trainingActivity + '\'' +
                ", trainingTime='" + trainingTime + '\'' +
                ", trainingVenue='" + trainingVenue + '\'' +
                ", assignedPti='" + assignedPti + '\'' +
                ", duration='" + duration + '\'' +
                ", confirmationStatus='" + confirmationStatus + '\'' +
                '}';
    }
}
