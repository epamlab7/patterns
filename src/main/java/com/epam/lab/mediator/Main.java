package com.epam.lab.mediator;

public class Main {
    public static void startMediatorPattern() {
        ConcreteMediator m = new ConcreteMediator();
        ConcreteColleague1 c1 = new ConcreteColleague1(m);
        ConcreteColleague2 c2 = new ConcreteColleague2(m);
        m.setColleague1(c1);
        m.setColleague2(c2);
        c1.send("How are you?");
        c2.send("Fine, thanks");
    }
}
