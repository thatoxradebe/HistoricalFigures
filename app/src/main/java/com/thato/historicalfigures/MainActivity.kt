package com.thato.historicalfigures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    //Declare variables
    private lateinit var etEditText: EditText
    private lateinit var etTextView: TextView
    private lateinit var etGenerateButton: Button
    private lateinit var etClearButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialize the variables declared above
        etEditText = findViewById(R.id.editText)
        etTextView = findViewById(R.id.textView)
        etGenerateButton = findViewById(R.id.generateButton)
        etClearButton = findViewById(R.id.clearButton)

        etGenerateButton.setOnClickListener {
            val age = etEditText.text.toString().toIntOrNull()
            if (age != null && age in 20..100) {

                val famous = when (age) {
                    27 -> "Amy Winehouse, an English singer and songwriter"
                    25 -> "Angus Cloud, an American actor who is best known for his role in Euphoria"
                    35 -> "Patrice Lumumba, former Prime Minister of the Democratic Republic of the Congo"
                    39 -> "Anna Nicole Smith, an American model, actress and television personality"
                    44 -> "Marvin Gaye, an Americna singer, songwriter and musician"
                    46 -> "Phillip Saymour Hoffman, an American actor"
                    58 -> "Fela Kuti, a Nigerian musician, bandleader and political activist"
                    53 -> "Robert Sobukwe, a South African politician and freedom fighter"
                    67 -> "Joe Fraizer, an American boxer who competed from 1965 to 1981"
                    61 -> "Roddy Piper, a Canadian wrestler and actor"
                    72 -> "Goodwill Zwelithini, The King of the Zulu Nation from 1968 to 2021"
                    77 -> "Julius Nyerere, a Tanzanian anti-colonial activist and politician"
                    82 -> "Pele, a Brazilian former footballer, considered the greatest footballer ever"
                    89 -> "Barry Goldwater, former American politician and major general in the Air Force"
                    90 -> "Fidel Castro, former Cuban revolutionary and politician"
                    97 -> "John Rockefeller, former American business magnate"
                    else -> null
                }
                val message = if (famous != null) "The historical figure who passed away is $famous"
                else "There is no famous figure who passed away at that age, try again"
                etTextView.text = message

            } else {
                etTextView.text = "Invalid input, please enter a valid age between 20-100"
            }
        }
        etClearButton.setOnClickListener {
            etEditText.text.clear()
            etTextView.text = ""}

    }


}

