package com.allaykhalil.contactsdirectory.data.remote

import com.allaykhalil.contactsdirectory.models.ContactsModel
import com.allaykhalil.contactsdirectory.models.base.ResponsePacket
import retrofit2.Response
import retrofit2.http.GET

interface ContactsService {
    @GET("d9e8292c-6584-44ee-a4a8-458b10c1df1a/")
    suspend fun fetchContacts(): Response<ResponsePacket<List<ContactsModel>>>
}