package com.nshane.advrecyclerview.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.nshane.advrecyclerview.R;
import com.nshane.advrecyclerview.viewholders.SysInfoVH;
import com.nshane.advrecyclerview.viewholders.SysInfoVHExpand;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lbl on 2017-9-11.
 */

public class SysInfoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    public static enum ITEM_TYPE {
        ITEM_TYPE_REGULAR,
        ITEM_TYPE_EXPAND
    }


    private List<String> mList = new ArrayList<>();


    private Context mContext;

    public SysInfoAdapter(List<String> list, Context context) {
        this.mList = list;
        this.mContext = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if (viewType == ITEM_TYPE.ITEM_TYPE_REGULAR.ordinal()) {
            return new SysInfoVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sys_info_regular, parent, false));
        } else {
            return new SysInfoVHExpand(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sys_info_expand, parent, false));
        }


    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof SysInfoVH) {
            ((SysInfoVH) holder).mContent.setText(mList.get(position));
            ((SysInfoVH) holder).rl_regular.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext, "老子可以跳转", Toast.LENGTH_SHORT).show();
                }
            });

        } else {
            final ImageView mIcon = ((SysInfoVHExpand) holder).mIcon;  // config. of
            ((SysInfoVHExpand) holder).mContent.setText(mList.get(position));
            ((SysInfoVHExpand) holder).rl_expand.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext, "老子可以展开", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }


    @Override
    public int getItemCount() {  // count of  items
        return mList.size();
    }


    @Override
    public int getItemViewType(int position) {  //config various rv layout
        return position % 2 == 0 ? ITEM_TYPE.ITEM_TYPE_REGULAR.ordinal() : ITEM_TYPE.ITEM_TYPE_EXPAND.ordinal();
    }


}


