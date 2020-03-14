package com.fanap.podSakku.data.modelVo;

/**
 * Mehdi Akbarian-Rastaghi 4/16/19
 */


public class TransferRequestVo {

    private String customerEmail;
    private boolean transferGit;
    private boolean transferImageRepo;
    private boolean addAsCollaborator;

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public boolean isTransferGit() {
        return transferGit;
    }

    public void setTransferGit(boolean transferGit) {
        this.transferGit = transferGit;
    }

    public boolean isTransferImageRepo() {
        return transferImageRepo;
    }

    public void setTransferImageRepo(boolean transferImageRepo) {
        this.transferImageRepo = transferImageRepo;
    }

    public boolean isAddAsCollaborator() {
        return addAsCollaborator;
    }

    public void setAddAsCollaborator(boolean addAsCollaborator) {
        this.addAsCollaborator = addAsCollaborator;
    }
}
