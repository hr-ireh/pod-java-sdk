import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({TestAddDealer.class, TestAddDealerProductPermission.class, TestAddUserAndBusiness.class,
        TestBusinessDealingList.class, TestBusinessFavorite.class, TestCommentBusiness.class, TestCommentBusinessList.class,
        TestConfirmComment.class, TestDealerList.class, TestDealerProductPermissionList.class, TestDealingProductPermissionList.class, TestDisableDealer.class, TestDisableDealerProductPermission.class, TestEnableDealer.class, TestEnableDealerProductPermission.class,
        TestGetApiTokenForCreatedBusiness.class, TestGuildList.class, TestListUserCreatedBusiness.class, TestRateBusiness.class,
        TestUnconfirmComment.class, TestUpdateBusiness.class, TestUserBusinessInfos.class})
public class mainTest {
}
