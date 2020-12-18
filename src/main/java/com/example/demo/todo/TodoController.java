package com.example.demo.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path="/api/v1/todos")
public class TodoController   {
    @Autowired
    private TodoService todoService;

    @GetMapping(path = {"","/"})
    public List<Todo> getAllTodos(){
        return todoService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Todo findOne(@PathVariable int id){
        return todoService.getById(id);
    }

    @PostMapping(path = {"","/"})
    public Todo createNewTodo(@RequestBody Todo todo){
        if(todoService.save(todo))return todo;
        return null;
    }

    @DeleteMapping(path = "/{id}")
    public void deleteTodo(@PathVariable int id){
        todoService.delete(id);
    }
}
