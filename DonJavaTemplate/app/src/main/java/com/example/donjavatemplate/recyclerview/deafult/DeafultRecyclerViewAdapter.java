package com.example.donjavatemplate.recyclerview.deafult;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.donjavatemplate.R;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class DeafultRecyclerViewAdapter extends RecyclerView.Adapter<DeafultRecyclerViewAdapter.DeafultViewHolder> {

    private ArrayList<String> mList;

    private Context mContext;

    public DeafultRecyclerViewAdapter(Context context) {
        this.mContext = context;
    }

    public void setData(ArrayList<String> data) {
        this.mList = data;
    }


    //ViewHolder가 초기화 될 때 혹은 ViewHolder를 초기화 할 때 실행되는 메서드
    @Override
    public DeafultRecyclerViewAdapter.DeafultViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_deafult_recyclerview, viewGroup, false);
        return new DeafultRecyclerViewAdapter.DeafultViewHolder(v);
    }

    //RecyclerView의 Row 하나하나를 구현하기위해 Bind(묶이다) 될 때
    @Override
    public void onBindViewHolder(DeafultRecyclerViewAdapter.DeafultViewHolder holder, int position) {

        holder.tv_deafult_recyclerview_item.setText(mList.get(position));
        holder.rl_deafult_recyclerview_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(mContext, mList.get(position), Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Glide.with(mContext)
//                    .applyDefaultRequestOptions(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE).skipMemoryCache(true))
                .load(mList.get(position)) // 어떤 데이터로 올지 모름
                .error(R.drawable.ic_launcher_background)
                .into(holder.iv_deafult_recyclerview_item);


    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class DeafultViewHolder extends RecyclerView.ViewHolder {

        public RelativeLayout rl_deafult_recyclerview_item;

        public ImageView iv_deafult_recyclerview_item;

        public TextView tv_deafult_recyclerview_item;

        //ViewHolder 생성
        public DeafultViewHolder(View itemView) {
            super(itemView);

            rl_deafult_recyclerview_item = (RelativeLayout) itemView.findViewById(R.id.rl_deafult_recyclerview_item);

            iv_deafult_recyclerview_item = (ImageView) itemView.findViewById(R.id.iv_deafult_recyclerview_item);

            tv_deafult_recyclerview_item = (TextView) itemView.findViewById(R.id.tv_deafult_recyclerview_item);


        }
    }

}
