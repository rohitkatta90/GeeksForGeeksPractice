package com.coding.arrays;


     public class LinkedListTest {
          int val;
         LinkedListTest next;
         LinkedListTest() {}
         LinkedListTest(int val) { this.val = val; }
         LinkedListTest(int val, LinkedListTest next) { this.val = val; this.next = next; }
      }

    class Solution {
        public LinkedListTest reverseList(LinkedListTest head) {
            LinkedListTest prev = null;

            while(head != null){
                LinkedListTest next = head.next;
                head.next = prev;
                prev = head;
                head = next;

            }
            return prev;
        }
    }

