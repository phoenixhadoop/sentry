/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.sentry.hdfs.service.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TPermissionsUpdate implements org.apache.thrift.TBase<TPermissionsUpdate, TPermissionsUpdate._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TPermissionsUpdate");

  private static final org.apache.thrift.protocol.TField HASFULL_IMAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("hasfullImage", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField SEQ_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("seqNum", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField PRIVILEGE_CHANGES_FIELD_DESC = new org.apache.thrift.protocol.TField("privilegeChanges", org.apache.thrift.protocol.TType.MAP, (short)3);
  private static final org.apache.thrift.protocol.TField ROLE_CHANGES_FIELD_DESC = new org.apache.thrift.protocol.TField("roleChanges", org.apache.thrift.protocol.TType.MAP, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TPermissionsUpdateStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TPermissionsUpdateTupleSchemeFactory());
  }

  public boolean hasfullImage; // required
  public long seqNum; // required
  public Map<String,TPrivilegeChanges> privilegeChanges; // required
  public Map<String,TRoleChanges> roleChanges; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HASFULL_IMAGE((short)1, "hasfullImage"),
    SEQ_NUM((short)2, "seqNum"),
    PRIVILEGE_CHANGES((short)3, "privilegeChanges"),
    ROLE_CHANGES((short)4, "roleChanges");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // HASFULL_IMAGE
          return HASFULL_IMAGE;
        case 2: // SEQ_NUM
          return SEQ_NUM;
        case 3: // PRIVILEGE_CHANGES
          return PRIVILEGE_CHANGES;
        case 4: // ROLE_CHANGES
          return ROLE_CHANGES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __HASFULLIMAGE_ISSET_ID = 0;
  private static final int __SEQNUM_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HASFULL_IMAGE, new org.apache.thrift.meta_data.FieldMetaData("hasfullImage", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.SEQ_NUM, new org.apache.thrift.meta_data.FieldMetaData("seqNum", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PRIVILEGE_CHANGES, new org.apache.thrift.meta_data.FieldMetaData("privilegeChanges", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TPrivilegeChanges.class))));
    tmpMap.put(_Fields.ROLE_CHANGES, new org.apache.thrift.meta_data.FieldMetaData("roleChanges", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TRoleChanges.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TPermissionsUpdate.class, metaDataMap);
  }

  public TPermissionsUpdate() {
  }

  public TPermissionsUpdate(
    boolean hasfullImage,
    long seqNum,
    Map<String,TPrivilegeChanges> privilegeChanges,
    Map<String,TRoleChanges> roleChanges)
  {
    this();
    this.hasfullImage = hasfullImage;
    setHasfullImageIsSet(true);
    this.seqNum = seqNum;
    setSeqNumIsSet(true);
    this.privilegeChanges = privilegeChanges;
    this.roleChanges = roleChanges;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TPermissionsUpdate(TPermissionsUpdate other) {
    __isset_bitfield = other.__isset_bitfield;
    this.hasfullImage = other.hasfullImage;
    this.seqNum = other.seqNum;
    if (other.isSetPrivilegeChanges()) {
      Map<String,TPrivilegeChanges> __this__privilegeChanges = new HashMap<String,TPrivilegeChanges>();
      for (Map.Entry<String, TPrivilegeChanges> other_element : other.privilegeChanges.entrySet()) {

        String other_element_key = other_element.getKey();
        TPrivilegeChanges other_element_value = other_element.getValue();

        String __this__privilegeChanges_copy_key = other_element_key;

        TPrivilegeChanges __this__privilegeChanges_copy_value = new TPrivilegeChanges(other_element_value);

        __this__privilegeChanges.put(__this__privilegeChanges_copy_key, __this__privilegeChanges_copy_value);
      }
      this.privilegeChanges = __this__privilegeChanges;
    }
    if (other.isSetRoleChanges()) {
      Map<String,TRoleChanges> __this__roleChanges = new HashMap<String,TRoleChanges>();
      for (Map.Entry<String, TRoleChanges> other_element : other.roleChanges.entrySet()) {

        String other_element_key = other_element.getKey();
        TRoleChanges other_element_value = other_element.getValue();

        String __this__roleChanges_copy_key = other_element_key;

        TRoleChanges __this__roleChanges_copy_value = new TRoleChanges(other_element_value);

        __this__roleChanges.put(__this__roleChanges_copy_key, __this__roleChanges_copy_value);
      }
      this.roleChanges = __this__roleChanges;
    }
  }

  public TPermissionsUpdate deepCopy() {
    return new TPermissionsUpdate(this);
  }

  @Override
  public void clear() {
    setHasfullImageIsSet(false);
    this.hasfullImage = false;
    setSeqNumIsSet(false);
    this.seqNum = 0;
    this.privilegeChanges = null;
    this.roleChanges = null;
  }

  public boolean isHasfullImage() {
    return this.hasfullImage;
  }

  public TPermissionsUpdate setHasfullImage(boolean hasfullImage) {
    this.hasfullImage = hasfullImage;
    setHasfullImageIsSet(true);
    return this;
  }

  public void unsetHasfullImage() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HASFULLIMAGE_ISSET_ID);
  }

  /** Returns true if field hasfullImage is set (has been assigned a value) and false otherwise */
  public boolean isSetHasfullImage() {
    return EncodingUtils.testBit(__isset_bitfield, __HASFULLIMAGE_ISSET_ID);
  }

  public void setHasfullImageIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HASFULLIMAGE_ISSET_ID, value);
  }

  public long getSeqNum() {
    return this.seqNum;
  }

  public TPermissionsUpdate setSeqNum(long seqNum) {
    this.seqNum = seqNum;
    setSeqNumIsSet(true);
    return this;
  }

  public void unsetSeqNum() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SEQNUM_ISSET_ID);
  }

  /** Returns true if field seqNum is set (has been assigned a value) and false otherwise */
  public boolean isSetSeqNum() {
    return EncodingUtils.testBit(__isset_bitfield, __SEQNUM_ISSET_ID);
  }

  public void setSeqNumIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SEQNUM_ISSET_ID, value);
  }

  public int getPrivilegeChangesSize() {
    return (this.privilegeChanges == null) ? 0 : this.privilegeChanges.size();
  }

  public void putToPrivilegeChanges(String key, TPrivilegeChanges val) {
    if (this.privilegeChanges == null) {
      this.privilegeChanges = new HashMap<String,TPrivilegeChanges>();
    }
    this.privilegeChanges.put(key, val);
  }

  public Map<String,TPrivilegeChanges> getPrivilegeChanges() {
    return this.privilegeChanges;
  }

  public TPermissionsUpdate setPrivilegeChanges(Map<String,TPrivilegeChanges> privilegeChanges) {
    this.privilegeChanges = privilegeChanges;
    return this;
  }

  public void unsetPrivilegeChanges() {
    this.privilegeChanges = null;
  }

  /** Returns true if field privilegeChanges is set (has been assigned a value) and false otherwise */
  public boolean isSetPrivilegeChanges() {
    return this.privilegeChanges != null;
  }

  public void setPrivilegeChangesIsSet(boolean value) {
    if (!value) {
      this.privilegeChanges = null;
    }
  }

  public int getRoleChangesSize() {
    return (this.roleChanges == null) ? 0 : this.roleChanges.size();
  }

  public void putToRoleChanges(String key, TRoleChanges val) {
    if (this.roleChanges == null) {
      this.roleChanges = new HashMap<String,TRoleChanges>();
    }
    this.roleChanges.put(key, val);
  }

  public Map<String,TRoleChanges> getRoleChanges() {
    return this.roleChanges;
  }

  public TPermissionsUpdate setRoleChanges(Map<String,TRoleChanges> roleChanges) {
    this.roleChanges = roleChanges;
    return this;
  }

  public void unsetRoleChanges() {
    this.roleChanges = null;
  }

  /** Returns true if field roleChanges is set (has been assigned a value) and false otherwise */
  public boolean isSetRoleChanges() {
    return this.roleChanges != null;
  }

  public void setRoleChangesIsSet(boolean value) {
    if (!value) {
      this.roleChanges = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HASFULL_IMAGE:
      if (value == null) {
        unsetHasfullImage();
      } else {
        setHasfullImage((Boolean)value);
      }
      break;

    case SEQ_NUM:
      if (value == null) {
        unsetSeqNum();
      } else {
        setSeqNum((Long)value);
      }
      break;

    case PRIVILEGE_CHANGES:
      if (value == null) {
        unsetPrivilegeChanges();
      } else {
        setPrivilegeChanges((Map<String,TPrivilegeChanges>)value);
      }
      break;

    case ROLE_CHANGES:
      if (value == null) {
        unsetRoleChanges();
      } else {
        setRoleChanges((Map<String,TRoleChanges>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HASFULL_IMAGE:
      return Boolean.valueOf(isHasfullImage());

    case SEQ_NUM:
      return Long.valueOf(getSeqNum());

    case PRIVILEGE_CHANGES:
      return getPrivilegeChanges();

    case ROLE_CHANGES:
      return getRoleChanges();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HASFULL_IMAGE:
      return isSetHasfullImage();
    case SEQ_NUM:
      return isSetSeqNum();
    case PRIVILEGE_CHANGES:
      return isSetPrivilegeChanges();
    case ROLE_CHANGES:
      return isSetRoleChanges();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TPermissionsUpdate)
      return this.equals((TPermissionsUpdate)that);
    return false;
  }

  public boolean equals(TPermissionsUpdate that) {
    if (that == null)
      return false;

    boolean this_present_hasfullImage = true;
    boolean that_present_hasfullImage = true;
    if (this_present_hasfullImage || that_present_hasfullImage) {
      if (!(this_present_hasfullImage && that_present_hasfullImage))
        return false;
      if (this.hasfullImage != that.hasfullImage)
        return false;
    }

    boolean this_present_seqNum = true;
    boolean that_present_seqNum = true;
    if (this_present_seqNum || that_present_seqNum) {
      if (!(this_present_seqNum && that_present_seqNum))
        return false;
      if (this.seqNum != that.seqNum)
        return false;
    }

    boolean this_present_privilegeChanges = true && this.isSetPrivilegeChanges();
    boolean that_present_privilegeChanges = true && that.isSetPrivilegeChanges();
    if (this_present_privilegeChanges || that_present_privilegeChanges) {
      if (!(this_present_privilegeChanges && that_present_privilegeChanges))
        return false;
      if (!this.privilegeChanges.equals(that.privilegeChanges))
        return false;
    }

    boolean this_present_roleChanges = true && this.isSetRoleChanges();
    boolean that_present_roleChanges = true && that.isSetRoleChanges();
    if (this_present_roleChanges || that_present_roleChanges) {
      if (!(this_present_roleChanges && that_present_roleChanges))
        return false;
      if (!this.roleChanges.equals(that.roleChanges))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TPermissionsUpdate other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TPermissionsUpdate typedOther = (TPermissionsUpdate)other;

    lastComparison = Boolean.valueOf(isSetHasfullImage()).compareTo(typedOther.isSetHasfullImage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHasfullImage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hasfullImage, typedOther.hasfullImage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSeqNum()).compareTo(typedOther.isSetSeqNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSeqNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.seqNum, typedOther.seqNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPrivilegeChanges()).compareTo(typedOther.isSetPrivilegeChanges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrivilegeChanges()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.privilegeChanges, typedOther.privilegeChanges);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRoleChanges()).compareTo(typedOther.isSetRoleChanges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoleChanges()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.roleChanges, typedOther.roleChanges);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TPermissionsUpdate(");
    boolean first = true;

    sb.append("hasfullImage:");
    sb.append(this.hasfullImage);
    first = false;
    if (!first) sb.append(", ");
    sb.append("seqNum:");
    sb.append(this.seqNum);
    first = false;
    if (!first) sb.append(", ");
    sb.append("privilegeChanges:");
    if (this.privilegeChanges == null) {
      sb.append("null");
    } else {
      sb.append(this.privilegeChanges);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("roleChanges:");
    if (this.roleChanges == null) {
      sb.append("null");
    } else {
      sb.append(this.roleChanges);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'hasfullImage' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'seqNum' because it's a primitive and you chose the non-beans generator.
    if (privilegeChanges == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'privilegeChanges' was not present! Struct: " + toString());
    }
    if (roleChanges == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'roleChanges' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TPermissionsUpdateStandardSchemeFactory implements SchemeFactory {
    public TPermissionsUpdateStandardScheme getScheme() {
      return new TPermissionsUpdateStandardScheme();
    }
  }

  private static class TPermissionsUpdateStandardScheme extends StandardScheme<TPermissionsUpdate> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TPermissionsUpdate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HASFULL_IMAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.hasfullImage = iprot.readBool();
              struct.setHasfullImageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SEQ_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.seqNum = iprot.readI64();
              struct.setSeqNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PRIVILEGE_CHANGES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map102 = iprot.readMapBegin();
                struct.privilegeChanges = new HashMap<String,TPrivilegeChanges>(2*_map102.size);
                for (int _i103 = 0; _i103 < _map102.size; ++_i103)
                {
                  String _key104; // required
                  TPrivilegeChanges _val105; // required
                  _key104 = iprot.readString();
                  _val105 = new TPrivilegeChanges();
                  _val105.read(iprot);
                  struct.privilegeChanges.put(_key104, _val105);
                }
                iprot.readMapEnd();
              }
              struct.setPrivilegeChangesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ROLE_CHANGES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map106 = iprot.readMapBegin();
                struct.roleChanges = new HashMap<String,TRoleChanges>(2*_map106.size);
                for (int _i107 = 0; _i107 < _map106.size; ++_i107)
                {
                  String _key108; // required
                  TRoleChanges _val109; // required
                  _key108 = iprot.readString();
                  _val109 = new TRoleChanges();
                  _val109.read(iprot);
                  struct.roleChanges.put(_key108, _val109);
                }
                iprot.readMapEnd();
              }
              struct.setRoleChangesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetHasfullImage()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'hasfullImage' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetSeqNum()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'seqNum' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TPermissionsUpdate struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(HASFULL_IMAGE_FIELD_DESC);
      oprot.writeBool(struct.hasfullImage);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SEQ_NUM_FIELD_DESC);
      oprot.writeI64(struct.seqNum);
      oprot.writeFieldEnd();
      if (struct.privilegeChanges != null) {
        oprot.writeFieldBegin(PRIVILEGE_CHANGES_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.privilegeChanges.size()));
          for (Map.Entry<String, TPrivilegeChanges> _iter110 : struct.privilegeChanges.entrySet())
          {
            oprot.writeString(_iter110.getKey());
            _iter110.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.roleChanges != null) {
        oprot.writeFieldBegin(ROLE_CHANGES_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.roleChanges.size()));
          for (Map.Entry<String, TRoleChanges> _iter111 : struct.roleChanges.entrySet())
          {
            oprot.writeString(_iter111.getKey());
            _iter111.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TPermissionsUpdateTupleSchemeFactory implements SchemeFactory {
    public TPermissionsUpdateTupleScheme getScheme() {
      return new TPermissionsUpdateTupleScheme();
    }
  }

  private static class TPermissionsUpdateTupleScheme extends TupleScheme<TPermissionsUpdate> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TPermissionsUpdate struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBool(struct.hasfullImage);
      oprot.writeI64(struct.seqNum);
      {
        oprot.writeI32(struct.privilegeChanges.size());
        for (Map.Entry<String, TPrivilegeChanges> _iter112 : struct.privilegeChanges.entrySet())
        {
          oprot.writeString(_iter112.getKey());
          _iter112.getValue().write(oprot);
        }
      }
      {
        oprot.writeI32(struct.roleChanges.size());
        for (Map.Entry<String, TRoleChanges> _iter113 : struct.roleChanges.entrySet())
        {
          oprot.writeString(_iter113.getKey());
          _iter113.getValue().write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TPermissionsUpdate struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.hasfullImage = iprot.readBool();
      struct.setHasfullImageIsSet(true);
      struct.seqNum = iprot.readI64();
      struct.setSeqNumIsSet(true);
      {
        org.apache.thrift.protocol.TMap _map114 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.privilegeChanges = new HashMap<String,TPrivilegeChanges>(2*_map114.size);
        for (int _i115 = 0; _i115 < _map114.size; ++_i115)
        {
          String _key116; // required
          TPrivilegeChanges _val117; // required
          _key116 = iprot.readString();
          _val117 = new TPrivilegeChanges();
          _val117.read(iprot);
          struct.privilegeChanges.put(_key116, _val117);
        }
      }
      struct.setPrivilegeChangesIsSet(true);
      {
        org.apache.thrift.protocol.TMap _map118 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.roleChanges = new HashMap<String,TRoleChanges>(2*_map118.size);
        for (int _i119 = 0; _i119 < _map118.size; ++_i119)
        {
          String _key120; // required
          TRoleChanges _val121; // required
          _key120 = iprot.readString();
          _val121 = new TRoleChanges();
          _val121.read(iprot);
          struct.roleChanges.put(_key120, _val121);
        }
      }
      struct.setRoleChangesIsSet(true);
    }
  }

}

