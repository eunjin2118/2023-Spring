package study.db.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
@ToString
public class Member {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(unique=true, nullable=false)
    @NonNull
    private String username;

    @Column(nullable=false)
    @NonNull
    private String password;

    @Column(nullable=false)
    private String name;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
}
