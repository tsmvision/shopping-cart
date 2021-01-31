package com.example.shoppingcart.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "middleName")
    private String middleName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "email")
    private String email;

    @Column(name = "passwordHash")
    private String passwordHash;

    @Column(name = "admin")
    private Boolean admin;

    @Column(name = "vendor")
    private Boolean vendor;

    @Column(name = "registeredAt")
    private LocalDateTime registeredAt;

    @Column(name = "lastLogin")
    private LocalDateTime lastLogin;

    @Column(name = "intro")
    private int intro;

    @Column(name = "profile")
    private String profile;

    @OneToMany(mappedBy = "user")
    private List<Cart> carts;

    @OneToMany
    private List<Product> product;

    @OneToMany(mappedBy = "user")
    private List<Order> orders;
}
