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
public class Stadium extends BaseEntity<Integer> {
    String name;
    int cityId;



    public Stadium(Integer id, String name, int cityId) {
        super(id);
        this.name = name;
        this.cityId = cityId;
    }
}
