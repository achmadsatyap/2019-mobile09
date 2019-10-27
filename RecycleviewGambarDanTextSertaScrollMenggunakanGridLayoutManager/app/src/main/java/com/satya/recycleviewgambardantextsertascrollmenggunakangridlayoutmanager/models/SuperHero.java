package com.satya.recycleviewgambardantextsertascrollmenggunakangridlayoutmanager.models;

public class SuperHero {
    public String heroName;
    public String heroText;
    public int heroImage;

    public SuperHero(String heroName, String heroText, int heroImage) {
        this.heroName = heroName;
        this.heroText = heroText;
        this.heroImage = heroImage;
    }

    public String getHeroName() {
        return heroName;
    }


    public String getHeroText() {
        return heroText;
    }


    public int getHeroImage() {
        return heroImage;
    }

}
