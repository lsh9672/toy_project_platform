package winterProject.winterProject.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class RecruitmentField {

    @Id @GeneratedValue
    @Column(name = "recruitment_field_id")
    private Long id;

    private String mainTask;

    private String qualification;

    private String preference;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "poster_id")
    private Poster poster;
}
