package com.example.firstWebApp.enteties;
import jakarta.persistence.*;
@Entity
@Table(name="org")
public class org {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orgID ;
    private String orgName ;

    private String orgEmail ;
    private  String employeeName ;
    private String orgPassword ;

    public long getOrgID() {
        return orgID;
    }

    public void setOrgID(long orgID) {
        this.orgID = orgID;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgEmail() {
        return orgEmail;
    }

    public void setOrgEmail(String orgEmail) {
        this.orgEmail = orgEmail;
    }

    public String getEmployeeNmae() {
        return employeeName;
    }

    public void setEmployeeNmae(String employeeNmae) {
        this.employeeName = employeeNmae;
    }

    public String getOrgPassword() {
        return orgPassword;
    }

    public void setOrgPassword(String orgPassword) {
        this.orgPassword = orgPassword;
    }

    public org(long orgID, String orgName, String orgEmail, String employeeNmae, String orgPassword) {
        this.orgID = orgID;
        this.orgName = orgName;
        this.orgEmail = orgEmail;
        this.employeeName = employeeNmae;
        this.orgPassword = orgPassword;
    }

    @Override
    public String toString() {
        return "org{" +
                "orgID=" + orgID +
                ", orgName='" + orgName + '\'' +
                ", orgEmail='" + orgEmail + '\'' +
                ", employeeNmae='" + employeeName + '\'' +
                ", orgPassword='" + orgPassword + '\'' +
                '}';
    }
}

