package com.QuickPoll.Quick.Poll.domain;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import javax.swing.text.html.Option;

public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VOTE_ID")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "OPTION_ID")
    private Options options;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Options getOption(){
        return options;
    }

    public void setOptions(Options option){
        this.options = options;
    }


//    private Long id;
//    private String option;
//
//    public Vote(Long id, String option) {
//        this.id = id;
//        this.option = option;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getOption() {
//        return option;
//    }
//
//    public void setOption(String option) {
//        this.option = option;
//    }
//
//    @Override
//    public String toString() {
//        return "Votes{" +
//                "id=" + id +
//                ", option='" + option + '\'' +
//                '}';
//    }
}
