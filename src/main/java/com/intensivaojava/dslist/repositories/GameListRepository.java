package com.intensivaojava.dslist.repositories;

import com.intensivaojava.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
