package com.cookbook.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "author")
    private List<CommentEntity> comments;

    public UserEntity(String userName) {
        this.userName = userName;
    }

}
