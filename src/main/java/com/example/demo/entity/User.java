package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String password;
    private String status;
    private Integer notification;
    private boolean notificationIndicator;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getNotification() {
        return notification;
    }

    public void setNotification(Integer notification) {
        this.notification = notification;
    }

    public boolean isNotificationIndicator() {
        return notificationIndicator;
    }

    public void setNotificationIndicator(boolean notificationIndicator) {
        this.notificationIndicator = notificationIndicator;
    }
}
