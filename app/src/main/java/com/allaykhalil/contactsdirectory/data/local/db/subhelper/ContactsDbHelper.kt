package com.allaykhalil.contactsdirectory.data.local.db.subhelper

import com.allaykhalil.contactsdirectory.models.ContactsModel

interface ContactsDbHelper {
    fun insertContacts(contacts: List<ContactsModel>)
    fun deleteAllContacts()
    fun getAllContacts(): List<ContactsModel>?
}