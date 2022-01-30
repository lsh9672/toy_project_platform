package winterProject.winterProject.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    private String nickname;

    private String profileImage;

    private String password;

    @Embedded
    private UnivInfo univInfo;

    private String email;

    private String interests;

    private String skills;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Poster> poster = new ArrayList<>();

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Comment> comments = new ArrayList<>();

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<SubComment> subComments = new ArrayList<>();
}
