package com.xiaoxing.xbanner;

import android.content.Context;
import android.view.View;

import com.stx.xhb.xbanner.XBanner;
import com.xiaoxing.glideutil.GlideUtil;

import java.util.List;

import templatetest.xiaoxing.com.xbanner.R;


/**
 * 描述：banner
 * 作者：xiaoxing on 17/5/8 22:39
 * 邮箱：2235445233@qq.com
 */
public class XBannerUtil<T extends String, Integer> implements XBanner.XBannerAdapter {
    private Context mContext;
    private List<T> mImgesUrl;
    private XBanner mXBanner;

    public XBannerUtil(Context mContext, List<T> mImgesUrl, XBanner mXBanner) {

        this.mContext = mContext;
        this.mImgesUrl = mImgesUrl;
        this.mXBanner = mXBanner;

        initXBanner();
    }

    /**
     * 初始化轮播图
     */

    private void initXBanner() {

        //添加广告数据
        mXBanner.setData(mImgesUrl, null);//第二个参数为提示文字资源集合
        mXBanner.setmAdapter(this);
    }

    @Override
    public void loadBanner(XBanner banner, Object model, View view, int position) {

        GlideUtil.displayImg(mContext, mImgesUrl.get(position), view, R.drawable.icon_mo_ren);
    }
}
