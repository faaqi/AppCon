package com.example.appconn_telenor;

import java.util.ArrayList;

public class todo_item {

    private String name;
    private boolean checked;

    public todo_item (String a, boolean c)
    {
        name=a;
        checked=c;
    }

    public String getName() {
        return name;
    }

    public boolean isChecked() {
        return checked;
    }

    private static int lastTodoID = 0;

//    public static ArrayList<todo_item> createTodoList(int numTodo) {
//        ArrayList<todo_item> todo = new ArrayList<todo_item>();
//
//        for (int i = 1; i <= numTodo; i++) {
//            todo.add(new todo_item("Task " + ++lastTodoID, i <= numTodo / 2));
//        }
//
//        return todo;
//    }
}
