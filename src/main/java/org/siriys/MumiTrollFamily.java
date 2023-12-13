package org.siriys;

import org.siriys.enums.Fruit;
import org.siriys.enums.State;
import org.siriys.exceptions.CantMakeBedException;
import org.siriys.exceptions.BasketOverflowException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class MumiTrollFamily {
    public ArrayList<MumiTrollFamilyMember> members;

    public MumiTrollFamily() {
        this.members = new ArrayList<>();
    }

    public class MumiTroll extends MumiTrollFamilyMember {
        public MumiTroll(String name) {
            super(name);
            members.add(this);
        }

        public void contemplate(Surroundings surroundingsObject) {
            System.out.println(this.name + " разглядывает " + surroundingsObject.toString());
        }
    }

    public class MumiMama extends MumiTrollFamilyMember {
        public MumiMama(String name) {
            super(name);
            members.add(this);
        }

        public void makeBed(Character... characters) throws CantMakeBedException {
            if (this.getState() != State.IDLE) {
                throw new CantMakeBedException(this.name + " не в состоянии подготовить кровать");
            }

            String renderedCharacterObjects = Arrays.stream(characters)
                    .map(object -> Objects.toString(object, null))
                    .toList()
                    .toString();

            System.out.println(this.name + " постелила на дереве для " + renderedCharacterObjects);
        }

        public void prepareFruitBasket(HashMap<Fruit, Integer> content) {
            class FruitBasket {
                private final HashMap<Fruit, Integer> content;

                public FruitBasket(HashMap<Fruit, Integer> content) {
                    this.content = content;
                }

                @Override
                public String toString() {
                    return "FruitBasket{" + "content=" + content.toString() + '}';
                }
            }

            for (Integer value : content.values()) {
                if (value > 25) {
                    throw new BasketOverflowException("Слишком много фруктов, мужик");
                }
            }

            FruitBasket fruitBasket = new FruitBasket(content);
            System.out.println(this.name + " приготовила корзинку " + fruitBasket.toString());
        }
    }

    public class MumiPapa extends MumiTrollFamilyMember {
        public MumiPapa(String name) {
            super(name);
            members.add(this);
        }
    }

    public void setFamilyState(State state) {
        for (MumiTrollFamilyMember member : this.members) {
            member.setState(state);
        }
    }

    public void renderCurrentFamilyState() {
        for (MumiTrollFamilyMember member : this.members) {
            member.renderCurrentState();
        }
    }

    public void forget() {
        this.setFamilyState(State.IDLE);
        System.out.println("Семья муми-троллей обо всем забыла");
        this.renderCurrentFamilyState();
    }
}
