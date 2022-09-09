package com.shop.repository;

import com.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

//<entity 타입의 class, primary key type>
public interface ItemRepository extends JpaRepository<Item, Long> {

    }
