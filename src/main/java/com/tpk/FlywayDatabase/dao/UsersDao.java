package com.tpk.FlywayDatabase.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class UsersDao {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "user_id")
        private int userID;

        @Column(name = "username")
        private String username;

        @Column(name = "password")
        private String password;

        @Column(name = "email")
        private String email;
}