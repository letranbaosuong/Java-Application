/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhpm11.tuan4;

/**
 *
 * @author Suong
 */
public class ThongTin {

    private boolean books;
    private boolean newspapers;
    private boolean journalsandmagazines;
    private String remarks;
    private String email;
    private String contact;
    private String address;
    private String name;
    private int id;

    public ThongTin(boolean books, boolean newspapers, boolean journalsandmagazines, String remarks, String email, String contact, String address, String name, int id) {
        this.books = books;
        this.newspapers = newspapers;
        this.journalsandmagazines = journalsandmagazines;
        this.remarks = remarks;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.name = name;
        this.id = id;
    }

    public boolean isBooks() {
        return books;
    }

    public void setBooks(boolean books) {
        this.books = books;
    }

    public boolean isNewspapers() {
        return newspapers;
    }

    public void setNewspapers(boolean newspapers) {
        this.newspapers = newspapers;
    }

    public boolean isJournalsandmagazines() {
        return journalsandmagazines;
    }

    public void setJournalsandmagazines(boolean journalsandmagazines) {
        this.journalsandmagazines = journalsandmagazines;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ThongTin() {
    }
}
