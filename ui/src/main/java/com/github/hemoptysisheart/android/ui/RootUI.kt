package com.github.hemoptysisheart.android.ui

import androidx.compose.runtime.Composable
import com.github.hemoptysisheart.android.ui.atom.AndroidTemplateTheme
import com.github.hemoptysisheart.android.ui.navigator.MainNavigator
import com.github.hemoptysisheart.android.ui.navigator.SplashNavigator
import com.github.hemoptysisheart.android.ui.page.MainPage
import com.github.hemoptysisheart.android.ui.page.SplashPage
import com.github.hemoptysisheart.ui.navigation.compose.NavigationGraph
import com.github.hemoptysisheart.ui.navigation.compose.baseNavigator
import com.github.hemoptysisheart.ui.navigation.compose.page
import com.github.hemoptysisheart.ui.navigation.destination.BaseNavigator

@Composable
fun RootUI(baseNavigator: BaseNavigator = baseNavigator()) {
    AndroidTemplateTheme {
        NavigationGraph(
            navHostController = baseNavigator.navHostController,
            startDestinationId = baseNavigator.startDestination.id
        ) {
            page(SplashNavigator(baseNavigator)) { navigator ->
                SplashPage(navigator)
            }

            page(MainNavigator(baseNavigator)) { navigator ->
                MainPage(navigator)
            }
        }
    }
}
