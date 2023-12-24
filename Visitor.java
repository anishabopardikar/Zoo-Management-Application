package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Visitor {
    private String name;
    private int age;
    private String phone;
    private double balance;
    private String email;
    private String password;
    private String membership;
    private String feedback;

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
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
    private static double revenue=0;
    public static double getRevenue() {
        return revenue;
    }

    public static void setRevenue(double revenue) {
        Visitor.revenue = revenue;
    }

    public Visitor(String name, int age, String phone, double balance, String email, String password, String membership) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.balance = balance;
        this.email = email;
        this.password = password;
        this.membership=membership;
        this.feedback="No feedback yet";
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}