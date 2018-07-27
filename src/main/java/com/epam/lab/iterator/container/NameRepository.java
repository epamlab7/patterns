package com.epam.lab.iterator.container;


import com.epam.lab.iterator.interfaces.Container;
import com.epam.lab.iterator.interfaces.Iterator;
import com.epam.lab.iterator.specific.iterator.JFirstIterator;

public class NameRepository implements Container {

    private String[] names;

    public NameRepository() {
        names = new String[]{"John", "Bill", "Bob", "Jack"};
    }

    @Override
    public Iterator getIterator() {
        return new JFirstIterator(names);
    }
}