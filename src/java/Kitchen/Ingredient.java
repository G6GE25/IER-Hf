package Kitchen;

public class Ingredient {
	private String Name;
	private Integer Amount;
	private Boolean Chopped;
	public Ingredient(String name,Integer amount,Boolean chopped)
	{
		Name=name;
		Amount=amount;
		Chopped=chopped;
	}
	public void SetIngredient(Ingredient param)
	{
		Name=param.getName();
		Amount=param.getAmount();
		Chopped=param.getChopped();
	}
	public Integer getAmount()
	{
		return Amount;
	}
	
	public void setAmount(Integer amount)
	{
		Amount=amount;
	}
	public void setChopped(Boolean chopped)
	{
		Chopped=chopped;
	}
	public Boolean getChopped()
	{
		return Chopped;
	}
	public String getName()
	{
		return Name;
	}
	public void setName(String name)
	{
		Name=name;
	}
}
