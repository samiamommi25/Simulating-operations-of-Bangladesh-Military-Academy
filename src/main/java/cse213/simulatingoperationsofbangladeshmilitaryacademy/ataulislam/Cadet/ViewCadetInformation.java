package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam.Cadet;

public class ViewCadetInformation {
    private String cadetId;
    private String cadetName;
    private String company;
    private String platoon;
    private int age;
    private String contact;

    // Cadet Training and Academic Records (TableView) fields
    private String recordType;      // e.g., "Academic", "Physical Training", "Military Tactics"
    private String courseOrActivity;
    private double score;
    private String grade;
    private String status;

    public ViewCadetInformation(String cadetId, String cadetName, String company, String platoon, int age, String contact, String recordType, String courseOrActivity, double score, String grade, String status) {
        this.cadetId = cadetId;
        this.cadetName = cadetName;
        this.company = company;
        this.platoon = platoon;
        this.age = age;
        this.contact = contact;
        this.recordType = recordType;
        this.courseOrActivity = courseOrActivity;
        this.score = score;
        this.grade = grade;
        this.status = status;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getCourseOrActivity() {
        return courseOrActivity;
    }

    public void setCourseOrActivity(String courseOrActivity) {
        this.courseOrActivity = courseOrActivity;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ViewCadetInformation{" +
                "cadetId='" + cadetId + '\'' +
                ", cadetName='" + cadetName + '\'' +
                ", company='" + company + '\'' +
                ", platoon='" + platoon + '\'' +
                ", age=" + age +
                ", contact='" + contact + '\'' +
                ", recordType='" + recordType + '\'' +
                ", courseOrActivity='" + courseOrActivity + '\'' +
                ", score=" + score +
                ", grade='" + grade + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
