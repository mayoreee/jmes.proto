//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: jmes/oracle/v1beta1/query.proto

package jmes.oracle.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun queryTobinTaxesResponse(block: jmes.oracle.v1beta1.QueryTobinTaxesResponseKt.Dsl.() -> Unit): jmes.oracle.v1beta1.QueryOuterClass.QueryTobinTaxesResponse =
  jmes.oracle.v1beta1.QueryTobinTaxesResponseKt.Dsl._create(jmes.oracle.v1beta1.QueryOuterClass.QueryTobinTaxesResponse.newBuilder()).apply { block() }._build()
object QueryTobinTaxesResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: jmes.oracle.v1beta1.QueryOuterClass.QueryTobinTaxesResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: jmes.oracle.v1beta1.QueryOuterClass.QueryTobinTaxesResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): jmes.oracle.v1beta1.QueryOuterClass.QueryTobinTaxesResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class TobinTaxesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * tobin_taxes defines a list of the tobin tax of all whitelisted denoms
     * </pre>
     *
     * <code>repeated .jmes.oracle.v1beta1.Denom tobin_taxes = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tobin_taxes&#92;"", (.gogoproto.castrepeated) = "DenomList"];</code>
     */
     val tobinTaxes: com.google.protobuf.kotlin.DslList<jmes.oracle.v1beta1.Oracle.Denom, TobinTaxesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getTobinTaxesList()
      )
    /**
     * <pre>
     * tobin_taxes defines a list of the tobin tax of all whitelisted denoms
     * </pre>
     *
     * <code>repeated .jmes.oracle.v1beta1.Denom tobin_taxes = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tobin_taxes&#92;"", (.gogoproto.castrepeated) = "DenomList"];</code>
     * @param value The tobinTaxes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addTobinTaxes")
    fun com.google.protobuf.kotlin.DslList<jmes.oracle.v1beta1.Oracle.Denom, TobinTaxesProxy>.add(value: jmes.oracle.v1beta1.Oracle.Denom) {
      _builder.addTobinTaxes(value)
    }/**
     * <pre>
     * tobin_taxes defines a list of the tobin tax of all whitelisted denoms
     * </pre>
     *
     * <code>repeated .jmes.oracle.v1beta1.Denom tobin_taxes = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tobin_taxes&#92;"", (.gogoproto.castrepeated) = "DenomList"];</code>
     * @param value The tobinTaxes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignTobinTaxes")
    inline operator fun com.google.protobuf.kotlin.DslList<jmes.oracle.v1beta1.Oracle.Denom, TobinTaxesProxy>.plusAssign(value: jmes.oracle.v1beta1.Oracle.Denom) {
      add(value)
    }/**
     * <pre>
     * tobin_taxes defines a list of the tobin tax of all whitelisted denoms
     * </pre>
     *
     * <code>repeated .jmes.oracle.v1beta1.Denom tobin_taxes = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tobin_taxes&#92;"", (.gogoproto.castrepeated) = "DenomList"];</code>
     * @param values The tobinTaxes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllTobinTaxes")
    fun com.google.protobuf.kotlin.DslList<jmes.oracle.v1beta1.Oracle.Denom, TobinTaxesProxy>.addAll(values: kotlin.collections.Iterable<jmes.oracle.v1beta1.Oracle.Denom>) {
      _builder.addAllTobinTaxes(values)
    }/**
     * <pre>
     * tobin_taxes defines a list of the tobin tax of all whitelisted denoms
     * </pre>
     *
     * <code>repeated .jmes.oracle.v1beta1.Denom tobin_taxes = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tobin_taxes&#92;"", (.gogoproto.castrepeated) = "DenomList"];</code>
     * @param values The tobinTaxes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllTobinTaxes")
    inline operator fun com.google.protobuf.kotlin.DslList<jmes.oracle.v1beta1.Oracle.Denom, TobinTaxesProxy>.plusAssign(values: kotlin.collections.Iterable<jmes.oracle.v1beta1.Oracle.Denom>) {
      addAll(values)
    }/**
     * <pre>
     * tobin_taxes defines a list of the tobin tax of all whitelisted denoms
     * </pre>
     *
     * <code>repeated .jmes.oracle.v1beta1.Denom tobin_taxes = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tobin_taxes&#92;"", (.gogoproto.castrepeated) = "DenomList"];</code>
     * @param index The index to set the value at.
     * @param value The tobinTaxes to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setTobinTaxes")
    operator fun com.google.protobuf.kotlin.DslList<jmes.oracle.v1beta1.Oracle.Denom, TobinTaxesProxy>.set(index: kotlin.Int, value: jmes.oracle.v1beta1.Oracle.Denom) {
      _builder.setTobinTaxes(index, value)
    }/**
     * <pre>
     * tobin_taxes defines a list of the tobin tax of all whitelisted denoms
     * </pre>
     *
     * <code>repeated .jmes.oracle.v1beta1.Denom tobin_taxes = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tobin_taxes&#92;"", (.gogoproto.castrepeated) = "DenomList"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearTobinTaxes")
    fun com.google.protobuf.kotlin.DslList<jmes.oracle.v1beta1.Oracle.Denom, TobinTaxesProxy>.clear() {
      _builder.clearTobinTaxes()
    }}
}
@kotlin.jvm.JvmSynthetic
inline fun jmes.oracle.v1beta1.QueryOuterClass.QueryTobinTaxesResponse.copy(block: jmes.oracle.v1beta1.QueryTobinTaxesResponseKt.Dsl.() -> Unit): jmes.oracle.v1beta1.QueryOuterClass.QueryTobinTaxesResponse =
  jmes.oracle.v1beta1.QueryTobinTaxesResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
