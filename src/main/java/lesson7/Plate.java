package lesson7;

public class Plate {
    private int foodCount;

    public Plate(int foodCount) {
        this.foodCount = foodCount;
        
    }

    public void printInfo() {
        System.out.println("Количество еды в миске: " + foodCount);
    }

    public boolean decreaseFood(int catEatFoodCount) {
        if (foodCount >= catEatFoodCount) {
            foodCount -= catEatFoodCount;
            return true;
        }
        else {
            return false;
        }
    }

    public void increaseFood(int newFoodCount) {
        foodCount += newFoodCount;
    }

    public int getFoodCount() {
        return foodCount;
    }
}
