package com.github.hemoptysisheart.android.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.github.hemoptysisheart.android.ui.atom.AndroidTemplateTheme
import com.github.hemoptysisheart.android.ui.page.MainPage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidTemplateTheme {
                MainPage()
            }
        }
    }
}
