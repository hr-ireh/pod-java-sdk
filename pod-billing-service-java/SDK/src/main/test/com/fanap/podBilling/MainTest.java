package com.fanap.podBilling;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({TestAddAutoSettlement.class, TestCancelInvoice.class, TestCloseInvoice.class,
        TestGetExportList.class, TestGetInvoiceList.class, TestGetInvoiceListAsFile.class, TestGetInvoiceListByMetadata.class,
        TestGetInvoicePaymentLink.class, TestGetPayInvoiceByUniqueNumberLink.class, TestIssueInvoice.class, TestListSettlements.class, TestGetPayInvoiceByWalletLink.class,
        TestpayInvoice.class, TestPayInvoiceByInvoice.class, TestPayInvoiceInFuture.class, TestReduceInvoice.class, TestRemoveAutoSettlement.class, TestRequestGuildSettlement.class
        , TestRequestSettlementByTool.class, TestVerifyInvoice.class, TestVerifyAndCloseInvoice.class, TestRequestGuildSettlement.class,
        TestRequestWalletSettlement.class})
public class MainTest {
}
