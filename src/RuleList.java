import java.util.ArrayList;

public class RuleList 
{
	//Data structure for list of rules
	private ArrayList<Rule> rules = new ArrayList<Rule>();
	
	private int numberOfSubCategories = 18;
	
	//categories
	private String deck_building = "Deckbuilding";
	private String gameplay = "Gameplay";
	
	//deckbuilding subcategories
	private String number_of_cards_in_deck = "Number of cards in deck";
	private String card_name = "Card Name";
	private String rarity = "Rarity";
	//private String card_pool = "Card Pool";
	private String card_type = "Card Type";
	private String cmc = "Converted Mana Cost";
	private String color = "Color";
	private String misc = "Miscellaneous";
	
	//gameplay subcategories
	private String life_total = "Life Total";
	private String deck_size = "Deck Size";
	private String hand_size = "Hand Size";
	private String card_draw = "Card Draw";
	private String lands = "Lands";
	private String creatures = "Creatures";
	private String spell_cost = "Spell Cost";
	private String spells = "Spells";
	private String turns = "Turns";
	private String other_rules = "Other";
	
	//populates the list with all the rules upon instantiation
	public RuleList()
	{
		Rule oneCopy = new Rule("Decks must not exceed 1 copy of any card, excluding basic lands.", 20, deck_building, number_of_cards_in_deck);
		rules.add(oneCopy);
		Rule twoCopies = new Rule("Decks must not exceed 2 copy of any card, excluding basic lands.", 10, deck_building, number_of_cards_in_deck);
		rules.add(twoCopies);
		Rule sixCopies = new Rule("Decks must not exceed 6 copy of any card, excluding basic lands.", 10, deck_building, number_of_cards_in_deck);
		rules.add(sixCopies);
		Rule eightCopies = new Rule("Decks must not exceed 8 copy of any card, excluding basic lands.", 30, deck_building, number_of_cards_in_deck);
		rules.add(eightCopies);
		Rule noLimit = new Rule("There is no limit on how many copies of any card a deck may contain.", 60, deck_building, number_of_cards_in_deck);
		rules.add(noLimit);
		Rule different_letter = new Rule("Every unique cardname must start with a different letter of the alphabet.", 45, deck_building, card_name);
		rules.add(different_letter);
		Rule no_e = new Rule("No cards with e in the cardname, excluding basic lands.", 45, deck_building, card_name);
		rules.add(no_e);
		Rule only_e = new Rule("Only cards with e in the cardname, excluding basic lands.", 50, deck_building, card_name);
		rules.add(only_e);
		Rule no_a = new Rule("No cards with a in the cardname, excluding basic lands.", 40, deck_building, card_name);
		rules.add(no_a);
		Rule only_a = new Rule("Only cards with a in the cardname, excluding basic lands.", 50, deck_building, card_name);
		rules.add(only_a);
		Rule peasent = new Rule("Only commons and uncommons.", 30, deck_building, rarity);
		rules.add(peasent);
		Rule rare_common = new Rule("Only commons and rares.", 30, deck_building, rarity);
		rules.add(rare_common);
		Rule mythic_common = new Rule("Only commons and mythics.", 40, deck_building, rarity);
		rules.add(mythic_common);
		Rule rare_uncommon = new Rule("Only uncommons and rares.", 45, deck_building, rarity);
		rules.add(rare_uncommon);
		Rule mythic_uncommon = new Rule("Only uncommons and mythics.", 45, deck_building, rarity);
		rules.add(mythic_uncommon);
		Rule rare_mythic = new Rule("Only rares and mythics.", 60, deck_building, rarity);
		rules.add(rare_mythic);
		/*
		Rule pioneer = new Rule("Pioneer-legal cards only.", 5, deck_building, card_pool);
		rules.add(pioneer);
		Rule modern = new Rule("Modern-legal cards only.", 5, deck_building, card_pool);
		rules.add(modern);
		Rule vintage = new Rule("Vintage-legal cards only (including restricted cards).", 25, deck_building, card_pool);
		rules.add(vintage);
		*/
		Rule no_creatures = new Rule("No Creatures.", 30, deck_building, card_type);
		rules.add(no_creatures);
		Rule max_ten_creatures = new Rule("Maximum of 10 creatures.", 20, deck_building, card_type);
		rules.add(max_ten_creatures);
		Rule min_twofive_creatures = new Rule("Minimum of 25 creatures.", 20, deck_building, card_type);
		rules.add(min_twofive_creatures);
		Rule artifacts_enchantments = new Rule("All nonland permanents must be artifacts or enchantments.", 30, deck_building, card_type);
		rules.add(artifacts_enchantments);
		Rule minimum_twofive_spells = new Rule("Minimum of 25 instants/sorceries", 25, deck_building, card_type);
		rules.add(minimum_twofive_spells);
		Rule twofive_artifacts_enchantments = new Rule("Minimum of 25 artifacts/enchantments.", 25, deck_building, card_type);
		rules.add(twofive_artifacts_enchantments);
		Rule all_legendary_creatures = new Rule("All creatures must be legendary.", 15, deck_building, card_type);
		rules.add(all_legendary_creatures);
		Rule even_cmc = new Rule("All nonland cards must have even CMC.", 35, deck_building, cmc);
		rules.add(even_cmc);
		Rule odd_cmc = new Rule("All nonland cards must have odd CMC.", 35, deck_building, cmc);
		rules.add(odd_cmc);
		Rule three_or_less = new Rule("All nonland cards must have CMC 3 or lower.", 25, deck_building, cmc);
		rules.add(three_or_less);
		Rule two_or_less = new Rule("All nonland cards must have CMC 2 or lower.", 30, deck_building, cmc);
		rules.add(two_or_less);
		Rule three_or_greater = new Rule("All nonland cards must have CMC 3 or greater.", 30, deck_building, cmc);
		rules.add(three_or_greater);
		Rule no_green = new Rule("No Green.", 25, deck_building, color);
		rules.add(no_green);
		Rule no_blue = new Rule("No Blue.", 25, deck_building, color);
		rules.add(no_blue);
		Rule no_white = new Rule("No White.", 25, deck_building, color);
		rules.add(no_white);
		Rule no_red = new Rule("No Red.", 25, deck_building, color);
		rules.add(no_red);
		Rule no_black = new Rule("No Black.", 25, deck_building, color);
		rules.add(no_black);
		Rule no_green_or_blue = new Rule("No Green or Blue.", 30, deck_building, color);
		rules.add(no_green_or_blue);
		Rule no_green_or_white = new Rule("No Green or White.", 30, deck_building, color);
		rules.add(no_green_or_white);
		Rule no_green_or_red = new Rule("No Green or Red.", 30, deck_building, color);
		rules.add(no_green_or_red);
		Rule no_green_or_black = new Rule("No Green or Black.", 30, deck_building, color);
		rules.add(no_green_or_black);
		Rule no_blue_or_white = new Rule("No Blue or White.", 30, deck_building, color);
		rules.add(no_blue_or_white);
		Rule no_blue_or_red = new Rule("No Blue or Red.", 30, deck_building, color);
		rules.add(no_blue_or_red);
		Rule no_blue_or_black = new Rule("No Blue or Black.", 30, deck_building, color);
		rules.add(no_blue_or_black);
		Rule no_white_or_red = new Rule("No White or Red.", 30, deck_building, color);
		rules.add(no_white_or_red);
		Rule no_white_or_black = new Rule("No White or Black.", 30, deck_building, color);
		rules.add(no_white_or_black);
		Rule no_red_or_black = new Rule("No Red or Black.", 30, deck_building, color);
		rules.add(no_red_or_black);
		Rule females = new Rule("All nonland cards must have art depicting a humanoid female.", 45, deck_building, misc);
		rules.add(females);
		Rule banned_cards = new Rule("All decks must contain at least 4 cards that have been banned in a constructed format (can be the same card).", 45, deck_building, misc);
		rules.add(banned_cards);
		Rule life_total_twelve = new Rule("Starting Life Total: 12.", 30, gameplay, life_total);
		rules.add(life_total_twelve);
		Rule life_total_fifteen = new Rule("Starting Life Total: 15.", 20, gameplay, life_total);
		rules.add(life_total_fifteen);
		Rule life_total_twofive = new Rule("Starting Life Total: 25.", 10, gameplay, life_total);
		rules.add(life_total_twofive);
		Rule life_total_thirty = new Rule("Starting Life Total: 30.", 20, gameplay, life_total);
		rules.add(life_total_thirty);
		Rule life_total_fourTwenty = new Rule("Starting Life Total: 420.", 60, gameplay, life_total);
		rules.add(life_total_fourTwenty);
		Rule deck_size_thirty = new Rule("Minimum deck size of 30.", 30, gameplay, deck_size);
		rules.add(deck_size_thirty);
		Rule deck_size_forty = new Rule("Minimum deck size of 40.", 10, gameplay, deck_size);
		rules.add(deck_size_forty);
		Rule deck_size_eighty = new Rule("Minimum deck size of 80.", 10, gameplay, deck_size);
		rules.add(deck_size_eighty);
		Rule deck_size_hundred = new Rule("Minimum deck size of 100.", 20, gameplay, deck_size);
		rules.add(deck_size_hundred);
		Rule hand_size_five = new Rule("Starting and maximum hand size: 5.", 20, gameplay, hand_size);
		rules.add(hand_size_five);
		Rule hand_size_eight = new Rule("Starting and maximum hand size: 8.", 10, gameplay, hand_size);
		rules.add(hand_size_eight);
		Rule hand_size_nine = new Rule("Starting and maximum hand size: 9.", 20, gameplay, hand_size);
		rules.add(hand_size_nine);
		Rule hand_size_ten = new Rule("Starting and maximum hand size: 10.", 30, gameplay, hand_size);
		rules.add(hand_size_ten);
		Rule draw_two_cards = new Rule("During your draw step, you draw 2 cards.", 35, gameplay, card_draw);
		rules.add(draw_two_cards);
		Rule tap_for_all_colors = new Rule("Lands tap for every color of mana (or colorless).", 20, gameplay, lands);
		rules.add(tap_for_all_colors);
		Rule tap_for_double_mana = new Rule("Lands tap for double mana (any color or type they would normally produce).", 40, gameplay, lands);
		rules.add(tap_for_double_mana);
		Rule two_lands = new Rule("You can play 2 lands per turn.", 30, gameplay, lands);
		rules.add(two_lands);
		Rule instant_lands = new Rule("Lands can be played at instant speed.", 10, gameplay, lands);
		rules.add(instant_lands);
		Rule all_creatures_plusOne = new Rule("All creatures get +1/+1", 20, gameplay, creatures);
		rules.add(all_creatures_plusOne);
		Rule all_creatures_plusMinusOne = new Rule("All creatures get -1/-1.", 25, gameplay, creatures);
		rules.add(all_creatures_plusMinusOne);
		Rule trample = new Rule("All creatures have trample.", 15, gameplay, creatures);
		rules.add(trample);
		Rule double_strike = new Rule("All creatures have double strike.", 30, gameplay, creatures);
		rules.add(double_strike);
		Rule unblockable = new Rule("All creatures are unblockable.", 30, gameplay, creatures);
		rules.add(unblockable);
		Rule haste = new Rule("All creatures have haste.", 20, gameplay, creatures);
		rules.add(haste);
		Rule spells_one_less = new Rule("All spells cost [1] less.", 30, gameplay, spell_cost);
		rules.add(spells_one_less);
		Rule creatures_one_less = new Rule("All creature spells cost [1] less.", 15, gameplay, spell_cost);
		rules.add(creatures_one_less);
		Rule artifacts_one_less = new Rule("All artifact spells cost [1] less.", 15, gameplay, spell_cost);
		rules.add(artifacts_one_less);
		Rule inst_sorc_one_less = new Rule("All instant or sorcery spells cost [1] less.", 15, gameplay, spell_cost);
		rules.add(inst_sorc_one_less);
		Rule spells_one_more = new Rule("All spells cost [1] more.", 25, gameplay, spell_cost);
		rules.add(spells_one_more);
		Rule creatures_one_more = new Rule("All creature spells cost [1] more.", 20, gameplay, spell_cost);
		rules.add(creatures_one_more);
		Rule noncreatures_one_more = new Rule("All non-creature spells cost [1] more.", 20, gameplay, spell_cost);
		rules.add(noncreatures_one_more);
		Rule instant_speed = new Rule("All spells can be cast at instant speed", 20, gameplay, spells);
		rules.add(instant_speed);
		Rule sorceries_at_instant_speed = new Rule("All sorcery spells can be cast at instant speed.", 15, gameplay, spells);
		rules.add(sorceries_at_instant_speed);
		Rule artifacts_enchantments_instant_speed = new Rule("All artifact and enchantment spells can be cast at instant speed.", 15, gameplay, spells);
		rules.add(artifacts_enchantments_instant_speed);
		Rule skip_upkeep = new Rule("All upkeep phases are skipped.", 30, gameplay, turns);
		rules.add(skip_upkeep);
		Rule skip_second_main_phase = new Rule("All second main phases are skipped.", 15, gameplay, turns);
		rules.add(skip_second_main_phase);
		Rule win_instead = new Rule("Whenever a player would (normally) lose the game for any reason, they win the game instead.", 60, gameplay, other_rules);
		rules.add(win_instead);
		Rule zero_life_win = new Rule("When a player reaches 0 or less life, they win the game.", 60, gameplay, other_rules);
		rules.add(zero_life_win);
		Rule lab_man = new Rule("When a player must draw from an empty library, they win the game (Lab Man Effect).", 45, gameplay, other_rules);
		rules.add(lab_man);
		Rule dont_lose_at_zero = new Rule("Players do not lose the game when they reach 0 or less life.", 60, gameplay, other_rules);
		rules.add(dont_lose_at_zero);
		Rule no_exile = new Rule("Whenever a card is exiled from anywhere, it goes to the graveyard instead.", 35, gameplay, other_rules);
		rules.add(no_exile);
		Rule no_graveyard = new Rule("Whenever a card would go to the graveyard from anywhere, it is exiled instead.", 30, gameplay, other_rules);
		rules.add(no_graveyard);
		Rule switch_controller = new Rule("If a creature would enter the battlefield under your control, it enters on an opponents control instead.", 40, gameplay, other_rules);
		rules.add(switch_controller);
	}
	
	//returns rule object at index
	public Rule getRule(int index)
	{
		return rules.get(index);
	}
	
	//returns the list size, which is the number of rules
	public int getNumberOfRules()
	{
		return rules.size();
	}
	
	public ArrayList<Rule> getList()
	{
		return rules;
	}
	
	public int getNumberOfSubCategories()
	{
		return numberOfSubCategories;
	}
}
