package study.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import study.db.entity.Member;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MemberController {
    @Autowired MemberRepository repository;

    @PostMapping("./add_memeber")
    public Map<String, Object> addMember(@RequestBody Member member) {
        repository.save(member);
        Map<String, Object> result = new HashMap<>();
        result.put("result", "success");
        return result;
    }
}
