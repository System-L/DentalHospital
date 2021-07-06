package com.ltc.bean;

public class Medicine {
    private Integer id;

    private String name;

    private String composition;

    private Float cost;

    private String dosageForm;

    private String indications;

    private String adverseReactions;

    private String taboo;

    private String attention;

    private String pharmacological;

    private String storage;

    private String validity;

    private String approvalNumber;

    private String productionEnterprise;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition == null ? null : composition.trim();
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public String getDosageForm() {
        return dosageForm;
    }

    public void setDosageForm(String dosageForm) {
        this.dosageForm = dosageForm == null ? null : dosageForm.trim();
    }

    public String getIndications() {
        return indications;
    }

    public void setIndications(String indications) {
        this.indications = indications == null ? null : indications.trim();
    }

    public String getAdverseReactions() {
        return adverseReactions;
    }

    public void setAdverseReactions(String adverseReactions) {
        this.adverseReactions = adverseReactions == null ? null : adverseReactions.trim();
    }

    public String getTaboo() {
        return taboo;
    }

    public void setTaboo(String taboo) {
        this.taboo = taboo == null ? null : taboo.trim();
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention == null ? null : attention.trim();
    }

    public String getPharmacological() {
        return pharmacological;
    }

    public void setPharmacological(String pharmacological) {
        this.pharmacological = pharmacological == null ? null : pharmacological.trim();
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage == null ? null : storage.trim();
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity == null ? null : validity.trim();
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber == null ? null : approvalNumber.trim();
    }

    public String getProductionEnterprise() {
        return productionEnterprise;
    }

    public void setProductionEnterprise(String productionEnterprise) {
        this.productionEnterprise = productionEnterprise == null ? null : productionEnterprise.trim();
    }
}