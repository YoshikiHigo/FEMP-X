package support;

import org.junit.jupiter.api.Assertions;

public abstract class ClonePairDifferenceTestSupportBase extends ClonePairGeneratedTestSupportBase {

    protected ClonePairDifferenceTestSupportBase() {
    }

    @FunctionalInterface
    public interface ThrowingRunnable {
        void run() throws Throwable;
    }

    public static void assertThrowsByName(String expectedClassName, ThrowingRunnable runnable) {
        Throwable throwable = Assertions.assertThrows(Throwable.class, runnable::run);
        Assertions.assertEquals(expectedClassName, throwable.getClass().getName());
    }

    public static boolean[][] b2(boolean[]... rows) {
        return rows;
    }

    public static Throwable equalThrowable(String message, int id, Throwable cause) {
        return new EqualThrowable(message, id, cause);
    }

    private static final class EqualThrowable extends Throwable {

        private final int id;

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
