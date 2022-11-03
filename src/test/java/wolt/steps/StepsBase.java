package wolt.steps;

import wolt.pages.DiscoveryPage;
import wolt.pages.Homepage;
import wolt.pages.RestaurantPage;

public class StepsBase {
    public DiscoveryPage discoveryPage = new DiscoveryPage();
    public static Homepage homepage;
    public RestaurantPage restaurantPage = new RestaurantPage();
}
