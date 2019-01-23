package com.hotspothome.hotspothome;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class BoardAdapter extends RecyclerView.Adapter<BoardAdapter.MyViewHolder>{

    int img[],imgs[],images[];
    String data1[],data2[],data3 [];
    Context ctx;

    public BoardAdapter(Context ct, String[] s1, String[] s2, String[] s3, int[] ig,int[] imgresource, int[] imgres) {
        ctx = ct;
        img = ig;
        imgs=imgresource;
        images=imgres;
        data1=s1;
        data2=s2;
        data3=s3;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View MyOwnView= LayoutInflater.from(ctx).inflate(R.layout.boardlist,viewGroup,false);
        return new MyViewHolder(MyOwnView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.myimage1.setImageResource(img[i]);
        myViewHolder.myimage2.setImageResource(img[i]);
        myViewHolder.myimage3.setImageResource(img[i]);
        myViewHolder.t1.setText(data1[i]);
        myViewHolder.t2.setText(data2[i]);
        myViewHolder.t3.setText(data3[i]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView t1,t3,t2;
        ImageView myimage1,myimage2,myimage3;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            t1=(TextView)itemView.findViewById(R.id.btv1);
            t2=(TextView)itemView.findViewById(R.id.btv2);
            t3=(TextView)itemView.findViewById(R.id.btv3);
            myimage1=(ImageView)itemView.findViewById(R.id.b1);
            myimage2=(ImageView)itemView.findViewById(R.id.b2);
            myimage3=(ImageView)itemView.findViewById(R.id.b3);
        }
    }
}
