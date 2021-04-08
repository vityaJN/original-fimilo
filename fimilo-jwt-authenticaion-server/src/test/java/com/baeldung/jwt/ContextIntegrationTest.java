package com.fimilo.jwt;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.fimilo.jwt.JWTAuthorizationServerApp;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = { JWTAuthorizationServerApp.class })
public class ContextIntegrationTest {

    @Test
    public void whenLoadApplication_thenSuccess() {

    }

}
