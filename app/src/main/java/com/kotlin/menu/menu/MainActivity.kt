package com.kotlin.menu.menu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ordenar(view : View){
        var primero = chkEntrada.isChecked
        var fondo = chkFondo.isChecked
        var txtOrdered = getString(R.string.txtOrdered)

        if (primero || fondo ) {
            if (primero) {
                txtOrdered = txtOrdered + "\n${chkEntrada.text.toString()} "
            }
            if (fondo) {
                txtOrdered = txtOrdered + "\n${chkFondo.text.toString()} "
            }

            txtOrden.setText(txtOrdered)

        }else {
                txtOrden.setText(R.string.txtNoSelect)
        }



    }
}
