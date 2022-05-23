package com.knoldus.controller;

import com.knoldus.models.MatchResult;
import com.knoldus.repository.MatchResultRepository;
//import com.knoldus.sender.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping(value = "/kafka")
public class KafkaController {

    @Autowired
    MatchResultRepository repository;

//    @Autowired
//    Producer producer;

    @GetMapping("/check")
    public String getStatus(Model model){
//        MatchResult matchResult = new MatchResult();
//        matchResult.setId(1L);
//        repository.insert(matchResult);
//        mongoTemplate.save()
//        producer.sendMessage();
//        System.out.println(repository.findById(1L).get().getId());
//        List<Player> players = playerService.getAllPlayers();
//        model.addAttribute("players",players);

//        List<Team> teams = teamService.getAllTeams();
//        model.addAttribute("teams",teams);



        List<MatchResult> matches = (List<MatchResult>) repository.findAll();
        model.addAttribute("matches", matches);
        System.out.println(matches.get(0).getResult());

        //        Point table list
//        List<PointTable> pointTables= pointService.getAllTables();
//        Collections.sort(pointTables);
//        model.addAttribute("pointTables",pointTables);
        return "dashboard";
//        return "Success";
    }
}
