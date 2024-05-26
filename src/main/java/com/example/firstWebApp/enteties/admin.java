package com.example.firstWebApp.enteties;

import jakarta.persistence.*;

@Entity
@Table(name="admin")
public class admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long adminID ;
    private String adminEmail ;
    private String adminPassword ;


    public long getAdminID() {
        return adminID;
    }

    public void setAdminID(long adminID) {
        this.adminID = adminID;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public admin(long adminID, String adminEmail, String adminPassword) {
        this.adminID = adminID;
        this.adminEmail = adminEmail;
        this.adminPassword = adminPassword;
    }

    @Override
    public String toString() {
        return "admin{" +
                "adminID=" + adminID +
                ", adminEmail='" + adminEmail + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                '}';
    }
}
