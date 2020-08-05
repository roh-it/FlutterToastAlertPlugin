import 'dart:async';

import 'package:flutter/services.dart';

enum Type {
  Info,
  Success,
  Warning,
  Error,
  Normal
}
class FlutterToastAlert {
  static const MethodChannel _channel =
      const MethodChannel('fluttertoastalert');

  static Future<dynamic> showToastAndAlert({Type type, String iosTitle, String iosSubtitle,String androidToast, int toastDuration, bool toastShowIcon}) async {
    await _channel.invokeMethod('showToastAndAlert',<String,dynamic>{
      'type': type.toString().split('.').last ?? " ",
      'ios_title':iosTitle ?? " ",
      'ios_subtitle':iosSubtitle ?? " ",
      'android_text': androidToast ?? " ",
      'length': toastDuration ?? " ",
      'showIcon': toastShowIcon ?? false
    });
  }

  static Future get platformVersion async{
    await  platformVersion;
  }
}
