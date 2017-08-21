package com.yc.soap.stack;

import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小素的min函数。在该栈中，调用min、push及pop的时间复杂度都是O(1)。
 */
public class MinInStack {
    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(3);
        System.out.println(stack.min());

        stack.push(2);
        System.out.println(stack.min());

        stack.push(5);
        System.out.println(stack.min());

        stack.push(1);
        System.out.println(stack.min());

        stack.pop();
        stack.pop();
        System.out.println(stack.min());
    }

    static class MinStack {
        private Stack<Integer> stackA = new Stack<>();
        private Stack<Integer> stackB = new Stack<>();

        public void push(int k) {
            stackA.push(k);
            if (stackB.isEmpty() || k < stackB.peek()) {
                stackB.push(k);
            } else {
                stackB.push(stackB.peek());
            }
        }

        public void pop() {
            if (!stackA.isEmpty()) {
                stackA.pop();
            }
            if (!stackB.isEmpty()) {
                stackB.pop();
            }
        }

        public int min() {
            if (stackB.isEmpty()) {
                return -1;
            }
            return stackB.peek();
        }
    }
}
