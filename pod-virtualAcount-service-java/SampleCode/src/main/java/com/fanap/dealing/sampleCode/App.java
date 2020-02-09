package com.fanap.dealing.sampleCode;

import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podVirtualAccount.controller.PodVirtualAccount;
import com.fanap.podVirtualAccount.data.modelSrv.*;
import com.fanap.podVirtualAccount.data.modelVo.*;
import com.fanap.podVirtualAccount.enums.EnumTypeCode;
import com.fanap.podVirtualAccount.enums.Enum_Tool_Code;
import com.fanap.podVirtualAccount.util.OnGetResponseListener;

import java.util.List;

/**
 * Created by Zahra Golinia on 2/4/2019.
 */

public class App {

    private static String TOKEN = "";
    private static String GUILD_CODE = "INFORMATION_TECHNOLOGY_GUILD";

    public static void main(String[] args) {

//      System.out.println(buyCredit());
//        System.out.println(buyCreditVoByAmountVo());
//        issueCreditInvoiceAndGetHash();
//        verifyCreditInvoice();
//        transferFromOwnAccounts();
//        transferFromOwnAccountsList();
//        transferToContact();
//        transferToContactList();
//        follow();
//        getBusiness();
//        getFollowers();
//        transferToFollower();
//        transferToFollowerAndCashout();
//        transferToFollowerList();
//        transferByInvoice();
//        listTransferByInvoice();
//        getGuildAccountBill();
//        getWalletAccountBill();
//        getAccountBillAsFile();
//        cardToCardList();
//        updateCardToCard();
//        addWithdrawRulePlan();
//        withdrawRulePlanList();
//        issueWithdrawRuleByPlan();
//        issueWithdrawRule();
//        withdrawRuleList();
//        revokeWithdrawRule();
//        payInvoiceByCredit();
//        withdrawRuleUsageReport();
    }

    private static void issueCreditInvoiceAndGetHash() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            final IssueCreditInvoiceAndGetHashVo issueCreditInvoiceAndGetHashVo = new IssueCreditInvoiceAndGetHashVo.Builder(baseInfoVo)
                    .setAmount(100L)
                    .setBillNumber("987")
                    .setRedirectUrl("https://www.google.com/")
                    .setWallet("PODLAND_WALLET")
                    .setUserId(7001L)
                    .build();
            podVirtualAccount.issueCreditInvoiceAndGetHash(issueCreditInvoiceAndGetHashVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
                    System.out.println(result.getResult());
                    System.out.println(issueCreditInvoiceAndGetHashVo.getLink(result.getResult()));
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    private static void verifyCreditInvoice() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            VerifyCreditInvoiceVo verifyCreditInvoiceVo = new VerifyCreditInvoiceVo.Builder(baseInfoVo)
                    .setBillNumber("987")
                    .build();
            podVirtualAccount.verifyCreditInvoice(verifyCreditInvoiceVo, new OnGetResponseListener<CreditInvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<CreditInvoiceSrv> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    //
    private static void transferFromOwnAccounts() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        GuildAmount[] guildAmounts = {new GuildAmount("ENGINEERING_GUILD", 100L), new GuildAmount("SCENARIST_GUILD", 500L)};
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            TransferFromOwnAccountsVo transferFromOwnAccountsVo = new TransferFromOwnAccountsVo.Builder(baseInfoVo)
                    .setGuildAmount(guildAmounts)
                    .build();
            podVirtualAccount.transferFromOwnAccounts(transferFromOwnAccountsVo, new OnGetResponseListener<UserAmountSrv>() {
                @Override
                public void onResponse(ResultVo<UserAmountSrv> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void transferFromOwnAccountsList() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            TransferFromOwnAccountsListVo transferFromOwnAccountsListVo = new TransferFromOwnAccountsListVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(50)
                    .setFromDate("1376/05/09")
                    .build();
            podVirtualAccount.transferFromOwnAccountsList(transferFromOwnAccountsListVo, new OnGetResponseListener<List<TransferCreditSrv>>() {
                @Override
                public void onResponse(ResultVo<List<TransferCreditSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    private static void transferToContact() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            TransferToContactVo transferToContactVo = new TransferToContactVo.Builder(baseInfoVo)
                    .setAmount(100L)
                    .setContactId(1455684L)
                    .build();
            podVirtualAccount.transferToContact(transferToContactVo, new OnGetResponseListener<TransferToContactSrv>() {
                @Override
                public void onResponse(ResultVo<TransferToContactSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void transferToContactList() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            TransferToContactListVo transferToContactListVo = new TransferToContactListVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(50)
                    .build();
            podVirtualAccount.transferToContactList(transferToContactListVo, new OnGetResponseListener<List<TransferToContactSrv>>() {
                @Override
                public void onResponse(ResultVo<List<TransferToContactSrv>> result) {
                    System.out.println(result.getResult().size());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    private static void follow() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            FollowVo followVo = new FollowVo.Builder(baseInfoVo)
                    .setBusinessId(4821L)
                    .setFollow(true)
                    .build();
            podVirtualAccount.follow(followVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void getBusiness() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            GetBusinessVo getBusinessVo = new GetBusinessVo.Builder(baseInfoVo)
                    .build();
            podVirtualAccount.getBusiness(getBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void getFollowers() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            GetFollowersVo getFollowersVo = new GetFollowersVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(50)
                    .build();
            podVirtualAccount.getFollowers(getFollowersVo, new OnGetResponseListener<List<UserSrv>>() {
                @Override
                public void onResponse(ResultVo<List<UserSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    private static void transferToFollower() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            TransferToFollowerVo transferToFollowerVo = new TransferToFollowerVo.Builder(baseInfoVo)
                    .setGuildCode("ENGINEERING_GUILD")
                    .setAmount(1L)
                    .setDescription("زود باش پول بده")
                    .setUserId(7001L)
                    .setWallet("PODLAND_WALLET")
                    .build();
            podVirtualAccount.transferToFollower(transferToFollowerVo, new OnGetResponseListener<UserAmountSrv>() {
                public void onResponse(ResultVo<UserAmountSrv> result) {
                    System.out.println(result.getResult().getCustomerAmountSrvs().get(0).getAmount());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void transferToFollowerAndCashout() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            TransferToFollowerAndCashoutVo transferToFollowerAndCashoutVo = new TransferToFollowerAndCashoutVo.Builder(baseInfoVo)
                    .setGuildCode("ENGINEERING_GUILD")
                    .setAmount(1L)
                    .setDescription("آفرین که تو تست قبل زود بهم پول دادی")
                    .setUserId(7001L)
                    .setWallet("PODLAND_WALLET")
                    .setToolCode(Enum_Tool_Code.SETTLEMENT_TOOL_CARD.getToolCode())
                    .build();
            podVirtualAccount.transferToFollowerAndCashout(transferToFollowerAndCashoutVo, new OnGetResponseListener<UserAmountSrv>() {
                public void onResponse(ResultVo<UserAmountSrv> result) {
                    System.out.println(result.getResult().getCustomerAmountSrvs().get(0).getActive());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void transferToFollowerList() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            TransferToFollowerListVo transferToFollowerListVo = new TransferToFollowerListVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(50)
                    .build();
            podVirtualAccount.transferToFollowerList(transferToFollowerListVo, new OnGetResponseListener<List<TransferToFollowerSrv>>() {
                public void onResponse(ResultVo<List<TransferToFollowerSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    private static void transferByInvoice() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            TransferByInvoiceVo transferByInvoiceVo = new TransferByInvoiceVo.Builder(baseInfoVo)
                    .setAmount(1L)
                    .setDescription("هی تو پووول بده")
                    .setInvoiceId(49873l)
                    .setGuildCode("ENGINEERING_GUILD")
//                    .setWallet("PODLAND_WALLET")
                    .build();
            podVirtualAccount.transferByInvoice(transferByInvoiceVo, new OnGetResponseListener<UserAmountSrv>() {
                @Override
                public void onResponse(ResultVo<UserAmountSrv> result) {
                    System.out.println(result.getResult().getCustomerAmountSrvs().get(0).getAmount());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    private static void listTransferByInvoice() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            ListTransferByInvoiceVo listTransferByInvoiceVo = new ListTransferByInvoiceVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(50)
                    .build();
            podVirtualAccount.listTransferByInvoice(listTransferByInvoiceVo, new OnGetResponseListener<List<TransferToFollowerSrv>>() {
                @Override
                public void onResponse(ResultVo<List<TransferToFollowerSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void getGuildAccountBill() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            GetGuildAccountBillVo getGuildAccountBillVo = new GetGuildAccountBillVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(50)
                    .build();
            podVirtualAccount.getGuildAccountBill(getGuildAccountBillVo, new OnGetResponseListener<List<AccountBillItemSrv>>() {
                @Override
                public void onResponse(ResultVo<List<AccountBillItemSrv>> result) {
                    System.out.println(result.getResult().get(0).getInvoiceId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void getWalletAccountBill() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            GetWalletAccountBillVo GetWalletAccountBillVo = new GetWalletAccountBillVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(55)
                    .setWallet("PODLAND_WALLET")
                    .build();
            podVirtualAccount.getWalletAccountBill(GetWalletAccountBillVo, new OnGetResponseListener<List<AccountBillItemSrv>>() {
                @Override
                public void onResponse(ResultVo<List<AccountBillItemSrv>> result) {
                    System.out.println(result.getResult().size());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void getAccountBillAsFile() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            GetAccountBillAsFileVo getAccountBillAsFileVo = new GetAccountBillAsFileVo.Builder(baseInfoVo)
//                    .setDateFrom("1379/06/24")
                    .setDateTo("1398/06/24")
                    .build();
            podVirtualAccount.getAccountBillAsFile(getAccountBillAsFileVo, new OnGetResponseListener<ExportServiceSrv>() {
                @Override
                public void onResponse(ResultVo<ExportServiceSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void cardToCardList() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            CardToCardListVo cardToCardListVo = new CardToCardListVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(50)
                    .build();
            podVirtualAccount.cardToCardList(cardToCardListVo, new OnGetResponseListener<List<CardToCardPoolSrv>>() {
                @Override
                public void onResponse(ResultVo<List<CardToCardPoolSrv>> result) {
                    System.out.println(result.getResult().size());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void updateCardToCard() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            UpdateCardToCardVo updateCardToCardVo = new UpdateCardToCardVo.Builder(baseInfoVo)
                    .setCardNumber("5022147896325874")
                    .setId(54545L)
                    .build();
            podVirtualAccount.updateCardToCard(updateCardToCardVo, new OnGetResponseListener<List<CardToCardPoolSrv>>() {
                @Override
                public void onResponse(ResultVo<List<CardToCardPoolSrv>> result) {
                    System.out.println(result.getResult().size());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static String buyCredit() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            BuyCreditVo buyCreditVo = new BuyCreditVo.Builder(baseInfoVo)
                    .setCallUri("https://www.google.com/")
                    .setRedirectUri("https://www.google.com/")
                    .build();
            return buyCreditVo.getLink();
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
        return null;
    }


    private static String buyCreditVoByAmount() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            BuyCreditVoByAmountVo buyCreditVoByAmountVo = new BuyCreditVoByAmountVo.Builder(baseInfoVo)
                    .setAmount(1000L)
                    .setCallUri("https://www.google.com/")
                    .setRedirectUri("https://www.google.com/")
                    .build();
            return buyCreditVoByAmountVo.getLink();
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
        return null;
    }
    private static void addWithdrawRulePlan() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            AddWithdrawRulePlanVo addWithdrawRulePlanVo = new AddWithdrawRulePlanVo.Builder(baseInfoVo)
                    .setMaxAmount(1L)
                    .setMaxCount(1L)
                    .setSubscriptionDays(1)
                    .setTypeCode(EnumTypeCode.WITHDRAW_RULE_TYPE_AMOUNT)
                    .build();
            podVirtualAccount.addWithdrawRulePlan(addWithdrawRulePlanVo, new OnGetResponseListener<WithdrawRuleSrv>() {
                @Override
                public void onResponse(ResultVo<WithdrawRuleSrv> result) {
                    System.out.println(result.getResult().getId());
                    System.out.println(result.getResult().getBusiness().getId());
                }
                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void withdrawRulePlanList() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        try {
            WithdrawRulePlanListVo withdrawRulePlanListVo = new WithdrawRulePlanListVo.Builder(baseInfoVo)
                    .setBusinessId(9371L)
                    .setId(4161L)
                    .setOffset(0)
                    .setSize(10)
                    .build();
            podVirtualAccount.withdrawRulePlanList(withdrawRulePlanListVo, new OnGetResponseListener<List<WithdrawRulePlanSrv>>() {
                @Override
                public void onResponse(ResultVo<List<WithdrawRulePlanSrv>> result) {
                    System.out.println(result.getResult().size());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static String issueWithdrawRuleByPlan() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            IssueWithdrawRuleByPlanVo issueWithdrawRuleByPlanVo = new IssueWithdrawRuleByPlanVo.Builder(baseInfoVo)
                    .setPlanId(4329L)
                    .setBusinessId(9371L)
                    .setCallUri("https://www.google.com/")
                    .setRedirectUri("https://www.google.com/")
                    .build();
            System.out.println(issueWithdrawRuleByPlanVo.getLink());
            return issueWithdrawRuleByPlanVo.getLink();
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
        return null;
    }

    private static String issueWithdrawRule() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            IssueWithdrawRuleVo issueWithdrawRuleVo = new IssueWithdrawRuleVo.Builder(baseInfoVo)
                    .setBusinessId(7811L)
                    .setCallUri("https://www.google.com/")
                    .setRedirectUri("https://www.google.com/")
                    .build();
            System.out.println(issueWithdrawRuleVo.getLink());
            return issueWithdrawRuleVo.getLink();
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
        return null;
    }

    private static void withdrawRuleList() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            WithdrawRuleListVo withdrawRuleListVo = new WithdrawRuleListVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(10)
                    .setUserId(7001L)
                    .build();
            podVirtualAccount.withdrawRuleList(withdrawRuleListVo, new OnGetResponseListener<List<WithdrawRuleForBizSrv>>() {
                @Override
                public void onResponse(ResultVo<List<WithdrawRuleForBizSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    private static void revokeWithdrawRule() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            RevokeWithdrawRuleVo revokeWithdrawRuleVo = new RevokeWithdrawRuleVo.Builder(baseInfoVo)
                    .setRuleId(2874L)
                    .build();
            podVirtualAccount.revokeWithdrawRule(revokeWithdrawRuleVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }
    private static void payInvoiceByCredit() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setOtt("836a4d52d9c3c6a1")
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        try {
            PayInvoiceByCreditVo payInvoiceByCreditVo = new PayInvoiceByCreditVo.Builder(baseInfoVo)
                    .setInvoiceId(64318L)
                    .build();
            podVirtualAccount.payInvoiceByCredit(payInvoiceByCreditVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }
                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void withdrawRuleUsageReport() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            WithdrawRuleUsageReportVo withdrawRuleUsageReportVo = new WithdrawRuleUsageReportVo.Builder(baseInfoVo)
                    .setRuleId(2874L)
                    .build();
            podVirtualAccount.withdrawRuleUsageReport(withdrawRuleUsageReportVo, new OnGetResponseListener<WithdrawRuleUsageReportSrv>() {
                @Override
                public void onResponse(ResultVo<WithdrawRuleUsageReportSrv> result) {
                    System.out.println(result.getResult().getRule().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }
}

