//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: jmes/wasm/v1beta1/genesis.proto

package jmes.wasm.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun model(block: jmes.wasm.v1beta1.ModelKt.Dsl.() -> Unit): jmes.wasm.v1beta1.Genesis.Model =
  jmes.wasm.v1beta1.ModelKt.Dsl._create(jmes.wasm.v1beta1.Genesis.Model.newBuilder()).apply { block() }._build()
object ModelKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: jmes.wasm.v1beta1.Genesis.Model.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: jmes.wasm.v1beta1.Genesis.Model.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): jmes.wasm.v1beta1.Genesis.Model = _builder.build()

    /**
     * <code>bytes key = 1;</code>
     */
    var key: com.google.protobuf.ByteString
      @JvmName("getKey")
      get() = _builder.getKey()
      @JvmName("setKey")
      set(value) {
        _builder.setKey(value)
      }
    /**
     * <code>bytes key = 1;</code>
     */
    fun clearKey() {
      _builder.clearKey()
    }

    /**
     * <code>bytes value = 2;</code>
     */
    var value: com.google.protobuf.ByteString
      @JvmName("getValue")
      get() = _builder.getValue()
      @JvmName("setValue")
      set(value) {
        _builder.setValue(value)
      }
    /**
     * <code>bytes value = 2;</code>
     */
    fun clearValue() {
      _builder.clearValue()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun jmes.wasm.v1beta1.Genesis.Model.copy(block: jmes.wasm.v1beta1.ModelKt.Dsl.() -> Unit): jmes.wasm.v1beta1.Genesis.Model =
  jmes.wasm.v1beta1.ModelKt.Dsl._create(this.toBuilder()).apply { block() }._build()
