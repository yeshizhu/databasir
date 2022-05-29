/*
 * This file is generated by jOOQ.
 */
package com.databasir.dao.tables;


import com.databasir.dao.Databasir;
import com.databasir.dao.Indexes;
import com.databasir.dao.Keys;
import com.databasir.dao.tables.records.DocumentFullTextRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DocumentFullText extends TableImpl<DocumentFullTextRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>databasir.document_full_text</code>
     */
    public static final DocumentFullText DOCUMENT_FULL_TEXT = new DocumentFullText();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DocumentFullTextRecord> getRecordType() {
        return DocumentFullTextRecord.class;
    }

    /**
     * The column <code>databasir.document_full_text.id</code>.
     */
    public final TableField<DocumentFullTextRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>databasir.document_full_text.group_id</code>. ref to
     * group.id
     */
    public final TableField<DocumentFullTextRecord, Integer> GROUP_ID = createField(DSL.name("group_id"), SQLDataType.INTEGER.nullable(false), this, "ref to group.id");

    /**
     * The column <code>databasir.document_full_text.project_id</code>. ref to
     * project.id, may null
     */
    public final TableField<DocumentFullTextRecord, Integer> PROJECT_ID = createField(DSL.name("project_id"), SQLDataType.INTEGER, this, "ref to project.id, may null");

    /**
     * The column
     * <code>databasir.document_full_text.database_document_id</code>. ref to
     * database_document.id, may null
     */
    public final TableField<DocumentFullTextRecord, Integer> DATABASE_DOCUMENT_ID = createField(DSL.name("database_document_id"), SQLDataType.INTEGER, this, "ref to database_document.id, may null");

    /**
     * The column
     * <code>databasir.document_full_text.database_document_version</code>. rf
     * to database_document.version, may null
     */
    public final TableField<DocumentFullTextRecord, Integer> DATABASE_DOCUMENT_VERSION = createField(DSL.name("database_document_version"), SQLDataType.INTEGER, this, "rf to database_document.version, may null");

    /**
     * The column <code>databasir.document_full_text.table_document_id</code>.
     * ref to table_document.id, may null
     */
    public final TableField<DocumentFullTextRecord, Integer> TABLE_DOCUMENT_ID = createField(DSL.name("table_document_id"), SQLDataType.INTEGER, this, "ref to table_document.id, may null");

    /**
     * The column
     * <code>databasir.document_full_text.table_column_document_id</code>. ref
     * to table_column_document.id, may null
     */
    public final TableField<DocumentFullTextRecord, Integer> TABLE_COLUMN_DOCUMENT_ID = createField(DSL.name("table_column_document_id"), SQLDataType.INTEGER, this, "ref to table_column_document.id, may null");

    /**
     * The column <code>databasir.document_full_text.group_name</code>.
     */
    public final TableField<DocumentFullTextRecord, String> GROUP_NAME = createField(DSL.name("group_name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>databasir.document_full_text.group_description</code>.
     */
    public final TableField<DocumentFullTextRecord, String> GROUP_DESCRIPTION = createField(DSL.name("group_description"), SQLDataType.VARCHAR(512), this, "");

    /**
     * The column <code>databasir.document_full_text.project_name</code>.
     */
    public final TableField<DocumentFullTextRecord, String> PROJECT_NAME = createField(DSL.name("project_name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>databasir.document_full_text.project_description</code>.
     */
    public final TableField<DocumentFullTextRecord, String> PROJECT_DESCRIPTION = createField(DSL.name("project_description"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>databasir.document_full_text.database_name</code>.
     */
    public final TableField<DocumentFullTextRecord, String> DATABASE_NAME = createField(DSL.name("database_name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>databasir.document_full_text.schema_name</code>.
     */
    public final TableField<DocumentFullTextRecord, String> SCHEMA_NAME = createField(DSL.name("schema_name"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>databasir.document_full_text.database_product_name</code>.
     */
    public final TableField<DocumentFullTextRecord, String> DATABASE_PRODUCT_NAME = createField(DSL.name("database_product_name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>databasir.document_full_text.database_type</code>.
     */
    public final TableField<DocumentFullTextRecord, String> DATABASE_TYPE = createField(DSL.name("database_type"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>databasir.document_full_text.table_name</code>.
     */
    public final TableField<DocumentFullTextRecord, String> TABLE_NAME = createField(DSL.name("table_name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>databasir.document_full_text.table_comment</code>.
     */
    public final TableField<DocumentFullTextRecord, String> TABLE_COMMENT = createField(DSL.name("table_comment"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>databasir.document_full_text.table_description</code>.
     */
    public final TableField<DocumentFullTextRecord, String> TABLE_DESCRIPTION = createField(DSL.name("table_description"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>databasir.document_full_text.col_name</code>.
     */
    public final TableField<DocumentFullTextRecord, String> COL_NAME = createField(DSL.name("col_name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>databasir.document_full_text.col_comment</code>.
     */
    public final TableField<DocumentFullTextRecord, String> COL_COMMENT = createField(DSL.name("col_comment"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>databasir.document_full_text.col_description</code>.
     */
    public final TableField<DocumentFullTextRecord, String> COL_DESCRIPTION = createField(DSL.name("col_description"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>databasir.document_full_text.update_at</code>.
     */
    public final TableField<DocumentFullTextRecord, LocalDateTime> UPDATE_AT = createField(DSL.name("update_at"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>databasir.document_full_text.create_at</code>.
     */
    public final TableField<DocumentFullTextRecord, LocalDateTime> CREATE_AT = createField(DSL.name("create_at"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private DocumentFullText(Name alias, Table<DocumentFullTextRecord> aliased) {
        this(alias, aliased, null);
    }

    private DocumentFullText(Name alias, Table<DocumentFullTextRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>databasir.document_full_text</code> table
     * reference
     */
    public DocumentFullText(String alias) {
        this(DSL.name(alias), DOCUMENT_FULL_TEXT);
    }

    /**
     * Create an aliased <code>databasir.document_full_text</code> table
     * reference
     */
    public DocumentFullText(Name alias) {
        this(alias, DOCUMENT_FULL_TEXT);
    }

    /**
     * Create a <code>databasir.document_full_text</code> table reference
     */
    public DocumentFullText() {
        this(DSL.name("document_full_text"), null);
    }

    public <O extends Record> DocumentFullText(Table<O> child, ForeignKey<O, DocumentFullTextRecord> key) {
        super(child, key, DOCUMENT_FULL_TEXT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Databasir.DATABASIR;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.DOCUMENT_FULL_TEXT_FIDX_COLUMN, Indexes.DOCUMENT_FULL_TEXT_FIDX_GROUP, Indexes.DOCUMENT_FULL_TEXT_FIDX_PROJECT, Indexes.DOCUMENT_FULL_TEXT_FIDX_TABLE, Indexes.DOCUMENT_FULL_TEXT_IDX_GROUP_ID, Indexes.DOCUMENT_FULL_TEXT_IDX_PROJECT_ID, Indexes.DOCUMENT_FULL_TEXT_IDX_TABLE_DOCUMENT_ID);
    }

    @Override
    public Identity<DocumentFullTextRecord, Integer> getIdentity() {
        return (Identity<DocumentFullTextRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<DocumentFullTextRecord> getPrimaryKey() {
        return Keys.KEY_DOCUMENT_FULL_TEXT_PRIMARY;
    }

    @Override
    public DocumentFullText as(String alias) {
        return new DocumentFullText(DSL.name(alias), this);
    }

    @Override
    public DocumentFullText as(Name alias) {
        return new DocumentFullText(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DocumentFullText rename(String name) {
        return new DocumentFullText(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DocumentFullText rename(Name name) {
        return new DocumentFullText(name, null);
    }
}