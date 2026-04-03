package equivalent;

public class ClonePair8432 {
    Double method1(String number) {
        Double myDouble = null;
        if (!number.trim().equals("")) {
            try {
                myDouble = new Double(Double.parseDouble(number));
            } catch (Exception ex) {
            }
        }
        return myDouble;
    }

    Double method2(String number) {
        Double myDouble = null;
        if (!number.trim().equals("")) try {
            myDouble = new Double(Double.parseDouble(number));
        } catch (Exception ex) {
        }
        return myDouble;
    }
}
