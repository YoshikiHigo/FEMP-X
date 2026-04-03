package inequivalent;

public class ClonePair8574 {

    boolean method1(String jName, String nodeName) {
        String tmpName = jName;
        if (jName.startsWith("discovery")) {
            int index = tmpName.lastIndexOf("_");
            tmpName = tmpName.substring(index + 1);
            return tmpName.equals(nodeName);
        } else {
            int index = tmpName.indexOf("_");
            if (index > 0) {
                tmpName = tmpName.substring(0, index);
                return nodeName.equals(tmpName);
            } else {
                return jName.equals(nodeName);
            }
        }
    }

    boolean method2(String string, String test) {
        if (test.length() > string.length()) return (false);
        if (test.equals("") && !string.equals("")) return (false);
        for (int i = 0; i < test.length(); i++) {
            if (Character.toLowerCase(string.charAt(i)) != Character.toLowerCase(test.charAt(i))) return (false);
        }
        return (true);
    }
}
