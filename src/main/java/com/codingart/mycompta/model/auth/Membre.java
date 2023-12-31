package com.codingart.mycompta.model.auth;

import com.codingart.mycompta.model.article.Article;
import com.codingart.mycompta.model.environment.Environment;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;


//@JsonIdentityInfo(scope = Membre.class, generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Membre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    Relation between Membre and User
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

//    Relation between Membre and Environment
    @ManyToOne
    @JoinColumn(name = "environment_id")
    private Environment environment;


}
