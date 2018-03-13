package br.cesed.unifacisa.si.map.atividade5.main.pizzaTypes;

import br.cesed.unifacisa.si.map.atividade5.interfaces.factory.PizzaIngredientFactory;
import br.cesed.unifacisa.si.map.atividade5.interfaces.ingredients.Cheese;
import br.cesed.unifacisa.si.map.atividade5.interfaces.ingredients.Clams;
import br.cesed.unifacisa.si.map.atividade5.interfaces.ingredients.Dough;
import br.cesed.unifacisa.si.map.atividade5.interfaces.ingredients.Pepperoni;
import br.cesed.unifacisa.si.map.atividade5.interfaces.ingredients.Sauce;
import br.cesed.unifacisa.si.map.atividade5.interfaces.ingredients.Veggies;
import br.cesed.unifacisa.si.map.atividade5.main.ingredientsClass.CookedVeggies;
import br.cesed.unifacisa.si.map.atividade5.main.ingredientsClass.FrozenClams;
import br.cesed.unifacisa.si.map.atividade5.main.ingredientsClass.PepperoniMeat;
import br.cesed.unifacisa.si.map.atividade5.main.ingredientsClass.PlumTomatoSauce;
import br.cesed.unifacisa.si.map.atividade5.main.ingredientsClass.ReggianoCheese;
import br.cesed.unifacisa.si.map.atividade5.main.ingredientsClass.ThickCrushDough;

public class ChicagoPizzaFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrushDough();
	}

	@Override
	public Clams createClams() {
		return new FrozenClams();
	}

	@Override
	public Pepperoni createPepperoni() {
		return new PepperoniMeat();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Veggies createVeggies() {
		return new CookedVeggies();
	}

}
