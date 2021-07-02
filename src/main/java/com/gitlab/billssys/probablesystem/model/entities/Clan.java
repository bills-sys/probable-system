package com.gitlab.billssys.probablesystem.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Clan {

    private String name;
    private List<Player> members = new ArrayList<>();

    public Clan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getMembers() {
        return members;
    }

    public void addMember(Player player) {
        members.add(player);
    }

}
