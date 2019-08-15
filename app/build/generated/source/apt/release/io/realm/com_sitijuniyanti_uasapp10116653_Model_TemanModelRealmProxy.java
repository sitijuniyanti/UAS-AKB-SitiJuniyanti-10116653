package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxy extends com.sitijuniyanti.uasapp10116653.Model.TemanModel
    implements RealmObjectProxy, com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface {

    static final class TemanModelColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long idIndex;
        long nimIndex;
        long namaIndex;
        long kelasIndex;
        long tlpIndex;
        long emailIndex;
        long sosmedIndex;

        TemanModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("TemanModel");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.nimIndex = addColumnDetails("nim", "nim", objectSchemaInfo);
            this.namaIndex = addColumnDetails("nama", "nama", objectSchemaInfo);
            this.kelasIndex = addColumnDetails("kelas", "kelas", objectSchemaInfo);
            this.tlpIndex = addColumnDetails("tlp", "tlp", objectSchemaInfo);
            this.emailIndex = addColumnDetails("email", "email", objectSchemaInfo);
            this.sosmedIndex = addColumnDetails("sosmed", "sosmed", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        TemanModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new TemanModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final TemanModelColumnInfo src = (TemanModelColumnInfo) rawSrc;
            final TemanModelColumnInfo dst = (TemanModelColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.nimIndex = src.nimIndex;
            dst.namaIndex = src.namaIndex;
            dst.kelasIndex = src.kelasIndex;
            dst.tlpIndex = src.tlpIndex;
            dst.emailIndex = src.emailIndex;
            dst.sosmedIndex = src.sosmedIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private TemanModelColumnInfo columnInfo;
    private ProxyState<com.sitijuniyanti.uasapp10116653.Model.TemanModel> proxyState;

    com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (TemanModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.sitijuniyanti.uasapp10116653.Model.TemanModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.idIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(Integer value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nim() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nimIndex);
    }

    @Override
    public void realmSet$nim(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nimIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nimIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nimIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nimIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nama() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.namaIndex);
    }

    @Override
    public void realmSet$nama(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.namaIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.namaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.namaIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.namaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$kelas() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kelasIndex);
    }

    @Override
    public void realmSet$kelas(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kelasIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.kelasIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kelasIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kelasIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tlp() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tlpIndex);
    }

    @Override
    public void realmSet$tlp(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tlpIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.tlpIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tlpIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tlpIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$email() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.emailIndex);
    }

    @Override
    public void realmSet$email(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.emailIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.emailIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.emailIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.emailIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$sosmed() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.sosmedIndex);
    }

    @Override
    public void realmSet$sosmed(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.sosmedIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.sosmedIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.sosmedIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.sosmedIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("TemanModel", 7, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("nim", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("nama", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kelas", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tlp", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("email", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("sosmed", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TemanModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new TemanModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "TemanModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "TemanModel";
    }

    @SuppressWarnings("cast")
    public static com.sitijuniyanti.uasapp10116653.Model.TemanModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.sitijuniyanti.uasapp10116653.Model.TemanModel obj = null;
        if (update) {
            Table table = realm.getTable(com.sitijuniyanti.uasapp10116653.Model.TemanModel.class);
            TemanModelColumnInfo columnInfo = (TemanModelColumnInfo) realm.getSchema().getColumnInfo(com.sitijuniyanti.uasapp10116653.Model.TemanModel.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("id")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.sitijuniyanti.uasapp10116653.Model.TemanModel.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxy) realm.createObjectInternal(com.sitijuniyanti.uasapp10116653.Model.TemanModel.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxy) realm.createObjectInternal(com.sitijuniyanti.uasapp10116653.Model.TemanModel.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface objProxy = (com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) obj;
        if (json.has("nim")) {
            if (json.isNull("nim")) {
                objProxy.realmSet$nim(null);
            } else {
                objProxy.realmSet$nim((String) json.getString("nim"));
            }
        }
        if (json.has("nama")) {
            if (json.isNull("nama")) {
                objProxy.realmSet$nama(null);
            } else {
                objProxy.realmSet$nama((String) json.getString("nama"));
            }
        }
        if (json.has("kelas")) {
            if (json.isNull("kelas")) {
                objProxy.realmSet$kelas(null);
            } else {
                objProxy.realmSet$kelas((String) json.getString("kelas"));
            }
        }
        if (json.has("tlp")) {
            if (json.isNull("tlp")) {
                objProxy.realmSet$tlp(null);
            } else {
                objProxy.realmSet$tlp((String) json.getString("tlp"));
            }
        }
        if (json.has("email")) {
            if (json.isNull("email")) {
                objProxy.realmSet$email(null);
            } else {
                objProxy.realmSet$email((String) json.getString("email"));
            }
        }
        if (json.has("sosmed")) {
            if (json.isNull("sosmed")) {
                objProxy.realmSet$sosmed(null);
            } else {
                objProxy.realmSet$sosmed((String) json.getString("sosmed"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.sitijuniyanti.uasapp10116653.Model.TemanModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.sitijuniyanti.uasapp10116653.Model.TemanModel obj = new com.sitijuniyanti.uasapp10116653.Model.TemanModel();
        final com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface objProxy = (com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("nim")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nim((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nim(null);
                }
            } else if (name.equals("nama")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nama((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nama(null);
                }
            } else if (name.equals("kelas")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kelas((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kelas(null);
                }
            } else if (name.equals("tlp")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tlp((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tlp(null);
                }
            } else if (name.equals("email")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$email((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$email(null);
                }
            } else if (name.equals("sosmed")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$sosmed((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$sosmed(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.sitijuniyanti.uasapp10116653.Model.TemanModel.class), false, Collections.<String>emptyList());
        io.realm.com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxy obj = new io.realm.com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.sitijuniyanti.uasapp10116653.Model.TemanModel copyOrUpdate(Realm realm, TemanModelColumnInfo columnInfo, com.sitijuniyanti.uasapp10116653.Model.TemanModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.sitijuniyanti.uasapp10116653.Model.TemanModel) cachedRealmObject;
        }

        com.sitijuniyanti.uasapp10116653.Model.TemanModel realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.sitijuniyanti.uasapp10116653.Model.TemanModel.class);
            long pkColumnIndex = columnInfo.idIndex;
            Number value = ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$id();
            long rowIndex = Table.NO_MATCH;
            if (value == null) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstLong(pkColumnIndex, value.longValue());
            }
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.sitijuniyanti.uasapp10116653.Model.TemanModel copy(Realm realm, TemanModelColumnInfo columnInfo, com.sitijuniyanti.uasapp10116653.Model.TemanModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.sitijuniyanti.uasapp10116653.Model.TemanModel) cachedRealmObject;
        }

        com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface realmObjectSource = (com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.sitijuniyanti.uasapp10116653.Model.TemanModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.nimIndex, realmObjectSource.realmGet$nim());
        builder.addString(columnInfo.namaIndex, realmObjectSource.realmGet$nama());
        builder.addString(columnInfo.kelasIndex, realmObjectSource.realmGet$kelas());
        builder.addString(columnInfo.tlpIndex, realmObjectSource.realmGet$tlp());
        builder.addString(columnInfo.emailIndex, realmObjectSource.realmGet$email());
        builder.addString(columnInfo.sosmedIndex, realmObjectSource.realmGet$sosmed());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.sitijuniyanti.uasapp10116653.Model.TemanModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.sitijuniyanti.uasapp10116653.Model.TemanModel.class);
        long tableNativePtr = table.getNativePtr();
        TemanModelColumnInfo columnInfo = (TemanModelColumnInfo) realm.getSchema().getColumnInfo(com.sitijuniyanti.uasapp10116653.Model.TemanModel.class);
        long pkColumnIndex = columnInfo.idIndex;
        Object primaryKeyValue = ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$id();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$nim = ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$nim();
        if (realmGet$nim != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nimIndex, rowIndex, realmGet$nim, false);
        }
        String realmGet$nama = ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$nama();
        if (realmGet$nama != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namaIndex, rowIndex, realmGet$nama, false);
        }
        String realmGet$kelas = ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$kelas();
        if (realmGet$kelas != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kelasIndex, rowIndex, realmGet$kelas, false);
        }
        String realmGet$tlp = ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$tlp();
        if (realmGet$tlp != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tlpIndex, rowIndex, realmGet$tlp, false);
        }
        String realmGet$email = ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
        }
        String realmGet$sosmed = ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$sosmed();
        if (realmGet$sosmed != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.sosmedIndex, rowIndex, realmGet$sosmed, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.sitijuniyanti.uasapp10116653.Model.TemanModel.class);
        long tableNativePtr = table.getNativePtr();
        TemanModelColumnInfo columnInfo = (TemanModelColumnInfo) realm.getSchema().getColumnInfo(com.sitijuniyanti.uasapp10116653.Model.TemanModel.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.sitijuniyanti.uasapp10116653.Model.TemanModel object = null;
        while (objects.hasNext()) {
            object = (com.sitijuniyanti.uasapp10116653.Model.TemanModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$id();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$nim = ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$nim();
            if (realmGet$nim != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nimIndex, rowIndex, realmGet$nim, false);
            }
            String realmGet$nama = ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$nama();
            if (realmGet$nama != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namaIndex, rowIndex, realmGet$nama, false);
            }
            String realmGet$kelas = ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$kelas();
            if (realmGet$kelas != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kelasIndex, rowIndex, realmGet$kelas, false);
            }
            String realmGet$tlp = ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$tlp();
            if (realmGet$tlp != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tlpIndex, rowIndex, realmGet$tlp, false);
            }
            String realmGet$email = ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
            }
            String realmGet$sosmed = ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$sosmed();
            if (realmGet$sosmed != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.sosmedIndex, rowIndex, realmGet$sosmed, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.sitijuniyanti.uasapp10116653.Model.TemanModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.sitijuniyanti.uasapp10116653.Model.TemanModel.class);
        long tableNativePtr = table.getNativePtr();
        TemanModelColumnInfo columnInfo = (TemanModelColumnInfo) realm.getSchema().getColumnInfo(com.sitijuniyanti.uasapp10116653.Model.TemanModel.class);
        long pkColumnIndex = columnInfo.idIndex;
        Object primaryKeyValue = ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$id();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        String realmGet$nim = ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$nim();
        if (realmGet$nim != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nimIndex, rowIndex, realmGet$nim, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nimIndex, rowIndex, false);
        }
        String realmGet$nama = ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$nama();
        if (realmGet$nama != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namaIndex, rowIndex, realmGet$nama, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.namaIndex, rowIndex, false);
        }
        String realmGet$kelas = ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$kelas();
        if (realmGet$kelas != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kelasIndex, rowIndex, realmGet$kelas, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kelasIndex, rowIndex, false);
        }
        String realmGet$tlp = ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$tlp();
        if (realmGet$tlp != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tlpIndex, rowIndex, realmGet$tlp, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tlpIndex, rowIndex, false);
        }
        String realmGet$email = ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.emailIndex, rowIndex, false);
        }
        String realmGet$sosmed = ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$sosmed();
        if (realmGet$sosmed != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.sosmedIndex, rowIndex, realmGet$sosmed, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.sosmedIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.sitijuniyanti.uasapp10116653.Model.TemanModel.class);
        long tableNativePtr = table.getNativePtr();
        TemanModelColumnInfo columnInfo = (TemanModelColumnInfo) realm.getSchema().getColumnInfo(com.sitijuniyanti.uasapp10116653.Model.TemanModel.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.sitijuniyanti.uasapp10116653.Model.TemanModel object = null;
        while (objects.hasNext()) {
            object = (com.sitijuniyanti.uasapp10116653.Model.TemanModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$id();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            String realmGet$nim = ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$nim();
            if (realmGet$nim != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nimIndex, rowIndex, realmGet$nim, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nimIndex, rowIndex, false);
            }
            String realmGet$nama = ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$nama();
            if (realmGet$nama != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namaIndex, rowIndex, realmGet$nama, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.namaIndex, rowIndex, false);
            }
            String realmGet$kelas = ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$kelas();
            if (realmGet$kelas != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kelasIndex, rowIndex, realmGet$kelas, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kelasIndex, rowIndex, false);
            }
            String realmGet$tlp = ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$tlp();
            if (realmGet$tlp != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tlpIndex, rowIndex, realmGet$tlp, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tlpIndex, rowIndex, false);
            }
            String realmGet$email = ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.emailIndex, rowIndex, false);
            }
            String realmGet$sosmed = ((com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) object).realmGet$sosmed();
            if (realmGet$sosmed != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.sosmedIndex, rowIndex, realmGet$sosmed, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.sosmedIndex, rowIndex, false);
            }
        }
    }

    public static com.sitijuniyanti.uasapp10116653.Model.TemanModel createDetachedCopy(com.sitijuniyanti.uasapp10116653.Model.TemanModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.sitijuniyanti.uasapp10116653.Model.TemanModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.sitijuniyanti.uasapp10116653.Model.TemanModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.sitijuniyanti.uasapp10116653.Model.TemanModel) cachedObject.object;
            }
            unmanagedObject = (com.sitijuniyanti.uasapp10116653.Model.TemanModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface unmanagedCopy = (com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) unmanagedObject;
        com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface realmSource = (com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$nim(realmSource.realmGet$nim());
        unmanagedCopy.realmSet$nama(realmSource.realmGet$nama());
        unmanagedCopy.realmSet$kelas(realmSource.realmGet$kelas());
        unmanagedCopy.realmSet$tlp(realmSource.realmGet$tlp());
        unmanagedCopy.realmSet$email(realmSource.realmGet$email());
        unmanagedCopy.realmSet$sosmed(realmSource.realmGet$sosmed());

        return unmanagedObject;
    }

    static com.sitijuniyanti.uasapp10116653.Model.TemanModel update(Realm realm, TemanModelColumnInfo columnInfo, com.sitijuniyanti.uasapp10116653.Model.TemanModel realmObject, com.sitijuniyanti.uasapp10116653.Model.TemanModel newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface realmObjectTarget = (com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) realmObject;
        com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface realmObjectSource = (com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxyInterface) newObject;
        Table table = realm.getTable(com.sitijuniyanti.uasapp10116653.Model.TemanModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.nimIndex, realmObjectSource.realmGet$nim());
        builder.addString(columnInfo.namaIndex, realmObjectSource.realmGet$nama());
        builder.addString(columnInfo.kelasIndex, realmObjectSource.realmGet$kelas());
        builder.addString(columnInfo.tlpIndex, realmObjectSource.realmGet$tlp());
        builder.addString(columnInfo.emailIndex, realmObjectSource.realmGet$email());
        builder.addString(columnInfo.sosmedIndex, realmObjectSource.realmGet$sosmed());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("TemanModel = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nim:");
        stringBuilder.append(realmGet$nim() != null ? realmGet$nim() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nama:");
        stringBuilder.append(realmGet$nama() != null ? realmGet$nama() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kelas:");
        stringBuilder.append(realmGet$kelas() != null ? realmGet$kelas() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tlp:");
        stringBuilder.append(realmGet$tlp() != null ? realmGet$tlp() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{email:");
        stringBuilder.append(realmGet$email() != null ? realmGet$email() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{sosmed:");
        stringBuilder.append(realmGet$sosmed() != null ? realmGet$sosmed() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxy aTemanModel = (com_sitijuniyanti_uasapp10116653_Model_TemanModelRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aTemanModel.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aTemanModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aTemanModel.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
