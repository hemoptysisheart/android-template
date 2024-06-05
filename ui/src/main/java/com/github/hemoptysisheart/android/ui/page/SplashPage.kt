package com.github.hemoptysisheart.android.ui.page

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewFontScale
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.github.hemoptysisheart.android.ui.atom.AndroidTemplateTheme
import com.github.hemoptysisheart.android.ui.navigator.SplashNavigator
import com.github.hemoptysisheart.android.viewmodel.SplashViewModel

@Composable
fun SplashPage(
    navigator: SplashNavigator,
    viewModel: SplashViewModel = hiltViewModel()
) {
    Log.v(TAG, "#SplashPage args : navigator=$navigator, viewModel=$viewModel")

    val timeout by viewModel.timeout.collectAsStateWithLifecycle()

    var timeoutHandled by remember { mutableStateOf(false) }

    if (timeout && !timeoutHandled) {
        timeoutHandled = true
        navigator.main()
    } else {
        SplashPageContent(timeout = timeout)
    }
}

@Composable
private fun SplashPageContent(
    timeout: Boolean
) {
    Log.v(TAG, "#SplashPageContent args : timeout=$timeout")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "SPLASH",
            color = MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.titleLarge
        )
        if (timeout) {
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Timeout!",
                color = MaterialTheme.colorScheme.onBackground,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}

@Composable
@PreviewFontScale
@PreviewLightDark
@PreviewScreenSizes
private fun SplashPageContentPreview() {
    AndroidTemplateTheme {
        SplashPageContent(timeout = false)
    }
}
