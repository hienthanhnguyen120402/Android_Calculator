package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    private lateinit var resultEditText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultEditText = findViewById(R.id.resultsEditText)

        var btn_0 = findViewById<Button>(R.id.btn_0);
        var btn_1 = findViewById<Button>(R.id.btn_1);
        var btn_2 = findViewById<Button>(R.id.btn_2);
        var btn_3 = findViewById<Button>(R.id.btn_3);
        var btn_4 = findViewById<Button>(R.id.btn_4);
        var btn_5 = findViewById<Button>(R.id.btn_5);
        var btn_6 = findViewById<Button>(R.id.btn_6);
        var btn_7 = findViewById<Button>(R.id.btn_7);
        var btn_8 = findViewById<Button>(R.id.btn_8);
        var btn_9 = findViewById<Button>(R.id.btn_9);
        var btn_divice = findViewById<Button>(R.id.btn_divide);
        var btn_multiply = findViewById<Button>(R.id.btn_multiply);
        var btn_subtract = findViewById<Button>(R.id.btn_subtract);
        var btn_plus = findViewById<Button>(R.id.btn_plus);
        var btn_C = findViewById<Button>(R.id.btn_C);
        var btn_CE = findViewById<Button>(R.id.btn_CE);
        var btn_BS = findViewById<Button>(R.id.btn_BS);
        var btn_equal = findViewById<Button>(R.id.btn_equal);
        var btn_dots = findViewById<Button>(R.id.btn_dots);
        var btn_plus_sub = findViewById<Button>(R.id.btn_plus_sub);

        btn_0.setOnClickListener{ changeEveryAction(btn_0.text.toString()); }
        btn_1.setOnClickListener{ changeEveryAction(btn_1.text.toString()); }
        btn_2.setOnClickListener{ changeEveryAction(btn_2.text.toString()); }
        btn_3.setOnClickListener{ changeEveryAction(btn_3.text.toString()); }
        btn_4.setOnClickListener{ changeEveryAction(btn_4.text.toString()); }
        btn_5.setOnClickListener{ changeEveryAction(btn_5.text.toString()); }
        btn_6.setOnClickListener{ changeEveryAction(btn_6.text.toString()); }
        btn_7.setOnClickListener{ changeEveryAction(btn_7.text.toString()); }
        btn_8.setOnClickListener{ changeEveryAction(btn_8.text.toString()); }
        btn_9.setOnClickListener{ changeEveryAction(btn_9.text.toString()); }
        btn_dots.setOnClickListener{ changeEveryAction(btn_dots.text.toString()); }
        btn_C.setOnClickListener{ changeEveryAction(btn_C.text.toString()); }
        btn_CE.setOnClickListener{ changeEveryAction(btn_CE.text.toString()); }
        btn_BS.setOnClickListener{ changeEveryAction(btn_BS.text.toString()); }
        btn_equal.setOnClickListener{ changeEveryAction(btn_equal.text.toString()); }
        btn_dots.setOnClickListener{ changeEveryAction(btn_dots.text.toString()); }
        btn_plus.setOnClickListener{ changeEveryAction(btn_plus.text.toString()); }
        btn_divice.setOnClickListener{ changeEveryAction(btn_divice.text.toString()); }
        btn_multiply.setOnClickListener{ changeEveryAction(btn_multiply.text.toString()); }
        btn_subtract.setOnClickListener{ changeEveryAction(btn_subtract.text.toString()); }


    }

    private fun changeEveryAction(str: String){
        if (str == "="){
            try {
                val cleanedExpression = resultEditText.text.toString().replace("x", "*")
                val exp = ExpressionBuilder(cleanedExpression).build()
                resultEditText.setText("${exp.evaluate()}")
            } catch (e: Exception) {
                return
            }
        }
        else if (str == "C"){
            resultEditText.setText(resultEditText.text.toString().dropLast(1))
        }
        else if (str == "CE"){
            resultEditText.setText("")
        }
        else if (str == "BS"){
        }
        else if (str == "+/-"){
        }
        else {
            resultEditText.setText(resultEditText.text.toString()  + str)
        }
    }
}