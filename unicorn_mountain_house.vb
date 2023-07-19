Public Class edibleEducation

Private Sub cmdCook_Click(sender As Object, e As EventArgs) Handles cmdCook.Click
    'This procedure allows the user to select ingredients and instructions for a meal.
    Dim strIngredient As String 
    Dim strInstruction As String

    'Allow the user to select the ingredients
    strIngredient = InputBox("Please enter the ingredients you need for the meal.", "Enter Ingredients")

    'Allow the user to enter the instructions
    strInstruction = InputBox("Please enter the instructions for the meal.", "Enter Instructions")

    ' Display a message with the results of the user's input
    MessageBox.Show("Your ingredients are: " & strIngredient & vbCrLf & vbCrLf & "Your instructions are: " & strInstruction)

End Sub

Private Sub cmdShop_Click(sender As Object, e As EventArgs) Handles cmdShop.Click
    'This procedure provides a list of ingredients and instructions for a meal.
    Dim strIngredient As String
    Dim strInstruction As String

    'Provide a list of ingredients
    strIngredient = "2 cups of rice, 1 can of corn, 2 tablespoons of butter, 1 teaspoon of salt"

    'Provide a list of instructions
    strInstruction = "1. Cook the rice according to package instructions. 2. Heat the butter in a skillet. 3. Add the corn and salt to the skillet and cook for five minutes. 4. Add the cooked rice to the skillet and mix well. 5. Serve and enjoy!"

    'Display a message with the ingredients and instructions
    MessageBox.Show("Your ingredients are: " & strIngredient & vbCrLf & vbCrLf & "Your instructions are: " & strInstruction)

End Sub

Private Sub cmdWonder_Click(sender As Object, e As EventArgs) Handles cmdWonder.Click
    'This procedure provides helpful tips for new cooks.
    Dim strTip As String

    'Provide helpful tips
    strTip = "1. Read the recipe before you start. 2. Measure ingredients accurately. 3. Taste as you go and adjust flavors as needed. 4. Experiment with new ingredients and flavors. 5. Have fun and enjoy the process!"

    'Display a message with the helpful tips
    MessageBox.Show("Helpful Tips:" & vbCrLf & vbCrLf & strTip)

End Sub

Private Sub cmdExit_Click(sender As Object, e As EventArgs) Handles cmdExit.Click
    'This procedure exits the program.

    'Close the form
    Me.Close()

End Sub

End Class