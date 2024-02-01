package model;

import base.model.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Score  extends BaseEntity<Integer> {
    int teamId;
    int semesterId;
    int totalScore;

    public Score(Integer id, int teamId, int semesterId, int totalScore) {
        super(id);
        this.teamId = teamId;
        this.semesterId = semesterId;
        this.totalScore = totalScore;
    }
}
