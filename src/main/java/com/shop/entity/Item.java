package com.shop.entity;

import com.shop.constant.ItemSellStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="item")
@Getter
@Setter
@ToString
public class Item {

    @Id
    @Column(name="item_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 50)
    private String itemNm;

    @Column(name = "price", nullable = false)
    private int price;

    @Column(nullable = false)
    private int stockNumber;

    @Lob
    @Column(nullable = false)
    private  String itemDetail;

    @Enumerated(EnumType.STRING)
    @Column
    private ItemSellStatus itemSellStatus;
    // constant.enum 클래스에 저장된 SOLD, SOLD_OUT 을 사용

    private LocalDateTime regTime; // 등록 시간
    private LocalDateTime updateTime;
}
