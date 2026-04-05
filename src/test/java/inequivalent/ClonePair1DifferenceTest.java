package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1DifferenceTest {

    private final ClonePair1 subject = new ClonePair1();

    @Test
    void methodsReturnDifferentMessagesWhenCauseOnlyEqualsParent() {
        EqualThrowable leaf = new EqualThrowable("leaf", 7);
        EqualThrowable root = new EqualThrowable("root", 7, leaf);

        assertEquals("leaf", subject.method1(root));
        assertEquals("root", subject.method2(root));
    }

    private static final class EqualThrowable extends Throwable {

        private final int id;

        private EqualThrowable(String message, int id) {
            super(message);
            this.id = id;
        }

        private EqualThrowable(String message, int id, Throwable cause) {
            super(message, cause);
            this.id = id;
        }

        @Override
        public boolean equals(Object other) {
            if (!(other instanceof EqualThrowable that)) {
                return false;
            }
            return id == that.id;
        }

        @Override
        public int hashCode() {
            return Integer.hashCode(id);
        }
    }
}
