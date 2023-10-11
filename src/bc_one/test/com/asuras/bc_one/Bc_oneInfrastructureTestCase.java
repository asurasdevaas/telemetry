package com.asuras.bc_one;


import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import com.asuras.shared.infraestructure.InfrastructureTestCase;
import com.asuras.apps.Starter;



@ContextConfiguration(classes = Starter.class)
@SpringBootTest
public abstract class Bc_oneInfrastructureTestCase extends InfrastructureTestCase {
}