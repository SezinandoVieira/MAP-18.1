package br.cesed.unifacisa.si.map.atividade5.interfaces.factory;

import br.cesed.unifacisa.si.map.atividade5.interfaces.ingredients.*;

public interface PizzaIngredientFactory {

	Dough createDough();
	Clams createClams();
	Pepperoni createPepperoni();
	Cheese createCheese();
	Sauce createSauce();
	Veggies createVeggies();
	
}
