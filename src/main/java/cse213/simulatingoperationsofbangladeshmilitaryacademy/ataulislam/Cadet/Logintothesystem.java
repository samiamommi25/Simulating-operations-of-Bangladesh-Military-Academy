package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam.Cadet;

public class Logintothesystem {
    private String username;
    private String password;
    private String userRole; // e.g.,
    private String fullName;
    private boolean isActive;

    public Logintothesystem(String username, String password, String userRole, String fullName, boolean isActive) {
        this.username = username;
        this.password = password;
        this.userRole = userRole;
        this.fullName = fullName;
        this.isActive = isActive;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Logintothesystem{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userRole='" + userRole + '\'' +
                ", fullName='" + fullName + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
