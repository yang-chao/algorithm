package com.yc.soap.stack;

import java.util.Stack;

/**
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数appendTail和deleteHead，
 * 分别完成在队列尾部插入结点和在队列头部删除结点的功能。
 */
public class StacksToQueue {
    public static void main(String[] args) {
        StackQueue queue = new StackQueue();
        queue.appendTail(1);
        queue.appendTail(2);
        queue.appendTail(3);
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
        queue.appendTail(4);
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
    }

    static class StackQueue {
        private Stack<Integer> stackA = new Stack<>();
        private Stack<Integer> stackB = new Stack<>();

        public void appendTail(int item) {
            stackA.push(item);
        }

        public int deleteHead() {
            if (stackB.isEmpty()) {
                if (stackA.isEmpty()) {
                    return -1;
                } else {
                    while (!stackA.isEmpty()) {
                        stackB.push(stackA.pop());
                    }
                    return stackB.pop();
                }
            } else {
                return stackB.pop();
            }
        }
    }
}
