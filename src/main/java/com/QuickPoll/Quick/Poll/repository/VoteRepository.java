package com.QuickPoll.Quick.Poll.repository;

import com.QuickPoll.Quick.Poll.domain.Vote;
import org.springframework.data.repository.CrudRepository;

public interface VoteRepository extends CrudRepository<Vote, Long> {
}
