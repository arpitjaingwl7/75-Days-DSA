public class Day48 {
    
}


// java code //
// Solution class to merge two sorted linked lists
class Solution {
    // Method to merge two sorted linked lists
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;

        // Iterate through both lists and merge them
        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                temp.next = p1;
                temp = temp.next;
                p1 = p1.next;
            } else {
                temp.next = p2;
                temp = temp.next;
                p2 = p2.next;
            }
        }

        // Attach the remaining elements
        if (p1 == null) {
            temp.next = p2;
        } else {
            temp.next = p1;
        }

        return ans.next;
    }
}
/* 
// C++ Code //
#include <iostream>

// Definition for singly-linked list.


// Solution class to merge two sorted linked lists
class Solution {
public:
    // Method to merge two sorted linked lists
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        ListNode dummy(-1);
        ListNode* temp = &dummy;

        // Iterate through both lists and merge them
        while (list1 != nullptr && list2 != nullptr) {
            if (list1->val < list2->val) {
                temp->next = list1;
                list1 = list1->next;
            } else {
                temp->next = list2;
                list2 = list2->next;
            }
            temp = temp->next;
        }

        // Attach the remaining elements
        if (list1 == nullptr) {
            temp->next = list2;
        } else {
            temp->next = list1;
        }

        return dummy.next;
    }
};


// Python Code //


class Solution:
    def mergeTwoLists(self, list1: ListNode, list2: ListNode) -> ListNode:
        dummy = ListNode(-1)
        temp = dummy

        # Iterate through both lists and merge them
        while list1 and list2:
            if list1.val < list2.val:
                temp.next = list1
                list1 = list1.next
            else:
                temp.next = list2
                list2 = list2.next
            temp = temp.next

        # Attach the remaining elements
        if not list1:
            temp.next = list2
        else:
            temp.next = list1

        return dummy.next

 */       