package definition;

import adt.ContactAdt;

public class ContactList<E> implements ContactAdt<E> {
    private Node<E> head = null;
    private int size = 0;

    private Node getNode(int index) {
        Node response = head;
        for (int i = 0; i < index; i++) {
            response = response.getNext();
        }
        return response;
    }


    private void addFirst(Person item) {
        Node<E> temp = new Node<>(item, head);
        head = temp;
        size++;
    }

    private void addAfter(Node node, Person item) {
        Node<E> newNode = new Node<E>(item, node.getNext());
        node.next = newNode;
        size++;
    }

    public void addContact(Person item, int index) {
        if (index == 0) {
            addFirst(item);
        } else {
            addAfter(getNode(index - 1), item);
        }

    }

    @Override
    public void addContact(Person person) {
        addContact(person, size);
    }


    @Override
    public void viewContact() {

    }

    @Override
    public boolean searchContact(E person) {
        return false;
    }


    @Override
    public E deleteContact(int index) {
        return null;
    }


    private static class Node<E> {

        private Person data;
        private Node<E> next;

        private Node(Person data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        private Person getData() {
            return data;
        }

        private Node<E> getNext() {
            return next;
        }
    }
}
