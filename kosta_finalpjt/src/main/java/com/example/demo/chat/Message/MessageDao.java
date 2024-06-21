package com.example.demo.chat.Message;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MessageDao extends JpaRepository<Message, Long> {
	  List<Message> findByRoom_ChatroomidOrderByIdAsc(String chatroomid);
}
