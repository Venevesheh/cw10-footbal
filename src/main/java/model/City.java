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
public class City extends BaseEntity<Integer> {
    String name;

    public City(Integer id, String name) {
        super(id);
        this.name = name;
    }

}
