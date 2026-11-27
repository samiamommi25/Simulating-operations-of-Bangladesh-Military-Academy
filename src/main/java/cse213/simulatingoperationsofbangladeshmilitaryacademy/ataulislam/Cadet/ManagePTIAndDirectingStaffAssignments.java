package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam.Cadet;

public class ManagePTIAndDirectingStaffAssignments {
    private String staffId;
    private String staffName;
    private String staffType;
    private String companyOrUnit;

    public ManagePTIAndDirectingStaffAssignments(String staffId, String staffName, String staffType, String companyOrUnit) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.staffType = staffType;
        this.companyOrUnit = companyOrUnit;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffType() {
        return staffType;
    }

    public void setStaffType(String staffType) {
        this.staffType = staffType;
    }

    public String getCompanyOrUnit() {
        return companyOrUnit;
    }

    public void setCompanyOrUnit(String companyOrUnit) {
        this.companyOrUnit = companyOrUnit;
    }

    @Override
    public String toString() {
        return "ManagePTIAndDirectingStaffAssignments{" +
                "staffId='" + staffId + '\'' +
                ", staffName='" + staffName + '\'' +
                ", staffType='" + staffType + '\'' +
                ", companyOrUnit='" + companyOrUnit + '\'' +
                '}';
    }
}
