package org.siriys;

import java.util.Objects;

public class Character {
    protected String name;

    public Character(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Character character = (Character) obj;
        return Objects.equals(name, character.name);
    }

    @Override
    public int hashCode() {
        int[] primes = {2687, 7433, 8849, 8849, 5689, 7507, 8039, 9341, 6449, 1033};

        int result = 0;
        for (int i = 0; i < this.name.length(); i++) {
            char c = this.name.charAt(i);
            int charCode = (int) c;
            int power = i + (charCode % 3);
            result += (int) Math.pow(primes[charCode % primes.length], power) % Integer.MAX_VALUE;
        }

        return result;
    }

    @Override
    public String toString() {
        return String.format("%s {name='%s'}", getClass().getSimpleName(), this.name);
    }
}

