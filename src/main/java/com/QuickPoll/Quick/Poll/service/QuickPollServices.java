package com.QuickPoll.Quick.Poll.service;

import com.QuickPoll.Quick.Poll.Polls;
import com.QuickPoll.Quick.Poll.domain.Poll;
import com.QuickPoll.Quick.Poll.repository.QuickPollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class QuickPollServices {

//    public Object getAllPolls;
//    @Autowired
//    QuickPollRepository quickPollRepository;

//    @Autowired
//    QuickPollRepository quickPollRepository;
//    public ResponseEntity<Iterable<Poll>> getAllPolls(){
//        Iterable<Poll> allPolls = quickPollRepository.findAll();
//        return new ResponseEntity<>(quickPollRepository.findAll(), HttpStatus.OK);
//    }

    @Autowired
    private QuickPollRepository pollRepository;

    @Override
    @Transactional
    public void addPoll(Poll poll) {
        this.pollRepository.addPoll(poll);
    }

    @Override
    @Transactional
    public void updatePoll(Poll poll) {
        this.pollRepository.updatePoll(poll);

    }

    @Override
    @Transactional(readOnly = true)
    public List<Poll> getPollList() {
        return this.pollRepository.getPollList();
    }

    @Override
    @Transactional(readOnly = true)
    public Poll getPollById(Long id) {
        return this.pollRepository.getPollById(id);
    }

    @Override
    @Transactional
    public void removePoll(Long id) {
        this.pollRepository.removePoll(id);
    }



}
