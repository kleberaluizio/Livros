package entity.books;

import entity.Writer;

public class PhysicalBook extends Book
{
	public PhysicalBook(Writer writer){
		super(writer);
	}

	public double getPritingFee(){
		return this.getValue() * 0.05;
	}

	@Override
	public boolean applyDiscountOf(double percentage){
		if(percentage > 0.3){
			return false;
		}
		double discount = getValue() * percentage;
		setValue(getValue() - discount);
		System.out.println("Applying physical book discount");
		return true;
	}
}
