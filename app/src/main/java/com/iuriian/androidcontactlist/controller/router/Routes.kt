package com.iuriian.androidcontactlist.controller.router

import kotlinx.serialization.Serializable

internal interface Routes {
    @Serializable
    data object ListContact : Routes

    @Serializable
    data object CreateContact : Routes
}
