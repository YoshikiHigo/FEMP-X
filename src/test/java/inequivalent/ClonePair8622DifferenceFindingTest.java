package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicBoolean;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8622DifferenceFindingTest {
    @Test
    void methodsNegateThreadGroupNameAndThreadNameDifferently() throws InterruptedException {
        ClonePair8622 clonePair = new ClonePair8622();
        AtomicBoolean method1Result = new AtomicBoolean();
        AtomicBoolean method2Result = new AtomicBoolean();
        Thread thread = new Thread(new ThreadGroup("group"), () -> {
            method1Result.set(clonePair.method1(null, "group", false));
            method2Result.set(clonePair.method2(null, "group", false));
        }, "worker");

        thread.start();
        thread.join();

        assertFalse(method1Result.get());
        assertTrue(method2Result.get());
    }
}
