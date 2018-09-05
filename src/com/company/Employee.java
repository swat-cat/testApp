package com.company;

import java.util.List;

public class Employee {

    private String firstName;
    private String  lastName;
    private int age;
    private String phoneNumber;
    private String email;
    private String position;
    private String id;
    private List<String> familyMembers;
    private String degree;


    private Employee() {
    }

    public Employee(String firstName, String lastName, int age, String phoneNumber, String email, String position, String id, List<String> familyMembers, String degree) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.position = position;
        this.id = id;
        this.familyMembers = familyMembers;
        this.degree = degree;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(List<String> familyMembers) {
        this.familyMembers = familyMembers;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public boolean canBuyAlcahol(){
        return age >21;
    }

    public static class Builder{
        private String firstName;
        private String  lastName;
        private int age;
        private String phoneNumber;
        private String email;
        private String position;
        private String id;
        private List<String> familyMembers;
        private String degree;

        Builder withFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        Builder withLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        Builder withAge(int age){
            this.age = age;
            return this;
        }

        Builder withPhone(String phone){
            this.phoneNumber = phone;
            return this;
        }

        Builder withEmail(String  email){
            this.email = email;
            return this;
        }

        Builder withPosition(String position){
            this.position = position;
            return this;
        }

        Builder withFamily(List<String> family){
            this.familyMembers = family;
            return this;
        }

        Builder withDegree(String degree){
            this.degree = degree;
            return this;
        }

        Builder withId(String id){
            this.id = id;
            return  this;
        }

        Builder withId(Long id){
            this.id = String.valueOf(id);
            return this;
        }

        Employee build(){
            Employee employee = new Employee();
            employee.setAge(age);
            employee.setFirstName(firstName);
            employee.setLastName(lastName);
            employee.setEmail(email);
            employee.setDegree(degree);
            employee.setPhoneNumber(phoneNumber);
            employee.setFamilyMembers(familyMembers);
            employee.setPosition(position);
            employee.setId(id);
            return  employee;
        }
    }
}
