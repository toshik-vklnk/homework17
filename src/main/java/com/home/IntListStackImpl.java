package com.home;

import java.util.List;

public class IntListStackImpl implements IntList, IntStack{

    int[] arrayPROS;
    int nextIndex;

    public IntListStackImpl() {
        arrayPROS = new int[10];
        nextIndex = 0;
    }

    @Override
    public void add(int i) {
        arrayPROS[nextIndex] = i;
        nextIndex++;
    }

    @Override
    public void insert(int index, int value) {
        int[] arrayNEW = new int[arrayPROS.length + 1];
        System.arraycopy(arrayPROS, 0, arrayNEW, 0, index - 1);
        arrayNEW[index] = value;
        System.arraycopy(arrayPROS, index, arrayNEW, index + 1, arrayPROS.length - index);
        arrayPROS = arrayNEW;
    }

    @Override
    public void set(int index, int value) {
        arrayPROS[index] = value;
    }

    @Override
    public int size() {
        if (nextIndex == 0) {
            return 0;
        }
        return nextIndex;
    }

    @Override
    public int capacity() {
        return arrayPROS.length;
    }

    @Override
    public int getByIndex(int index) {
        return arrayPROS[index];
    }

    @Override
    public Integer getIndexByValue(int value) {
        Integer index = null;
        for (int i = 0; i < arrayPROS.length; i++) {
            if (arrayPROS[i] == value) {
                index = i;
            } else {
                return null;
            }
        }
        return index;
    }

    @Override
    public boolean contains(int value) {
        boolean containsIt = false;
        for (int i = 0; i < arrayPROS.length; i++) {
            if (arrayPROS[i] == value) {
                containsIt = true;
            }
        }
        return containsIt;
    }

    @Override
    public void removeValue(int value) {
        for (int i = 0; i < arrayPROS.length; i++) {
            if (arrayPROS[i] == value) {
                arrayPROS[i] = 0;
            }
        }
    }

    @Override
    public void removeByIndex(int index) {
        int[] arrayNEW = new int[arrayPROS.length];
        System.arraycopy(arrayPROS, 0, arrayNEW, 0, index);
        System.arraycopy(arrayPROS, index + 1, arrayNEW, index, arrayPROS.length - (index + 1));
        arrayPROS = arrayNEW;
    }

    @Override
    public IntList subList(int fromIndex, int toIndex) {
        IntList subList = new IntListStackImpl();
        int[] subarray = new int[toIndex - fromIndex];
        System.arraycopy(arrayPROS, fromIndex, subarray, 0, toIndex - fromIndex);
        for (int i : subarray) {
            subList.add(i);
        }
        return subList;
    }

    @Override
    public int[] toArray(List list) {
        int[] t = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            t[i] = (int) list.get(i);
        }
        return t;
    }

    @Override
    public void push(int value) {
        arrayPROS[nextIndex++] = value;
    }

    @Override
    public int pop() {
        int a = arrayPROS[nextIndex];
        arrayPROS[nextIndex] = 0;
        return a;
    }

    @Override
    public int peek() {
        return arrayPROS[nextIndex];
    }
}
