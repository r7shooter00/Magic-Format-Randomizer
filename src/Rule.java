public class Rule 
{
	//the rule text itself
	private String rule;
	
	//value for how much the rule changes the game
	private int funk_score;
	
	//is it a deckbuilding rule or gameplay rule?
	private String category;
	
	//what aspect of the game does this rule change?
	private String subcategory;
	
	public Rule(String r, int f, String c, String s)
	{
		rule = r;
		funk_score = f;
		category = c;
		subcategory = s;
	}
	
	public String getRule()
	{
		return rule;
	}
	
	public int getFunkScore()
	{
		return funk_score;
	}
	
	public String getCategory()
	{
		return category;
	}
	
	public String getSubCategory()
	{
		return subcategory;
	}
}
