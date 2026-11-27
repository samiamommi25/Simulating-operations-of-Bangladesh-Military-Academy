package cse213.simulatingoperationsofbangladeshmilitaryacademy.Common.Model;

import java.io.Serializable;

public abstract class Users implements Serializable {
    protected String userId;
    protected String name;
    protected String email;
    protected String password;

    public Users(String userId, String name, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public boolean login(String inputUserId, String inputPassword) {
        return this.userId != null
                && this.password != null
                && this.userId.equals(inputUserId)
                && this.password.equals(inputPassword);
    }

    public void logout() {
    }

    public boolean changePassword(String oldPassword, String newPassword) {
        if (this.password != null
                && this.password.equals(oldPassword)
                && newPassword != null
                && !newPassword.isEmpty()) {
            this.password = newPassword;
            return true;
        }
        return false;
    }

    public abstract String getRoleName();

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}