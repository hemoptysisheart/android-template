package com.github.hemoptysisheart.android.ui.navigator

import android.util.Log
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavDeepLink
import com.github.hemoptysisheart.ui.navigation.destination.BaseNavigator
import com.github.hemoptysisheart.ui.navigation.destination.Destination
import com.github.hemoptysisheart.ui.navigation.destination.Navigator

class SplashNavigator(
    private val base: BaseNavigator
) : Navigator by base {
    companion object : Destination {
        private const val TAG = "SplashNavigator"

        override val arguments: List<NamedNavArgument> = emptyList()

        override val deepLinks: List<NavDeepLink> = emptyList()

        override val id = "splash"

        override fun route(vararg arguments: Any) = if (arguments.isEmpty()) {
            id
        } else {
            throw IllegalArgumentException("SplashNavigator does not have arguments")
        }
    }

    override val destination: Destination = SplashNavigator

    fun main() {
        Log.d(TAG, "#main called.")

        base.navHostController.run {
            popBackStack()
            navigate(MainNavigator.route())
        }
    }
}
