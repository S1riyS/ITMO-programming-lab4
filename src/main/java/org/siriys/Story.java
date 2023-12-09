package org.siriys;

import org.siriys.enums.Fruit;
import org.siriys.enums.State;

import java.util.ArrayList;
import java.util.HashMap;

public class Story {
    public static void main(String[] args) {
        // Characters of story
        MumiTrollFamily mumiTrollFamily = new MumiTrollFamily();
        MumiTrollFamily.MumiTroll mumiTroll = mumiTrollFamily.new MumiTroll("Муми-тролль");
        MumiTrollFamily.MumiMama mumiMama = mumiTrollFamily.new MumiMama("Муми-мама");
        MumiTrollFamily.MumiPapa mumiPapa = mumiTrollFamily.new MumiPapa("Муми-папа");

        Emma emma = new Emma("Эмма");
        Character frekenSnork = new Character("фрекен Снорк") {
            @Override
            public String toString() {
                return String.format("%s {name='%s'} (Anonymous class hehe)", getClass().getName(), this.name);
            }
        };


        // Adding members of Mumi-Troll family to list of observers
        for (MumiTrollFamilyMember member : mumiTrollFamily.members) {
            emma.addObserver(member);
        }

        // Surroundings
        Surroundings.Tree tree = new Surroundings.Tree("GREEN");

        // Story
        mumiTroll.setState(State.IDLE);
        mumiTroll.renderCurrentState();
        mumiTroll.contemplate(tree);
        mumiTroll.setState(State.WHISTLING);
        mumiTroll.renderCurrentState();

        System.out.println();

        emma.approach();
        emma.mumble();
        emma.notifyObservers();
        mumiTrollFamily.setFamilyState(State.WORRIED);
        mumiTrollFamily.renderCurrentFamilyState();
        mumiTrollFamily.forget();

        System.out.println();

        try {
            mumiMama.makeBed(mumiTroll, frekenSnork);
        } catch (Exception e) {
            e.printStackTrace();
        }

        HashMap<Fruit, Integer> fruitBasketContent = new HashMap<>();
        fruitBasketContent.put(Fruit.APPLE, 6);
        fruitBasketContent.put(Fruit.BANANA, 4);
        fruitBasketContent.put(Fruit.KIWI, 2);
        mumiMama.prepareFruitBasket(fruitBasketContent);
    }
}
