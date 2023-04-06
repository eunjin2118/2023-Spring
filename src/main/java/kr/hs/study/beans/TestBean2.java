package kr.hs.study.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("aa")
@Data
@Lazy
@Scope("prototype")
public class TestBean2 {

    @Autowired
    private DataBean1 data1;

    @Autowired
    @Qualifier("java1")
    private DataBean2 data2;

}
