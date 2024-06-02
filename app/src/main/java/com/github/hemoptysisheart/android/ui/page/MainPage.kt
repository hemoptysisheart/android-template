package com.github.hemoptysisheart.android.ui.page

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewDynamicColors
import androidx.compose.ui.tooling.preview.PreviewFontScale
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import com.github.hemoptysisheart.android.ui.atom.AndroidTemplateTheme

@Composable
fun MainPage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hello, Android!", color = MaterialTheme.colorScheme.onBackground)
    }
}

@Composable
@PreviewScreenSizes
@PreviewFontScale
@PreviewLightDark
@PreviewDynamicColors
fun MainPagePreview() {
    AndroidTemplateTheme {
        MainPage()
    }
}
