package com.unpri.charactermanager.model;

public class Character {

    private String name;
    private int level;
    private int hitPoints;
    private CharacterType type;
    private int mana;

    // Constructor 1
    public Character(String name, CharacterType type) {
        this.name = name;
        this.level = 1;
        this.hitPoints = 100;
        this.type = type;
        this.mana = 0;
    }

    // Constructor 2
    public Character(String name, int level, int hitPoints, CharacterType type) {
        this.name = name;
        this.level = level;
        this.hitPoints = hitPoints;
        this.type = type;
        this.mana = 0;
    }

    // Getter dan Setter name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter dan Setter level
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // Getter dan Setter hitPoints
    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    // Getter dan Setter type
    public CharacterType getType() {
        return type;
    }

    public void setType(CharacterType type) {
        this.type = type;
    }

    // Getter mana
    public int getMana() {
        return mana;
    }

    // Setter mana dengan validasi
    public void setMana(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException("Mana tidak boleh negatif.");
        }

        this.mana = mana;
    }

    // Mengecek apakah character masih hidup
    public boolean isAlive() {
        return hitPoints > 0;
    }

    // Level up
    public void levelUp() {
        level++;
        hitPoints += 20;
    }

    // Menampilkan data character
    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", hitPoints=" + hitPoints +
                ", mana=" + mana +
                ", type=" + type +
                '}';
    }
}