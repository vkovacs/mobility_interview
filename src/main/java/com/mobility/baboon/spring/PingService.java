package com.mobility.baboon.spring;

import org.springframework.stereotype.Service;

@Service
public class PingService implements NetworkService {

    @Override
    public String trace() {
        return "ping";
    }

}
