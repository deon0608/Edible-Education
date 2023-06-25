package main 
 
import (
	"fmt"
	"math"
)

//Declare a new type 'Edible'
type Edible struct {
	name string
	calories float64
}

//Function to initialize a new Edible
func newEdible(name string, calories float64) *Edible {
	e := Edible{name, calories}
	return &e
}

//Function to learn more about an Edible
func (e *Edible) learnMore() {
	fmt.Printf("This Edible is '%s' and contains %f calories.\n", e.name, e.calories)
}

//Function to calculate the nutritional value of an Edible
func (e *Edible) nutritiveValue() float64 {
	nutritiveValue := (e.calories)/math.Pow(e.calories, 2)
	return nutritiveValue
}

//Function to compare the nutritional value of two Edibles
func compareNutrition(e1 *Edible, e2 *Edible) {
	value1 := e1.nutritiveValue()
	value2 := e2.nutritiveValue()
	if value1 > value2 {
		fmt.Printf("The Edible '%s' has more nutritional value than '%s'.\n", e1.name, e2.name)
	} else if value2 > value1 {
		fmt.Printf("The Edible '%s' has more nutritional value than '%s'.\n", e2.name, e1.name)
	} else {
		fmt.Printf("The Edibles '%s' and '%s' have equal nutritional value.\n", e1.name, e2.name)
	}
}

//Function to calculate the number of servings of an Edible
func (e *Edible) numServings(targetCalories float64) int {
	servings := int(targetCalories / e.calories)
	return servings
}

//Function to print total calories of an Edible
func (e *Edible) totalCalories(servings int) float64 {
	totalCalories := float64(servings) * e.calories
	fmt.Printf("%d servings of '%s' will contain %f calories.\n", servings, e.name, totalCalories)
	return totalCalories
}

func main() {
	// Create two Edibles
	apple := newEdible("Apple", 100.0)
	banana := newEdible("Banana", 150.0)

	// Learn more about each Edible
	apple.learnMore()
	banana.learnMore()

	// Compare nutrition between the two Edibles
	compareNutrition(apple, banana)

	// Calculate the number of servings needed to reach a target calorie amount
	targetCalories := 600.0
	numServingsApple := apple.numServings(targetCalories)
	numServingsBanana := banana.numServings(targetCalories)

	// Print the total calorie amount for each Edible
	apple.totalCalories(numServingsApple)
	banana.totalCalories(numServingsBanana)
}