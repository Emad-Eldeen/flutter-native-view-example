
import 'dart:async';

import 'package:flutter/services.dart';

class FlutterNativeViewExample {
  static const MethodChannel _channel =
      const MethodChannel('flutter_native_view_example');

  static Future<String?> get platformVersion async {
    final String? version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }
}
