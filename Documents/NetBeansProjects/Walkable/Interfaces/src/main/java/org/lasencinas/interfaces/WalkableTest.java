package org.lasencinas.interfaces;

import org.lasencinas.interfaces.Walkable.Walkables;

public class WalkableTest {

    public static void main(String[] args) {
        Walkable[] w = new Walkable[4];
        w[0] = new Person("Jack");
        w[1] = new Duck("Jeff");
        w[2] = new Person("John");
        w[3] = new Cat("Jace");
// Let everyone walk
        Walkables.letThemWalk(w);
    }
}