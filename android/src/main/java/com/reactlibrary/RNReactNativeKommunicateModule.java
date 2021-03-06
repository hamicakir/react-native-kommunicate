
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import ReactNativeKommunicate;

public class RNReactNativeKommunicateModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNReactNativeKommunicateModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNReactNativeKommunicate";
  }

  @ReactMethod
  public static initMessaging(context, APP_ID) {
      ReactNativeKommunicate.initMessaging(context, APP_ID)
  }
}