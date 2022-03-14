package com.zemoga.controller;

import com.zemoga.DTO.PortfolioDTO;
import com.zemoga.service.PortfolioService;
import com.zemoga.service.TwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/portfolio")
@CrossOrigin(origins = "*")
public class PortfolioController {

    @Autowired
    private PortfolioService portfolioService;

    @Autowired
    private TwitterService twitterService;

    @GetMapping("/twitter")
    public List<Tweet> getTweets(){
        return twitterService.getTweets();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUser(@PathVariable(value = "id") Long id){
        return portfolioService.findById(id);
    }

    @PutMapping
    public ResponseEntity<?> updateUser(@RequestBody PortfolioDTO portfolio){
        return portfolioService.updateUser(portfolio);
    }

}
