package winterProject.winterProject.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Poster {

    @Id @GeneratedValue
    @Column(name = "poster_id")
    private Long id;

    private String title;

    private String contents;

    private int recruitment; //모집인원

    @OneToMany(mappedBy = "poster",cascade = CascadeType.ALL)
    private List<RecruitmentField> recruitmentFields = new ArrayList<>();

    private String contactInfo;

    private String skills;//기술 스택

    private LocalDateTime deadline; //마감시간

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @Enumerated(EnumType.STRING)
    private Status status; //LIVE,DEAD

    @OneToMany(mappedBy = "poster",cascade = CascadeType.ALL)
    private List<Comment> comment = new ArrayList<>();


}
