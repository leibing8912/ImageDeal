package cn.jianke.imagedeal.imageloader;

/**
 * @interfaceName: CustomImageSizeModel
 * @interfaceDescription: 自定义图片大小接口
 * @author: leibing
 * @createTime: 2016/09/17
 */
public interface CustomImageSizeModel {
    String requestCustomSizeUrl(int width, int height);
}
