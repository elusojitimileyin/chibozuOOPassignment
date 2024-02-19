package chapterThree;

public class GeoPolitical {
    enum GeoPoliticalZone {
        NORTHWEST,
        NORTHEAST,
        NORTHCENTRAL,
        SOUTHWEST,
        SOUTHEAST,
        SOUTHSOUTH
    }

    public static  GeoPoliticalZone resolveGeozone(String location) {
       String [] northwest = {"kano","kebbi","kaduna","kastina", "zamfara", "sokoto"};
       String [] northeast = {"yobe","gombe","borno","jigawa", "adamawa", "bauchi", "taraba"};
       String [] northcentral = {"kogi", "kwara","plateau","niger","benue","FCT","nasarawa" };
       String [] southwest = {"ogun", "oyo","osun","lagos","ekiti","ondo"};
       String []  southeast = {"abia", "enugu","imo", "ebonyi","anabra"};
       String []  southsouth = {"rivers","akwa-ibom","bayelsa","cross-rivers","delta","edo"};

        if (containsIgnoreCase(northwest, location)) {
            return GeoPoliticalZone.NORTHWEST;
        } else if (containsIgnoreCase(northeast, location)) {
            return GeoPoliticalZone.NORTHEAST;
        } else if (containsIgnoreCase(northcentral, location)) {
            return GeoPoliticalZone.NORTHCENTRAL;
        } else if (containsIgnoreCase(southwest, location)) {
            return GeoPoliticalZone.SOUTHWEST;
        } else if (containsIgnoreCase(southeast, location)) {
            return GeoPoliticalZone.SOUTHEAST;
        } else if (containsIgnoreCase(southsouth, location)) {
            return GeoPoliticalZone.SOUTHSOUTH;
        } else {
            return null; // Location not found in any zone
        }
    }

    private static boolean containsIgnoreCase(String[] array, String key) {
        for (String str : array) {
            if (str.equalsIgnoreCase(key)) {
                return true;
            }
        }
        return false;
    }

}
