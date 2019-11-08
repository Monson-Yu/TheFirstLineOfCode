package com.yyg.thefirstlineofcode.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.yyg.thefirstlineofcode.R;
import com.yyg.thefirstlineofcode.util.Util;

public class MainTitleAdapter extends BaseAdapter {
    private static final String TAG = "YYG";
    private Context mContext;
    private LayoutInflater mInflater;

    public MainTitleAdapter(Context context) {
        this.mContext = context;
        this.mInflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return 15;
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
//            Log.d(TAG, "holder关联 ");
            holder.tvContent = view.findViewById(R.id.tv_main_title);
            view.setTag(holder);
        } else {
            holder = (Holder) view.getTag();
        }
        String no = i < 9 ? " " + (i + 1) + " " : String.valueOf(i + 1);
        holder.tvId.setText(no);
        holder.tvContent.setText(Util.mTitle[i]);
        return view;
    }
}
