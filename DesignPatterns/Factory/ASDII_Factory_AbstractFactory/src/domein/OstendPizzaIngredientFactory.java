package domein;

import domein.ingredients.Cheese;
import domein.ingredients.Clams;
import domein.ingredients.Dough;
import domein.ingredients.Pepperoni;
import domein.ingredients.Sauce;
import domein.ingredients.cheese.MozzarellaCheese;
import domein.ingredients.clams.FrozenClams;
import domein.ingredients.dough.ThickCrustDough;
import domein.ingredients.pepperoni.SlicedPepperoni;
import domein.ingredients.sauce.PlumTomatoSauce;
import domein.ingredients.veggies.Eggplant;
import domein.ingredients.veggies.Spinach;
import domein.ingredients.Veggies;
public class OstendPizzaIngredientFactory implements PizzaIngredientFactory 
	{

		public Dough createDough() {
			return new ThickCrustDough();
		}

		public Sauce createSauce() {
			return new PlumTomatoSauce();
		}

		public Cheese createCheese() {
			return new MozzarellaCheese();
		}

		public Veggies[] createVeggies() {
			Veggies veggies[] = { new domein.ingredients.veggies.BlackOlives(), 
			                      new Spinach(), 
			                      new Eggplant() };
			return veggies;
		}

		public Pepperoni createPepperoni() {
			return new SlicedPepperoni();
		}

		public Clams createClam() {
			return new FrozenClams();
		}
	}

