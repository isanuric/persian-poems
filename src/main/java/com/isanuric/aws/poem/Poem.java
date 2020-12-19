package com.isanuric.aws.poem;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Table(name = "poemslightweight")
@Table(name = "poems")
public class Poem {
//
//    @Id
//    private String id;
//    private String poem;

    @Id
    private Long id;
    private String poemName;
    private String poem;

}
