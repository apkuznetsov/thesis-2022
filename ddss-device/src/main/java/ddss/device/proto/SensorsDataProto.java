// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources/sensors-data.proto

package ddss.device.proto;

public final class SensorsDataProto {
  private SensorsDataProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SensorsData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SensorsData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034resources/sensors-data.proto\"R\n\013Sensor" +
      "sData\022\027\n\017degrees_celsius\030\001 \001(\005\022\017\n\007pascal" +
      "s\030\002 \001(\005\022\031\n\021meters_per_second\030\003 \001(\005B\'\n\021dd" +
      "ss.device.protoB\020SensorsDataProtoP\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SensorsData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SensorsData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SensorsData_descriptor,
        new java.lang.String[] { "DegreesCelsius", "Pascals", "MetersPerSecond", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
