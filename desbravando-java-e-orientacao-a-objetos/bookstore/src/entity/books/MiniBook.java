package entity.books;

import entity.Writer;

public class MiniBook extends Book
{
	public MiniBook(Writer writer){
		super(writer);
	}

	@Override
	public boolean applyDiscountOf(double percentage)
	{
		return false;
	}
}
