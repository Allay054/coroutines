package com.allaykhalil.contactsdirectory

import android.app.Application
import com.allaykhalil.contactsdirectory.managers.DataManager
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class AppClass : Application() {
    @Inject
    lateinit var dataManager: DataManager
}