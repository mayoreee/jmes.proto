//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: jmes/oracle/v1beta1/query.proto

package jmes.oracle.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun queryTobinTaxesRequest(block: jmes.oracle.v1beta1.QueryTobinTaxesRequestKt.Dsl.() -> Unit): jmes.oracle.v1beta1.QueryOuterClass.QueryTobinTaxesRequest =
  jmes.oracle.v1beta1.QueryTobinTaxesRequestKt.Dsl._create(jmes.oracle.v1beta1.QueryOuterClass.QueryTobinTaxesRequest.newBuilder()).apply { block() }._build()
object QueryTobinTaxesRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: jmes.oracle.v1beta1.QueryOuterClass.QueryTobinTaxesRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: jmes.oracle.v1beta1.QueryOuterClass.QueryTobinTaxesRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): jmes.oracle.v1beta1.QueryOuterClass.QueryTobinTaxesRequest = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
inline fun jmes.oracle.v1beta1.QueryOuterClass.QueryTobinTaxesRequest.copy(block: jmes.oracle.v1beta1.QueryTobinTaxesRequestKt.Dsl.() -> Unit): jmes.oracle.v1beta1.QueryOuterClass.QueryTobinTaxesRequest =
  jmes.oracle.v1beta1.QueryTobinTaxesRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
