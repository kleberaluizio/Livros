package com.kleberaluizio.bookstore.test;

import com.kleberaluizio.bookstore.entity.schoppingcart.CouponManager;

public class DiscountConsult
{
	public static void main(String[] args)
	{
		CouponManager manager = new CouponManager();

		String coupon = "CUP1234";
		if(manager.isCouponValid(coupon)){
			System.out.println(String.format("[%s] is a valid!",coupon));
		} else{
			System.out.println(String.format("[%s] is not a valid coupon!",coupon));
		}
	}
}
