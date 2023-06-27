// This code will create a simple program to teach users about Edible Education

object EdibleEducation {

  // Define function to print Edible Education introduction
  def printEdibleEducationIntro(): Unit = {
    println("Edible Education focuses on understanding the many concepts of food and nutrition and how to incorporate them into everyday life. The program strives to bring together people of all ages and backgrounds to learn, share, analyze and explore the importance of edible education.")
  }

  // Define function to display food nutrient categories
  def displayFoodNutrientCategories(): Unit = {
    println("1. Carbohydrates")
    println("2. Proteins")
    println("3. Fats")
    println("4. Vitamins and Minerals")
    println("5. Water")
  }

  // Define function to explain the importance of each food nutrient category
  def explainFoodNutrientCategories(): Unit = {
    println("Carbohydrates provide us with the energy to fuel our bodies.")
    println("Proteins provide us with the building blocks for healthy muscles and tissues.")
    println("Fats provide us with essential fatty acids that are important for our health.")
    println("Vitamins and minerals provide us with nutrients that help us stay healthy.")
    println("Water helps to keep us hydrated and helps our bodies to function correctly.")
  }

  // Define function to explain how food can be incorporated into everyday life
  def explainFoodIncorporationIntoLife(): Unit = {
    println("Food can be incorporated into everyday life in many ways. Eating healthy meals and snacks, exercising regularly and drinking plenty of water are just a few things that can help keep us healthy. It is also important to make sure we get the right balance of nutrients from our food, and to make sure we are getting enough nutrients by eating a variety of different foods.")
  }

  // Define function to explain what happens when we don't get enough nutrients
  def explainNutrientDeficiency(): Unit = {
    println("When we don't get enough nutrients from our food, our bodies can start to suffer. Not getting enough of the right nutrients can lead to tiredness, poor concentration, a weakened immune system and other illnesses and diseases.")
  }

  // Define function to explain ways to get enough nutrients
  def explainGettingEnoughNutrients(): Unit = {
    println("Eating a balanced diet is the best way to make sure our bodies get enough of the right nutrients. It is important to eat a variety of different foods to make sure our bodies get the right balance of nutrients. Eating enough of the right foods can also help us to maintain a healthy weight and keep our energy levels up.")
  }

  // Define function to display conclusion
  def displayConclusion(): Unit = {
    println("Knowing how to get the right balance of nutrients from our food is an important part of edible education. Learning about edible education and how to incorporate it into our lives can help us to stay healthy and happy.")
  }

  // Main function
  def main(args: Array[String]): Unit = {
    println("Welcome to Edible Education!\n")

    printEdibleEducationIntro()
    println()
    
    println("Let's begin by exploring the five main categories of food nutrients:\n")
    displayFoodNutrientCategories()
    println()

    println("Now let's learn about the importance of each of these categories:\n")
    explainFoodNutrientCategories()
    println()

    println("Now let's discuss how food can be incorporated into everyday life:\n")
    explainFoodIncorporationIntoLife()
    println()

    println("What happens when we don't get enough nutrients?\n")
    explainNutrientDeficiency()
    println()

    println("How can we make sure we get enough nutrients?\n")
    explainGettingEnoughNutrients()
    println()

    println("We can conclude that:\n")
    displayConclusion()
  }

}