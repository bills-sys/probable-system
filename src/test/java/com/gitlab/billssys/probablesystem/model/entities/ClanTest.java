package com.gitlab.billssys.probablesystem.model.entities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ClanTest {

    private Clan clan;

    @Before
    public void setUp() {
        clan = new Clan("Earth Warriors");
    }

    @Test
    public void shouldHaveInitialEarthWarriorsName() {
        assertEquals("Earth Warriors", clan.getName());
    }

    @Test
    public void shouldBeEmpty() {
        assertEquals(0, clan.getMembers().size());
    }

    @Test
    public void shouldAddMember() {
        Player player = new Player("Mary", 6, "Adviser");
        clan.addMember(player);
        assertTrue(clan.getMembers().get(0).equals(player));
    }

    @Test
    public void shouldAddThreeMember() {
        for (int i = 1; i < 4; i++) {
            Player player = new Player(String.format("Android N° %d", i), 6, "Adviser");
            clan.addMember(player);
        }
        assertEquals(3, clan.getMembers().size());
    }

}
