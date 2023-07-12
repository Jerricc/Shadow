/*
 * Tencent is pleased to support the open source community by making Tencent Shadow available.
 * Copyright (C) 2019 THL A29 Limited, a Tencent company.  All rights reserved.
 *
 * Licensed under the BSD 3-Clause License (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 *     https://opensource.org/licenses/BSD-3-Clause
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.tencent.shadow.sample.plugin.app.lib.gallery.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.tencent.shadow.sample.plugin.app.lib.base.R;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.umverify.UMVerifyHelper;
import com.umeng.umverify.listener.UMPreLoginResultListener;
import com.umeng.umverify.listener.UMTokenResultListener;

public class SplashActivity extends Activity {

    private SplashAnimation mSplashAnimation;
    private UMTokenResultListener dummyListener = new UMTokenResultListener() {
        @Override
        public void onTokenSuccess(String s) {
            Log.e("SplashActivity","onTokenSuccess"+s);
        }

        @Override
        public void onTokenFailed(String s) {
            Log.e("SplashActivity","onTokenFailed"+s);
        }
    };
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_splash);
        UMConfigure.preInit(this,UMENG_KEY,"channel");
        UMConfigure.init(
                this,
                UMENG_KEY,
                "BuildConfig.CHANNEL",
                UMConfigure.DEVICE_TYPE_PHONE,
                UMENG_MSG_KEY
        );
        UMVerifyHelper verify = UMVerifyHelper.getInstance(this, dummyListener);
        verify.accelerateLoginPage(5000, new UMPreLoginResultListener(){

            @Override
            public void onTokenSuccess(String s) {
                Log.e("SplashActivity","onTokenSuccess"+s);

            }

            @Override
            public void onTokenFailed(String s, String s1) {
                Log.e("SplashActivity","onTokenFailed"+s+"---"+s1);

            }
        });
        Log.e("SplashActivity","start");

        verify.setAuthSDKInfo(AUTH_INFO);
        verify.getLoginToken(this,5000);
//        mSplashAnimation = new SplashAnimation(this);
//        mSplashAnimation.start();
//
//
//        mSplashAnimation.setAnimationListener(new ISplashAnimation.AnimationListener() {
//            @Override
//            public void onAnimationEnd() {
//                finish();
//
//                startActivity(new Intent(SplashActivity.this, TestUmengActivity.class));
//            }
//        });
    }
    //TODO UMENG更换测试信息
    String UMENG_KEY = "";
    String AUTH_INFO = "";
    String  UMENG_MSG_KEY = "";
}
