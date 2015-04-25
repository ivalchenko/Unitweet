/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thrift.tweet;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
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

public class Tweet implements org.apache.thrift.TBase<Tweet, Tweet._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Tweet");

  private static final org.apache.thrift.protocol.TField USER_FIELD_DESC = new org.apache.thrift.protocol.TField("user", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField MSG_FIELD_DESC = new org.apache.thrift.protocol.TField("msg", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TAG_FIELD_DESC = new org.apache.thrift.protocol.TField("tag", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CHANNEL_FIELD_DESC = new org.apache.thrift.protocol.TField("channel", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField RETWEETS_FIELD_DESC = new org.apache.thrift.protocol.TField("retweets", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField LIKES_FIELD_DESC = new org.apache.thrift.protocol.TField("likes", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("date", org.apache.thrift.protocol.TType.STRUCT, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TweetStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TweetTupleSchemeFactory());
  }

  public String user; // required
  public String msg; // required
  public String tag; // required
  public String channel; // required
  public int retweets; // required
  public int likes; // required
  public DateTime date; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER((short)1, "user"),
    MSG((short)2, "msg"),
    TAG((short)3, "tag"),
    CHANNEL((short)4, "channel"),
    RETWEETS((short)5, "retweets"),
    LIKES((short)6, "likes"),
    DATE((short)7, "date");

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
        case 1: // USER
          return USER;
        case 2: // MSG
          return MSG;
        case 3: // TAG
          return TAG;
        case 4: // CHANNEL
          return CHANNEL;
        case 5: // RETWEETS
          return RETWEETS;
        case 6: // LIKES
          return LIKES;
        case 7: // DATE
          return DATE;
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
  private static final int __RETWEETS_ISSET_ID = 0;
  private static final int __LIKES_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER, new org.apache.thrift.meta_data.FieldMetaData("user", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MSG, new org.apache.thrift.meta_data.FieldMetaData("msg", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TAG, new org.apache.thrift.meta_data.FieldMetaData("tag", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CHANNEL, new org.apache.thrift.meta_data.FieldMetaData("channel", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RETWEETS, new org.apache.thrift.meta_data.FieldMetaData("retweets", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    tmpMap.put(_Fields.LIKES, new org.apache.thrift.meta_data.FieldMetaData("likes", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    tmpMap.put(_Fields.DATE, new org.apache.thrift.meta_data.FieldMetaData("date", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DateTime.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Tweet.class, metaDataMap);
  }

  public Tweet() {
  }

  public Tweet(
    String user,
    String msg,
    String tag,
    String channel,
    int retweets,
    int likes,
    DateTime date)
  {
    this();
    this.user = user;
    this.msg = msg;
    this.tag = tag;
    this.channel = channel;
    this.retweets = retweets;
    setRetweetsIsSet(true);
    this.likes = likes;
    setLikesIsSet(true);
    this.date = date;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Tweet(Tweet other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetUser()) {
      this.user = other.user;
    }
    if (other.isSetMsg()) {
      this.msg = other.msg;
    }
    if (other.isSetTag()) {
      this.tag = other.tag;
    }
    if (other.isSetChannel()) {
      this.channel = other.channel;
    }
    this.retweets = other.retweets;
    this.likes = other.likes;
    if (other.isSetDate()) {
      this.date = new DateTime(other.date);
    }
  }

  public Tweet deepCopy() {
    return new Tweet(this);
  }

  @Override
  public void clear() {
    this.user = null;
    this.msg = null;
    this.tag = null;
    this.channel = null;
    setRetweetsIsSet(false);
    this.retweets = 0;
    setLikesIsSet(false);
    this.likes = 0;
    this.date = null;
  }

  public String getUser() {
    return this.user;
  }

  public Tweet setUser(String user) {
    this.user = user;
    return this;
  }

  public void unsetUser() {
    this.user = null;
  }

  /** Returns true if field user is set (has been assigned a value) and false otherwise */
  public boolean isSetUser() {
    return this.user != null;
  }

  public void setUserIsSet(boolean value) {
    if (!value) {
      this.user = null;
    }
  }

  public String getMsg() {
    return this.msg;
  }

  public Tweet setMsg(String msg) {
    this.msg = msg;
    return this;
  }

  public void unsetMsg() {
    this.msg = null;
  }

  /** Returns true if field msg is set (has been assigned a value) and false otherwise */
  public boolean isSetMsg() {
    return this.msg != null;
  }

  public void setMsgIsSet(boolean value) {
    if (!value) {
      this.msg = null;
    }
  }

  public String getTag() {
    return this.tag;
  }

  public Tweet setTag(String tag) {
    this.tag = tag;
    return this;
  }

  public void unsetTag() {
    this.tag = null;
  }

  /** Returns true if field tag is set (has been assigned a value) and false otherwise */
  public boolean isSetTag() {
    return this.tag != null;
  }

  public void setTagIsSet(boolean value) {
    if (!value) {
      this.tag = null;
    }
  }

  public String getChannel() {
    return this.channel;
  }

  public Tweet setChannel(String channel) {
    this.channel = channel;
    return this;
  }

  public void unsetChannel() {
    this.channel = null;
  }

  /** Returns true if field channel is set (has been assigned a value) and false otherwise */
  public boolean isSetChannel() {
    return this.channel != null;
  }

  public void setChannelIsSet(boolean value) {
    if (!value) {
      this.channel = null;
    }
  }

  public int getRetweets() {
    return this.retweets;
  }

  public Tweet setRetweets(int retweets) {
    this.retweets = retweets;
    setRetweetsIsSet(true);
    return this;
  }

  public void unsetRetweets() {
    __isset_bit_vector.clear(__RETWEETS_ISSET_ID);
  }

  /** Returns true if field retweets is set (has been assigned a value) and false otherwise */
  public boolean isSetRetweets() {
    return __isset_bit_vector.get(__RETWEETS_ISSET_ID);
  }

  public void setRetweetsIsSet(boolean value) {
    __isset_bit_vector.set(__RETWEETS_ISSET_ID, value);
  }

  public int getLikes() {
    return this.likes;
  }

  public Tweet setLikes(int likes) {
    this.likes = likes;
    setLikesIsSet(true);
    return this;
  }

  public void unsetLikes() {
    __isset_bit_vector.clear(__LIKES_ISSET_ID);
  }

  /** Returns true if field likes is set (has been assigned a value) and false otherwise */
  public boolean isSetLikes() {
    return __isset_bit_vector.get(__LIKES_ISSET_ID);
  }

  public void setLikesIsSet(boolean value) {
    __isset_bit_vector.set(__LIKES_ISSET_ID, value);
  }

  public DateTime getDate() {
    return this.date;
  }

  public Tweet setDate(DateTime date) {
    this.date = date;
    return this;
  }

  public void unsetDate() {
    this.date = null;
  }

  /** Returns true if field date is set (has been assigned a value) and false otherwise */
  public boolean isSetDate() {
    return this.date != null;
  }

  public void setDateIsSet(boolean value) {
    if (!value) {
      this.date = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USER:
      if (value == null) {
        unsetUser();
      } else {
        setUser((String)value);
      }
      break;

    case MSG:
      if (value == null) {
        unsetMsg();
      } else {
        setMsg((String)value);
      }
      break;

    case TAG:
      if (value == null) {
        unsetTag();
      } else {
        setTag((String)value);
      }
      break;

    case CHANNEL:
      if (value == null) {
        unsetChannel();
      } else {
        setChannel((String)value);
      }
      break;

    case RETWEETS:
      if (value == null) {
        unsetRetweets();
      } else {
        setRetweets((Integer)value);
      }
      break;

    case LIKES:
      if (value == null) {
        unsetLikes();
      } else {
        setLikes((Integer)value);
      }
      break;

    case DATE:
      if (value == null) {
        unsetDate();
      } else {
        setDate((DateTime)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER:
      return getUser();

    case MSG:
      return getMsg();

    case TAG:
      return getTag();

    case CHANNEL:
      return getChannel();

    case RETWEETS:
      return Integer.valueOf(getRetweets());

    case LIKES:
      return Integer.valueOf(getLikes());

    case DATE:
      return getDate();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USER:
      return isSetUser();
    case MSG:
      return isSetMsg();
    case TAG:
      return isSetTag();
    case CHANNEL:
      return isSetChannel();
    case RETWEETS:
      return isSetRetweets();
    case LIKES:
      return isSetLikes();
    case DATE:
      return isSetDate();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Tweet)
      return this.equals((Tweet)that);
    return false;
  }

  public boolean equals(Tweet that) {
    if (that == null)
      return false;

    boolean this_present_user = true && this.isSetUser();
    boolean that_present_user = true && that.isSetUser();
    if (this_present_user || that_present_user) {
      if (!(this_present_user && that_present_user))
        return false;
      if (!this.user.equals(that.user))
        return false;
    }

    boolean this_present_msg = true && this.isSetMsg();
    boolean that_present_msg = true && that.isSetMsg();
    if (this_present_msg || that_present_msg) {
      if (!(this_present_msg && that_present_msg))
        return false;
      if (!this.msg.equals(that.msg))
        return false;
    }

    boolean this_present_tag = true && this.isSetTag();
    boolean that_present_tag = true && that.isSetTag();
    if (this_present_tag || that_present_tag) {
      if (!(this_present_tag && that_present_tag))
        return false;
      if (!this.tag.equals(that.tag))
        return false;
    }

    boolean this_present_channel = true && this.isSetChannel();
    boolean that_present_channel = true && that.isSetChannel();
    if (this_present_channel || that_present_channel) {
      if (!(this_present_channel && that_present_channel))
        return false;
      if (!this.channel.equals(that.channel))
        return false;
    }

    boolean this_present_retweets = true;
    boolean that_present_retweets = true;
    if (this_present_retweets || that_present_retweets) {
      if (!(this_present_retweets && that_present_retweets))
        return false;
      if (this.retweets != that.retweets)
        return false;
    }

    boolean this_present_likes = true;
    boolean that_present_likes = true;
    if (this_present_likes || that_present_likes) {
      if (!(this_present_likes && that_present_likes))
        return false;
      if (this.likes != that.likes)
        return false;
    }

    boolean this_present_date = true && this.isSetDate();
    boolean that_present_date = true && that.isSetDate();
    if (this_present_date || that_present_date) {
      if (!(this_present_date && that_present_date))
        return false;
      if (!this.date.equals(that.date))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Tweet other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Tweet typedOther = (Tweet)other;

    lastComparison = Boolean.valueOf(isSetUser()).compareTo(typedOther.isSetUser());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUser()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user, typedOther.user);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMsg()).compareTo(typedOther.isSetMsg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMsg()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.msg, typedOther.msg);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTag()).compareTo(typedOther.isSetTag());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTag()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tag, typedOther.tag);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetChannel()).compareTo(typedOther.isSetChannel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChannel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.channel, typedOther.channel);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRetweets()).compareTo(typedOther.isSetRetweets());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRetweets()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.retweets, typedOther.retweets);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLikes()).compareTo(typedOther.isSetLikes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLikes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.likes, typedOther.likes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDate()).compareTo(typedOther.isSetDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.date, typedOther.date);
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
    StringBuilder sb = new StringBuilder("Tweet(");
    boolean first = true;

    sb.append("user:");
    if (this.user == null) {
      sb.append("null");
    } else {
      sb.append(this.user);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("msg:");
    if (this.msg == null) {
      sb.append("null");
    } else {
      sb.append(this.msg);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tag:");
    if (this.tag == null) {
      sb.append("null");
    } else {
      sb.append(this.tag);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("channel:");
    if (this.channel == null) {
      sb.append("null");
    } else {
      sb.append(this.channel);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("retweets:");
    sb.append(this.retweets);
    first = false;
    if (!first) sb.append(", ");
    sb.append("likes:");
    sb.append(this.likes);
    first = false;
    if (!first) sb.append(", ");
    sb.append("date:");
    if (this.date == null) {
      sb.append("null");
    } else {
      sb.append(this.date);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TweetStandardSchemeFactory implements SchemeFactory {
    public TweetStandardScheme getScheme() {
      return new TweetStandardScheme();
    }
  }

  private static class TweetStandardScheme extends StandardScheme<Tweet> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Tweet struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.user = iprot.readString();
              struct.setUserIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MSG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.msg = iprot.readString();
              struct.setMsgIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TAG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tag = iprot.readString();
              struct.setTagIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CHANNEL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.channel = iprot.readString();
              struct.setChannelIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // RETWEETS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.retweets = iprot.readI32();
              struct.setRetweetsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // LIKES
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.likes = iprot.readI32();
              struct.setLikesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.date = new DateTime();
              struct.date.read(iprot);
              struct.setDateIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Tweet struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.user != null) {
        oprot.writeFieldBegin(USER_FIELD_DESC);
        oprot.writeString(struct.user);
        oprot.writeFieldEnd();
      }
      if (struct.msg != null) {
        oprot.writeFieldBegin(MSG_FIELD_DESC);
        oprot.writeString(struct.msg);
        oprot.writeFieldEnd();
      }
      if (struct.tag != null) {
        oprot.writeFieldBegin(TAG_FIELD_DESC);
        oprot.writeString(struct.tag);
        oprot.writeFieldEnd();
      }
      if (struct.channel != null) {
        oprot.writeFieldBegin(CHANNEL_FIELD_DESC);
        oprot.writeString(struct.channel);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(RETWEETS_FIELD_DESC);
      oprot.writeI32(struct.retweets);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LIKES_FIELD_DESC);
      oprot.writeI32(struct.likes);
      oprot.writeFieldEnd();
      if (struct.date != null) {
        oprot.writeFieldBegin(DATE_FIELD_DESC);
        struct.date.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TweetTupleSchemeFactory implements SchemeFactory {
    public TweetTupleScheme getScheme() {
      return new TweetTupleScheme();
    }
  }

  private static class TweetTupleScheme extends TupleScheme<Tweet> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Tweet struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUser()) {
        optionals.set(0);
      }
      if (struct.isSetMsg()) {
        optionals.set(1);
      }
      if (struct.isSetTag()) {
        optionals.set(2);
      }
      if (struct.isSetChannel()) {
        optionals.set(3);
      }
      if (struct.isSetRetweets()) {
        optionals.set(4);
      }
      if (struct.isSetLikes()) {
        optionals.set(5);
      }
      if (struct.isSetDate()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetUser()) {
        oprot.writeString(struct.user);
      }
      if (struct.isSetMsg()) {
        oprot.writeString(struct.msg);
      }
      if (struct.isSetTag()) {
        oprot.writeString(struct.tag);
      }
      if (struct.isSetChannel()) {
        oprot.writeString(struct.channel);
      }
      if (struct.isSetRetweets()) {
        oprot.writeI32(struct.retweets);
      }
      if (struct.isSetLikes()) {
        oprot.writeI32(struct.likes);
      }
      if (struct.isSetDate()) {
        struct.date.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Tweet struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.user = iprot.readString();
        struct.setUserIsSet(true);
      }
      if (incoming.get(1)) {
        struct.msg = iprot.readString();
        struct.setMsgIsSet(true);
      }
      if (incoming.get(2)) {
        struct.tag = iprot.readString();
        struct.setTagIsSet(true);
      }
      if (incoming.get(3)) {
        struct.channel = iprot.readString();
        struct.setChannelIsSet(true);
      }
      if (incoming.get(4)) {
        struct.retweets = iprot.readI32();
        struct.setRetweetsIsSet(true);
      }
      if (incoming.get(5)) {
        struct.likes = iprot.readI32();
        struct.setLikesIsSet(true);
      }
      if (incoming.get(6)) {
        struct.date = new DateTime();
        struct.date.read(iprot);
        struct.setDateIsSet(true);
      }
    }
  }

}

