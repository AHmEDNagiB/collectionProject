package Fillers;

import Generators.Generator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Filler {

    public <T> void fill(int numberOfItems, Generator generator, ArrayList<T> toBeFilled) {
        for (int i = 1; i <= numberOfItems; i++) {
            toBeFilled.add(generator.genetrate(i));
        }
    }

    public <T> void fill(int numberOfItems, Generator generator, LinkedList<T> toBeFilled) {
        for (int i = 1; i <= numberOfItems; i++) {
            toBeFilled.add(generator.genetrate(i));
        }
    }

    public <T> void fill(int numberOfItems, Generator generator, HashSet<T> toBeFilled) {
        for (int i = 1; i <= numberOfItems; i++) {
            toBeFilled.add(generator.genetrate(i));
        }
    }

    public <T> void fill(int numberOfItems, Generator generator, TreeSet<T> toBeFilled) {
        for (int i = 1; i <= numberOfItems; i++) {
            toBeFilled.add(generator.genetrate(i));
        }
    }
}
