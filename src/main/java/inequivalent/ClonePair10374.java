package inequivalent;

public class ClonePair10374 {

    Integer method1(String s) {
        if (s == null) return null;
        try {
            return Integer.parseInt(s);
        } catch (Exception e) {
            System.err.println("Error decoding Integer-String '" + s + "'");
        }
        return null;
    }

    Integer method2(String stepNumberString) {
        if (stepNumberString == null) {
            return null;
        }
        try {
            Integer theStepNumber = Integer.valueOf(stepNumberString);
            return theStepNumber;
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
