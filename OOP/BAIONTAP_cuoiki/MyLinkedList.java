import java.util.*;

public class MyLinkedList{
    
    public static class Node{
        int value;
        Node next;
        Node(int value) {
            this.value = value;
    }
}
//printLinkedList
public static void printLinkedList(Node head) {
    if(head == null){
        System.out.println("List is empty");
    }else{
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value);
            temp=temp.next;
            if(temp != null){
                System.out.print("->");
            }
            else{
                System.out.println();
            }
        }
    }
}
//addToHead
public static Node addToHead(Node headNode, int value) {
    Node newNode = new Node(value);
    if(headNode == null){
        return newNode;
    }else{
        newNode = headNode
    }
    return null;
}
public static void main(String[] args) {
    Node n1 = new Node(1);
    Node n2 = new Node(5);
    Node n3 = new Node(7);

    n1.next=n2;
    n2.next=n3;
    
    printLinkedList(n1);
    printLinkedList(n2);
    printLinkedList(n3);
    }
}