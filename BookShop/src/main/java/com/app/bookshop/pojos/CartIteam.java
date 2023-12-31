package com.app.bookshop.pojos;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CartIteam extends BaseEntity{
	private int quantity;
	private double totalPrice;
	@ManyToOne
	@JoinColumn(name = "cart_id")
	private ShoppingCart myCart;
	@OneToOne
	@JoinColumn(name = "product_id")
	private Books books;
}
