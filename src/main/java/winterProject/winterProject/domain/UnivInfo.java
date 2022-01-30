package winterProject.winterProject.domain;

import lombok.Getter;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
@Getter
public class UnivInfo {

    private String univName;

    private String department;

    @Enumerated(EnumType.STRING)
    private UnivStatus status; //GRAD,EXPECT_GRAD,ATTEND,LEAVE_OF_ABSENSE
}
