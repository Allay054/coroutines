package com.allaykhalil.contactsdirectory.managers

import com.allaykhalil.contactsdirectory.data.local.db.DbHelper
import com.allaykhalil.contactsdirectory.data.local.prefs.PreferencesHelper
import com.allaykhalil.contactsdirectory.data.remote.AppService
import com.allaykhalil.contactsdirectory.utils.ResourceProvider

interface DataManager {
    fun getApiHelper(): AppService
    fun getResourceManager(): ResourceProvider
    fun getPreferencesHelper(): PreferencesHelper
    fun getDbHelper(): DbHelper
}