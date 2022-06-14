package com.example.kjj.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Sader")
public class Sader extends ImpExp {
    @Setter @Getter
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    public Sader(){}

    public Sader(
            Product product,
            User user,
            Boolean isActive
    ) {
        this.user = user;
        this.product = product;
        this.isActive = isActive;
    }

}
