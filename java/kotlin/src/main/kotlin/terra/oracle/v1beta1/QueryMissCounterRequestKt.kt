//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: jmes/oracle/v1beta1/query.proto

package jmes.oracle.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun queryMissCounterRequest(block: jmes.oracle.v1beta1.QueryMissCounterRequestKt.Dsl.() -> Unit): jmes.oracle.v1beta1.QueryOuterClass.QueryMissCounterRequest =
  jmes.oracle.v1beta1.QueryMissCounterRequestKt.Dsl._create(jmes.oracle.v1beta1.QueryOuterClass.QueryMissCounterRequest.newBuilder()).apply { block() }._build()
object QueryMissCounterRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: jmes.oracle.v1beta1.QueryOuterClass.QueryMissCounterRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: jmes.oracle.v1beta1.QueryOuterClass.QueryMissCounterRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): jmes.oracle.v1beta1.QueryOuterClass.QueryMissCounterRequest = _builder.build()

    /**
     * <pre>
     * validator defines the validator address to query for.
     * </pre>
     *
     * <code>string validator_addr = 1;</code>
     */
    var validatorAddr: kotlin.String
      @JvmName("getValidatorAddr")
      get() = _builder.getValidatorAddr()
      @JvmName("setValidatorAddr")
      set(value) {
        _builder.setValidatorAddr(value)
      }
    /**
     * <pre>
     * validator defines the validator address to query for.
     * </pre>
     *
     * <code>string validator_addr = 1;</code>
     */
    fun clearValidatorAddr() {
      _builder.clearValidatorAddr()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun jmes.oracle.v1beta1.QueryOuterClass.QueryMissCounterRequest.copy(block: jmes.oracle.v1beta1.QueryMissCounterRequestKt.Dsl.() -> Unit): jmes.oracle.v1beta1.QueryOuterClass.QueryMissCounterRequest =
  jmes.oracle.v1beta1.QueryMissCounterRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
