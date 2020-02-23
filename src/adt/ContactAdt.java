package adt;

import definition.Person;

public interface ContactAdt<E> {
    void addContact(Person person);

    void viewContact();

    boolean searchContact(E person);

    E deleteContact(int index);
}
