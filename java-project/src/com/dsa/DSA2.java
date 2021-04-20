package com.dsa;

import java.util.Scanner;

import org.omg.CORBA.OMGVMCID;

public class DSA2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();

		Node head = null;
		for (int i = 0; i < size; i++) {
			int data = scan.nextInt();
		  head =	insertData(head, data);
		}
		printLinkedList(head);
		head = implMergeSort(head, size);
		printLinkedList(head);
	}
	
	public static Node implMergeSort(Node head, int size) {
		
		if(head == null) {
			return head;
		}
		
		int mid =  0;
		if(size % 2 == 0) {
			mid = size/2;
		} else {
			mid =  size/2 + 1;
		}
		
		Node temp = head;
		Node temp2 = head;
		
		int x = mid;
		while(x-- > 0) {
			temp2 = temp2.next;
		}
	 Node head1 =	implMergeSort(temp, mid);
	Node head2 =	implMergeSort(temp2, size-mid);
		
		return mergeSort(head1, head2, mid, size-mid);
	}
	
	public static Node mergeSort(Node head1, Node head2, int size1, int size2) {
		
		Node newNode = null;
		Node temp1 = head1;
		Node temp2 = head2;
		while(temp1.next != null  && temp2.next != null && size1 >0 && size2 > 0) {
			if(temp2.data > temp1.data) {
				if(newNode == null) {
					newNode = temp1;
				} else {
					newNode.next = temp1;
				}
				temp1 = temp1.next;
				size1--;
			} else {
				if(newNode == null) {
					newNode = temp2;
				} else {
					newNode.next = temp2;
				}
				temp2 = temp2.next;
				size2--;
			}
		}
		
		while(temp1 != null && size1 > 0) {
			newNode.next = temp1;
			temp1 = temp1.next;
		}
		
		while(temp2 != null && size2> 0) {
			newNode.next = temp2;
			temp2 = temp2.next;
		}
		return newNode;
	}

	public static Node insertData(Node head, int data) {

		Node newNode = new Node(data);

		Node temp = head;

		if (temp == null) {
			head = newNode;
			return head;
		}

		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = newNode;

		return head;
	}

	static void printLinkedList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

}
