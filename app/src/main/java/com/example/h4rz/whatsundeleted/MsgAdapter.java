package com.example.h4rz.whatsundeleted;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MsgAdapter extends RecyclerView.Adapter<MsgAdapter.MyViewHolder> {

    private List<MsgInfo> msgList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView date, name, msg;

        public MyViewHolder(View view) {
            super(view);
            date = (TextView) view.findViewById(R.id.date);
            msg = (TextView) view.findViewById(R.id.msg);
            name = (TextView) view.findViewById(R.id.name);
        }
    }


    public MsgAdapter(List<MsgInfo> msgList) {
        this.msgList = msgList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.msg_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MsgInfo msg = msgList.get(position);
        holder.date.setText(msg.getDate());
        holder.msg.setText(msg.getMsg());
        holder.name.setText(msg.getName());
    }

    @Override
    public int getItemCount() {
        return msgList.size();
    }
}