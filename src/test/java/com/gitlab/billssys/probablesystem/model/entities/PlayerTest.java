package com.gitlab.billssys.probablesystem.model.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PlayerTest {
    private Player player;

    @Before
    public void setUp() {
        player = new Player("Jack", 0, "Boss");
    }

    @Test
    public void shouldHaveInitialJackName() {
        assertEquals("Jack", player.getName());
    }

    @Test
    public void shouldHaveInitial0Age() {
        assertEquals(0, player.getAge());
    }

    @Test
    public void shouldHaveInitialBossOccupation() {
        assertEquals(0, player.getAge());
    }

    @Test
    public void shouldBeGelOld9() {
        for (int i = 1; i < 10; i++) {
            player.getOld();
        }
        assertEquals(9, player.getAge());
    }

    @Test
    public void shouldAddClanAfterConstructor() {
        Clan clan = new Clan("Sword & Cross");
        player.addClan(clan);
        assertEquals(clan, player.getClan());
    }

    public void shouldAddClanInConstructor() {
        Clan clan = new Clan("White Lotus");
        player = new Player("Bob", 6, "occupation", clan);
        assertEquals(clan, player.getClan());
    }

}
