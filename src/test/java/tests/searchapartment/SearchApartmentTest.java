package tests.searchapartment;

import tests.base.BaseTest;
import org.testng.annotations.Test;

import static constants.Constant.Urls.REALT_HOME_PAGE;

public class SearchApartmentTest extends BaseTest {
    @Test
    public void checkIsRedirectToListing() {
        basePage.open(REALT_HOME_PAGE);

        realtHomePage
                .enterCountRooms()
                .clickToFind();


    }
    @Test
            public void countResults() {

        realtListingPage.checkCountCards();
    }

}
