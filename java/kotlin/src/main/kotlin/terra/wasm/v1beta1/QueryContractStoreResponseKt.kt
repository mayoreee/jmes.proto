//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: jmes/wasm/v1beta1/query.proto

package jmes.wasm.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun queryContractStoreResponse(block: jmes.wasm.v1beta1.QueryContractStoreResponseKt.Dsl.() -> Unit): jmes.wasm.v1beta1.QueryOuterClass.QueryContractStoreResponse =
  jmes.wasm.v1beta1.QueryContractStoreResponseKt.Dsl._create(jmes.wasm.v1beta1.QueryOuterClass.QueryContractStoreResponse.newBuilder()).apply { block() }._build()
object QueryContractStoreResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: jmes.wasm.v1beta1.QueryOuterClass.QueryContractStoreResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: jmes.wasm.v1beta1.QueryOuterClass.QueryContractStoreResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): jmes.wasm.v1beta1.QueryOuterClass.QueryContractStoreResponse = _builder.build()

    /**
     * <code>bytes query_result = 1 [(.gogoproto.casttype) = "encoding/json.RawMessage"];</code>
     */
    var queryResult: com.google.protobuf.ByteString
      @JvmName("getQueryResult")
      get() = _builder.getQueryResult()
      @JvmName("setQueryResult")
      set(value) {
        _builder.setQueryResult(value)
      }
    /**
     * <code>bytes query_result = 1 [(.gogoproto.casttype) = "encoding/json.RawMessage"];</code>
     */
    fun clearQueryResult() {
      _builder.clearQueryResult()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun jmes.wasm.v1beta1.QueryOuterClass.QueryContractStoreResponse.copy(block: jmes.wasm.v1beta1.QueryContractStoreResponseKt.Dsl.() -> Unit): jmes.wasm.v1beta1.QueryOuterClass.QueryContractStoreResponse =
  jmes.wasm.v1beta1.QueryContractStoreResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
