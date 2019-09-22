package mx.edu.ittepic.tpdm_unidad1_ejercicio9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var num1 : EditText ?= null
    var num2 : EditText ?= null
    var calcular : Button ?= null
    var resmul : TextView ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        num1=findViewById(R.id.nummul)
        num2=findViewById(R.id.numcal)
        calcular=findViewById(R.id.calcular)
        resmul=findViewById(R.id.resmul)

        calcular?.setOnClickListener {
            var n1 = num1?.text.toString().toInt()
            var n2 = num2?.text.toString().toInt()
            var res=""
            (1..n2).forEach{
                var r = n1*it
                res = res +n1+"x"+it+"="+r+"\n"
            }
            resmul?.setText(res)
        }
    }
}
