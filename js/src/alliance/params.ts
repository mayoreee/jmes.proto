/* eslint-disable */
import Long from "long";
import _m0 from "protobufjs/minimal";
import { Duration } from "../google/protobuf/duration";
import { Timestamp } from "../google/protobuf/timestamp";

export const protobufPackage = "alliance";

export interface Params {
  rewardDelayTime?: Duration;
  /** Time interval between consecutive applications of `take_rate` */
  takeRateClaimInterval?: Duration;
  /** Last application of `take_rate` on assets */
  lastTakeRateClaimTime?: Date;
}

export interface RewardHistory {
  denom: string;
  index: string;
}

const baseParams: object = {};

export const Params = {
  encode(message: Params, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.rewardDelayTime !== undefined) {
      Duration.encode(message.rewardDelayTime, writer.uint32(10).fork()).ldelim();
    }
    if (message.takeRateClaimInterval !== undefined) {
      Duration.encode(message.takeRateClaimInterval, writer.uint32(18).fork()).ldelim();
    }
    if (message.lastTakeRateClaimTime !== undefined) {
      Timestamp.encode(toTimestamp(message.lastTakeRateClaimTime), writer.uint32(26).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): Params {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseParams } as Params;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.rewardDelayTime = Duration.decode(reader, reader.uint32());
          break;
        case 2:
          message.takeRateClaimInterval = Duration.decode(reader, reader.uint32());
          break;
        case 3:
          message.lastTakeRateClaimTime = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): Params {
    const message = { ...baseParams } as Params;
    if (object.rewardDelayTime !== undefined && object.rewardDelayTime !== null) {
      message.rewardDelayTime = Duration.fromJSON(object.rewardDelayTime);
    } else {
      message.rewardDelayTime = undefined;
    }
    if (object.takeRateClaimInterval !== undefined && object.takeRateClaimInterval !== null) {
      message.takeRateClaimInterval = Duration.fromJSON(object.takeRateClaimInterval);
    } else {
      message.takeRateClaimInterval = undefined;
    }
    if (object.lastTakeRateClaimTime !== undefined && object.lastTakeRateClaimTime !== null) {
      message.lastTakeRateClaimTime = fromJsonTimestamp(object.lastTakeRateClaimTime);
    } else {
      message.lastTakeRateClaimTime = undefined;
    }
    return message;
  },

  toJSON(message: Params): unknown {
    const obj: any = {};
    message.rewardDelayTime !== undefined &&
      (obj.rewardDelayTime = message.rewardDelayTime ? Duration.toJSON(message.rewardDelayTime) : undefined);
    message.takeRateClaimInterval !== undefined &&
      (obj.takeRateClaimInterval = message.takeRateClaimInterval
        ? Duration.toJSON(message.takeRateClaimInterval)
        : undefined);
    message.lastTakeRateClaimTime !== undefined &&
      (obj.lastTakeRateClaimTime = message.lastTakeRateClaimTime.toISOString());
    return obj;
  },

  fromPartial(object: DeepPartial<Params>): Params {
    const message = { ...baseParams } as Params;
    if (object.rewardDelayTime !== undefined && object.rewardDelayTime !== null) {
      message.rewardDelayTime = Duration.fromPartial(object.rewardDelayTime);
    } else {
      message.rewardDelayTime = undefined;
    }
    if (object.takeRateClaimInterval !== undefined && object.takeRateClaimInterval !== null) {
      message.takeRateClaimInterval = Duration.fromPartial(object.takeRateClaimInterval);
    } else {
      message.takeRateClaimInterval = undefined;
    }
    if (object.lastTakeRateClaimTime !== undefined && object.lastTakeRateClaimTime !== null) {
      message.lastTakeRateClaimTime = object.lastTakeRateClaimTime;
    } else {
      message.lastTakeRateClaimTime = undefined;
    }
    return message;
  },
};

const baseRewardHistory: object = { denom: "", index: "" };

export const RewardHistory = {
  encode(message: RewardHistory, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.denom !== "") {
      writer.uint32(10).string(message.denom);
    }
    if (message.index !== "") {
      writer.uint32(18).string(message.index);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): RewardHistory {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseRewardHistory } as RewardHistory;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.denom = reader.string();
          break;
        case 2:
          message.index = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): RewardHistory {
    const message = { ...baseRewardHistory } as RewardHistory;
    if (object.denom !== undefined && object.denom !== null) {
      message.denom = String(object.denom);
    } else {
      message.denom = "";
    }
    if (object.index !== undefined && object.index !== null) {
      message.index = String(object.index);
    } else {
      message.index = "";
    }
    return message;
  },

  toJSON(message: RewardHistory): unknown {
    const obj: any = {};
    message.denom !== undefined && (obj.denom = message.denom);
    message.index !== undefined && (obj.index = message.index);
    return obj;
  },

  fromPartial(object: DeepPartial<RewardHistory>): RewardHistory {
    const message = { ...baseRewardHistory } as RewardHistory;
    if (object.denom !== undefined && object.denom !== null) {
      message.denom = object.denom;
    } else {
      message.denom = "";
    }
    if (object.index !== undefined && object.index !== null) {
      message.index = object.index;
    } else {
      message.index = "";
    }
    return message;
  },
};

type Builtin = Date | Function | Uint8Array | string | number | boolean | undefined | Long;
export type DeepPartial<T> = T extends Builtin
  ? T
  : T extends Array<infer U>
  ? Array<DeepPartial<U>>
  : T extends ReadonlyArray<infer U>
  ? ReadonlyArray<DeepPartial<U>>
  : T extends {}
  ? { [K in keyof T]?: DeepPartial<T[K]> }
  : Partial<T>;

function toTimestamp(date: Date): Timestamp {
  const seconds = numberToLong(date.getTime() / 1_000);
  const nanos = (date.getTime() % 1_000) * 1_000_000;
  return { seconds, nanos };
}

function fromTimestamp(t: Timestamp): Date {
  let millis = t.seconds.toNumber() * 1_000;
  millis += t.nanos / 1_000_000;
  return new Date(millis);
}

function fromJsonTimestamp(o: any): Date {
  if (o instanceof Date) {
    return o;
  } else if (typeof o === "string") {
    return new Date(o);
  } else {
    return fromTimestamp(Timestamp.fromJSON(o));
  }
}

function numberToLong(number: number) {
  return Long.fromNumber(number);
}

if (_m0.util.Long !== Long) {
  _m0.util.Long = Long as any;
  _m0.configure();
}
