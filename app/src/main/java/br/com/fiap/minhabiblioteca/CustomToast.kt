package br.com.fiap.minhabiblioteca

import android.app.Activity
import android.content.Context
import android.widget.Toast
import android.view.Gravity
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.custom_toast.view.*


class CustomToast {

    companion object {

        fun showToast(activity: Activity, mensagem: String) {
            val inflater = activity.layoutInflater

            val customToastroot = inflater.inflate(R.layout.custom_toast, null)

            val customtoast = Toast(activity)

            customToastroot.tvMensagem.text = mensagem

            customtoast.view = customToastroot
            customtoast.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.CENTER_VERTICAL, 0, 0)
            customtoast.duration = Toast.LENGTH_LONG
            customtoast.show()
        }

    }
}