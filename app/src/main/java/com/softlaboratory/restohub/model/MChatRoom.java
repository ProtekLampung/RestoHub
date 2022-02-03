package com.softlaboratory.restohub.model;

import com.google.firebase.firestore.ServerTimestamp;

import java.util.Date;

public class MChatRoom {

    //ATTRIBUT:
    private String keyChatRoom;
    private String profilePic;
    private String profileName;
    private String lastChat;
    private @ServerTimestamp Date dateTime;

    //CONSTRUCTOR:


    public MChatRoom() {
        //
    }

    public MChatRoom(String keyChatRoom, String profilePic, String profileName, String lastChat) {
        this.keyChatRoom = keyChatRoom;
        this.profilePic = profilePic;
        this.profileName = profileName;
        this.lastChat = lastChat;
    }

    public String getKeyChatRoom() {
        return keyChatRoom;
    }

    public void setKeyChatRoom(String keyChatRoom) {
        this.keyChatRoom = keyChatRoom;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getLastChat() {
        return lastChat;
    }

    public void setLastChat(String lastChat) {
        this.lastChat = lastChat;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
