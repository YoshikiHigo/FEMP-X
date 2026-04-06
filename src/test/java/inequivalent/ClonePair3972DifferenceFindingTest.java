package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair3972DifferenceFindingTest {

    private final ClonePair3972 subject = new ClonePair3972();

    @Test
    void methodsUseOppositeInequalityBranches() {
        assertTrue(subject.method1(Set.of("1.0"), Set.of("2.0")) > 0.0);
        assertEquals(0.0, subject.method2(Set.of("1.0"), Set.of("2.0")));
    }
}
