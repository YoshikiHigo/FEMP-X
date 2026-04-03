package equivalent;

public class ClonePair3917 {
    Double method1(String v1, String v2) {
        Double myDouble = null;
        if (!v1.trim().equals("") || !v2.trim().equals("")) try {
            String s1 = (v1.equals("")) ? "0" : v1;
            String s2 = (v2.equals("")) ? "0" : v2;
            String s12 = s1 + "." + s2;
            myDouble = new Double(Double.parseDouble(s12));
        } catch (Exception ex) {
        }
        return myDouble;
    }

    Double method2(String v1, String v2) {
        Double myDouble = null;
        if (!v1.trim().equals("") || !v2.trim().equals("")) {
            try {
                String s1 = (v1.equals("")) ? "0" : v1;
                String s2 = (v2.equals("")) ? "0" : v2;
                String s12 = s1 + "." + s2;
                myDouble = new Double(Double.parseDouble(s12));
            } catch (Exception ex) {
            }
        }
        return myDouble;
    }
}
