package com.example.srikant.apishitting.user.java_model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "HOUSE".
*/
public class HouseDao extends AbstractDao<House, Void> {

    public static final String TABLENAME = "HOUSE";

    /**
     * Properties of entity House.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Deleted = new Property(0, Boolean.class, "deleted", false, "DELETED");
        public final static Property ClientGeneratedId = new Property(1, String.class, "clientGeneratedId", false, "CLIENT_GENERATED_ID");
        public final static Property Status = new Property(2, Boolean.class, "status", false, "STATUS");
        public final static Property Timestamp = new Property(3, Long.class, "timestamp", false, "TIMESTAMP");
        public final static Property Number = new Property(4, String.class, "number", false, "NUMBER");
        public final static Property Address = new Property(5, String.class, "address", false, "ADDRESS");
        public final static Property AnganwadiCentreId = new Property(6, Long.class, "anganwadiCentreId", false, "ANGANWADI_CENTRE_ID");
        public final static Property Version = new Property(7, Integer.class, "version", false, "VERSION");
        public final static Property ServerGeneratedId = new Property(8, Integer.class, "serverGeneratedId", false, "SERVER_GENERATED_ID");
    }


    public HouseDao(DaoConfig config) {
        super(config);
    }
    
    public HouseDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"HOUSE\" (" + //
                "\"DELETED\" INTEGER," + // 0: deleted
                "\"CLIENT_GENERATED_ID\" TEXT," + // 1: clientGeneratedId
                "\"STATUS\" INTEGER," + // 2: status
                "\"TIMESTAMP\" INTEGER," + // 3: timestamp
                "\"NUMBER\" TEXT," + // 4: number
                "\"ADDRESS\" TEXT," + // 5: address
                "\"ANGANWADI_CENTRE_ID\" INTEGER," + // 6: anganwadiCentreId
                "\"VERSION\" INTEGER," + // 7: version
                "\"SERVER_GENERATED_ID\" INTEGER);"); // 8: serverGeneratedId
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"HOUSE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, House entity) {
        stmt.clearBindings();
 
        Boolean deleted = entity.getDeleted();
        if (deleted != null) {
            stmt.bindLong(1, deleted ? 1L: 0L);
        }
 
        String clientGeneratedId = entity.getClientGeneratedId();
        if (clientGeneratedId != null) {
            stmt.bindString(2, clientGeneratedId);
        }
 
        Boolean status = entity.getStatus();
        if (status != null) {
            stmt.bindLong(3, status ? 1L: 0L);
        }
 
        Long timestamp = entity.getTimestamp();
        if (timestamp != null) {
            stmt.bindLong(4, timestamp);
        }
 
        String number = entity.getNumber();
        if (number != null) {
            stmt.bindString(5, number);
        }
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(6, address);
        }
 
        Long anganwadiCentreId = entity.getAnganwadiCentreId();
        if (anganwadiCentreId != null) {
            stmt.bindLong(7, anganwadiCentreId);
        }
 
        Integer version = entity.getVersion();
        if (version != null) {
            stmt.bindLong(8, version);
        }
 
        Integer serverGeneratedId = entity.getServerGeneratedId();
        if (serverGeneratedId != null) {
            stmt.bindLong(9, serverGeneratedId);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, House entity) {
        stmt.clearBindings();
 
        Boolean deleted = entity.getDeleted();
        if (deleted != null) {
            stmt.bindLong(1, deleted ? 1L: 0L);
        }
 
        String clientGeneratedId = entity.getClientGeneratedId();
        if (clientGeneratedId != null) {
            stmt.bindString(2, clientGeneratedId);
        }
 
        Boolean status = entity.getStatus();
        if (status != null) {
            stmt.bindLong(3, status ? 1L: 0L);
        }
 
        Long timestamp = entity.getTimestamp();
        if (timestamp != null) {
            stmt.bindLong(4, timestamp);
        }
 
        String number = entity.getNumber();
        if (number != null) {
            stmt.bindString(5, number);
        }
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(6, address);
        }
 
        Long anganwadiCentreId = entity.getAnganwadiCentreId();
        if (anganwadiCentreId != null) {
            stmt.bindLong(7, anganwadiCentreId);
        }
 
        Integer version = entity.getVersion();
        if (version != null) {
            stmt.bindLong(8, version);
        }
 
        Integer serverGeneratedId = entity.getServerGeneratedId();
        if (serverGeneratedId != null) {
            stmt.bindLong(9, serverGeneratedId);
        }
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public House readEntity(Cursor cursor, int offset) {
        House entity = new House( //
            cursor.isNull(offset + 0) ? null : cursor.getShort(offset + 0) != 0, // deleted
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // clientGeneratedId
            cursor.isNull(offset + 2) ? null : cursor.getShort(offset + 2) != 0, // status
            cursor.isNull(offset + 3) ? null : cursor.getLong(offset + 3), // timestamp
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // number
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // address
            cursor.isNull(offset + 6) ? null : cursor.getLong(offset + 6), // anganwadiCentreId
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // version
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8) // serverGeneratedId
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, House entity, int offset) {
        entity.setDeleted(cursor.isNull(offset + 0) ? null : cursor.getShort(offset + 0) != 0);
        entity.setClientGeneratedId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setStatus(cursor.isNull(offset + 2) ? null : cursor.getShort(offset + 2) != 0);
        entity.setTimestamp(cursor.isNull(offset + 3) ? null : cursor.getLong(offset + 3));
        entity.setNumber(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setAddress(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setAnganwadiCentreId(cursor.isNull(offset + 6) ? null : cursor.getLong(offset + 6));
        entity.setVersion(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setServerGeneratedId(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(House entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(House entity) {
        return null;
    }

    @Override
    public boolean hasKey(House entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
