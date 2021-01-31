package com.example.shoppingcart.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "product")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "title")
    private String title;

    @OneToMany(mappedBy = "product")
    private List<ProductMeta> productMeta;

    @Column(name = "slug")
    private String slug;

    @Column(name = "summary")
    private String summary;

    @Column(name = "type")
    private String type;

    @Column(name = "sku")
    private String sku;

    @Column(name = "price")
    private float price;

    @Column(name = "discount")
    private float discount;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "shop")
    private int shop;

    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;

    @Column(name = "publishedAt")
    private LocalDateTime publishedAt;

    @Column(name ="startsAt")
    private LocalDateTime startsAt;

    @Column(name = "endsAt")
    private LocalDateTime endsAt;

    @Column(name = "content")
    private String content;

    @OneToMany(mappedBy = "product")
    private List<ProductReview> productReview;

    @OneToMany(mappedBy = "product")
    private List<CartItem> cartItems;

    @ManyToMany
    private List<Tag> tags;

    @ManyToMany(mappedBy = "products")
    private List<Category> categories;

    @OneToMany(mappedBy = "product")
    private List<OrderItem> orderItems;
}
