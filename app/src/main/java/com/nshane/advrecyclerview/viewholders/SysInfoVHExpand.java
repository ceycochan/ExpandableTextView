package com.nshane.advrecyclerview.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.nshane.advrecyclerview.R;

/**
 * Created by lbl on 2017-9-11.
 */

public class SysInfoVHExpand extends RecyclerView.ViewHolder {

    public TextView mContent;

    public ImageView mIcon;


    public RelativeLayout rl_expand;

    public SysInfoVHExpand(View view) {
        super(view);
        mContent = (TextView) view.findViewById(R.id.etv);
        mIcon = (ImageView) view.findViewById(R.id.iv_sys_info_head);
        rl_expand = (RelativeLayout) view.findViewById(R.id.rl_expand);
    }

}
