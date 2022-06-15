package com.example.kjj.models;

import javax.persistence.*;

import com.example.kjj.enums.Pack;
import com.example.kjj.enums.Transport;
import lombok.Getter;
import lombok.Setter;
public class ImpExp extends AuditedModel {
    @Getter @Setter
    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="product_id")
    public Product product;

    @Getter @Setter
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="user_id")
    public User user;

    @Getter @Setter
    @Column
    public Integer amount;

    @Getter @Setter
    @Column
    public Integer fee;

    @Getter @Setter
    @Column
    public Pack packaging;

    @Getter @Setter
    @Column
    public Transport RavshErsal;
}
