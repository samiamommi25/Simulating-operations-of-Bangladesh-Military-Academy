package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam.Cadet;

public class ApproveRemedialFitnessProgram {
    private String cadetId;
    private String cadetName;
    private double fitnessScore;
    private String fitnessIssue;

    public ApproveRemedialFitnessProgram(String cadetId, String cadetName, double fitnessScore, String fitnessIssue) {
        this.cadetId = cadetId;
        this.cadetName = cadetName;
        this.fitnessScore = fitnessScore;
        this.fitnessIssue = fitnessIssue;
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

    public double getFitnessScore() {
        return fitnessScore;
    }

    public void setFitnessScore(double fitnessScore) {
        this.fitnessScore = fitnessScore;
    }

    public String getFitnessIssue() {
        return fitnessIssue;
    }

    public void setFitnessIssue(String fitnessIssue) {
        this.fitnessIssue = fitnessIssue;
    }

    @Override
    public String toString() {
        return "ApproveRemedialFitnessProgram{" +
                "cadetId='" + cadetId + '\'' +
                ", cadetName='" + cadetName + '\'' +
                ", fitnessScore=" + fitnessScore +
                ", fitnessIssue='" + fitnessIssue + '\'' +
                '}';
    }
}
