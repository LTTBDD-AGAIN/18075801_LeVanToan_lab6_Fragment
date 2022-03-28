package com.example.a18075801_levantoan_lab6_fragment.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.a18075801_levantoan_lab6_fragment.R;
import com.example.a18075801_levantoan_lab6_fragment.model.Shoes;

import java.util.List;

public class ShoesAdapter extends BaseAdapter {

    private Context mContext;
    private List<Shoes> mListShoes;
    private int mIdLayout;
    private int positionSelected = -1;

    public ShoesAdapter(Context context, List<Shoes> listShoes, int idLayout){
        this.mContext = context;
        this.mIdLayout = idLayout;
        this.mListShoes = listShoes;
    }
    @Override
    public int getCount() {
        if(mListShoes.size() != 0 && !mListShoes.isEmpty()){
            return mListShoes.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shoes_activity,parent,false);
        }

        ImageView mImgShoes = (ImageView) convertView.findViewById(R.id.imgShoes);
        TextView mTvName = (TextView) convertView.findViewById(R.id.tvNameShoes);
        TextView mTvDescription = (TextView) convertView.findViewById(R.id.tvDescription);
        final LinearLayout mLinearLayout = (LinearLayout) convertView.findViewById(R.id.linearLayout);
        final Shoes shoes = mListShoes.get(position);

        if (mListShoes.size() != 0 && !mListShoes.isEmpty()){
            mTvName.setText(shoes.getName());
            int idShoes = shoes.getId();
            switch (idShoes){
                case 1:
                    mImgShoes.setImageResource(R.drawable.giay_tim);
                    break;
                case 2:
                    mImgShoes.setImageResource(R.drawable.giay_xanhduong);
                    break;
                case 3:
                    mImgShoes.setImageResource(R.drawable.giay_timxanh);
                    break;
                case 4:
                    mImgShoes.setImageResource(R.drawable.giay_do);
                    break;
                case 5:
                    mImgShoes.setImageResource(R.drawable.giay_vang);
                    break;
                case 6:
                    mImgShoes.setImageResource(R.drawable.giay_trang);
                    break;
                case 7:
                    mImgShoes.setImageResource(R.drawable.giay_lonxon);
                    break;
                default:
                    break;
            }
        }

        

        return convertView;
    }
}
