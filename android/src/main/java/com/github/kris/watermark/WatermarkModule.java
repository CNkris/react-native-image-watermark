package com.github.kris.watermark;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;


import javax.annotation.Nonnull;

public class WatermarkModule extends ReactContextBaseJavaModule{

    public WatermarkModule(@Nonnull ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "ImageWatermark";
    }

    @ReactMethod
    public void addWatermark(ReadableMap params, Callback callback) {
        String srcImg = params.getString("src");
        String watermarkStr = params.getString("watermarkStr");
        String location = params.getString("location");
        //这里补充图片加水印的方法

        //返回加水印后的图片Base64
        String distImg = "";
        callback.invoke(distImg);
    }



    }
