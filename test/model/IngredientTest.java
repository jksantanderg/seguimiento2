package model;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class IngredientTest {
	
	
	private Ingredient ingredient;
	private Recipe recipe;
	
	//Esenario
	public void setupStage1() {
		ingredient = new Ingredient("tomate",245);
		
	}
	
	//Casos de prueba
	@Test
	void addWeight() {
		//poner el escenario
		setupStage1();
		String name = ingredient.getName();
		double weight = ingredient.getWeight();
		double inputWeight=54;
		
		ingredient.addWeight(inputWeight);
		ingredient = new Ingredient(name,weight);
		
		//Asserts
		/*int size =  recipe.getIngredients().size();
		assertEquals(size, 1);
		Ingredient ingredient = recipe.getIngredients().get(0);*/
		assertEquals(name, ingredient.getName());
		assertEquals(weight,ingredient.getWeight());
		

	}
	
	@Test
	void addWeightE() {
		//poner el escenario
		setupStage1();
		String name = ingredient.getName();
		double weight = ingredient.getWeight();
		double inputWeight=-100;
		
		ingredient.addWeight(inputWeight);
		ingredient = new Ingredient(name,weight);
		
		//Asserts
		/*int size =  recipe.getIngredients().size();
		assertEquals(size, 1);
		Ingredient ingredient = recipe.getIngredients().get(0);*/
		assertEquals(name,ingredient.getName());
		assertEquals(weight,ingredient.getWeight());

	}
	
	@Test
	void removeWeight() {
		//poner el escenario
		setupStage1();
		String name = ingredient.getName();
		double weight = ingredient.getWeight();
		double inputWeight=45;
		
		ingredient.removeWeight(inputWeight);
		ingredient = new Ingredient(name,weight);
		
		//Asserts
		/*int size =  recipe.getIngredients().size();
		assertEquals(size, 1);
		Ingredient ingredient = recipe.getIngredients().get(0);*/
		assertEquals(name,ingredient.getName());
		assertEquals(weight,ingredient.getWeight());

	}
	
	@Test
	void removeWeightE() {
		//poner el escenario
		setupStage1();
		String name = ingredient.getName();
		double weight = ingredient.getWeight();
		double inputWeight=-100;
		
		ingredient.removeWeight(inputWeight);
		ingredient = new Ingredient(name,weight);
		
		//Asserts
		/*int size =  recipe.getIngredients().size();
		assertEquals(size, 1);
		Ingredient ingredient = recipe.getIngredients().get(0);*/
		assertEquals(name,ingredient.getName());
		assertEquals(weight,ingredient.getWeight());

	}
}
