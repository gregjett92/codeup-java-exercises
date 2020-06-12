
package oopLecture;

public class DishTest {

    public static void main(String[] args) {

        Dish dish1 = new Dish();
        dish1.setCostInCents(1000);
        dish1.setNameOfDish("Coffee");
        dish1.setWouldRecommend(false);
//        dish1.printSummary();

        DishTools.analyzeDishCost(dish1);
        DishTools.shoutDishName(dish1);
        DishTools.flipRecommendation(dish1);
        dish1.printSummary();

    }

}
