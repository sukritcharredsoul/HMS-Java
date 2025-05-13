package com.hms.service;

import java.util.Stack ;

public class UndoService {
    private final Stack<String> undoStack = new Stack<>();

    public void recordAction(String action) {
        undoStack.push(action);
    }

    public String undoLastAction() {
        return undoStack.isEmpty() ? "Nothing to undo" : undoStack.pop();
    }
}
