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
public class Goal extends BaseEntity<Integer> {
    int memberId;
    int matchesId;

    public Goal(Integer id, int memberId, int matchesId) {
        super(id);
        this.memberId = memberId;
        this.matchesId = matchesId;
    }
}

