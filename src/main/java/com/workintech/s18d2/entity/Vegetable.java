package com.workintech.s18d2.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "fruit",schema = "fsweb")
public class Vegetable extends Plant  {

    @Column(name = "is_grown_on_tree")
    private Boolean isGrownOnTree;
}
