//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: jmes/wasm/v1beta1/query.proto

package jmes.wasm.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun queryRawStoreRequest(block: jmes.wasm.v1beta1.QueryRawStoreRequestKt.Dsl.() -> Unit): jmes.wasm.v1beta1.QueryOuterClass.QueryRawStoreRequest =
  jmes.wasm.v1beta1.QueryRawStoreRequestKt.Dsl._create(jmes.wasm.v1beta1.QueryOuterClass.QueryRawStoreRequest.newBuilder()).apply { block() }._build()
object QueryRawStoreRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: jmes.wasm.v1beta1.QueryOuterClass.QueryRawStoreRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: jmes.wasm.v1beta1.QueryOuterClass.QueryRawStoreRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): jmes.wasm.v1beta1.QueryOuterClass.QueryRawStoreRequest = _builder.build()

    /**
     * <code>string contract_address = 1;</code>
     */
    var contractAddress: kotlin.String
      @JvmName("getContractAddress")
      get() = _builder.getContractAddress()
      @JvmName("setContractAddress")
      set(value) {
        _builder.setContractAddress(value)
      }
    /**
     * <code>string contract_address = 1;</code>
     */
    fun clearContractAddress() {
      _builder.clearContractAddress()
    }

    /**
     * <code>bytes key = 2;</code>
     */
    var key: com.google.protobuf.ByteString
      @JvmName("getKey")
      get() = _builder.getKey()
      @JvmName("setKey")
      set(value) {
        _builder.setKey(value)
      }
    /**
     * <code>bytes key = 2;</code>
     */
    fun clearKey() {
      _builder.clearKey()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun jmes.wasm.v1beta1.QueryOuterClass.QueryRawStoreRequest.copy(block: jmes.wasm.v1beta1.QueryRawStoreRequestKt.Dsl.() -> Unit): jmes.wasm.v1beta1.QueryOuterClass.QueryRawStoreRequest =
  jmes.wasm.v1beta1.QueryRawStoreRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
