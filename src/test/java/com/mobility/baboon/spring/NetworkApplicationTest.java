package com.mobility.baboon.spring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = NetworkApplication.class)
public class NetworkApplicationTest {

    @Autowired
    private NetworkService networkService;

    @Test
    public void shouldPingTheNetworkService() {
        assertEquals("ping", networkService.trace());
    }

}
