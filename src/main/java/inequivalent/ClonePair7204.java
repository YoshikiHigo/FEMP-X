package inequivalent;

public class ClonePair7204 {

    boolean method1(String title1, String title2) {
        if ((title1 == null) || (title2 == null)) {
            return false;
        }
        if ((title1.length() == 0) || (title2.length() == 0)) {
            return false;
        }
        if (Character.toUpperCase(title1.charAt(0)) != Character.toUpperCase(title2.charAt(0))) {
            return false;
        }
        return title1.substring(1).equals(title2.substring(1));
    }

    boolean method2(String oldName, String newName) {
        return (oldName != null) && (newName != null) && (!oldName.isEmpty()) && (!newName.isEmpty()) && (oldName.equals(newName));
    }
}
