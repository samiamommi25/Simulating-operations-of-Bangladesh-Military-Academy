package cse213.simulatingoperationsofbangladeshmilitaryacademy.ID_2521129.DrillInstructor.Model;

import cse213.simulatingoperationsofbangladeshmilitaryacademy.Common.Model.Users;
import java.io.Serializable;

public class DrillInstructor extends Users implements Serializable {
    private String instructorId;
    private String rank;
    private String platoon;
    private String specialization;
    private String phone;
    private int yearsOfService;
    private String lastRemedialCadetId;
    private String lastRemedialRoutine;

    public DrillInstructor(String userId, String name, String email, String password,
                           String instructorId, String rank, String platoon,
                           String specialization, String phone, int yearsOfService) {
        super(userId, name, email, password);
        this.instructorId = instructorId;
        this.rank = rank;
        this.platoon = platoon;
        this.specialization = specialization;
        this.phone = phone;
        this.yearsOfService = yearsOfService;
        this.lastRemedialCadetId = "";
        this.lastRemedialRoutine = "";
    }

    @Override
    public String getRoleName() {
        return "Drill Instructor";
    }

    public void assignRemedialTraining(String cadetId, String routine) {
        if (cadetId != null && !cadetId.isBlank()) {
            this.lastRemedialCadetId = cadetId;
        }
        if (routine != null && !routine.isBlank()) {
            this.lastRemedialRoutine = routine;
        }
    }

    public String generatePlatoonReport(String platoon, String term) {
        String targetPlatoon = (platoon != null && !platoon.isBlank()) ? platoon : this.platoon;
        String targetTerm = (term != null && !term.isBlank()) ? term : "Current Term";
        String remedialInfo = (lastRemedialCadetId != null && !lastRemedialCadetId.isBlank())
                ? lastRemedialCadetId + " (" + lastRemedialRoutine + ")"
                : "None";

        return "Platoon Report | Term: " + targetTerm
                + " | Platoon: " + targetPlatoon
                + " | Instructor: " + name + " (" + rank + ", ID: " + instructorId + ")"
                + " | Specialization: " + specialization
                + " | Latest Remedial: " + remedialInfo;
    }

    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getPlatoon() {
        return platoon;
    }

    public void setPlatoon(String platoon) {
        this.platoon = platoon;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public String getLastRemedialCadetId() {
        return lastRemedialCadetId;
    }

    public void setLastRemedialCadetId(String lastRemedialCadetId) {
        this.lastRemedialCadetId = lastRemedialCadetId;
    }

    public String getLastRemedialRoutine() {
        return lastRemedialRoutine;
    }

    public void setLastRemedialRoutine(String lastRemedialRoutine) {
        this.lastRemedialRoutine = lastRemedialRoutine;
    }
}
