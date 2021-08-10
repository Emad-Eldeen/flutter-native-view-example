package ca.elev8xr.flutter_native_view_example;

import android.content.Context;
import io.flutter.plugin.common.StandardMessageCodec;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;

public class NativeViewFactory extends PlatformViewFactory {

    public NativeViewFactory() {
        super(StandardMessageCodec.INSTANCE);

    }

    @NonNull
    @Override
    @SuppressWarnings("unchecked")
    public PlatformView create(@NonNull Context context, int id, @Nullable Object args) {
        final Map<String, Object> creationParams = (Map<String, Object>) args;
        return new NativeView(context, id, creationParams);
    }
}
