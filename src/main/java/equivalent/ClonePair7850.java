package equivalent;

public class ClonePair7850 {
    boolean method1(String domain, String host) {
        if (domain == null || host == null) return true;
        boolean isLocalDomain = ".local".equalsIgnoreCase(domain);
        int embeddedDotInDomain = domain.indexOf('.');
        if (embeddedDotInDomain == 0) embeddedDotInDomain = domain.indexOf('.', 1);
        if (!isLocalDomain && (embeddedDotInDomain == -1 || embeddedDotInDomain == domain.length() - 1)) return false;
        int firstDotInHost = host.indexOf('.');
        if (firstDotInHost == -1 && isLocalDomain) return true;
        int domainLength = domain.length();
        int lengthDiff = host.length() - domainLength;
        if (lengthDiff == 0) {
            return host.equalsIgnoreCase(domain);
        } else if (lengthDiff > 0) {
            String D = host.substring(lengthDiff);
            return D.equalsIgnoreCase(domain);
        } else if (lengthDiff == -1) {
            return (domain.charAt(0) == '.' && host.equalsIgnoreCase(domain.substring(1)));
        }
        return false;
    }

    boolean method2(String domain, String host) {
        if (domain == null || host == null) return true;
        boolean isLocalDomain = ".local".equalsIgnoreCase(domain);
        int embeddedDotInDomain = domain.indexOf('.');
        if (embeddedDotInDomain == 0) embeddedDotInDomain = domain.indexOf('.', 1);
        if (!isLocalDomain && (embeddedDotInDomain == -1 || embeddedDotInDomain == domain.length() - 1)) return false;
        int firstDotInHost = host.indexOf('.');
        if (firstDotInHost == -1 && isLocalDomain) return true;
        int domainLength = domain.length();
        int lengthDiff = host.length() - domainLength;
        if (lengthDiff == 0) {
            return host.equalsIgnoreCase(domain);
        } else if (lengthDiff > 0) {
            String H = host.substring(0, lengthDiff);
            String D = host.substring(lengthDiff);
            return D.equalsIgnoreCase(domain);
        } else if (lengthDiff == -1) {
            return (domain.charAt(0) == '.' && host.equalsIgnoreCase(domain.substring(1)));
        }
        return false;
    }
}
