package equivalent;

import org.junit.jupiter.api.Test;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair54DifferenceFindingTest {

    private final ClonePair54 subject = new ClonePair54();

    @Test
    void methodsUseDifferentListTraversalApis() {
        WeirdList input = new WeirdList();

        assertEquals("a", subject.method1(input, ","));
        assertEquals("b", subject.method2(input, ","));
    }

    private static final class WeirdList extends AbstractList<String> {
        @Override
        public String get(int index) {
            return "x";
        }

        @Override
        public int size() {
            return 1;
        }

        @Override
        public Iterator<String> iterator() {
            return Collections.singletonList("a").iterator();
        }

        @Override
        public ListIterator<String> listIterator() {
            return Collections.singletonList("b").listIterator();
        }
    }
}
