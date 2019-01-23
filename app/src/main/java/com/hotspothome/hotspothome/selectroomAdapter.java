package com.hotspothome.hotspothome;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class selectroomAdapter extends RecyclerView.Adapter<selectroomAdapter.MyOwnHolder> {
    @NonNull
    int img[],imgs[],images[];
    String data1[],data2[],data3 [];
    Context ctx;

    public selectroomAdapter(Context ct, String[] s1, String[] s2, String[] s3, int[] ig,int[] imgresource, int[] imgres) {
        ctx = ct;
        img = ig;
        imgs=imgresource;
        images=imgres;
        data1=s1;
        data2=s2;
        data3=s3;
    }

    @NonNull
    @Override
    public selectroomAdapter.MyOwnHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View MyOwnView= LayoutInflater.from(ctx).inflate(R.layout.roomlist,viewGroup,false);
        return new MyOwnHolder(MyOwnView);
    }

    @Override
    public void onBindViewHolder(@NonNull selectroomAdapter.MyOwnHolder myOwnHolder, int i) {
        myOwnHolder.myimage1.setImageResource(img[i]);
        myOwnHolder.myimage2.setImageResource(img[i]);
        myOwnHolder.myimage3.setImageResource(img[i]);
        myOwnHolder.t1.setText(data1[i]);
        myOwnHolder.t2.setText(data2[i]);
        myOwnHolder.t3.setText(data3[i]);
    }

    @Override
    public int getItemCount() {return data1.length;}

        public class MyOwnHolder extends RecyclerView.ViewHolder {
            TextView t1,t3,t2;
            ImageView myimage1,myimage2,myimage3;
            public MyOwnHolder(View itemView) {
                super(itemView);
                t1=(TextView)itemView.findViewById(R.id.tv1);
                t2=(TextView)itemView.findViewById(R.id.tv2);
                t3=(TextView)itemView.findViewById(R.id.tv3);
                myimage1=(ImageView)itemView.findViewById(R.id.iv1);
                myimage2=(ImageView)itemView.findViewById(R.id.iv2);
                myimage3=(ImageView)itemView.findViewById(R.id.iv3);
            }

    }
}