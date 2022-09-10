package com.shop.repository;

import com.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//<entity 타입의 class, primary key type>
public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findByItemNmOrItemDetail(String itemNm, String itemDetail);
    List<Item> findByItemNm(String itemNm);
    List<Item> findByPriceLessThan(Integer price);
    List<Item> findByPriceLessThanOrderByPriceDesc(Integer price);
}