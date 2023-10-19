package entity;

public class Ebook extends Book
{
	private String waterMark;

	public Ebook(Writer writer){
		super(writer);
	}

	@Override
	public boolean applyDiscountOf(double percentage){
		if(percentage > 0.15){
			return false;
		}
		System.out.println("Applying ebook discount");
		return super.applyDiscountOf(percentage);
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
