package com.gitlab.billssys.probablesystem.model.entities;

public class Player {

    private String name;
    private int age;
    private String occupation;
    private Clan clan;

    public Player(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public Player(String name, int age, String occupation, Clan clan) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        addClan(clan);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Clan getClan() {
        return clan;
    }

    public void getOld() {
        age += 1;
    }

    public void addClan(Clan clan) {
        clan.addMember(this);
        this.clan = clan;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((clan == null) ? 0 : clan.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((occupation == null) ? 0 : occupation.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Player other = (Player) obj;
        if (age != other.age)
            return false;
        if (clan == null) {
            if (other.clan != null)
                return false;
        } else if (!clan.equals(other.clan))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (occupation == null) {
            if (other.occupation != null)
                return false;
        } else if (!occupation.equals(other.occupation))
            return false;
        return true;
    }

}
