package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TraineeDto {
   // TODO sam email wystarczy?
    private int id;
    private String name;
    private String surname;
    private String email;
    private long version;
}
