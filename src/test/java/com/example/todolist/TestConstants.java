package com.example.todolist;

import java.util.ArrayList;
import java.util.List;

import com.example.todolist.entity.Todo;

public class TestConstants {
    public static final List<Todo> TODOS = new ArrayList<>() {
        {

        }
    };

    public static final Todo TODO = TODOS.get(0);
}