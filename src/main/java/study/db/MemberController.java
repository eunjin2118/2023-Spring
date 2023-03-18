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

    @GetMapping("/get_members")
    public Iterable<Member> getMembers() {
        return repository.findAll();
    }

    @DeleteMapping("/delete_member/{id}")
    public Map<String, Object> deleteMember(@PathVariable("id") Integer id){
        repository.deleteById(id);

        Map<String, Object> result = new HashMap<>();
        result.put("result", "success");
        return result;
    }

    @DeleteMapping("/delete_members")
    public Map<String, Object> deleteMembers(){
        repository.deleteAll();

        Map<String, Object> result = new HashMap<>();
        result.put("result", "success");
        return result;
    }

    @PatchMapping("/update_member/{id}")
    public Map<String, Object> updateMember(@PathVariable("id") Integer id,
                               @RequestBody Map<String, Object> modification){
        Optional<Member> result = repository.findById(id);
        Member member = result.get();
        if(modification.get("password") != null) {
            member.setPassword(modification.get("password").toString());
        }
        if(modification.get("name") != null) {
            member.setName(modification.get("name").toString());
        }

        repository.save(member);

        Map<String, Object> r = new HashMap<>();
        r.put("result", "success");
        return r;
    }
}
