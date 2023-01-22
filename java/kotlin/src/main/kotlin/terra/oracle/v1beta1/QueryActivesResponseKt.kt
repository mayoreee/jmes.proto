//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: jmes/oracle/v1beta1/query.proto

package jmes.oracle.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun queryActivesResponse(block: jmes.oracle.v1beta1.QueryActivesResponseKt.Dsl.() -> Unit): jmes.oracle.v1beta1.QueryOuterClass.QueryActivesResponse =
  jmes.oracle.v1beta1.QueryActivesResponseKt.Dsl._create(jmes.oracle.v1beta1.QueryOuterClass.QueryActivesResponse.newBuilder()).apply { block() }._build()
object QueryActivesResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: jmes.oracle.v1beta1.QueryOuterClass.QueryActivesResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: jmes.oracle.v1beta1.QueryOuterClass.QueryActivesResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): jmes.oracle.v1beta1.QueryOuterClass.QueryActivesResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class ActivesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * actives defines a list of the denomination which oracle prices aggreed upon.
     * </pre>
     *
     * <code>repeated string actives = 1;</code>
     * @return A list containing the actives.
     */
    val actives: com.google.protobuf.kotlin.DslList<kotlin.String, ActivesProxy>
      @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getActivesList()
      )
    /**
     * <pre>
     * actives defines a list of the denomination which oracle prices aggreed upon.
     * </pre>
     *
     * <code>repeated string actives = 1;</code>
     * @param value The actives to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addActives")
    fun com.google.protobuf.kotlin.DslList<kotlin.String, ActivesProxy>.add(value: kotlin.String) {
      _builder.addActives(value)
    }
    /**
     * <pre>
     * actives defines a list of the denomination which oracle prices aggreed upon.
     * </pre>
     *
     * <code>repeated string actives = 1;</code>
     * @param value The actives to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignActives")
    operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ActivesProxy>.plusAssign(value: kotlin.String) {
      _builder.addActives(value)
    }
    /**
     * <pre>
     * actives defines a list of the denomination which oracle prices aggreed upon.
     * </pre>
     *
     * <code>repeated string actives = 1;</code>
     * @param values The actives to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllActives")
    fun com.google.protobuf.kotlin.DslList<kotlin.String, ActivesProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllActives(values)
    }
    /**
     * <pre>
     * actives defines a list of the denomination which oracle prices aggreed upon.
     * </pre>
     *
     * <code>repeated string actives = 1;</code>
     * @param values The actives to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllActives")
    operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ActivesProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllActives(values)
    }
    /**
     * <pre>
     * actives defines a list of the denomination which oracle prices aggreed upon.
     * </pre>
     *
     * <code>repeated string actives = 1;</code>
     * @param index The index to set the value at.
     * @param value The actives to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setActives")
    operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ActivesProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setActives(index, value)
    }/**
     * <pre>
     * actives defines a list of the denomination which oracle prices aggreed upon.
     * </pre>
     *
     * <code>repeated string actives = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearActives")
    fun com.google.protobuf.kotlin.DslList<kotlin.String, ActivesProxy>.clear() {
      _builder.clearActives()
    }}
}
@kotlin.jvm.JvmSynthetic
inline fun jmes.oracle.v1beta1.QueryOuterClass.QueryActivesResponse.copy(block: jmes.oracle.v1beta1.QueryActivesResponseKt.Dsl.() -> Unit): jmes.oracle.v1beta1.QueryOuterClass.QueryActivesResponse =
  jmes.oracle.v1beta1.QueryActivesResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
