package org.siriys.interfaces;

public interface Observable {
    void addObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void notifyObservers();
}
