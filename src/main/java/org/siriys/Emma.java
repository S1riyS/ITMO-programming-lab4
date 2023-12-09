package org.siriys;

import org.siriys.interfaces.Observable;
import org.siriys.interfaces.IObserver;

import java.util.LinkedList;

public class Emma extends Character implements Observable {
    protected LinkedList<IObserver> observers = new LinkedList<>();

    public Emma(String name) {
        super(name);
    }

    public void approach() {
        System.out.println(this.name + " прибежал(а)");
    }

    public void mumble() {
        System.out.println(this.name + " что-то бормочет");

    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(this.name + " уходит в темноту");
        }
    }
}

