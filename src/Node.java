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
    
    public void insert(String productID,String productName,int itemCode, double price) {

       Node temp = new Node();
       
       temp.productID =productID;
       temp.productName=productName;
       temp.itemCode=itemCode;
       temp.price= price;
       temp.next=null;
       
       
       if(head==null){
           head = temp;
       }
       else{
           Node temp2 = head;
           while(temp2.next!=null){
               temp2 = temp2.next;
           }
           temp2.next=temp;
       }

    }
    
    public double search(String ID){
        double productPrice = 0;
        Node temp = new Node();
        temp = head;
            while(temp!=null){
                if(temp.productID==ID){
                    productPrice=temp.price;
                    return productPrice;
                    
                }else{
                    temp = temp.next;
                }
            
        }

        
        return productPrice;
    }
    
}
