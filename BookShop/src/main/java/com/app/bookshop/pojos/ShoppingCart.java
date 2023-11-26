package com.app.bookshop.pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "carts")
@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = {"cartOwner","cartItems"})
public class ShoppingCart extends BaseEntity {
	//private double totalCartPrice;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id") // FK constraint
	private User cartOwner;
	
	@OneToMany(mappedBy = "myCart", cascade = CascadeType.ALL, orphanRemoval = true/* ,fetch = FetchType.EAGER */)
	private List<CartIteam> cartItems = new ArrayList<>();
}
