package com.example.buglytest.hotfix;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * 类描述： 自定义Application.
 * <p>
 * 注意：这个类集成TinkerApplication类，这里面不做任何操作，所有Application的代码都会放到ApplicationLike继承类当中<br/>
 * <pre>
 *  参数解析：
 *  参数1：int tinkerFlags 表示Tinker支持的类型 dex only、library only or all suuport，default: TINKER_ENABLE_ALL
 *  参数2：String delegateClassName Application代理类 这里填写你自定义的ApplicationLike
 *  参数3：String loaderClassName  Tinker的加载器，使用默认即可
 *  参数4：boolean tinkerLoadVerifyFlag  加载dex或者lib是否验证md5，默认为false
 *  </pre>
 * <p>
 * 创建人：吴冬冬<br/>
 * 创建时间：2019/12/4 19:49 <br/>
 */
public class SampleApplication extends TinkerApplication {
    public SampleApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.example.buglytest.hotfix.SampleApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}