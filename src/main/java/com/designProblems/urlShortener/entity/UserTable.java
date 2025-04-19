package com.designProblems.urlShortener.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="usertable")
public class UserTable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
}