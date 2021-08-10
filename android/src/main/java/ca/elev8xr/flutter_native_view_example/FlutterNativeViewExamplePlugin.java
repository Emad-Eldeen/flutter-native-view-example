package ca.elev8xr.flutter_native_view_example;

import androidx.annotation.NonNull;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.platform.PlatformViewRegistry;

/** FlutterNativeViewExamplePlugin */
public class FlutterNativeViewExamplePlugin implements FlutterPlugin {

  private PlatformViewRegistry registry;

  @Override
  public void onAttachedToEngine(@NonNull FlutterPluginBinding flutterPluginBinding) {
    registry = flutterPluginBinding.getPlatformViewRegistry();
    registry.registerViewFactory("virtual-display", new NativeViewFactory());
  }

  @Override
  public void onDetachedFromEngine(@NonNull FlutterPluginBinding binding) {

  }
}
