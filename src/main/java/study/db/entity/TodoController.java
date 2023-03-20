package study.db.entity;

import org.hibernate.Internal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import study.db.TodoRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
public class TodoController {
    @Autowired TodoRepository repository;

    // 모든 할 일 내용 조회
    @GetMapping("/get_todos")
    public Iterable<Todo> getTodos() {
        return repository.findAll();
    }

    // 해당 id 할 일 내용 조회
    @GetMapping("/get_todos/{id}")
    public Todo getTodo(@PathVariable("id") Integer id) {
        Optional<Todo> result = repository.findById(id);
        return result.get();
    }

    // 할 일 내용 추가
    @PostMapping("/add_todo")
    public Map<String, Object> addTodo(@RequestBody Todo todo) {
        repository.save(todo);
        Map<String, Object> result = new HashMap<>();
        result.put("result", "success");
        return result;
    }

    // 전달 받은 내용으로 할 일 내용 변경

}
