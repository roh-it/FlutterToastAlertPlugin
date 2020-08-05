package com.notify.fluttertoastalert;

import android.content.Context;

import io.flutter.embedding.engine.plugins.activity.ActivityAware;

import androidx.annotation.NonNull;

import es.dmoral.toasty.Toasty;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.Registrar;
/** FlutterToastAlertPlugin */
public class FlutterToastAlertPlugin implements FlutterPlugin, MethodCallHandler {
  /// The MethodChannel that will the communication between Flutter and native Android
  ///
  /// This local reference serves to register the plugin with the Flutter Engine and unregister it
  /// when the Flutter Engine is detached from the Activity
  private MethodChannel channel;
  private  Context context;


  @Override
  public void onAttachedToEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    channel = new MethodChannel(flutterPluginBinding.getFlutterEngine().getDartExecutor(), "fluttertoastalert");
    channel.setMethodCallHandler(this);
    context = flutterPluginBinding.getApplicationContext();

  }

  // This static function is optional and equivalent to onAttachedToEngine. It supports the old
  // pre-Flutter-1.12 Android projects. You are encouraged to continue supporting
  // plugin registration via this function while apps migrate to use the new Android APIs
  // post-flutter-1.12 via https://flutter.dev/go/android-project-migration.
  //
  // It is encouraged to share logic between onAttachedToEngine and registerWith to keep
  // them functionally equivalent. Only one of onAttachedToEngine or registerWith will be called
  // depending on the user's project. onAttachedToEngine or registerWith must both be defined
  // in the same class.
  public static void registerWith(Registrar registrar) {
    final MethodChannel channel = new MethodChannel(registrar.messenger(), "fluttertoastalert");
    channel.setMethodCallHandler(new FlutterToastAlertPlugin());
    //context = registrar.activity().getApplication();
  }
  @Override
  public void onMethodCall(@NonNull MethodCall call, @NonNull Result result) {
    if (call.method.equals("showToastAndAlert")) {
      String type = call.argument("type");
      boolean showIcon = call.argument("showIcon");
      int length = call.argument("length");
      final String message = call.argument("android_text");
      switch(type){
        case "Info":{
          Toasty.info(context, message,length,showIcon).show();
          break;
        }
        case "Success":{
          Toasty.success(context, message,length,showIcon).show();
          break;
        }
        case "Error":{
          Toasty.error(context, message,length,showIcon).show();
          break;
        }
        case "Warning":{
          Toasty.warning(context, message,length,showIcon).show();
          break;
        }
        case "Normal":{
          Toasty.normal(context, message,length).show();
          break;
        }
        default:{
          Toasty.normal(context, message,length).show();
          break;
        }
      }

    } else {
      result.notImplemented();
    }
  }

  @Override
  public void onDetachedFromEngine(@NonNull FlutterPluginBinding binding) {
    channel.setMethodCallHandler(null);
  }
}
