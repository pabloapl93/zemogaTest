package com.zemoga.service;

import org.springframework.social.twitter.api.Tweet;

import java.util.List;

public interface TwitterService {
    public List<Tweet> getTweets();
}
