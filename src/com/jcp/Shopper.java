package com.jcp;

import java.util.ArrayList;

import clothing.ClothingDetails;
import clothing.Pant;
import clothing.Shirt;

public class Shopper {
	private Cart cart;

	public Shopper(Cart pCart) {
		this.cart = pCart;
	}

	public void addShirt(String colour, String design, int code) {
		Shirt s = new Shirt();
		s.setColour(colour);
		s.setDesign(design);
		s.setCode(code);

		ArrayList<ClothingDetails> items = cart.getItemList();
		items.add(s);
		System.out.println("shirt added "+"with "+ colour+" " + design +"  "+ code);
	}

	public void addPant(int size, int price, String material) {
		Pant p = new Pant();
		p.setSize(size);
		p.setPrice(price);
		p.setMaterial(material);

		ArrayList<ClothingDetails> items = cart.getItemList();
		items.add(p);
		System.out.println("pant  added "+"with "+ size +" " + price +"  "+ material);

	}
}
