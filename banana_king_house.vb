Public Class Form1
 
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
 
        Dim sMessage As String
        sMessage = "Welcome to Edible Education"
        MessageBox.Show(sMessage, "Edible Education")
 
    End Sub
 
    Private Sub btnCalculate_Click(sender As Object, e As EventArgs) Handles btnCalculate.Click
 
        Dim fCost As Single
        Dim fDiscount As Single
 
        fCost = CDbl(txtCost.Text)
        fDiscount = CDbl(txtDiscount.Text)
 
        fCost = fCost - (fCost * (fDiscount / 100))
        txtFinalCost.Text = FormatCurrency(fCost)
 
    End Sub
 
    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
 
        Me.Close()
 
    End Sub
 
    Private Sub btnReset_Click(sender As Object, e As EventArgs) Handles btnReset.Click
 
        txtCost.Text = ""
        txtDiscount.Text = ""
        txtFinalCost.Text = ""
        txtCost.Focus()
 
    End Sub
 
    Private Sub txtCost_KeyPress(sender As Object, e As KeyPressEventArgs) Handles txtCost.KeyPress
 
        'Allows numbers, backspace & delete
        If (e.KeyChar < "0" OrElse e.KeyChar > "9") AndAlso
            e.KeyChar <> ControlChars.Back AndAlso e.KeyChar <> "," Then
            e.Handled = True
        End If
 
    End Sub
 
    Private Sub txtDiscount_KeyPress(sender As Object, e As KeyPressEventArgs) Handles txtDiscount.KeyPress
 
        'Allows numbers, backspace & delete
        If (e.KeyChar < "0" OrElse e.KeyChar > "9") AndAlso
            e.KeyChar <> ControlChars.Back AndAlso e.KeyChar <> "," Then
            e.Handled = True
        End If
 
    End Sub
 
End Class