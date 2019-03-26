
package org.lasencinas.interfaces;

public interface Walkable {

    void walk();

    public class Walkables {

        public static void letThemWalk(Walkable[] list) {
            for (Walkable w : list) {
                w.walk();
            }
        }
    }
}

