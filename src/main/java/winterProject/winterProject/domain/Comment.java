package winterProject.winterProject.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Comment {

    @Id @GeneratedValue
    @Column(name = "comment_id")
    private Long id;

    private String contents;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "poster_id")
    private Poster poster;
}
