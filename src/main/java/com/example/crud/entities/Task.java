package com.example.crud.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
public class Task {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;

    @Column
    String name;

    @Column
    String description;

    @CreationTimestamp
    Date createdAt;

    @UpdateTimestamp
    Date updateAt;

    public Task() {
    }

    public Task(Long id, String name, String description, Date createdAt) {
        Id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
