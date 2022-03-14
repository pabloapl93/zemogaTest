package com.zemoga.service;

import com.zemoga.util.TwitterTemplateCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TwitterServiceImpl implements TwitterService{

    @Autowired
    private TwitterTemplateCreator twitterCreator;

    public List<Tweet> getTweets() {
        Twitter twitterTemplate = twitterCreator.getTwitterTemplate();
        return twitterTemplate.timelineOperations().getUserTimeline(5);
    }
}
