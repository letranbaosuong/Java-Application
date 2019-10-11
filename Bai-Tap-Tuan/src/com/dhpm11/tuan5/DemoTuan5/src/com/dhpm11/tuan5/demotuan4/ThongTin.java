/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhpm11.tuan5.demotuan4;

/**
 *
 * @author Suong
 */
public class ThongTin {

    
    private String id;
    private String name;
    private boolean books;
    private boolean newspapers;
    private boolean journalsandmagazines;
    private String address;
    private String contact;
    private String email;
    private String remarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public ThongTin() {
    }

    public ThongTin(String id, String name, boolean books, boolean newspapers, boolean journalsandmagazines, String address, String contact, String email, String remarks) {
        this.id = id;
        this.name = name;
        this.books = books;
        this.newspapers = newspapers;
        this.journalsandmagazines = journalsandmagazines;
        this.address = address;
        this.contact = contact;
        this.email = email;
        this.remarks = remarks;
    }
}
