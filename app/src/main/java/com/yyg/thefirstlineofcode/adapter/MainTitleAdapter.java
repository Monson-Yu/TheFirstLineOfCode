package com.yyg.thefirstlineofcode.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.yyg.thefirstlineofcode.R;
import com.yyg.thefirstlineofcode.util.Util;

public class MainTitleAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mInflater;

    public MainTitleAdapter(Context context) {
        this.mContext = context;
        this.mInflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return 14;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    static class Holder {
        public TextView tvId, tvContent;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Holder holder = null;
        if (view == null) {
            view = mInflater.inflate(R.layout.layout_main_title_item, null);
            holder = new Holder();
            holder.tvId = view.findViewById(R.id.tv_main_title_id);
            holder.tvContent = view.findViewById(R.id.tv_main_title);
            view.setTag(holder);
        } else {
            holder = (Holder) view.getTag();
        }
        holder.tvId.setText((i + 1));
        holder.tvContent.setText(Util.data[i]);
        return view;
    }
}
