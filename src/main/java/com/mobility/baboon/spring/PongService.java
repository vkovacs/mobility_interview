package com.mobility.baboon.spring;

import org.springframework.stereotype.Service;

@Service
public class PongService implements NetworkService {

    @Override
    public String trace() {
        return "pong";
    }

}
