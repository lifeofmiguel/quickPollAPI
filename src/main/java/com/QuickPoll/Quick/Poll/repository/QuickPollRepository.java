package com.QuickPoll.Quick.Poll.repository;

import com.QuickPoll.Quick.Poll.Polls;
import com.QuickPoll.Quick.Poll.domain.Options;
import com.QuickPoll.Quick.Poll.domain.Poll;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuickPollRepository extends CrudRepository<Options, Long> {
    void addPoll(Poll poll);

    void updatePoll(Poll poll);

    List<Poll> getPollList();

    Poll getPollById(Long id);

    void removePoll(Long id);

}
