import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HelloWorldTest {

    @Test
    public void shouldGreetWhenPassedName(){
        HelloWorld  helloWorld = new HelloWorld();
        assertEquals("Hello World Orchid College",helloWorld.greetWithHelloWorld("Orchid College"));
    }
}
