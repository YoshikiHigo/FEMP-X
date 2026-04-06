package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair9408DifferenceFindingTest {
    @Test
    void methodsHandleUnexpectedMonthDifferently() {
        ClonePair9408 clonePair = new ClonePair9408();
        Calendar calendar = new FixedMonthCalendar(12);

        assertEquals("Dec", clonePair.method1(calendar));
        assertEquals("", clonePair.method2(calendar));
    }

    private static class FixedMonthCalendar extends Calendar {
        private final int month;

        private FixedMonthCalendar(int month) {
            this.month = month;
        }

        @Override
        public int get(int field) {
            return field == MONTH ? month : 0;
        }

        @Override
        public void add(int field, int amount) {
        }

        @Override
        public void roll(int field, boolean up) {
        }

        @Override
        public int getMinimum(int field) {
            return 0;
        }

        @Override
        public int getMaximum(int field) {
            return 0;
        }

        @Override
        public int getGreatestMinimum(int field) {
            return 0;
        }

        @Override
        public int getLeastMaximum(int field) {
            return 0;
        }

        @Override
        protected void computeTime() {
        }

        @Override
        protected void computeFields() {
        }
    }
}
