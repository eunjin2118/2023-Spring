package study.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import study.db.entity.Member;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
public class MemberController {
    @Autowired MemberRepository repository;

    @PostMapping("/add_member")
    public Map<String, Object> addMember(@RequestBody Member member) {
        repository.save(member);
        Map<String, Object> result = new HashMap<>();
        result.put("result", "success");
        return result;
    }

    @GetMapping("/get_member/{id}")
    public Member getMember(@PathVariable("id") Integer id) {
        Optional<Member> result = repository.findById(id);
        return result.get();
    }
}
