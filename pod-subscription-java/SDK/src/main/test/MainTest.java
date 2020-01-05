import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({TestAddSubscriptionPlan.class, TestConfirmSubscription.class, TestConsumeSubscription.class,
        TestRequestSubscription.class, TestSubscriptionList.class, TestSubscriptionPlanList.class, TestUpdateSubscriptionPlan.class})
public class MainTest {
}
