package com.robert.elasticsearchdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

//@Data getter, setter, toString, equals, hashCode, requiredArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "product")
public class Product {
    @Id
    private String id;
    private String name;
    private Double price;

}
