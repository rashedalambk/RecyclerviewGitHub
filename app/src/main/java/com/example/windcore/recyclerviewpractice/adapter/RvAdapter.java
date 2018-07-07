package com.example.windcore.recyclerviewpractice.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.windcore.recyclerviewpractice.R;
import com.example.windcore.recyclerviewpractice.model.Message;

import java.util.List;

/**
 * Created by Wind Core on 4/10/2018.
 */

//TODO (6) extends to RecyclerView.Adapter
                                                   //Inner class of viewholder
public class RvAdapter extends RecyclerView.Adapter<RvAdapter.MessageVH> {
    private Context context;
    private List<Message> messageList;

    public RvAdapter(Context context, List messageList){
        this.context = context;
        this.messageList = messageList;
    }

    @Override
    public MessageVH onCreateViewHolder(ViewGroup parent, int viewType) {
       View messageItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.messagervitem, parent, false);
        return new MessageVH(messageItem);
        // We inflate the view (i.e. show it) and then pass that view to the viewholder inner class
    }

    @Override
    public void onBindViewHolder(MessageVH holder, int position) {// holder is passed in from the inner class
        // position is the item in the RV
        holder.messageBody.setText(messageList.get(position).getMessageBody());
        holder.messageTitle.setText(messageList.get(position).getMessageTitle());
    }

    @Override
    public int getItemCount() {
        return messageList.size();
    }

    //TODO(7) Add View holder inner class

    // Viewholder represents the different component of Item.
    public class MessageVH extends RecyclerView.ViewHolder{

        public TextView messageTitle;
        public TextView messageBody;
        public MessageVH(View itemView) { // The view is pass by the onCreateViewHolder which is a
                                        // representation of the item xml

            super(itemView);
            messageTitle = (TextView) itemView.findViewById(R.id.tv_message_title);
            messageBody = (TextView) itemView.findViewById(R.id.tv_message_body);
        }
    }
}
