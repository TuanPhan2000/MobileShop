package com.pnt.mobileshop.enity.shoppingcart;

import com.pnt.mobileshop.enity.User;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "checkout")
public class Checkout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String address;
    private String phoneNumber;
    private Date date;
    private String description;
}
