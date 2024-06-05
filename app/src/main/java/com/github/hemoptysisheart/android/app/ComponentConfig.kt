package com.github.hemoptysisheart.android.app

import android.util.Log
import com.github.hemoptysisheart.android.model.SampleModel
import com.github.hemoptysisheart.statepump.ScaffoldPump
import com.github.hemoptysisheart.statepump.ScaffoldPumpImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ComponentConfig {
    companion object {
        private const val TAG = "ComponentConfig"
    }

    @Provides
    @Singleton
    fun provideSampleModel(): SampleModel {
        val model = SampleModel()
        Log.d(TAG, "#provideSampleModel return : model=$model")
        return model
    }

    @Deprecated("See https://github.com/hemoptysisheart/android-library/issues/25")
    @Provides
    @Singleton
    @Suppress("DeprecatedCallableAddReplaceWith")
    fun provideScaffoldPump(): ScaffoldPump = ScaffoldPumpImpl()
}
