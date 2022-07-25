

package com.banvien.flyway.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tbl_customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String name;
    @Column(length = 100)
    private String country;
    @Column(length = 100)
    private String city;
    @Column(length = 11, unique = true)
    private String phone;
}
