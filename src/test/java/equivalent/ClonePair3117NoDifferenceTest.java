package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair3117NoDifferenceTest {

    private final ClonePair3117 subject = new ClonePair3117();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{date(0L), date(0L)}),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{date(0L), date(0L)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{null, date(0L)}),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{null, date(0L)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{date(86_400_000L), date(0L)}),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{date(86_400_000L), date(0L)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{date(-86_400_000L), date(0L)}),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{date(-86_400_000L), date(0L)})
        );
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0], (Object) values[1]), new Object[]{Integer.valueOf(7), date(0L)}),
            capture(values -> subject.method2((Object) values[0], (Object) values[1]), new Object[]{Integer.valueOf(7), date(0L)})
        );
    }
}
