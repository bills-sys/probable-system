package com.gitlab.billssys.probablesystem.application;

import com.gitlab.billssys.probablesystem.model.entities.Player;

public class App {

    public static void main(String[] args) {
        Player player = new Player("Hestia", 33, "Goddess");
        System.out.printf("%s %s%n", player.getOccupation(), player.getName());
    }

}
