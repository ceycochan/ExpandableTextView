package com.nshane.advrecyclerview.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.nshane.advrecyclerview.R;

/**
 * Created by lbl on 2017-9-18.
 */

public class SysInfoVH extends RecyclerView.ViewHolder {


    public TextView mContent;

    public RelativeLayout rl_regular;
    public SysInfoVH(View view) {
        super(view);
        mContent = (TextView) view.findViewById(R.id.tv_sys_info_content);
        rl_regular = (RelativeLayout) view.findViewById(R.id.rl_regular);
    }
}
