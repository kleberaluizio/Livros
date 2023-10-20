package entity.revistas;

import entity.Product;
import entity.Promotional;
import entity.editora.Editora;

public class Magazine implements Product, Promotional
{
	private String name;
	private String description;
	private double value;
	private Editora editora;

	@Override
	public boolean applyDiscountOf(double percentage){
		if(percentage > 0.1){
			return true;
		}
		double discount = getValue() * percentage;
		setValue(getValue() - discount);
		return false;
	}
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public double getValue()
	{
		return value;
	}

	public void setValue(double value)
	{
		this.value = value;
	}

	public Editora getEditora()
	{
		return editora;
	}

	public void setEditora(Editora editora)
	{
		this.editora = editora;
	}


}
