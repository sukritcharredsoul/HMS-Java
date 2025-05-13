package com.hms.controller;

import com.hms.service.UndoService;

public class UndoController {
    private final UndoService undoService = new UndoService();

    public void recordAction(String action) {
        undoService.recordAction(action);
    }

    public void undoLast() {
        String undone = undoService.undoLastAction();
        System.out.println("Undone: " + undone);
    }
}
