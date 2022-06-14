package com.example.kjj.models;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
public class ImpExp extends AuditedModel {
    @Getter @Setter
    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="product_id")
    Product product;

    @Getter @Setter
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="user_id")
    public User user;


}
