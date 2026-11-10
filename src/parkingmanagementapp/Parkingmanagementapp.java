/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parkingmanagementapp;

/**
 *
 * @author USER
 */
public class Parkingmanagementapp {
 private VehicleNode head;
    private int size;

    public CustomLinkedList() {
        this.head = null;
        this.size = 0;
    }
    public int getSize() {
        return size;
    }

    public VehicleNode getHead() {
        return head;
    }

    // Insert new node at the end of the linked list
    public void add(String plateNumber, String vehicleType, String ownerName, long entryTime) {
        VehicleNode newNode = new VehicleNode(plateNumber, vehicleType, ownerName, entryTime);
        if (head == null) {
            head = newNode;
        } else {
            VehicleNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
