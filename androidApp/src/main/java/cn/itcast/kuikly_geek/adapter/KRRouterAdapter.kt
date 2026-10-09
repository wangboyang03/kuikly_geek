package cn.itcast.kuikly_geek.adapter

import android.app.Activity
import android.content.Context
import com.tencent.kuikly.core.render.android.adapter.IKRRouterAdapter
import cn.itcast.kuikly_geek.KuiklyRenderActivity
import org.json.JSONObject

object KRRouterAdapter : IKRRouterAdapter {

  override fun openPage(
    context: Context,
    pageName: String,
    pageData: JSONObject,
  ) {
    KuiklyRenderActivity.start(context, pageName, pageData)
  }

  override fun closePage(context: Context) {
    (context as? Activity)?.finish()
  }
}