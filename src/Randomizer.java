import java.util.*;
import java.lang.*;

public class Randomizer 
{
	public static void main(String[] Args)
	{
		RuleList list = new RuleList();				//creates list with all the rules in it
		ArrayList<Rule> finalRules = new ArrayList<Rule>();			//the final list of rules to print
		Scanner input = new Scanner(System.in);
		double funkValue = 0;
		int infinity = 1000000;
		 
		while (true)
		{
			System.out.print("Input a number between 5 and 674: ");
			funkValue = Math.round(input.nextDouble() / 10) * 10;			//divided by 10 rounded, then multiplied by 10 to round it to a number divisible by 10. This value determines how random the ruleset will be.
			if(funkValue > 670)
			{
				System.out.println("Not that high you dumb dumb.");
				continue;
			}
			break;
		}
		int funkSum = infinity;			//starts at infinity so that the code will enter the next loop
		
		while (funkSum > funkValue + 5)			//funkSum needs to result in a value less than funkValue to have an appropriate list
		{
			list = new RuleList();
			funkSum = 0;			//reset funkSum
			finalRules.clear();			//reset rules so that a proper combination of rules can be gathered
			while (funkSum < funkValue - 5 && !list.getList().isEmpty())
			{
				//acquire a random rule from list
				double index = Math.round(list.getNumberOfRules() * Math.random() - 1);
				if(index < 1)
					index = 0;
				Rule randomRule = list.getRule((int)index);
				
				//if rule passes selection, add it to list
				if (randomRule != null)
				{
					funkSum += randomRule.getFunkScore();
					finalRules.add(randomRule);
					list.getList().remove(randomRule);
					
					//remove all other rules from the added rule's subcategory
					for (int i = 0; i < list.getNumberOfRules(); i++)
					{
						if (list.getRule(i).getSubCategory().equals(randomRule.getSubCategory()))
						{
							list.getList().remove(i);
							i = -1;
						}
					}
				}
			}
			
			if(funkSum < funkValue - 5)
				funkSum = infinity;
		}
		
		//print final list
		for(Rule r: finalRules)
			System.out.println(r.getRule());
		
		//no appropriate combination of rules
		if(finalRules.isEmpty())
			System.out.println("You are playing regular ass Magic.");
	}
}
