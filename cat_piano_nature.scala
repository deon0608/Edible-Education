object EdibleEducation {
	//import necessary classes
	import java.util.Scanner
	import scala.collection.mutable.ArrayBuffer

	//create Scanner class object
	val input = new Scanner(System.in)

	//define main method
	def main(args: Array[String]): Unit = {
		//welcome user to the system
		println("Welcome to Edible Education!")

		//prompt user for input
		println("Please enter your favorite food:")
		val favoriteFood = input.nextLine()

		//initialize empty array to store user's education preferences
		var educationPreferences = ArrayBuffer[String]()

		//prompt user for input
		println("Please enter the type of education you would like to learn about related to "+favoriteFood+":")

		//add user's input to array
		educationPreferences += input.nextLine()

		//prompt user for input
		println("Is there anything else you would like to learn about related to "+favoriteFood+"?")

		//loop until user enters "no"
		while(input.nextLine() != "no") {
			//prompt user for input
			println("Please enter the type of education you would like to learn about related to "+favoriteFood+":")

			//add user's input to array
			educationPreferences += input.nextLine()
		}

		//display user's preferences
		println("You are interested in learning the following things related to "+favoriteFood+":")
		for(preference <- educationPreferences) {
			println(preference)
		}
	}

}