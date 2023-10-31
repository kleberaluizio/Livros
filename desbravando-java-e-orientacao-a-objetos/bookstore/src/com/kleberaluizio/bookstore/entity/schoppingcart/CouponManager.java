package com.kleberaluizio.bookstore.entity.schoppingcart;

import java.util.*;

public class CouponManager
{
	private Map<String,Double> coupons;
	public CouponManager(){
		this.coupons = new HashMap<>();
		coupons.put("cab11",10.0);
		coupons.put("cab22",12.0);
		coupons.put("cab33",13.0);
		coupons.put("cab44",14.0);
	}
	public Double validateCoupon(String coupon){
		return this.coupons.get(coupon);
	}
}
