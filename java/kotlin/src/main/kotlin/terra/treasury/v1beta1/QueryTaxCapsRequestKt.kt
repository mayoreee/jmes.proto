//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: jmes/treasury/v1beta1/query.proto

package jmes.treasury.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun queryTaxCapsRequest(block: jmes.treasury.v1beta1.QueryTaxCapsRequestKt.Dsl.() -> Unit): jmes.treasury.v1beta1.QueryOuterClass.QueryTaxCapsRequest =
  jmes.treasury.v1beta1.QueryTaxCapsRequestKt.Dsl._create(jmes.treasury.v1beta1.QueryOuterClass.QueryTaxCapsRequest.newBuilder()).apply { block() }._build()
object QueryTaxCapsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: jmes.treasury.v1beta1.QueryOuterClass.QueryTaxCapsRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: jmes.treasury.v1beta1.QueryOuterClass.QueryTaxCapsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): jmes.treasury.v1beta1.QueryOuterClass.QueryTaxCapsRequest = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
inline fun jmes.treasury.v1beta1.QueryOuterClass.QueryTaxCapsRequest.copy(block: jmes.treasury.v1beta1.QueryTaxCapsRequestKt.Dsl.() -> Unit): jmes.treasury.v1beta1.QueryOuterClass.QueryTaxCapsRequest =
  jmes.treasury.v1beta1.QueryTaxCapsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
