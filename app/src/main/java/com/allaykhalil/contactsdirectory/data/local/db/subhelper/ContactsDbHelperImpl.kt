package com.allaykhalil.contactsdirectory.data.local.db.subhelper

import com.allaykhalil.contactsdirectory.models.ContactsModel

abstract class ContactsDbHelperImpl : BaseDbHelper(), ContactsDbHelper {
    override fun deleteAllContacts() {
        mAppDatabase?.contactsDao()?.deleteAllContacts()
    }

    override fun insertContacts(contacts: List<ContactsModel>) {
        mAppDatabase?.contactsDao()?.insertContacts(contacts)
    }

    override fun getAllContacts(): List<ContactsModel>? {
        return mAppDatabase?.contactsDao()?.getAllContacts()
    }
}