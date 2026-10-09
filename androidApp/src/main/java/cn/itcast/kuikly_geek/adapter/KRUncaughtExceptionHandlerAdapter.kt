package cn.itcast.kuikly_geek.adapter

import android.util.Log
import com.tencent.kuikly.core.render.android.adapter.IKRUncaughtExceptionHandlerAdapter
import cn.itcast.kuikly_geek.BuildConfig

object KRUncaughtExceptionHandlerAdapter : IKRUncaughtExceptionHandlerAdapter {

  private const val TAG = "KRExceptionHandler"

  override fun uncaughtException(throwable: Throwable) {
    if (BuildConfig.DEBUG) {
      throw throwable
    } else {
      Log.e(TAG, "KR error: ${throwable.stackTraceToString()}")
    }
  }

}