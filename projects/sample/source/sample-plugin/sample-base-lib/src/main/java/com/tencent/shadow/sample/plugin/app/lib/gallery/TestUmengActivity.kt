package com.tencent.shadow.sample.plugin.app.lib.gallery

import android.app.Activity
import android.os.Bundle
import com.umeng.umverify.UMVerifyHelper
import com.umeng.umverify.listener.UMTokenResultListener

class TestUmengActivity: Activity() {
    private val dummyListener = object : UMTokenResultListener {
        override fun onTokenSuccess(p0: String?) = Unit

        override fun onTokenFailed(p0: String?) = Unit
    }

    private val umVerifyHelper by lazy {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}