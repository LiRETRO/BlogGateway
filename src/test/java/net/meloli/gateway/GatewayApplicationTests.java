package net.meloli.gateway;

import net.meloli.gateway.config.CommandHelloWorld;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Future;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GatewayApplicationTests {

    @Test
    public void contextLoads() {

    }

    @Test
    public void testAsynchronous2() throws Exception {

        Future<String> fWorld = new CommandHelloWorld("World").queue();
        Future<String> fBob = new CommandHelloWorld("Bob").queue();

        assertEquals ("HelloWorld", fWorld.get());
        assertEquals("HelloBob", fBob.get());
    }


}
