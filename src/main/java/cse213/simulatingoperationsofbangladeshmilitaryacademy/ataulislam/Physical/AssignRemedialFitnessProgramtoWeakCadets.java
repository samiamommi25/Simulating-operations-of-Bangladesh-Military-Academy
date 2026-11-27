package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam.Physical;

import java.time.LocalDate;

public class AssignRemedialFitnessProgramtoWeakCadets {

    private String cadetId;
    private String cadetName;
    private double pftScore;
    private String weakArea;
    private String fitnessAnalysis;
    private String remedialRoutine;
    private double workloadHoursPerWeek;
    private LocalDate startDate;
    private int durationWeeks;
    private String frequencyDaysPerWeek;

    public AssignRemedialFitnessProgramtoWeakCadets(String cadetId, String cadetName, double pftScore, String weakArea, String fitnessAnalysis, String remedialRoutine, double workloadHoursPerWeek, LocalDate startDate, int durationWeeks, String frequencyDaysPerWeek) {
        this.cadetId = cadetId;
        this.cadetName = cadetName;
        this.pftScore = pftScore;
        this.weakArea = weakArea;
        this.fitnessAnalysis = fitnessAnalysis;
        this.remedialRoutine = remedialRoutine;
        this.workloadHoursPerWeek = workloadHoursPerWeek;
        this.startDate = startDate;
        this.durationWeeks = durationWeeks;
        this.frequencyDaysPerWeek = frequencyDaysPerWeek;
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

    public double getPftScore() {
        return pftScore;
    }

    public void setPftScore(double pftScore) {
        this.pftScore = pftScore;
    }

    public String getWeakArea() {
        return weakArea;
    }

    public void setWeakArea(String weakArea) {
        this.weakArea = weakArea;
    }

    public String getFitnessAnalysis() {
        return fitnessAnalysis;
    }

    public void setFitnessAnalysis(String fitnessAnalysis) {
        this.fitnessAnalysis = fitnessAnalysis;
    }

    public String getRemedialRoutine() {
        return remedialRoutine;
    }

    public void setRemedialRoutine(String remedialRoutine) {
        this.remedialRoutine = remedialRoutine;
    }

    public double getWorkloadHoursPerWeek() {
        return workloadHoursPerWeek;
    }

    public void setWorkloadHoursPerWeek(double workloadHoursPerWeek) {
        this.workloadHoursPerWeek = workloadHoursPerWeek;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getDurationWeeks() {
        return durationWeeks;
    }

    public void setDurationWeeks(int durationWeeks) {
        this.durationWeeks = durationWeeks;
    }

    public String getFrequencyDaysPerWeek() {
        return frequencyDaysPerWeek;
    }

    public void setFrequencyDaysPerWeek(String frequencyDaysPerWeek) {
        this.frequencyDaysPerWeek = frequencyDaysPerWeek;
    }

    @Override
    public String toString() {
        return "AssignRemedialFitnessProgramtoWeakCadets{" +
                "cadetId='" + cadetId + '\'' +
                ", cadetName='" + cadetName + '\'' +
                ", pftScore=" + pftScore +
                ", weakArea='" + weakArea + '\'' +
                ", fitnessAnalysis='" + fitnessAnalysis + '\'' +
                ", remedialRoutine='" + remedialRoutine + '\'' +
                ", workloadHoursPerWeek=" + workloadHoursPerWeek +
                ", startDate=" + startDate +
                ", durationWeeks=" + durationWeeks +
                ", frequencyDaysPerWeek='" + frequencyDaysPerWeek + '\'' +
                '}';
    }
}
