package inequivalent;

public class ClonePair7851 {

    boolean method1(String actionMapping, String filterPath) {
        boolean result = false;
        int index = actionMapping.indexOf(filterPath);
        if (index != -1) result = true;
        if (index != 0 && index != -1) result = "/".equals(actionMapping.charAt(index - 1));
        return result;
    }

    boolean method2(String day, String end) {
        if (end.equals("")) return true;
        return day.compareToIgnoreCase(end) == 0;
    }
}
