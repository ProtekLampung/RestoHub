package com.softlaboratory.restohub.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.softlaboratory.restohub.R;
import com.softlaboratory.restohub.model.MChatRoom;
import com.softlaboratory.restohub.viewholder.VHChatRoom;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class AChatRoom extends FirestoreRecyclerAdapter<MChatRoom, VHChatRoom> {

    Context context;

    public AChatRoom(@NonNull FirestoreRecyclerOptions<MChatRoom> options, Context context) {
        super(options);
        this.context = context;
    }

    @Override
    protected void onBindViewHolder(@NonNull VHChatRoom holder, int position, @NonNull MChatRoom model) {

        //SET VIEW:
        Glide.with(context).load(model.getProfilePic()).into(holder.profilePic);
        holder.profileName.setText(model.getProfileName());
        holder.lastChat.setText(model.getLastChat());

        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        holder.time.setText(dateFormat.format(model.getDateTime()));

        holder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @NonNull
    @Override
    public VHChatRoom onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat_room,parent,false);
        return new VHChatRoom(view);
    }
}
