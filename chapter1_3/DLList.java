package chapter1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

//Iterator 需调整
public class DLList<Item> implements Iterable<Item> {
    private Node sentinel;
    private Item sentinelItem;
    private int size;

    private class Node {
        Item item;
        Node next;
        Node prev;

        public Node(Item item, Node next, Node prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }

    public DLList() {
        sentinel = new Node(sentinelItem, sentinel, sentinel);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
        size = 0;
    }

    public DLList(Item item) {
        sentinel = new Node(sentinelItem, sentinel, sentinel);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
        Node temp = new Node(item, sentinel, sentinel);
        sentinel.next = temp;
        sentinel.prev = temp;
        size = 1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void addFirst(Item item) {
        size++;
        Node temp = new Node(item, sentinel.next, sentinel);
        sentinel.next.prev = temp;
        sentinel.next = temp;
    }

    public void addLast(Item item) {
        size++;
        Node temp = new Node(item, sentinel, sentinel.prev);
        sentinel.prev.next = temp;
        sentinel.prev = temp;

    }

    public void removeFirst() {
        size--;
        sentinel.next.next.prev = sentinel;
        sentinel.next = sentinel.next.next;
    }

    public void removeLast() {
        size--;
        sentinel.prev.prev.next = sentinel;
        sentinel.prev = sentinel.prev.prev;
    }

    public Item getFirst() {
        return sentinel.next.item;
    }

    public Item getLast() {
        return sentinel.prev.item;
    }

    public Iterator<Item> iterator() {
        return new DLListIterator();
    }

    private class DLListIterator implements Iterator<Item> {
        private Node current = sentinel.next;

        public boolean hasNext() {
            return current.next != sentinel;
        }

        public void remove() {
        }

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    public static void main(String[] args) {
        DLList<String> DLList = new DLList<>();
        while (!StdIn.isEmpty()) {
            DLList.addLast(StdIn.readString());
        }
        StdOut.print(DLList.getLast() + " ");
        DLList.removeLast();
        StdOut.print(DLList.getLast() + " ");
        DLList.removeLast();
        StdOut.print(DLList.getLast() + " ");
        DLList.removeLast();
        StdOut.print(DLList.getLast() + " ");
        DLList.removeLast();
//        for (String s : DLList) {
//            StdOut.print(s + " ");
//        }
        StdOut.println();
    }
}
