package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam;

public class PhysicalRecordCadetFitnessTestResults {
    private String userRole;
    private String selectedMenuOption;

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getSelectedMenuOption() {
        return selectedMenuOption;
    }

    public void setSelectedMenuOption(String selectedMenuOption) {
        this.selectedMenuOption = selectedMenuOption;
    }

    public PhysicalRecordCadetFitnessTestResults(String userRole, String selectedMenuOption) {
        this.userRole = userRole;
        this.selectedMenuOption = selectedMenuOption;

    }

    @Override
    public String toString() {
        return "PhysicalRecordCadetFitnessTestResults{" +
                "userRole='" + userRole + '\'' +
                ", selectedMenuOption='" + selectedMenuOption + '\'' +
                '}';
    }
}
