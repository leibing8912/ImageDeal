package cn.jianke.imagedeal.imageloader;

/**
 * @className: CustomImageSizeModelFutureStudio
 * @classDescription: 实现图片自定义大小
 * @author: leibing
 * @createTime: 2016/09/17
 */
public class CustomImageSizeModelFutureStudio implements CustomImageSizeModel {
    // 请求图片url
    String baseImageUrl;

    public CustomImageSizeModelFutureStudio(String baseImageUrl) {
        this.baseImageUrl = baseImageUrl;
    }

    @Override
    public String requestCustomSizeUrl(int width, int height) {
        if (height == 0) {
            return baseImageUrl + "?w=" + width;
        }
        return baseImageUrl + "?w=" + width + "&h=" + height;
    }
}
