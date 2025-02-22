package com.iwdael.permissionsdispatcher

import android.app.Application
import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri


/**
 * author : iwdael
 * e-mail : iwdael@outlook.com
 */
class PermissionContentProvider : ContentProvider() {
    override fun onCreate(): Boolean {
        (context?.applicationContext as Application?)?.registerActivityLifecycleCallbacks(
            permissionActivityLifecycle
        )
        return true
    }

    override fun query(
        uri: Uri,
        projection: Array<out String>?,
        selection: String?,
        selectionArgs: Array<out String>?,
        sortOrder: String?
    ): Cursor? {
        return null
    }

    override fun getType(uri: Uri): Nothing? = null
    override fun insert(uri: Uri, values: ContentValues?): Nothing? = null
    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<out String>?) = -1

    override fun update(
        uri: Uri,
        values: ContentValues?,
        selection: String?,
        selectionArgs: Array<out String>?
    ) = -1
}