/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhpm11.tuan5;

/**
 *
 * @author Suong
 */
public class Employee {
    private int id;
    private String name;
    private String address;
    private String gender;
    private String knowdge;
    private String subject;

    public Employee() {
    }

    public Employee(int id, String name, String address, String gender, String knowdge, String subject) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.knowdge = knowdge;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getKnowdge() {
        return knowdge;
    }

    public void setKnowdge(String knowdge) {
        this.knowdge = knowdge;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
