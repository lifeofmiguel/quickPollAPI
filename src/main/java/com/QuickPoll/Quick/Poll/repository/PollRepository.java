package com.QuickPoll.Quick.Poll.repository;

import com.QuickPoll.Quick.Poll.domain.Poll;
import org.springframework.data.repository.CrudRepository;

public interface PollRepository extends CrudRepository<Poll, Long> {
}
