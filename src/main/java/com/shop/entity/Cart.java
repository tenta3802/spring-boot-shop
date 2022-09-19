package com.shop.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "cart")
@Getter
@Setter
@ToString
public class Cart {

    @Id
    @Column(name = "cart_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne // Cart class 에만 명시했기 때문에 단방향 매핑
    @JoinColumn(name = "member_id")
    private Member member;
}
