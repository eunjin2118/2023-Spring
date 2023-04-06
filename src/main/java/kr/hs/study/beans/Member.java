package kr.hs.study.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Lazy
@Scope("prototype")
public class Member {

    @Autowired
    @Qualifier("p1")
    private Person p1;

    @Autowired
    @Qualifier("p2")
    private Person p2;
}
