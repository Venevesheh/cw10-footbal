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
    int semesterId;
    int salary;

    public Contract(Integer integer, int memberId, int semesterId, int salary) {
        super(integer);
        this.memberId = memberId;
        this.semesterId = semesterId;
        this.salary = salary;
    }
}
