package com.one2ten.one2tenuilibrary.ui

import android.content.Context
import android.widget.Toast

class ToasterMessage{

    fun showToast(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }

}