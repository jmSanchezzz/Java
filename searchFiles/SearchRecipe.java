package searchFiles;

import java.util.ArrayList;

public class SearchRecipe {
	private ArrayList<Recipe> recipeList;
	
	public SearchRecipe() {
		recipeList = new ArrayList<>();
	}
	public void add(Recipe recipe) {
		recipeList.add(recipe);
	} 
	public void findName(String name) {
		for(Recipe recipe:recipeList) {
			if(recipe.getName().contains(name)) {
				System.out.println(recipe);
			}
		}
		
	}
	public void findCookingTime(int maximumTime) {
		System.out.println("Recipes:");
		for(Recipe recipe : recipeList) {
			if(recipe.getCookingTime()<=maximumTime) {
				System.out.println(recipe);
			}
			
		}
	
	}
	public void findIngredient(String ingredient) {
		for(Recipe recipe : recipeList) {
			if(recipe.ingredients.contains(ingredient)) {
				System.out.println(recipe);
			}
		}
	}
	public void print() {
		
		for(Recipe recipe : recipeList) {
			System.out.println(recipe);
		}
	}

}
