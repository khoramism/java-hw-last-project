package com.example.kjj.models;

import javax.persistence.*;

public class ImpExp extends AuditedModel {

    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="product_id")
    Product product;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="user_id")
    public User user;


}
