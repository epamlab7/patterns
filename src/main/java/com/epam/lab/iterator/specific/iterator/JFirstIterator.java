package com.epam.lab.iterator.specific.iterator;


import com.epam.lab.iterator.interfaces.Iterator;

public class JFirstIterator implements Iterator {

    int index;
    String[] names;

    public JFirstIterator(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        while (index < names.length) {
            if (names[index].matches("^J.*"))
                return true;
            else
                index++;
        }
        return false;
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return names[index++];
        }
        return null;
    }
}
