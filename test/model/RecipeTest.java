package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecipeTest {
	
	private Recipe recipe;
	private Ingredient ingredient;
	//Esenarios
	public void setupStage1() {
		recipe = new Recipe ();
	}
	
	public void setupStage2() {
		ingredient = new Ingredient("Cebolla",315);
		ingredient = new Ingredient("Ajo",58);
		ingredient = new Ingredient("Arroz",520);
	}
	
	
	
	@Test
	void addIngredientTest() {
		//poner el escenario
		setupStage1();
		String name = "Sal";
		double weight = 12;
	
		recipe.addIngredient(name,weight);
		
		
		//Asserts
		int size =  recipe.getIngredients().size();
		assertEquals(size, 1);
		Ingredient ingredient = recipe.getIngredients().get(0);
		assertEquals(name,ingredient.getName());
		assertEquals(weight,ingredient.getWeight());

	}
	
	@Test
	void addIngTest() {
		//poner el escenario
		setupStage2();
		String name = "Pimienta";
		double weight = 6;
		
		recipe.addIngredient(name,weight);
		//La receta ahora tiene 4 ingredientes, el �ltimo de los cuales tiene nombre Pimienta y peso 6.
		
		//Asserts
		int size =  recipe.getIngredients().size();
		assertEquals(size, 1);
		Ingredient ingredient = recipe.getIngredients().get(0);
		assertEquals(name,ingredient.getName());
		assertEquals(weight,ingredient.getWeight());

	}
	
	@Test
	void addrTest() {
		//poner el escenario
		setupStage2();
		String name = "Ajo";
		double weight = 21;
		
		recipe.addIngredient(name,weight);
		
		//La receta sigue teniendo 3 ingredientes, pero el ingrediente con nombre Ajo ahora tiene un peso de 79.
		
		//Asserts
	
		assertEquals(3,ingredient.getName());
		assertEquals(weight,ingredient.getWeight());

	}
	
	@Test
	void removeIngredientTest() {
		//poner el escenario
		setupStage2();
		String name = "Ajo";
		
		
		recipe.removeIngredient(name);
		
		//La receta ahora tiene 2 ingredientes: Cebolla y Arroz
		
		//Asserts
		assertEquals(null,ingredient.getName());
		assertEquals(null,ingredient.getWeight());

	}
	

}
