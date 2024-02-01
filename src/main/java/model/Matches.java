package model;

import base.model.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Matches extends BaseEntity<Integer> {
    int hostTeamId;
    int guestTeamId;
    int stadiumId;
    int winnerId;
    int goalsCount;
    int hostTeamScore;
    int guestTeamScore;
    int semesterId;

    public Matches(Integer id, int hostTeamId, int guestTeamId, int stadiumId, int winnerId, int goalsCount, int hostTeamScore, int guestTeamScore, int semesterId) {
        super(id);
        this.hostTeamId = hostTeamId;
        this.guestTeamId = guestTeamId;
        this.stadiumId = stadiumId;
        this.winnerId = winnerId;
        this.goalsCount = goalsCount;
        this.hostTeamScore = hostTeamScore;
        this.guestTeamScore = guestTeamScore;
        this.semesterId = semesterId;
    }
}
