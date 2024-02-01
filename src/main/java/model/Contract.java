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
public class Contract extends BaseEntity<Integer> {
    int memberId ;
    Date startDate;
    Date endDate;
    int salary;



    public Contract(Integer id, int memberId, Date startDate, Date endDate, int salary) {
        super(id);
        this.memberId = memberId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.salary = salary;
    }
}
