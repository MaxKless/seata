// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: globalBeginRequest.proto

package io.seata.codec.protobuf.generated;

public final class GlobalBeginRequest {
  private GlobalBeginRequest() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_seata_protocol_protobuf_GlobalBeginRequestProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_seata_protocol_protobuf_GlobalBeginRequestProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030globalBeginRequest.proto\022\032io.seata.pro" +
      "tocol.protobuf\032 abstractTransactionReque" +
      "st.proto\"\244\001\n\027GlobalBeginRequestProto\022_\n\032" +
      "abstractTransactionRequest\030\001 \001(\0132;.io.se" +
      "ata.protocol.protobuf.AbstractTransactio" +
      "nRequestProto\022\017\n\007timeout\030\002 \001(\005\022\027\n\017transa" +
      "ctionName\030\003 \001(\tB9\n!io.seata.codec.protob" +
      "uf.generatedB\022GlobalBeginRequestP\001b\006prot" +
      "o3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.seata.codec.protobuf.generated.AbstractTransactionRequest.getDescriptor(),
        }, assigner);
    internal_static_io_seata_protocol_protobuf_GlobalBeginRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_seata_protocol_protobuf_GlobalBeginRequestProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_seata_protocol_protobuf_GlobalBeginRequestProto_descriptor,
        new java.lang.String[] { "AbstractTransactionRequest", "Timeout", "TransactionName", });
    io.seata.codec.protobuf.generated.AbstractTransactionRequest.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}