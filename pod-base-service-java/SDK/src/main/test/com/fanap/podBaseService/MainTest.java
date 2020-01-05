package com.fanap.podBaseService;

import org.junit.Rule;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({TestAddTagTree.class, TestAddTagTreeCategory.class, TestGetCurrencyList.class,
        TestGetTagTreeCategoryList.class, TestGetTagTreeList.class, TestUpdateTagTreeCategory.class, TestUpdateTagTree.class})
class MainTest {

    @Rule
    public final TestRule globalTimeout = Timeout.millis(20000);
}