package com.ltc.bean;

import java.util.ArrayList;
import java.util.List;

public class MedicineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicineExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCompositionIsNull() {
            addCriterion("composition is null");
            return (Criteria) this;
        }

        public Criteria andCompositionIsNotNull() {
            addCriterion("composition is not null");
            return (Criteria) this;
        }

        public Criteria andCompositionEqualTo(String value) {
            addCriterion("composition =", value, "composition");
            return (Criteria) this;
        }

        public Criteria andCompositionNotEqualTo(String value) {
            addCriterion("composition <>", value, "composition");
            return (Criteria) this;
        }

        public Criteria andCompositionGreaterThan(String value) {
            addCriterion("composition >", value, "composition");
            return (Criteria) this;
        }

        public Criteria andCompositionGreaterThanOrEqualTo(String value) {
            addCriterion("composition >=", value, "composition");
            return (Criteria) this;
        }

        public Criteria andCompositionLessThan(String value) {
            addCriterion("composition <", value, "composition");
            return (Criteria) this;
        }

        public Criteria andCompositionLessThanOrEqualTo(String value) {
            addCriterion("composition <=", value, "composition");
            return (Criteria) this;
        }

        public Criteria andCompositionLike(String value) {
            addCriterion("composition like", value, "composition");
            return (Criteria) this;
        }

        public Criteria andCompositionNotLike(String value) {
            addCriterion("composition not like", value, "composition");
            return (Criteria) this;
        }

        public Criteria andCompositionIn(List<String> values) {
            addCriterion("composition in", values, "composition");
            return (Criteria) this;
        }

        public Criteria andCompositionNotIn(List<String> values) {
            addCriterion("composition not in", values, "composition");
            return (Criteria) this;
        }

        public Criteria andCompositionBetween(String value1, String value2) {
            addCriterion("composition between", value1, value2, "composition");
            return (Criteria) this;
        }

        public Criteria andCompositionNotBetween(String value1, String value2) {
            addCriterion("composition not between", value1, value2, "composition");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(Float value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(Float value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(Float value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(Float value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(Float value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(Float value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<Float> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<Float> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(Float value1, Float value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(Float value1, Float value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andDosageFormIsNull() {
            addCriterion("dosage_form is null");
            return (Criteria) this;
        }

        public Criteria andDosageFormIsNotNull() {
            addCriterion("dosage_form is not null");
            return (Criteria) this;
        }

        public Criteria andDosageFormEqualTo(String value) {
            addCriterion("dosage_form =", value, "dosageForm");
            return (Criteria) this;
        }

        public Criteria andDosageFormNotEqualTo(String value) {
            addCriterion("dosage_form <>", value, "dosageForm");
            return (Criteria) this;
        }

        public Criteria andDosageFormGreaterThan(String value) {
            addCriterion("dosage_form >", value, "dosageForm");
            return (Criteria) this;
        }

        public Criteria andDosageFormGreaterThanOrEqualTo(String value) {
            addCriterion("dosage_form >=", value, "dosageForm");
            return (Criteria) this;
        }

        public Criteria andDosageFormLessThan(String value) {
            addCriterion("dosage_form <", value, "dosageForm");
            return (Criteria) this;
        }

        public Criteria andDosageFormLessThanOrEqualTo(String value) {
            addCriterion("dosage_form <=", value, "dosageForm");
            return (Criteria) this;
        }

        public Criteria andDosageFormLike(String value) {
            addCriterion("dosage_form like", value, "dosageForm");
            return (Criteria) this;
        }

        public Criteria andDosageFormNotLike(String value) {
            addCriterion("dosage_form not like", value, "dosageForm");
            return (Criteria) this;
        }

        public Criteria andDosageFormIn(List<String> values) {
            addCriterion("dosage_form in", values, "dosageForm");
            return (Criteria) this;
        }

        public Criteria andDosageFormNotIn(List<String> values) {
            addCriterion("dosage_form not in", values, "dosageForm");
            return (Criteria) this;
        }

        public Criteria andDosageFormBetween(String value1, String value2) {
            addCriterion("dosage_form between", value1, value2, "dosageForm");
            return (Criteria) this;
        }

        public Criteria andDosageFormNotBetween(String value1, String value2) {
            addCriterion("dosage_form not between", value1, value2, "dosageForm");
            return (Criteria) this;
        }

        public Criteria andIndicationsIsNull() {
            addCriterion("indications is null");
            return (Criteria) this;
        }

        public Criteria andIndicationsIsNotNull() {
            addCriterion("indications is not null");
            return (Criteria) this;
        }

        public Criteria andIndicationsEqualTo(String value) {
            addCriterion("indications =", value, "indications");
            return (Criteria) this;
        }

        public Criteria andIndicationsNotEqualTo(String value) {
            addCriterion("indications <>", value, "indications");
            return (Criteria) this;
        }

        public Criteria andIndicationsGreaterThan(String value) {
            addCriterion("indications >", value, "indications");
            return (Criteria) this;
        }

        public Criteria andIndicationsGreaterThanOrEqualTo(String value) {
            addCriterion("indications >=", value, "indications");
            return (Criteria) this;
        }

        public Criteria andIndicationsLessThan(String value) {
            addCriterion("indications <", value, "indications");
            return (Criteria) this;
        }

        public Criteria andIndicationsLessThanOrEqualTo(String value) {
            addCriterion("indications <=", value, "indications");
            return (Criteria) this;
        }

        public Criteria andIndicationsLike(String value) {
            addCriterion("indications like", value, "indications");
            return (Criteria) this;
        }

        public Criteria andIndicationsNotLike(String value) {
            addCriterion("indications not like", value, "indications");
            return (Criteria) this;
        }

        public Criteria andIndicationsIn(List<String> values) {
            addCriterion("indications in", values, "indications");
            return (Criteria) this;
        }

        public Criteria andIndicationsNotIn(List<String> values) {
            addCriterion("indications not in", values, "indications");
            return (Criteria) this;
        }

        public Criteria andIndicationsBetween(String value1, String value2) {
            addCriterion("indications between", value1, value2, "indications");
            return (Criteria) this;
        }

        public Criteria andIndicationsNotBetween(String value1, String value2) {
            addCriterion("indications not between", value1, value2, "indications");
            return (Criteria) this;
        }

        public Criteria andAdverseReactionsIsNull() {
            addCriterion("adverse_reactions is null");
            return (Criteria) this;
        }

        public Criteria andAdverseReactionsIsNotNull() {
            addCriterion("adverse_reactions is not null");
            return (Criteria) this;
        }

        public Criteria andAdverseReactionsEqualTo(String value) {
            addCriterion("adverse_reactions =", value, "adverseReactions");
            return (Criteria) this;
        }

        public Criteria andAdverseReactionsNotEqualTo(String value) {
            addCriterion("adverse_reactions <>", value, "adverseReactions");
            return (Criteria) this;
        }

        public Criteria andAdverseReactionsGreaterThan(String value) {
            addCriterion("adverse_reactions >", value, "adverseReactions");
            return (Criteria) this;
        }

        public Criteria andAdverseReactionsGreaterThanOrEqualTo(String value) {
            addCriterion("adverse_reactions >=", value, "adverseReactions");
            return (Criteria) this;
        }

        public Criteria andAdverseReactionsLessThan(String value) {
            addCriterion("adverse_reactions <", value, "adverseReactions");
            return (Criteria) this;
        }

        public Criteria andAdverseReactionsLessThanOrEqualTo(String value) {
            addCriterion("adverse_reactions <=", value, "adverseReactions");
            return (Criteria) this;
        }

        public Criteria andAdverseReactionsLike(String value) {
            addCriterion("adverse_reactions like", value, "adverseReactions");
            return (Criteria) this;
        }

        public Criteria andAdverseReactionsNotLike(String value) {
            addCriterion("adverse_reactions not like", value, "adverseReactions");
            return (Criteria) this;
        }

        public Criteria andAdverseReactionsIn(List<String> values) {
            addCriterion("adverse_reactions in", values, "adverseReactions");
            return (Criteria) this;
        }

        public Criteria andAdverseReactionsNotIn(List<String> values) {
            addCriterion("adverse_reactions not in", values, "adverseReactions");
            return (Criteria) this;
        }

        public Criteria andAdverseReactionsBetween(String value1, String value2) {
            addCriterion("adverse_reactions between", value1, value2, "adverseReactions");
            return (Criteria) this;
        }

        public Criteria andAdverseReactionsNotBetween(String value1, String value2) {
            addCriterion("adverse_reactions not between", value1, value2, "adverseReactions");
            return (Criteria) this;
        }

        public Criteria andTabooIsNull() {
            addCriterion("taboo is null");
            return (Criteria) this;
        }

        public Criteria andTabooIsNotNull() {
            addCriterion("taboo is not null");
            return (Criteria) this;
        }

        public Criteria andTabooEqualTo(String value) {
            addCriterion("taboo =", value, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooNotEqualTo(String value) {
            addCriterion("taboo <>", value, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooGreaterThan(String value) {
            addCriterion("taboo >", value, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooGreaterThanOrEqualTo(String value) {
            addCriterion("taboo >=", value, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooLessThan(String value) {
            addCriterion("taboo <", value, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooLessThanOrEqualTo(String value) {
            addCriterion("taboo <=", value, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooLike(String value) {
            addCriterion("taboo like", value, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooNotLike(String value) {
            addCriterion("taboo not like", value, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooIn(List<String> values) {
            addCriterion("taboo in", values, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooNotIn(List<String> values) {
            addCriterion("taboo not in", values, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooBetween(String value1, String value2) {
            addCriterion("taboo between", value1, value2, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooNotBetween(String value1, String value2) {
            addCriterion("taboo not between", value1, value2, "taboo");
            return (Criteria) this;
        }

        public Criteria andAttentionIsNull() {
            addCriterion("attention is null");
            return (Criteria) this;
        }

        public Criteria andAttentionIsNotNull() {
            addCriterion("attention is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionEqualTo(String value) {
            addCriterion("attention =", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotEqualTo(String value) {
            addCriterion("attention <>", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionGreaterThan(String value) {
            addCriterion("attention >", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionGreaterThanOrEqualTo(String value) {
            addCriterion("attention >=", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLessThan(String value) {
            addCriterion("attention <", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLessThanOrEqualTo(String value) {
            addCriterion("attention <=", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLike(String value) {
            addCriterion("attention like", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotLike(String value) {
            addCriterion("attention not like", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionIn(List<String> values) {
            addCriterion("attention in", values, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotIn(List<String> values) {
            addCriterion("attention not in", values, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionBetween(String value1, String value2) {
            addCriterion("attention between", value1, value2, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotBetween(String value1, String value2) {
            addCriterion("attention not between", value1, value2, "attention");
            return (Criteria) this;
        }

        public Criteria andPharmacologicalIsNull() {
            addCriterion("pharmacological is null");
            return (Criteria) this;
        }

        public Criteria andPharmacologicalIsNotNull() {
            addCriterion("pharmacological is not null");
            return (Criteria) this;
        }

        public Criteria andPharmacologicalEqualTo(String value) {
            addCriterion("pharmacological =", value, "pharmacological");
            return (Criteria) this;
        }

        public Criteria andPharmacologicalNotEqualTo(String value) {
            addCriterion("pharmacological <>", value, "pharmacological");
            return (Criteria) this;
        }

        public Criteria andPharmacologicalGreaterThan(String value) {
            addCriterion("pharmacological >", value, "pharmacological");
            return (Criteria) this;
        }

        public Criteria andPharmacologicalGreaterThanOrEqualTo(String value) {
            addCriterion("pharmacological >=", value, "pharmacological");
            return (Criteria) this;
        }

        public Criteria andPharmacologicalLessThan(String value) {
            addCriterion("pharmacological <", value, "pharmacological");
            return (Criteria) this;
        }

        public Criteria andPharmacologicalLessThanOrEqualTo(String value) {
            addCriterion("pharmacological <=", value, "pharmacological");
            return (Criteria) this;
        }

        public Criteria andPharmacologicalLike(String value) {
            addCriterion("pharmacological like", value, "pharmacological");
            return (Criteria) this;
        }

        public Criteria andPharmacologicalNotLike(String value) {
            addCriterion("pharmacological not like", value, "pharmacological");
            return (Criteria) this;
        }

        public Criteria andPharmacologicalIn(List<String> values) {
            addCriterion("pharmacological in", values, "pharmacological");
            return (Criteria) this;
        }

        public Criteria andPharmacologicalNotIn(List<String> values) {
            addCriterion("pharmacological not in", values, "pharmacological");
            return (Criteria) this;
        }

        public Criteria andPharmacologicalBetween(String value1, String value2) {
            addCriterion("pharmacological between", value1, value2, "pharmacological");
            return (Criteria) this;
        }

        public Criteria andPharmacologicalNotBetween(String value1, String value2) {
            addCriterion("pharmacological not between", value1, value2, "pharmacological");
            return (Criteria) this;
        }

        public Criteria andStorageIsNull() {
            addCriterion("storage is null");
            return (Criteria) this;
        }

        public Criteria andStorageIsNotNull() {
            addCriterion("storage is not null");
            return (Criteria) this;
        }

        public Criteria andStorageEqualTo(String value) {
            addCriterion("storage =", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotEqualTo(String value) {
            addCriterion("storage <>", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageGreaterThan(String value) {
            addCriterion("storage >", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageGreaterThanOrEqualTo(String value) {
            addCriterion("storage >=", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLessThan(String value) {
            addCriterion("storage <", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLessThanOrEqualTo(String value) {
            addCriterion("storage <=", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLike(String value) {
            addCriterion("storage like", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotLike(String value) {
            addCriterion("storage not like", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageIn(List<String> values) {
            addCriterion("storage in", values, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotIn(List<String> values) {
            addCriterion("storage not in", values, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageBetween(String value1, String value2) {
            addCriterion("storage between", value1, value2, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotBetween(String value1, String value2) {
            addCriterion("storage not between", value1, value2, "storage");
            return (Criteria) this;
        }

        public Criteria andValidityIsNull() {
            addCriterion("validity is null");
            return (Criteria) this;
        }

        public Criteria andValidityIsNotNull() {
            addCriterion("validity is not null");
            return (Criteria) this;
        }

        public Criteria andValidityEqualTo(String value) {
            addCriterion("validity =", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityNotEqualTo(String value) {
            addCriterion("validity <>", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityGreaterThan(String value) {
            addCriterion("validity >", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityGreaterThanOrEqualTo(String value) {
            addCriterion("validity >=", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityLessThan(String value) {
            addCriterion("validity <", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityLessThanOrEqualTo(String value) {
            addCriterion("validity <=", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityLike(String value) {
            addCriterion("validity like", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityNotLike(String value) {
            addCriterion("validity not like", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityIn(List<String> values) {
            addCriterion("validity in", values, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityNotIn(List<String> values) {
            addCriterion("validity not in", values, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityBetween(String value1, String value2) {
            addCriterion("validity between", value1, value2, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityNotBetween(String value1, String value2) {
            addCriterion("validity not between", value1, value2, "validity");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberIsNull() {
            addCriterion("approval_number is null");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberIsNotNull() {
            addCriterion("approval_number is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberEqualTo(String value) {
            addCriterion("approval_number =", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberNotEqualTo(String value) {
            addCriterion("approval_number <>", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberGreaterThan(String value) {
            addCriterion("approval_number >", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberGreaterThanOrEqualTo(String value) {
            addCriterion("approval_number >=", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberLessThan(String value) {
            addCriterion("approval_number <", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberLessThanOrEqualTo(String value) {
            addCriterion("approval_number <=", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberLike(String value) {
            addCriterion("approval_number like", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberNotLike(String value) {
            addCriterion("approval_number not like", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberIn(List<String> values) {
            addCriterion("approval_number in", values, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberNotIn(List<String> values) {
            addCriterion("approval_number not in", values, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberBetween(String value1, String value2) {
            addCriterion("approval_number between", value1, value2, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberNotBetween(String value1, String value2) {
            addCriterion("approval_number not between", value1, value2, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andProductionEnterpriseIsNull() {
            addCriterion("production_enterprise is null");
            return (Criteria) this;
        }

        public Criteria andProductionEnterpriseIsNotNull() {
            addCriterion("production_enterprise is not null");
            return (Criteria) this;
        }

        public Criteria andProductionEnterpriseEqualTo(String value) {
            addCriterion("production_enterprise =", value, "productionEnterprise");
            return (Criteria) this;
        }

        public Criteria andProductionEnterpriseNotEqualTo(String value) {
            addCriterion("production_enterprise <>", value, "productionEnterprise");
            return (Criteria) this;
        }

        public Criteria andProductionEnterpriseGreaterThan(String value) {
            addCriterion("production_enterprise >", value, "productionEnterprise");
            return (Criteria) this;
        }

        public Criteria andProductionEnterpriseGreaterThanOrEqualTo(String value) {
            addCriterion("production_enterprise >=", value, "productionEnterprise");
            return (Criteria) this;
        }

        public Criteria andProductionEnterpriseLessThan(String value) {
            addCriterion("production_enterprise <", value, "productionEnterprise");
            return (Criteria) this;
        }

        public Criteria andProductionEnterpriseLessThanOrEqualTo(String value) {
            addCriterion("production_enterprise <=", value, "productionEnterprise");
            return (Criteria) this;
        }

        public Criteria andProductionEnterpriseLike(String value) {
            addCriterion("production_enterprise like", value, "productionEnterprise");
            return (Criteria) this;
        }

        public Criteria andProductionEnterpriseNotLike(String value) {
            addCriterion("production_enterprise not like", value, "productionEnterprise");
            return (Criteria) this;
        }

        public Criteria andProductionEnterpriseIn(List<String> values) {
            addCriterion("production_enterprise in", values, "productionEnterprise");
            return (Criteria) this;
        }

        public Criteria andProductionEnterpriseNotIn(List<String> values) {
            addCriterion("production_enterprise not in", values, "productionEnterprise");
            return (Criteria) this;
        }

        public Criteria andProductionEnterpriseBetween(String value1, String value2) {
            addCriterion("production_enterprise between", value1, value2, "productionEnterprise");
            return (Criteria) this;
        }

        public Criteria andProductionEnterpriseNotBetween(String value1, String value2) {
            addCriterion("production_enterprise not between", value1, value2, "productionEnterprise");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}