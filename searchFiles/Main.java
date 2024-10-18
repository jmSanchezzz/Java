package searchFiles;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    SearchRecipe recipeList = new SearchRecipe();
		Scanner scan = new Scanner(System.in);
		System.out.println("What file to search?");
		String file = scan.nextLine();
		System.out.println("Commands:");
		 System.out.println("list - lists the recipes\n" +
                 "stop - stops the program\n" +
                 "find name - searches recipes by name\n" +
                 "find cooking time - searches recipes by cooking time\n" +
                 "find ingredient - searches recipes by ingredient");
		 String command = scan.nextLine();	
		try(Scanner fileScanner = new Scanner(Paths.get(file))){
			while(fileScanner.hasNextLine()) {
				String name = fileScanner.nextLine();
				int time = Integer.valueOf(fileScanner.nextLine());
				ArrayList<String> ingredientList = new ArrayList<>();
				String ingredient = fileScanner.nextLine();
				while(fileScanner.hasNextLine()) {
					if(ingredient.isEmpty()) {
						break;
					}
					ingredientList.add(ingredient);
					ingredient=fileScanner.nextLine();
				}
				Recipe recipe = new Recipe(name,time,ingredientList);
			    recipeList.add(recipe);
			}
			  if (command.equals("list")) {
	                recipeList.print();
	            } else if (command.equals("stop")) {
	                return;
	            } else if (command.equals("find name")) {
	                System.out.print("Searched word: ");
	                String search = scan.nextLine();
	                recipeList.findName(search);
	            } else if (command.equals("find cooking time")) {
	                System.out.print("Max cooking time: ");
	                int maxTime = Integer.valueOf(scan.nextLine());
	                recipeList.findCookingTime(maxTime);
	            } else if (command.equals(("find ingredient"))) {
	                System.out.print("Ingredient: ");
	                String ingredient = scan.nextLine();
	                recipeList.findIngredient(ingredient);
	            }
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
			
		
		
	}
	


