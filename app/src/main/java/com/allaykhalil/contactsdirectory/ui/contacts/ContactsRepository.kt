package com.allaykhalil.contactsdirectory.ui.contacts

import com.allaykhalil.contactsdirectory.managers.DataManager
import com.allaykhalil.contactsdirectory.models.ContactsModel
import com.allaykhalil.contactsdirectory.models.base.ResponsePacket
import com.allaykhalil.contactsdirectory.models.base.State
import com.allaykhalil.contactsdirectory.ui.base.BaseRepository
import javax.inject.Inject

class ContactsRepository @Inject constructor(dataManager: DataManager) :
    BaseRepository(dataManager) {

    suspend fun fetchContacts(): State<ResponsePacket<List<ContactsModel>>> {
        return makeApiCall { dataManager.getApiHelper().fetchContacts() }
    }

    suspend fun fetchContactsFromDb(): List<ContactsModel>? {
        return dataManager.getDbHelper().getAllContacts()
    }
}