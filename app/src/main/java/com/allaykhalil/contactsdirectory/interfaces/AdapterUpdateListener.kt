package com.allaykhalil.contactsdirectory.interfaces

interface AdapterUpdateListener<T> {
    fun clearItems()
    fun addItems(items: List<T>, isLoadMore: Boolean = false)
    fun addItem(item: T) {}
    fun removeItem(position: Int) {}
}