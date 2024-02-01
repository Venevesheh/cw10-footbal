package model;

import base.model.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level=AccessLevel.PRIVATE)

public class Semester extends BaseEntity<Integer> {
    Date startDate;
    Date endDate;

    public Semester(Integer id,Date startDate, Date endDate) {
        super(id);
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
