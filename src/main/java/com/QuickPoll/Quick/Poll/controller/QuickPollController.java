package com.QuickPoll.Quick.Poll.controller;

import com.QuickPoll.Quick.Poll.Polls;
import com.QuickPoll.Quick.Poll.domain.Poll;
import com.QuickPoll.Quick.Poll.service.QuickPollServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuickPollController {

//    @Autowired
//    QuickPollServices quickPollServices;
//    //private QuickPollServices quickPollServices;
//
//    @PostMapping("/polls")
//    public ResponseEntity<Iterable<Polls>> getAllPolls() {
//        return quickPollServices.getAllPolls();
////    public void addPolls(@RequestBody Polls polls) {
////        quickPollServices.addPoll(polls);
//    }
//
//    @RequestMapping(value = "/polls", method = RequestMethod.GET)
//    public ResponseEntity<Iterable<Poll>> getAllPolls(){
//        quickPollServices.getAllPolls();
//        return new ResponseEntity<>(quickPollServices.getAllPolls(), HttpStatus,ok)
//    }


    @RequestMapping(value="/polls", method=RequestMethod.GET)
    public ResponseEntity<Iterable<Poll>> getAllPolls() {
        Iterable<Poll> allPolls = quickPollRepository.findAll();
        return new ResponseEntity<>(quickPollRepository.findAll(), HttpStatus.OK);
    }

}
