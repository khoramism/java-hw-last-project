package com.example.kjj.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Vared")
public class Vared extends ImpExp {

	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy =  GenerationType.SEQUENCE)
	public Long id;

	public Vared(){}

	public Vared(
			Product product,
			User user,
			Boolean isActive,
			String createdBy,
			String updatedBy,
			String deletedBy
	) {
		this.user = user;
		this.product = product;
		this.isActive = isActive;
	}
}