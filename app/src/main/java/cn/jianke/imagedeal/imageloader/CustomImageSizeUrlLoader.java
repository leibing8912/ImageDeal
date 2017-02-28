package cn.jianke.imagedeal.imageloader;

import android.content.Context;

import com.bumptech.glide.load.model.stream.BaseGlideUrlLoader;

/**
 * @className: CustomImageSizeUrlLoader
 * @classDescription: 自定义图片大小Url加载器
 * @author: leibing
 * @createTime:
 */
public class CustomImageSizeUrlLoader extends BaseGlideUrlLoader<CustomImageSizeModel> {
    public CustomImageSizeUrlLoader(Context context) {
        super(context);
    }

    @Override
    protected String getUrl(CustomImageSizeModel model, int width, int height) {
        return model.requestCustomSizeUrl( width, height );
    }
}
