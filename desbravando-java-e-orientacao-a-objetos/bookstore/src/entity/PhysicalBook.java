package entity;

public class PhysicalBook extends Book
{
	public PhysicalBook(Writer writer){
		super(writer);
	}

	public double getPritingFee(){
		return this.getValue() * 0.05;
	}
}
