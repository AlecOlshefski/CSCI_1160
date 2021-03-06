package com.company.killoran;

class SuperHero extends Person {

    private String Alias;

    public SuperHero(String name, int health, String alias) {
        super(name, health);
        Alias = alias;
        //this.health+=50;

    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String alias) {
        Alias = alias;
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "Alias='" + Alias + '\'' +
                ", name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}
