package com.kleberaluizio.bookstore.test;

import com.kleberaluizio.bookstore.entity.schoppingcart.CouponManager;

public class DiscountConsult
{
	public static void main(String[] args)
	{
		CouponManager manager = new CouponManager();

		String coupon = "cab11";
		Double discount = manager.validateCoupon(coupon);
		if(discount != null){
			System.out.println(String.format("[%s] is a valid!",coupon));
			System.out.println("Value " +discount);
		} else{
			System.out.println(String.format("[%s] is not a valid coupon!",coupon));
		}
	}
}
