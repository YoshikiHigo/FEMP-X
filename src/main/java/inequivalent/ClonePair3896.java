package inequivalent;

public class ClonePair3896 {

    boolean method1(String fileName, String fileExtensions) {
        if (fileExtensions == null || fileName == null) {
            return false;
        }
        String[] arr = fileExtensions.toUpperCase().split(" ");
        fileName = fileName.toUpperCase();
        for (String elem : arr) {
            if (!"".equals(elem) && fileName.endsWith(elem)) {
                return true;
            }
        }
        return false;
    }

    boolean method2(String value1, String value2) {
        try {
            if (value1 == null || value2 == null) {
                return false;
            } else if (value1.trim().length() == 0 || value2.trim().length() == 0) {
                return false;
            } else {
                return value1.equals(value2);
            }
        } catch (Exception e) {
            return false;
        }
    }
}
