package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair9430DifferenceFindingTest {
    @Test
    void methodsHandleUnexpectedDayOfWeekDifferently() {
        ClonePair9430 clonePair = new ClonePair9430();
        Calendar calendar = new FixedDayOfWeekCalendar(8);

        assertEquals("", clonePair.method1(calendar));
        assertEquals("8", clonePair.method2(calendar));
    }

    private static class FixedDayOfWeekCalendar extends Calendar {
        private final int dayOfWeek;

        private FixedDayOfWeekCalendar(int dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
        }

        @Override
        public int get(int field) {
            return field == DAY_OF_WEEK ? dayOfWeek : 0;
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
