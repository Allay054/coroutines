package com.allaykhalil.contactsdirectory.ui.contacts

import androidx.activity.viewModels
import com.allaykhalil.contactsdirectory.BR
import com.allaykhalil.contactsdirectory.R
import com.allaykhalil.contactsdirectory.databinding.ActivityContactsBinding
import com.allaykhalil.contactsdirectory.ui.base.BaseActivity
import com.allaykhalil.contactsdirectory.ui.contacts.adapter.ContactsAdapter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ContactsActivity :
    BaseActivity<ContactsViewModel, ActivityContactsBinding>(R.layout.activity_contacts),
    ContactsNavigator {
    @Inject
    lateinit var adapter: ContactsAdapter

    override val viewModel: ContactsViewModel by viewModels()

    override fun getBindingVariable() = BR.viewModel

    override fun initUi() {
        viewModel.setNavigator(this)
        bindings.rvContacts.adapter = adapter

        viewModel.contactList.observe(this,
            {
                viewModel.observableArrayList.addAll(it)
            })
    }
}