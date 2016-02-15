/*
 * IndividualListBaseRecord.kt
 *
 * GENERATED FILE - DO NOT EDIT
 * CHECKSTYLE:OFF
 * 
 */



package org.jdc.template.domain.other.individuallist

import org.dbtools.android.domain.DBToolsDateFormatter
import android.database.Cursor


@SuppressWarnings("all")
object IndividualListConst {

    const val DATABASE = "other"
    const val TABLE = "INDIVIDUAL_LIST"
    const val FULL_TABLE = "other.INDIVIDUAL_LIST"
    const val PRIMARY_KEY_COLUMN = "_id"
    const val C_ID = "_id"
    const val FULL_C_ID = "INDIVIDUAL_LIST._id"
    const val C_NAME = "NAME"
    const val FULL_C_NAME = "INDIVIDUAL_LIST.NAME"
    const val CREATE_TABLE = "CREATE TABLE IF NOT EXISTS INDIVIDUAL_LIST (" + 
        "_id INTEGER PRIMARY KEY  AUTOINCREMENT," + 
        "NAME TEXT NOT NULL" + 
        ");" + 
        "" + 
        ""
    const val DROP_TABLE = "DROP TABLE IF EXISTS INDIVIDUAL_LIST;"
    val ALL_COLUMNS = arrayOf(
        C_ID,
        C_NAME)
    val ALL_COLUMNS_FULL = arrayOf(
        FULL_C_ID,
        FULL_C_NAME)

    fun getId(cursor: Cursor): Long {
        return cursor.getLong(cursor.getColumnIndexOrThrow(C_ID))
    }

    fun getName(cursor: Cursor): String {
        return cursor.getString(cursor.getColumnIndexOrThrow(C_NAME))
    }


}