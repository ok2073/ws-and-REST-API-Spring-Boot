package com.keelient.learnspringboot001oreilly;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.EnableMBeanExport;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {
    private long id;
    private String name;
    private String author;

}
