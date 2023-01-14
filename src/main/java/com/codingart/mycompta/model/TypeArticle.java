package com.codingart.mycompta.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeArticle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "TypeName may not be blank")
    private String typeName;


    //    Relation between TypeArticle and Article
    @OneToMany(mappedBy = "typeArticle",cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private List<Article> articleList;
}
