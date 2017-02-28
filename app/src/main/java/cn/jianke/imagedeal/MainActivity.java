package cn.jianke.imagedeal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import cn.jianke.imagedeal.imageloader.ImageLoader;

/**
 * @className:MainActivity
 * @classDescription: 图片处理(获取原始图比例再计算新图高度显示)
 * @author: leibing
 * @createTime: 2017/2/27
 */
public class MainActivity extends AppCompatActivity {
    // 图片地址
    private final static String IMG_REMOTE_URL = "https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1494112507,2283095784&fm=116&gp=0.jpg";
    // 未处理拉伸图
    private ImageView noDealStretchIv;
    // 处理过拉伸图
    private ImageView dealStretchIv;
    // 屏幕宽度
    private int screenWidth = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // findView
        noDealStretchIv = (ImageView) findViewById(R.id.iv_no_deal_stretch);
        dealStretchIv = (ImageView) findViewById(R.id.iv_deal_stretch);
        // 获取屏幕宽度
        WindowManager wm = this.getWindowManager();
        screenWidth = wm.getDefaultDisplay().getWidth();
        // 获取图片宽高
        ImageLoader.getInstance().getImgWidthHeight(this, IMG_REMOTE_URL,
                new ImageLoader.ImageLoaderCallBack() {
            @Override
            public void getImgWidthHeight(int width, int height) {
                System.out.println("ddddddddddddddd originWidth = " + width);
                System.out.println("ddddddddddddddd originHeight = " + height);
                // 处理过拉伸图加载
                ImageLoader.getInstance().load(MainActivity.this,
                        ImageLoader.getInstance().resetImgWidthHeight(dealStretchIv, width,
                                height, screenWidth),
                        IMG_REMOTE_URL);
            }
        });
        // 加载图片
        // 未处理拉伸图加载
//        ImageLoader.getInstance().load(this, noDealStretchIv,
//                ImageLoader.getDrawableSource(this, R.mipmap.ic_launcher));
    }
}
