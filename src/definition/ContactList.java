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


    private void addFirst(E item) {
        Node<E> temp = new Node<>(item, head);
        head = temp;
        size++;
    }

    private void addAfter(Node node, E item) {
        Node<E> newNode = new Node<>(item, node.getNext());
        node.next = newNode;
        size++;
    }

    public void addContact(E item, int index) {
        if (index == 0) {
            addFirst(item);
        } else {
            addAfter(getNode(index - 1), item);
        }

    }

    @Override
    public void addContact(E person) {
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

    private class Node<E> {
        E data;
        Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }
    }
}
