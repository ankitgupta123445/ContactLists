package adt;

public interface ContactAdt<E> {
    void addContact(E person);

    void viewContact();

    boolean searchContact(E person);

    E deleteContact(int index);
}
