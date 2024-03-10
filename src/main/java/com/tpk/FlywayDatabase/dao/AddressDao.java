package com.tpk.FlywayDatabase.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "address")
public class AddressDao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private int addressID;

    @Column(name = "user_id")
    private String userID;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "postal_code")
    private String postalCode;
}
