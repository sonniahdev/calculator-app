package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var displayresult:TextView
    lateinit var edit1:EditText
    lateinit var edit2:EditText
    lateinit var button1:Button
    lateinit var button2:Button
    lateinit var button3:Button
    lateinit var button4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //join the two
        displayresult =findViewById(R.id.displayresult)
        edit1=findViewById(R.id.edit1)
        edit2=findViewById(R.id.edit2)

        button1=findViewById(R.id.button1)
        button2=findViewById(R.id.button2)
        button3=findViewById(R.id.button3)
        button4=findViewById(R.id.button4)

        //click listener
        button1.setOnClickListener{
            var num1=edit1.text.toString().trim()
            var num2=edit2.text.toString().trim()



            var number1= num1.toDouble()
            var number2= num2.toDouble()
            val total = number1 +number2

           //convert back to string
            var string_total=total.toString()
            Toast.makeText(this, "Result is$string_total", Toast.LENGTH_SHORT).show()


        }
        button2.setOnClickListener(){

            var num1=edit1.text.toString().trim()
            var num2=edit2.text.toString().trim()



            var number1= num1.toDouble()
            var number2= num2.toDouble()
            val total = number1 *number2

            //convert back to string
            var string_total=total.toString()
            Toast.makeText(this, "Result is$string_total", Toast.LENGTH_SHORT).show()

        }

        button3.setOnClickListener(){

            var num1=edit1.text.toString().trim()
            var num2=edit2.text.toString().trim()



            var number1= num1.toDouble()
            var number2= num2.toDouble()
            val total = number1 - number2

            //convert back to string
            var string_total=total.toString()
            Toast.makeText(this, "Result is$string_total", Toast.LENGTH_SHORT).show()
        }
        button4.setOnClickListener(){

            var num1=edit1.text.toString().trim()
            var num2=edit2.text.toString().trim()



            var number1= num1.toDouble()
            var number2= num2.toDouble()
            val total = number1 /number2

            //convert back to string
            var string_total=total.toString()
            Toast.makeText(this, "Result is$string_total", Toast.LENGTH_SHORT).show()
        }


        }
}