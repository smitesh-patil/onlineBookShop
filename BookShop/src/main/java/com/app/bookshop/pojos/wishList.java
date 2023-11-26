package com.app.bookshop.pojos;
//package com.app.bookshop.pojos;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@Entity
//@Table(name = "wishlist")
//@Setter
//@Getter
//@NoArgsConstructor
//@ToString
//public class wishList extends BaseEntity{
//	
//	@OneToOne(targetEntity = User.class,fetch = FetchType.EAGER)
//@JoinColumn(name="user_id")
//	private User user;
//	
//@ManyToOne
//@JoinColumn(name ="book_id")
//private Books book;
//
//
//public wishList(User user, Books book) {
//	super();
//	this.user = user;
//	this.book = book;
//}
//
//
//
//}
