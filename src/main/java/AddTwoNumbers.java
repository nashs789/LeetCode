/**
 *  AddTwoNumbers
 *
 *  You are given two non_empty linked lists representing two non negative integers.
 *  The digits are stored in reverse order and each of their nodes contain a single digit.
 *  Add the two numbers and return it as a linked list.
 *
 *  You may assume the two numbers do not contain any leading zero,
 *  except the numbers o itself.
 *
 *  Example:
 *
 *  Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 *  Output: 7 -> 0 -> 8
 *  Explanation: 342 + 465 = 807
 */

/**
 *  What I'm considering is
 *
 *  - if there is only one element number zero in list, it means it's zero or invalid number
 */

import java.util.LinkedList;

public class AddTwoNumbers {
    public static void main(String[] args) {

        LinkedList<Integer> operandList1 = getLinkedList(new int[]{2, 4, 3});
        LinkedList<Integer> operandList2 = getLinkedList(new int[]{5, 6, 4});
        
        int oper1 = getInteger(operandList1);
        int oper2 = getInteger(operandList2);

        System.out.println("oper1 = " + oper1);
        System.out.println("oper2 = " + oper2);
        System.out.println("(oper1 + oper2) = " + (oper1 + oper2));

    }
    
    public static int getInteger(LinkedList<Integer> list){
        int num = 0;
        int listSize = list.size() - 1;
        
        for(int idx = listSize; idx >= 0; idx--){
            num += list.get(idx) * pow(idx);
        }
        return num;
    }
    
    public static int pow(int idx){
        return (int) Math.pow(10, (idx));
    }

    public static LinkedList<Integer> getLinkedList(int[] arr){
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        for(int num : arr){
            linkedList.add(num);
        }
        
        return linkedList;
    }
}
