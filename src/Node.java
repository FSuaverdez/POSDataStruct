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
    double price;
    Node next;
}

class LinkedList {

    Node head = null;

    public void insert(String productID, String productName, int itemCode, double price) {

        Node temp = new Node();

        temp.productID = productID;
        temp.productName = productName;
        temp.itemCode = itemCode;
        temp.price = price;
        temp.next = null;

        if (head == null) {
            head = temp;
        } else {
            Node temp2 = head;
            while (temp2.next != null) {
                temp2 = temp2.next;
            }
            temp2.next = temp;
        }

    }

    public double search(String ID) {
        double productPrice = 0;
        Node temp = new Node();
        temp = head;
        while (temp != null) {
            if (temp.productID == ID) {
                productPrice = temp.price;
                return productPrice;

            } else {
                temp = temp.next;
            }

        }

        return productPrice;
    }

}

class NodeT {
    String productID;
    String productName;
    int itemCode;
    double price;
    NodeT left;
    NodeT right;

    public NodeT(String productID, String productName, int itemCode, double price) {
        this.productID = productID;
        this.productName = productName;
        this.itemCode = itemCode;
        this.price = price;
    }

}


class BinaryTree {
    NodeT root;

    public void insert(String productID, String productName, int itemCode, double price) {

        NodeT newNode = new NodeT(productID, productName, itemCode, price);

        if (root == null) {
            root = newNode;
        } else {
            NodeT temp = root;

            NodeT parent;
            while (true) {
                parent = temp;

                if (itemCode < temp.itemCode) {
                    temp = temp.left;

                    if (temp == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    temp = temp.right;

                    if (temp == null) {
                        parent.right = newNode;
                        return;
                    }
                }

            }
        }
    }

    public double searchPrice(int itemCode) {

            NodeT temp = root;
            
            while (true) {
                if (temp.itemCode == itemCode) {
                        return temp.price;
                    }
                
                if (itemCode < temp.itemCode) {
                    temp = temp.left;

                    if (temp.itemCode == itemCode) {
                        return temp.price;
                    }
                } else {
                    temp = temp.right;

                    if (temp.itemCode == itemCode) {
                        return temp.price;
                    }
                }

            }
        }
    

    public String searchName(int itemCode) {

        NodeT temp = root;

        
        while (true) {
            
            if (temp.itemCode == itemCode) {
                    return temp.productName;
                }
            
            if (itemCode < temp.itemCode) {
                temp = temp.left;

                if (temp.itemCode == itemCode) {
                    return temp.productName;
                }
            } else {
                temp = temp.right;

                if (temp.itemCode == itemCode) {
                    return temp.productName;
                }
            }

        }
    }
}
