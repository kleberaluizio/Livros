package entity.books;

import entity.Promotional;
import entity.Writer;

public class Ebook extends Book implements Promotional
{
	private String waterMark;

	public Ebook(Writer writer){
		super(writer);
	}

	public boolean applyDiscountOf(double percentage){
		if(percentage > 0.15){
			return true;
		}
		double discount = getValue() * percentage;
		setValue(getValue() - discount);
		System.out.println("Applying ebook discount");
		return false;
	}

	public String getWaterMark()
	{
		return waterMark;
	}

	public void setWaterMark(String waterMark)
	{
		this.waterMark = waterMark;
	}
}
