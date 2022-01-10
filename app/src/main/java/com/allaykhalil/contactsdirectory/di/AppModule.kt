package com.allaykhalil.contactsdirectory.di

import android.app.Application
import android.content.Context
import com.allaykhalil.contactsdirectory.data.local.db.DbHelper
import com.allaykhalil.contactsdirectory.data.local.db.DbHelperImpl
import com.allaykhalil.contactsdirectory.data.local.prefs.PreferencesHelper
import com.allaykhalil.contactsdirectory.data.local.prefs.PreferencesHelperImpl
import com.allaykhalil.contactsdirectory.managers.DataManager
import com.allaykhalil.contactsdirectory.managers.DataManagerImpl
import com.allaykhalil.contactsdirectory.utils.CommonConstants
import com.allaykhalil.contactsdirectory.utils.ResourceProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class AppModule {

    @Provides
    @Singleton
    fun provideContext(application: Application): Context {
        return application
    }


    @Provides
    fun providePreferenceName(): String {
        return CommonConstants.PREF_NAME
    }

    @Singleton
    @Provides
    fun providePreferenceHelper(preferencesHelperImpl: PreferencesHelperImpl): PreferencesHelper {
        return preferencesHelperImpl
    }

    @Provides
    fun provideResourceProvider(context: Context): ResourceProvider {
        return ResourceProvider(context.applicationContext)
    }

    @Singleton
    @Provides
    fun provideDataManager(dataManagerImpl: DataManagerImpl): DataManager {
        return dataManagerImpl
    }

    @Singleton
    @Provides
    fun provideDbHelper(dbHelperImpl: DbHelperImpl): DbHelper {
        return dbHelperImpl
    }
}