package inequivalent;

public class ClonePair2975 {

    double method1(String s) {
        double res = 0;
        try {
            if (s.equals("")) return 0;
            res = Double.parseDouble(s.trim());
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException: " + nfe.getMessage());
        }
        return res;
    }

    double method2(String TextString) {
        double d = 0;
        TextString = TextString.replaceAll(",", "");
        String TempString = "";
        TempString = TextString.replaceAll("-", "");
        if (!TempString.trim().equals("")) try {
            d = Double.parseDouble(TextString);
        } catch (Exception ex) {
            d = 0;
        }
        return d;
    }
}
