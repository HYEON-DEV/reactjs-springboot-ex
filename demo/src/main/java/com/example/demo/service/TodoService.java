package com.example.demo.service;

import com.example.demo.model.TodoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    public String testService() {
        return "Test Service";
        // TodoEntity 생성
        //TodoEntity entity = TodoEntity.builder().title("My first todo item").build();
        // TodoEntity 저장


    }
}
