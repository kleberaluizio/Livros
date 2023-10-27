package com.kleberaluizio.bookstore.entity.schoppingcart;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class CouponManager
{
	private Set<String> coupons;
	public CouponManager(){
		this.coupons.addAll(Arrays.asList("CUP74","CUP158","CUP14","CUP52",
			"CUP21","CUP221","CUP91","CUP327","CUP410","CUP275","CUP484",
			"CUP207","CUP96","CUP119","CUP174","CUP291","CUP1",
			"CUP115","CUP222","CUP272"));
	}
	public boolean isCouponValid(String coupon){
		return this.coupons.contains(coupon);
	}
}
