package com.abasscodes.hockeyserver;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ContactWrapper {
    @SerializedName("roster")
    private List<Contact> roster;

    public ContactWrapper(List<Contact> roster) {
        this.roster = roster;
    }

    public List<Contact> getRoster() {
        return roster;
    }
}