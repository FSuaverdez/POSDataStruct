/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Node {

    String productID;
    String productName;
    int itemCode;
    int price;
    Node next;
}

class LinkedList {

    Node head = null;

    void insert(String productID, String productName,int itemCode, int price) {

        Node temp = new Node();
        temp = head;

        if (head == null) {
            head.productID = productID;
            head.productName = productName;
            head.itemCode = itemCode;
            head.price = price;

        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp = temp.next;
            temp.productID = productID;
            temp.productID = productName;
            temp.itemCode = itemCode;
            temp.price = price;

        }

    }
    
    public int search(int itemCode){
        int price = 0;
        Node temp = new Node();
        temp = head;
        if (head.itemCode == itemCode) {
            price = head.itemCode;

        } else {
            while (temp.next.itemCode != itemCode) {
                temp = temp.next;
            }
            price = temp.itemCode;

        }
        return price;
    }
}
