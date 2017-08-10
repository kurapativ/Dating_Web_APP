/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Tatha
 */
@ManagedBean
@RequestScoped
public class UserProfile {

    /**
     * Creates a new instance of UserProfile
     */
    private String lastname;
    private String firstname;
    private String userid;
    private String email;
    private String password;
    private String gender;
    private int age;
    private String city;
    private String zipcode;
    private String dob;
    private String seeking;
    private String relationship;
    private String ethnicity;
    private String religion;
    private String language;
    private String education;
    private int income;
    private String type;
    private String interest01;
    private String interest02;
    private String interest03;
    private String securityq01;
    private String securtiyq02;
    private String answer01;
    private String answer02;
    
    
    private int mage;
    private String mreligion;
    private String mlanguage;
    private String methnicity;
    private String meducation;
    private String moccupation;
    private String mrelationship;

    public UserProfile(String lastname, String firstname, String userid, String email, String password, String gender, int age, String city, String zipcode, String dob, String seeking, String relationship, String ethnicity, String religion, String language, String education, int income, String type, String interest01, String interest02, String interest03, String securityq01, String securtiyq02, String answer01, String answer02, int mage, String mreligion, String mlanguage, String methnicity, String meducation, String moccupation, String mrelationship)
    {
        this.lastname = lastname;
        this.firstname = firstname;
        this.userid = userid;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.age = age;
        this.city = city;
        this.zipcode = zipcode;
        this.dob = dob;
        this.seeking = seeking;
        this.relationship = relationship;
        this.ethnicity = ethnicity;
        this.religion = religion;
        this.language = language;
        this.education = education;
        this.income = income;
        this.type = type;
        this.interest01 = interest01;
        this.interest02 = interest02;
        this.interest03 = interest03;
        this.securityq01 = securityq01;
        this.securtiyq02 = securtiyq02;
        this.answer01 = answer01;
        this.answer02 = answer02;
        this.mage = mage;
        this.mreligion = mreligion;
        this.mlanguage = mlanguage;
        this.methnicity = methnicity;
        this.meducation = meducation;
        this.moccupation = moccupation;
        this.mrelationship = mrelationship;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSeeking() {
        return seeking;
    }

    public void setSeeking(String seeking) {
        this.seeking = seeking;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInterest01() {
        return interest01;
    }

    public void setInterest01(String interest01) {
        this.interest01 = interest01;
    }

    public String getInterest02() {
        return interest02;
    }

    public void setInterest02(String interest02) {
        this.interest02 = interest02;
    }

    public String getInterest03() {
        return interest03;
    }

    public void setInterest03(String interest03) {
        this.interest03 = interest03;
    }

    public String getSecurityq01() {
        return securityq01;
    }

    public void setSecurityq01(String securityq01) {
        this.securityq01 = securityq01;
    }

    public String getSecurtiyq02() {
        return securtiyq02;
    }

    public void setSecurtiyq02(String securtiyq02) {
        this.securtiyq02 = securtiyq02;
    }

    public String getAnswer01() {
        return answer01;
    }

    public void setAnswer01(String answer01) {
        this.answer01 = answer01;
    }

    public String getAnswer02() {
        return answer02;
    }

    public void setAnswer02(String answer02) {
        this.answer02 = answer02;
    }

    public int getMage() {
        return mage;
    }

    public void setMage(int mage) {
        this.mage = mage;
    }

    public String getMreligion() {
        return mreligion;
    }

    public void setMreligion(String mreligion) {
        this.mreligion = mreligion;
    }

    public String getMlanguage() {
        return mlanguage;
    }

    public void setMlanguage(String mlanguage) {
        this.mlanguage = mlanguage;
    }

    public String getMethnicity() {
        return methnicity;
    }

    public void setMethnicity(String methnicity) {
        this.methnicity = methnicity;
    }

    public String getMeducation() {
        return meducation;
    }

    public void setMeducation(String meducation) {
        this.meducation = meducation;
    }

    public String getMoccupation() {
        return moccupation;
    }

    public void setMoccupation(String moccupation) {
        this.moccupation = moccupation;
    }

    public String getMrelationship() {
        return mrelationship;
    }

    public void setMrelationship(String mrelationship) {
        this.mrelationship = mrelationship;
    }
    
    public UserProfile() {
    }
    
}
