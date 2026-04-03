package equivalent;

public class ClonePair8968 {
    boolean method1(String outcome, String prevOutcome) {
        if (outcome.startsWith("I-")) {
            if (prevOutcome == null) {
                return (false);
            } else {
                if (prevOutcome.equals("O")) {
                    return (false);
                }
                return prevOutcome.substring(2).equals(outcome.substring(2));
            }
        }
        return (true);
    }

    boolean method2(String outcome, String prevOutcome) {
        if (outcome.startsWith("I-")) {
            if (prevOutcome == null) {
                return (false);
            } else {
                if (prevOutcome.equals("O")) {
                    return (false);
                }
                return prevOutcome.substring(2).equals(outcome.substring(2));
            }
        }
        return true;
    }
}
