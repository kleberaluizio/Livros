package entity.revistas;

import entity.editora.Editora;

public class Magazine
{
	private String name;
	private String description;
	private double value;
	private Editora editora;

	public boolean applyDiscountOf(double percentage){
		if(percentage > 0.1){
			return false;
		}
		double discount = getValue() * percentage;
		setValue(getValue() - discount);
		return true;
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
