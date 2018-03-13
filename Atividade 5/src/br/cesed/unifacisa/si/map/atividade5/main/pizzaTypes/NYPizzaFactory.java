package br.cesed.unifacisa.si.map.atividade5.main.pizzaTypes;

import br.cesed.unifacisa.si.map.atividade5.interfaces.factory.PizzaIngredientFactory;
import br.cesed.unifacisa.si.map.atividade5.interfaces.ingredients.Cheese;
import br.cesed.unifacisa.si.map.atividade5.interfaces.ingredients.Clams;
import br.cesed.unifacisa.si.map.atividade5.interfaces.ingredients.Dough;
import br.cesed.unifacisa.si.map.atividade5.interfaces.ingredients.Pepperoni;
import br.cesed.unifacisa.si.map.atividade5.interfaces.ingredients.Sauce;
import br.cesed.unifacisa.si.map.atividade5.interfaces.ingredients.Veggies;
import br.cesed.unifacisa.si.map.atividade5.main.ingredientsClass.FreshClams;
import br.cesed.unifacisa.si.map.atividade5.main.ingredientsClass.FreshVeggies;
import br.cesed.unifacisa.si.map.atividade5.main.ingredientsClass.MarinaraSauce;
import br.cesed.unifacisa.si.map.atividade5.main.ingredientsClass.MozzarellaCheese;
import br.cesed.unifacisa.si.map.atividade5.main.ingredientsClass.PepperoniMeat;
import br.cesed.unifacisa.si.map.atividade5.main.ingredientsClass.ThinCrushDough;

public class NYPizzaFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrushDough();
	}

	@Override
	public Clams createClams() {
		return new FreshClams();
	}

	@Override
	public Pepperoni createPepperoni() {
		return new PepperoniMeat();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Veggies createVeggies() {
		return new FreshVeggies();
	}

}
