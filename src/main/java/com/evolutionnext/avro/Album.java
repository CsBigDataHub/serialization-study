/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.evolutionnext.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Album extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1595154842653907432L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Album\",\"namespace\":\"com.evolutionnext.avro\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"yearReleased\",\"type\":[\"int\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Album> ENCODER =
      new BinaryMessageEncoder<Album>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Album> DECODER =
      new BinaryMessageDecoder<Album>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Album> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Album> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Album>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Album to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Album from a ByteBuffer. */
  public static Album fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.Integer yearReleased;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Album() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param yearReleased The new value for yearReleased
   */
  public Album(java.lang.CharSequence name, java.lang.Integer yearReleased) {
    this.name = name;
    this.yearReleased = yearReleased;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return yearReleased;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: yearReleased = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'yearReleased' field.
   * @return The value of the 'yearReleased' field.
   */
  public java.lang.Integer getYearReleased() {
    return yearReleased;
  }

  /**
   * Sets the value of the 'yearReleased' field.
   * @param value the value to set.
   */
  public void setYearReleased(java.lang.Integer value) {
    this.yearReleased = value;
  }

  /**
   * Creates a new Album RecordBuilder.
   * @return A new Album RecordBuilder
   */
  public static com.evolutionnext.avro.Album.Builder newBuilder() {
    return new com.evolutionnext.avro.Album.Builder();
  }

  /**
   * Creates a new Album RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Album RecordBuilder
   */
  public static com.evolutionnext.avro.Album.Builder newBuilder(com.evolutionnext.avro.Album.Builder other) {
    return new com.evolutionnext.avro.Album.Builder(other);
  }

  /**
   * Creates a new Album RecordBuilder by copying an existing Album instance.
   * @param other The existing instance to copy.
   * @return A new Album RecordBuilder
   */
  public static com.evolutionnext.avro.Album.Builder newBuilder(com.evolutionnext.avro.Album other) {
    return new com.evolutionnext.avro.Album.Builder(other);
  }

  /**
   * RecordBuilder for Album instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Album>
    implements org.apache.avro.data.RecordBuilder<Album> {

    private java.lang.CharSequence name;
    private java.lang.Integer yearReleased;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.evolutionnext.avro.Album.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.yearReleased)) {
        this.yearReleased = data().deepCopy(fields()[1].schema(), other.yearReleased);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Album instance
     * @param other The existing instance to copy.
     */
    private Builder(com.evolutionnext.avro.Album other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.yearReleased)) {
        this.yearReleased = data().deepCopy(fields()[1].schema(), other.yearReleased);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.evolutionnext.avro.Album.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.evolutionnext.avro.Album.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'yearReleased' field.
      * @return The value.
      */
    public java.lang.Integer getYearReleased() {
      return yearReleased;
    }

    /**
      * Sets the value of the 'yearReleased' field.
      * @param value The value of 'yearReleased'.
      * @return This builder.
      */
    public com.evolutionnext.avro.Album.Builder setYearReleased(java.lang.Integer value) {
      validate(fields()[1], value);
      this.yearReleased = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'yearReleased' field has been set.
      * @return True if the 'yearReleased' field has been set, false otherwise.
      */
    public boolean hasYearReleased() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'yearReleased' field.
      * @return This builder.
      */
    public com.evolutionnext.avro.Album.Builder clearYearReleased() {
      yearReleased = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Album build() {
      try {
        Album record = new Album();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.yearReleased = fieldSetFlags()[1] ? this.yearReleased : (java.lang.Integer) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Album>
    WRITER$ = (org.apache.avro.io.DatumWriter<Album>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Album>
    READER$ = (org.apache.avro.io.DatumReader<Album>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
