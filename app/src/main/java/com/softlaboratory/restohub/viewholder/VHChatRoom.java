package com.softlaboratory.restohub.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.softlaboratory.restohub.R;

public class VHChatRoom extends RecyclerView.ViewHolder {

    //VIEW DECLARATION:
    public LinearLayout container;
    public ImageView profilePic;
    public TextView profileName;
    public TextView lastChat;
    public TextView time;

    public VHChatRoom(@NonNull View itemView) {
        super(itemView);

        //INIT VIEW:
        container = itemView.findViewById(R.id.item_chat_room_container);
        profilePic = itemView.findViewById(R.id.item_chat_room_profilepic);
        profileName = itemView.findViewById(R.id.item_chat_room_profilename);
        lastChat = itemView.findViewById(R.id.item_chat_room_lastchat);
        time = itemView.findViewById(R.id.item_chat_room_time);

    }
}
