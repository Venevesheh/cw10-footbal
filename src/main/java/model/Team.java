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
public class Team extends BaseEntity<Integer> {
    String name;
    int cityId ;
    int stadiumId;

    public Team(Integer id, String name, int cityId, int stadiumId) {
        super(id);
        this.name = name;
        this.cityId = cityId;
        this.stadiumId = stadiumId;
    }
}
