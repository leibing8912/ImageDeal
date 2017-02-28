package cn.jianke.imagedeal.imageloader;

import android.content.Context;

import com.bumptech.glide.load.model.GenericLoaderFactory;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;

import java.io.InputStream;

/**
 * @className:CustomImageSizeModelFactory
 * @classDescription: 自定义图片大小工厂
 * @author: leibing
 * @createTime:
 */
public class CustomImageSizeModelFactory implements ModelLoaderFactory<CustomImageSizeModel,
        InputStream> {

    @Override
    public ModelLoader<CustomImageSizeModel, InputStream> build(Context context,
                                                                GenericLoaderFactory factories) {
        return new CustomImageSizeUrlLoader( context );
    }

    @Override
    public void teardown() {

    }
}
