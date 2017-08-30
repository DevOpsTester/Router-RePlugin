package com.lzh.replugindemo.action;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import com.lzh.nonview.router.anno.RouterRule;
import com.lzh.nonview.router.route.ActionSupport;

/**
 * host的测试动作路由
 */
@RouterRule("action")
public class HostAction extends ActionSupport {
    @Override
    public void onRouteTrigger(Context context, Bundle bundle) {
        Toast.makeText(context, "Host Action invoked!", Toast.LENGTH_SHORT).show();
    }
}
