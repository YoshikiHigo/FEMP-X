package equivalent;

public class ClonePair4905 {
    boolean method1(String feat, String version) {
        if ("XML".equalsIgnoreCase(feat) || "Core".equalsIgnoreCase(feat)) {
            return ((version == null) || (version.length() == 0) || "1.0".equals(version) || "2.0".equals(version));
        }
        return false;
    }

    boolean method2(String feature, String version) {
        if ("XML".equalsIgnoreCase(feature) || "Core".equalsIgnoreCase(feature)) {
            return version == null || "".equals(version) || "2.0".equals(version) || "1.0".equals(version);
        }
        return false;
    }
}
