//package Leet;
//
//public class MergeList_21
//{
//
//	/*
//	 * public static void main(String[] args) {
//	 * 
//	 * LList l1=new LList(); LList l2=new LList(); LList l3=new LList();
//	 * l1.addLast(1); l1.addLast(2); l1.addLast(3); l2.addLast(4); l2.addLast(5);
//	 * l2.addLast(6);
//	 * 
//	 * for(int i=0;i<l1.size();i++) { l3.addLast(l1.getAtIndex(i)+l2.getAtIndex(i));
//	 * }
//	 * 
//	 * l3.display();
//	 * 
//	 * }
//	 * 
//	 * } class LList{ static class Node{ private int data; private Node next;
//	 * 
//	 * public Node() { data=0; next=null; }
//	 * 
//	 * public Node(int val) { data=val; next=null; } }
//	 * 
//	 * private Node head;
//	 * 
//	 * public LList() { head=null; }
//	 * 
//	 * public void addLast(int val) { Node trav; Node nn=new Node(val);
//	 * if(head==null) { head=nn; }else { trav=head; while(trav.next!=null) {
//	 * trav=trav.next; } //nn.next=trav.next; trav.next=nn; } }
//	 * 
//	 * public int getAtIndex(int i) { Node trav=head; for(int j=0;j<i-1;j++) {
//	 * trav=trav.next; } return trav.data; }
//	 * 
//	 * public int size() { Node trav=head; int count=0; while(trav!=null) { count++;
//	 * trav=trav.next; } return count; }
//	 * 
//	 * public void display() { Node trav=head; while(trav!=null) {
//	 * System.out.print(trav.data+" "); trav=trav.next; } System.out.println(); }
//	 * 
//	 * 
//	 */
//
//public class MergeTwoLinkedList {
//  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//      
//      if(list1 == null){
//          return list2;
//      }
//      
//      if(list2 == null){
//          return list1;
//      }
//      
//      ListNode head;
//      
//      ListNode temp;
//      
//      if(list1.val > list2.val) {
//          temp = head = new ListNode(list2.val);
//          list2 = list2.next;
//      }else{
//          temp = head = new ListNode(list1.val);
//          list1 = list1.next;
//      }
//      
//      while(list1 != null || list2 != null) {
//          if(list1 == null && list2 !=null) {
//              temp.next = new ListNode(list2.val);
//              list2 = list2.next;
//          } else if (list1 != null && list2 == null) {
//              temp.next = new ListNode(list1.val);
//              list1 = list1.next;                
//          } else {
//              if(list1.val > list2.val){
//                  temp.next = new ListNode(list2.val);
//                  list2 = list2.next;
//              }else{
//                  temp.next = new ListNode(list1.val);
//                  list1 = list1.next;
//              }
//          }
//          temp = temp.next;
//      }
//      return head;
//  }
////view rawMergeTwoSortedLists.java hosted with ❤ by GitHub
//}
//
