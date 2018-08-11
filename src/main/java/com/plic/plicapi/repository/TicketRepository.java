package com.plic.plicapi.repository;


import com.plic.plicapi.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByuserId(String userId);
    List<Ticket> findByuserIdAndScoreIsNull(String userId);
    List<Ticket> findByuserIdAndScoreNotNull(String userId);
    List<Ticket> findByuserIdAndCommentIsNull(String userId);
    List<Ticket> findByuserIdAndCommentNotNull(String userId);
    List<Ticket> findByUserIdAndMt20id(String userId, String mt20id);
}
