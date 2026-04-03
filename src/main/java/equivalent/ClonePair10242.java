package equivalent;

public class ClonePair10242 {
    Integer method1(String aString) {
        Integer result = null;
        if (aString != null && !aString.equals("")) {
            result = Integer.valueOf(aString);
        }
        return result;
    }

    Integer method2(String str) {
        Integer integer = null;
        if (!"".equals(str) && str != null) {
            integer = Integer.valueOf(str);
        }
        return integer;
    }
}
