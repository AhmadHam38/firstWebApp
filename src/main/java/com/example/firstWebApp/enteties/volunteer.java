package com.example.firstWebApp.enteties;
import jakarta.persistence.*;
@Entity
@Table(name="volunteer")
public class volunteer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long ID ;
    private String volunteerName ;
    private String volunteerSurname ;
    private int volunteerAge ;
    private String schoolName ;
    private boolean volunteerMale ;
    private String volunteerCity ;
    private int volunteerPhonenumber ;
    private String volunteerEmail ;
    private String password ;

    public long getVolunteerID() {
        return ID;
    }

    public void setVolunteerID(long volunteerID) {
        this.ID = volunteerID;
    }

    public String getVolunteerName() {
        return volunteerName;
    }

    public void setVolunteerName(String volunteerName) {
        this.volunteerName = volunteerName;
    }

    public String getVolunteerSurname() {
        return volunteerSurname;
    }

    public void setVolunteerSurname(String volunteerSurname) {
        this.volunteerSurname = volunteerSurname;
    }

    public int getVolunteerAge() {
        return volunteerAge;
    }

    public void setVolunteerAge(int volunteerAge) {
        this.volunteerAge = volunteerAge;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public boolean isVolunteerMale() {
        return volunteerMale;
    }

    public void setVolunteerMale(boolean volunteerMale) {
        this.volunteerMale = volunteerMale;
    }

    public String getVolunteerCity() {
        return volunteerCity;
    }

    public void setVolunteerCity(String volunteerCity) {
        this.volunteerCity = volunteerCity;
    }

    public int getVolunteerPhonenumber() {
        return volunteerPhonenumber;
    }

    public void setVolunteerPhonenumber(int volunteerPhonenumber) {
        this.volunteerPhonenumber = volunteerPhonenumber;
    }

    public String getVolunteerEmail() {
        return volunteerEmail;
    }

    public void setVolunteerEmail(String volunteerEmail) {
        this.volunteerEmail = volunteerEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public volunteer(long volunteerID, String volunteerName, String volunteerSurname, int volunteerAge, String schoolName, boolean volunteerMale, String volunteerCity, int volunteerPhonenumber, String volunteerEmail, String password) {
        this.ID = volunteerID;
        this.volunteerName = volunteerName;
        this.volunteerSurname = volunteerSurname;
        this.volunteerAge = volunteerAge;
        this.schoolName = schoolName;
        this.volunteerMale = volunteerMale;
        this.volunteerCity = volunteerCity;
        this.volunteerPhonenumber = volunteerPhonenumber;
        this.volunteerEmail = volunteerEmail;
        this.password = password;
    }

    @Override
    public String toString() {
        return "volunteer{" +
                "volunteerID=" + ID +
                ", volunteerName='" + volunteerName + '\'' +
                ", volunteerSurname='" + volunteerSurname + '\'' +
                ", volunteerAge=" + volunteerAge +
                ", schoolName='" + schoolName + '\'' +
                ", volunteerMale=" + volunteerMale +
                ", volunteerCity='" + volunteerCity + '\'' +
                ", volunteerPhonenumber=" + volunteerPhonenumber +
                ", volunteerEmail='" + volunteerEmail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
