package com.app.bookshop.pojos;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	// setter n getter

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
