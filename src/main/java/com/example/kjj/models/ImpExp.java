package com.example.kjj.models;
import com.example.kjj.models.Product;
import com.example.kjj.models.UserEntity;

import javax.persistence.*;

public class ImpExp extends AuditedModel {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="product_id")
    private Product product;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="user_id")
    public UserEntity user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
