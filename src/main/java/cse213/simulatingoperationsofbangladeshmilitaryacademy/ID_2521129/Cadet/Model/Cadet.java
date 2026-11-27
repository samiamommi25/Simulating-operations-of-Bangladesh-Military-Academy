package cse213.simulatingoperationsofbangladeshmilitaryacademy.ID_2521129.Cadet.Model;

import cse213.simulatingoperationsofbangladeshmilitaryacademy.Common.Model.Users;
import java.io.Serializable;

public class Cadet extends Users implements Serializable {
    private String cadetId;
    private String batch;
    private String phone;
    private String emergencyContact;
    private String address;
    private String rank;
    private String academicResult;

    public Cadet(String userId, String name, String email, String password,
                 String cadetId, String batch, String phone, String emergencyContact,
                 String address, String rank, String academicResult) {
        super(userId, name, email, password);
        this.cadetId = cadetId;
        this.batch = batch;
        this.phone = phone;
        this.emergencyContact = emergencyContact;
        this.address = address;
        this.rank = rank;
        this.academicResult = academicResult;
    }

    @Override
    public String getRoleName() {
        return "Cadet";
    }

    public void updateAcademicResult(String newResult) {
        if (newResult != null && !newResult.isBlank()) {
            this.academicResult = newResult;
        }
    }

    public void promoteRank(String newRank) {
        if (newRank != null && !newRank.isBlank()) {
            this.rank = newRank;
        }
    }

    public String getCadetId() {
        return cadetId;
    }

    public void setCadetId(String cadetId) {
        this.cadetId = cadetId;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getAcademicResult() {
        return academicResult;
    }

    public void setAcademicResult(String academicResult) {
        this.academicResult = academicResult;
    }
}