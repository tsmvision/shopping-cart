package com.example.shoppingcart.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @Column(name = "sessionId")
    private String sessionId;

    @Column(name = "token")
    private String token;

    @Column(name = "status")
    private boolean status;

    @Column(name = "subTotal")
    private float subTotal;

    @Column(name = "itemDiscount")
    private float itemDiscount;

    @Column(name = "tax")
    private float tax;

    @Column(name = "shipping")
    private float shipping;

    @Column(name = "total")
    private float total;

    @Column(name = "promo")
    private String promo;

    @Column(name = "discount")
    private float discount;

    @Column(name = "grandTotal")
    private float grandTotal;

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

    @Column(name = "line1")
    private String line1;

    @Column(name = "line2")
    private String line2;

    @Column(name = "city")
    private String city;

    @Column(name = "province")
    private String province;

    @Column(name = "country")
    private String country;

    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;

    @Column(name = "content")
    private String content;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems;

}
