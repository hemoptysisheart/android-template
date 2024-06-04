package com.github.hemoptysisheart.android.ui

import androidx.compose.runtime.Composable
import com.github.hemoptysisheart.android.ui.atom.AndroidTemplateTheme
import com.github.hemoptysisheart.android.ui.page.MainPage

@Composable
fun RootUI() {
    AndroidTemplateTheme {
        MainPage()
    }
}
