// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetPlayerSocialDetailRsp.proto

package emu.grasscutter.net.proto;

public final class GetPlayerSocialDetailRspOuterClass {
  private GetPlayerSocialDetailRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetPlayerSocialDetailRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetPlayerSocialDetailRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.SocialDetail detail_data = 13;</code>
     * @return Whether the detailData field is set.
     */
    boolean hasDetailData();
    /**
     * <code>.SocialDetail detail_data = 13;</code>
     * @return The detailData.
     */
    emu.grasscutter.net.proto.SocialDetailOuterClass.SocialDetail getDetailData();
    /**
     * <code>.SocialDetail detail_data = 13;</code>
     */
    emu.grasscutter.net.proto.SocialDetailOuterClass.SocialDetailOrBuilder getDetailDataOrBuilder();

    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 
   * </pre>
   *
   * Protobuf type {@code GetPlayerSocialDetailRsp}
   */
  public static final class GetPlayerSocialDetailRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetPlayerSocialDetailRsp)
      GetPlayerSocialDetailRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetPlayerSocialDetailRsp.newBuilder() to construct.
    private GetPlayerSocialDetailRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetPlayerSocialDetailRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetPlayerSocialDetailRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetPlayerSocialDetailRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 48: {

              retcode_ = input.readInt32();
              break;
            }
            case 106: {
              emu.grasscutter.net.proto.SocialDetailOuterClass.SocialDetail.Builder subBuilder = null;
              if (detailData_ != null) {
                subBuilder = detailData_.toBuilder();
              }
              detailData_ = input.readMessage(emu.grasscutter.net.proto.SocialDetailOuterClass.SocialDetail.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(detailData_);
                detailData_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.internal_static_GetPlayerSocialDetailRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.internal_static_GetPlayerSocialDetailRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp.class, emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp.Builder.class);
    }

    public static final int DETAIL_DATA_FIELD_NUMBER = 13;
    private emu.grasscutter.net.proto.SocialDetailOuterClass.SocialDetail detailData_;
    /**
     * <code>.SocialDetail detail_data = 13;</code>
     * @return Whether the detailData field is set.
     */
    @java.lang.Override
    public boolean hasDetailData() {
      return detailData_ != null;
    }
    /**
     * <code>.SocialDetail detail_data = 13;</code>
     * @return The detailData.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.SocialDetailOuterClass.SocialDetail getDetailData() {
      return detailData_ == null ? emu.grasscutter.net.proto.SocialDetailOuterClass.SocialDetail.getDefaultInstance() : detailData_;
    }
    /**
     * <code>.SocialDetail detail_data = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.SocialDetailOuterClass.SocialDetailOrBuilder getDetailDataOrBuilder() {
      return getDetailData();
    }

    public static final int RETCODE_FIELD_NUMBER = 6;
    private int retcode_;
    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (retcode_ != 0) {
        output.writeInt32(6, retcode_);
      }
      if (detailData_ != null) {
        output.writeMessage(13, getDetailData());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, retcode_);
      }
      if (detailData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getDetailData());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp other = (emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp) obj;

      if (hasDetailData() != other.hasDetailData()) return false;
      if (hasDetailData()) {
        if (!getDetailData()
            .equals(other.getDetailData())) return false;
      }
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasDetailData()) {
        hash = (37 * hash) + DETAIL_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getDetailData().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 
     * </pre>
     *
     * Protobuf type {@code GetPlayerSocialDetailRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetPlayerSocialDetailRsp)
        emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.internal_static_GetPlayerSocialDetailRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.internal_static_GetPlayerSocialDetailRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp.class, emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (detailDataBuilder_ == null) {
          detailData_ = null;
        } else {
          detailData_ = null;
          detailDataBuilder_ = null;
        }
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.internal_static_GetPlayerSocialDetailRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp build() {
        emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp buildPartial() {
        emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp result = new emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp(this);
        if (detailDataBuilder_ == null) {
          result.detailData_ = detailData_;
        } else {
          result.detailData_ = detailDataBuilder_.build();
        }
        result.retcode_ = retcode_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp other) {
        if (other == emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp.getDefaultInstance()) return this;
        if (other.hasDetailData()) {
          mergeDetailData(other.getDetailData());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.SocialDetailOuterClass.SocialDetail detailData_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.SocialDetailOuterClass.SocialDetail, emu.grasscutter.net.proto.SocialDetailOuterClass.SocialDetail.Builder, emu.grasscutter.net.proto.SocialDetailOuterClass.SocialDetailOrBuilder> detailDataBuilder_;
      /**
       * <code>.SocialDetail detail_data = 13;</code>
       * @return Whether the detailData field is set.
       */
      public boolean hasDetailData() {
        return detailDataBuilder_ != null || detailData_ != null;
      }
      /**
       * <code>.SocialDetail detail_data = 13;</code>
       * @return The detailData.
       */
      public emu.grasscutter.net.proto.SocialDetailOuterClass.SocialDetail getDetailData() {
        if (detailDataBuilder_ == null) {
          return detailData_ == null ? emu.grasscutter.net.proto.SocialDetailOuterClass.SocialDetail.getDefaultInstance() : detailData_;
        } else {
          return detailDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.SocialDetail detail_data = 13;</code>
       */
      public Builder setDetailData(emu.grasscutter.net.proto.SocialDetailOuterClass.SocialDetail value) {
        if (detailDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          detailData_ = value;
          onChanged();
        } else {
          detailDataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.SocialDetail detail_data = 13;</code>
       */
      public Builder setDetailData(
          emu.grasscutter.net.proto.SocialDetailOuterClass.SocialDetail.Builder builderForValue) {
        if (detailDataBuilder_ == null) {
          detailData_ = builderForValue.build();
          onChanged();
        } else {
          detailDataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.SocialDetail detail_data = 13;</code>
       */
      public Builder mergeDetailData(emu.grasscutter.net.proto.SocialDetailOuterClass.SocialDetail value) {
        if (detailDataBuilder_ == null) {
          if (detailData_ != null) {
            detailData_ =
              emu.grasscutter.net.proto.SocialDetailOuterClass.SocialDetail.newBuilder(detailData_).mergeFrom(value).buildPartial();
          } else {
            detailData_ = value;
          }
          onChanged();
        } else {
          detailDataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.SocialDetail detail_data = 13;</code>
       */
      public Builder clearDetailData() {
        if (detailDataBuilder_ == null) {
          detailData_ = null;
          onChanged();
        } else {
          detailData_ = null;
          detailDataBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.SocialDetail detail_data = 13;</code>
       */
      public emu.grasscutter.net.proto.SocialDetailOuterClass.SocialDetail.Builder getDetailDataBuilder() {
        
        onChanged();
        return getDetailDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.SocialDetail detail_data = 13;</code>
       */
      public emu.grasscutter.net.proto.SocialDetailOuterClass.SocialDetailOrBuilder getDetailDataOrBuilder() {
        if (detailDataBuilder_ != null) {
          return detailDataBuilder_.getMessageOrBuilder();
        } else {
          return detailData_ == null ?
              emu.grasscutter.net.proto.SocialDetailOuterClass.SocialDetail.getDefaultInstance() : detailData_;
        }
      }
      /**
       * <code>.SocialDetail detail_data = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.SocialDetailOuterClass.SocialDetail, emu.grasscutter.net.proto.SocialDetailOuterClass.SocialDetail.Builder, emu.grasscutter.net.proto.SocialDetailOuterClass.SocialDetailOrBuilder> 
          getDetailDataFieldBuilder() {
        if (detailDataBuilder_ == null) {
          detailDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.SocialDetailOuterClass.SocialDetail, emu.grasscutter.net.proto.SocialDetailOuterClass.SocialDetail.Builder, emu.grasscutter.net.proto.SocialDetailOuterClass.SocialDetailOrBuilder>(
                  getDetailData(),
                  getParentForChildren(),
                  isClean());
          detailData_ = null;
        }
        return detailDataBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 6;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:GetPlayerSocialDetailRsp)
    }

    // @@protoc_insertion_point(class_scope:GetPlayerSocialDetailRsp)
    private static final emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp();
    }

    public static emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetPlayerSocialDetailRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetPlayerSocialDetailRsp>() {
      @java.lang.Override
      public GetPlayerSocialDetailRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetPlayerSocialDetailRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetPlayerSocialDetailRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetPlayerSocialDetailRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetPlayerSocialDetailRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetPlayerSocialDetailRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036GetPlayerSocialDetailRsp.proto\032\022Social" +
      "Detail.proto\"O\n\030GetPlayerSocialDetailRsp" +
      "\022\"\n\013detail_data\030\r \001(\0132\r.SocialDetail\022\017\n\007" +
      "retcode\030\006 \001(\005B\033\n\031emu.grasscutter.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.SocialDetailOuterClass.getDescriptor(),
        });
    internal_static_GetPlayerSocialDetailRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetPlayerSocialDetailRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetPlayerSocialDetailRsp_descriptor,
        new java.lang.String[] { "DetailData", "Retcode", });
    emu.grasscutter.net.proto.SocialDetailOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
