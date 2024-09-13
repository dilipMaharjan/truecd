package karate;

import com.intuit.karate.junit5.Karate;

public class E2ERunnerIT {
    @Karate.Test
    Karate testTodo(){
        return Karate.run("todo").relativeTo(getClass());
    }
}
