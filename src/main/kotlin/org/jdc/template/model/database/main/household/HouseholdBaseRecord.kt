/*
 * HouseholdBaseRecord.kt
 *
 * GENERATED FILE - DO NOT EDIT
 * CHECKSTYLE:OFF
 * 
 */



package org.jdc.template.model.database.main.household

import org.dbtools.android.domain.AndroidBaseRecord
import org.dbtools.android.domain.database.statement.StatementWrapper
import org.dbtools.android.domain.database.contentvalues.DBToolsContentValues
import android.database.Cursor


@SuppressWarnings("all")
abstract class HouseholdBaseRecord : AndroidBaseRecord() {

     var id: Long = 0
     var name: String = ""

    override fun getIdColumnName(): String {
        return HouseholdConst.C_ID
    }

    override fun getPrimaryKeyId(): Long {
        return id
    }

    override fun setPrimaryKeyId(id: Long) {
        this.id = id
    }

    override fun getAllColumns(): Array<String> {
        return HouseholdConst.ALL_COLUMNS.clone()
    }

    fun getAllColumnsFull(): Array<String> {
        return HouseholdConst.ALL_COLUMNS_FULL.clone()
    }

    override fun getContentValues(values: DBToolsContentValues<*>) {
        values.put(HouseholdConst.C_NAME, name)
    }

    override fun getValues(): Array<Any?> {
        return arrayOf(
            id,
            name)
    }

    fun copy(): Household {
        var copy = Household()
        copy.id = id
        copy.name = name
        return copy
    }

    override fun bindInsertStatement(statement: StatementWrapper) {
        statement.bindString(1, name)
    }

    override fun bindUpdateStatement(statement: StatementWrapper) {
        statement.bindString(1, name)
        statement.bindLong(2, id)
    }

    override fun setContent(values: DBToolsContentValues<*>) {
        name = values.getAsString(HouseholdConst.C_NAME)
    }

    override fun setContent(cursor: Cursor) {
        id = cursor.getLong(cursor.getColumnIndexOrThrow(HouseholdConst.C_ID))
        name = cursor.getString(cursor.getColumnIndexOrThrow(HouseholdConst.C_NAME))
    }

    override fun isNewRecord(): Boolean {
        return primaryKeyId <= 0
    }


}