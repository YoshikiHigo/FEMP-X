package inequivalent;

public class ClonePair8622 {

    boolean method1(Object thisObject, String value, boolean regex) {
        if (regex) {
            return !Thread.currentThread().getThreadGroup().getName().matches(value);
        } else {
            return !Thread.currentThread().getThreadGroup().getName().equals(value);
        }
    }

    boolean method2(Object thisObject, String value, boolean regex) {
        if (regex) {
            return !Thread.currentThread().getName().matches(value);
        } else {
            return !Thread.currentThread().getName().equals(value);
        }
    }
}
