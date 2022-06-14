package com.example.kjj.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Vared")
public class Vared extends AuditedModel {

	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy =  GenerationType.SEQUENCE)
	public Long id;

	@Getter
	@Setter
	@OneToMany
	Set<Product> products = new HashSet<>();

	@Getter
	@Setter
	@ManyToOne
	User user;

	public Vared(){}

	public Vared(
			Set<Product> products,
			User user,
			Boolean isActive,
			String createdBy,
			String updatedBy,
			String deletedBy
	) {
		this.user = user;
		this.products = products;
		this.isActive = isActive;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.deletedBy = deletedBy;
	}
}