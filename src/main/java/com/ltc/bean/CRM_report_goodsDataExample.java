package com.ltc.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CRM_report_goodsDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CRM_report_goodsDataExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("customer_id like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("customer_id not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderTypeIsNull() {
            addCriterion("customer_order_type is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderTypeIsNotNull() {
            addCriterion("customer_order_type is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderTypeEqualTo(String value) {
            addCriterion("customer_order_type =", value, "customerOrderType");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderTypeNotEqualTo(String value) {
            addCriterion("customer_order_type <>", value, "customerOrderType");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderTypeGreaterThan(String value) {
            addCriterion("customer_order_type >", value, "customerOrderType");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_order_type >=", value, "customerOrderType");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderTypeLessThan(String value) {
            addCriterion("customer_order_type <", value, "customerOrderType");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("customer_order_type <=", value, "customerOrderType");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderTypeLike(String value) {
            addCriterion("customer_order_type like", value, "customerOrderType");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderTypeNotLike(String value) {
            addCriterion("customer_order_type not like", value, "customerOrderType");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderTypeIn(List<String> values) {
            addCriterion("customer_order_type in", values, "customerOrderType");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderTypeNotIn(List<String> values) {
            addCriterion("customer_order_type not in", values, "customerOrderType");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderTypeBetween(String value1, String value2) {
            addCriterion("customer_order_type between", value1, value2, "customerOrderType");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderTypeNotBetween(String value1, String value2) {
            addCriterion("customer_order_type not between", value1, value2, "customerOrderType");
            return (Criteria) this;
        }

        public Criteria andGoodsDayIsNull() {
            addCriterion("goods_day is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDayIsNotNull() {
            addCriterion("goods_day is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDayEqualTo(Date value) {
            addCriterionForJDBCDate("goods_day =", value, "goodsDay");
            return (Criteria) this;
        }

        public Criteria andGoodsDayNotEqualTo(Date value) {
            addCriterionForJDBCDate("goods_day <>", value, "goodsDay");
            return (Criteria) this;
        }

        public Criteria andGoodsDayGreaterThan(Date value) {
            addCriterionForJDBCDate("goods_day >", value, "goodsDay");
            return (Criteria) this;
        }

        public Criteria andGoodsDayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("goods_day >=", value, "goodsDay");
            return (Criteria) this;
        }

        public Criteria andGoodsDayLessThan(Date value) {
            addCriterionForJDBCDate("goods_day <", value, "goodsDay");
            return (Criteria) this;
        }

        public Criteria andGoodsDayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("goods_day <=", value, "goodsDay");
            return (Criteria) this;
        }

        public Criteria andGoodsDayIn(List<Date> values) {
            addCriterionForJDBCDate("goods_day in", values, "goodsDay");
            return (Criteria) this;
        }

        public Criteria andGoodsDayNotIn(List<Date> values) {
            addCriterionForJDBCDate("goods_day not in", values, "goodsDay");
            return (Criteria) this;
        }

        public Criteria andGoodsDayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("goods_day between", value1, value2, "goodsDay");
            return (Criteria) this;
        }

        public Criteria andGoodsDayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("goods_day not between", value1, value2, "goodsDay");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andGoodsYearIsNull() {
            addCriterion("goods_year is null");
            return (Criteria) this;
        }

        public Criteria andGoodsYearIsNotNull() {
            addCriterion("goods_year is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsYearEqualTo(Integer value) {
            addCriterion("goods_year =", value, "goodsYear");
            return (Criteria) this;
        }

        public Criteria andGoodsYearNotEqualTo(Integer value) {
            addCriterion("goods_year <>", value, "goodsYear");
            return (Criteria) this;
        }

        public Criteria andGoodsYearGreaterThan(Integer value) {
            addCriterion("goods_year >", value, "goodsYear");
            return (Criteria) this;
        }

        public Criteria andGoodsYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_year >=", value, "goodsYear");
            return (Criteria) this;
        }

        public Criteria andGoodsYearLessThan(Integer value) {
            addCriterion("goods_year <", value, "goodsYear");
            return (Criteria) this;
        }

        public Criteria andGoodsYearLessThanOrEqualTo(Integer value) {
            addCriterion("goods_year <=", value, "goodsYear");
            return (Criteria) this;
        }

        public Criteria andGoodsYearIn(List<Integer> values) {
            addCriterion("goods_year in", values, "goodsYear");
            return (Criteria) this;
        }

        public Criteria andGoodsYearNotIn(List<Integer> values) {
            addCriterion("goods_year not in", values, "goodsYear");
            return (Criteria) this;
        }

        public Criteria andGoodsYearBetween(Integer value1, Integer value2) {
            addCriterion("goods_year between", value1, value2, "goodsYear");
            return (Criteria) this;
        }

        public Criteria andGoodsYearNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_year not between", value1, value2, "goodsYear");
            return (Criteria) this;
        }

        public Criteria andGoodsMonthIsNull() {
            addCriterion("goods_month is null");
            return (Criteria) this;
        }

        public Criteria andGoodsMonthIsNotNull() {
            addCriterion("goods_month is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsMonthEqualTo(Integer value) {
            addCriterion("goods_month =", value, "goodsMonth");
            return (Criteria) this;
        }

        public Criteria andGoodsMonthNotEqualTo(Integer value) {
            addCriterion("goods_month <>", value, "goodsMonth");
            return (Criteria) this;
        }

        public Criteria andGoodsMonthGreaterThan(Integer value) {
            addCriterion("goods_month >", value, "goodsMonth");
            return (Criteria) this;
        }

        public Criteria andGoodsMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_month >=", value, "goodsMonth");
            return (Criteria) this;
        }

        public Criteria andGoodsMonthLessThan(Integer value) {
            addCriterion("goods_month <", value, "goodsMonth");
            return (Criteria) this;
        }

        public Criteria andGoodsMonthLessThanOrEqualTo(Integer value) {
            addCriterion("goods_month <=", value, "goodsMonth");
            return (Criteria) this;
        }

        public Criteria andGoodsMonthIn(List<Integer> values) {
            addCriterion("goods_month in", values, "goodsMonth");
            return (Criteria) this;
        }

        public Criteria andGoodsMonthNotIn(List<Integer> values) {
            addCriterion("goods_month not in", values, "goodsMonth");
            return (Criteria) this;
        }

        public Criteria andGoodsMonthBetween(Integer value1, Integer value2) {
            addCriterion("goods_month between", value1, value2, "goodsMonth");
            return (Criteria) this;
        }

        public Criteria andGoodsMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_month not between", value1, value2, "goodsMonth");
            return (Criteria) this;
        }

        public Criteria andBigAreaIsNull() {
            addCriterion("big_area is null");
            return (Criteria) this;
        }

        public Criteria andBigAreaIsNotNull() {
            addCriterion("big_area is not null");
            return (Criteria) this;
        }

        public Criteria andBigAreaEqualTo(String value) {
            addCriterion("big_area =", value, "bigArea");
            return (Criteria) this;
        }

        public Criteria andBigAreaNotEqualTo(String value) {
            addCriterion("big_area <>", value, "bigArea");
            return (Criteria) this;
        }

        public Criteria andBigAreaGreaterThan(String value) {
            addCriterion("big_area >", value, "bigArea");
            return (Criteria) this;
        }

        public Criteria andBigAreaGreaterThanOrEqualTo(String value) {
            addCriterion("big_area >=", value, "bigArea");
            return (Criteria) this;
        }

        public Criteria andBigAreaLessThan(String value) {
            addCriterion("big_area <", value, "bigArea");
            return (Criteria) this;
        }

        public Criteria andBigAreaLessThanOrEqualTo(String value) {
            addCriterion("big_area <=", value, "bigArea");
            return (Criteria) this;
        }

        public Criteria andBigAreaLike(String value) {
            addCriterion("big_area like", value, "bigArea");
            return (Criteria) this;
        }

        public Criteria andBigAreaNotLike(String value) {
            addCriterion("big_area not like", value, "bigArea");
            return (Criteria) this;
        }

        public Criteria andBigAreaIn(List<String> values) {
            addCriterion("big_area in", values, "bigArea");
            return (Criteria) this;
        }

        public Criteria andBigAreaNotIn(List<String> values) {
            addCriterion("big_area not in", values, "bigArea");
            return (Criteria) this;
        }

        public Criteria andBigAreaBetween(String value1, String value2) {
            addCriterion("big_area between", value1, value2, "bigArea");
            return (Criteria) this;
        }

        public Criteria andBigAreaNotBetween(String value1, String value2) {
            addCriterion("big_area not between", value1, value2, "bigArea");
            return (Criteria) this;
        }

        public Criteria andBigAreaNameIsNull() {
            addCriterion("big_area_name is null");
            return (Criteria) this;
        }

        public Criteria andBigAreaNameIsNotNull() {
            addCriterion("big_area_name is not null");
            return (Criteria) this;
        }

        public Criteria andBigAreaNameEqualTo(String value) {
            addCriterion("big_area_name =", value, "bigAreaName");
            return (Criteria) this;
        }

        public Criteria andBigAreaNameNotEqualTo(String value) {
            addCriterion("big_area_name <>", value, "bigAreaName");
            return (Criteria) this;
        }

        public Criteria andBigAreaNameGreaterThan(String value) {
            addCriterion("big_area_name >", value, "bigAreaName");
            return (Criteria) this;
        }

        public Criteria andBigAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("big_area_name >=", value, "bigAreaName");
            return (Criteria) this;
        }

        public Criteria andBigAreaNameLessThan(String value) {
            addCriterion("big_area_name <", value, "bigAreaName");
            return (Criteria) this;
        }

        public Criteria andBigAreaNameLessThanOrEqualTo(String value) {
            addCriterion("big_area_name <=", value, "bigAreaName");
            return (Criteria) this;
        }

        public Criteria andBigAreaNameLike(String value) {
            addCriterion("big_area_name like", value, "bigAreaName");
            return (Criteria) this;
        }

        public Criteria andBigAreaNameNotLike(String value) {
            addCriterion("big_area_name not like", value, "bigAreaName");
            return (Criteria) this;
        }

        public Criteria andBigAreaNameIn(List<String> values) {
            addCriterion("big_area_name in", values, "bigAreaName");
            return (Criteria) this;
        }

        public Criteria andBigAreaNameNotIn(List<String> values) {
            addCriterion("big_area_name not in", values, "bigAreaName");
            return (Criteria) this;
        }

        public Criteria andBigAreaNameBetween(String value1, String value2) {
            addCriterion("big_area_name between", value1, value2, "bigAreaName");
            return (Criteria) this;
        }

        public Criteria andBigAreaNameNotBetween(String value1, String value2) {
            addCriterion("big_area_name not between", value1, value2, "bigAreaName");
            return (Criteria) this;
        }

        public Criteria andSmallAreaIsNull() {
            addCriterion("small_area is null");
            return (Criteria) this;
        }

        public Criteria andSmallAreaIsNotNull() {
            addCriterion("small_area is not null");
            return (Criteria) this;
        }

        public Criteria andSmallAreaEqualTo(String value) {
            addCriterion("small_area =", value, "smallArea");
            return (Criteria) this;
        }

        public Criteria andSmallAreaNotEqualTo(String value) {
            addCriterion("small_area <>", value, "smallArea");
            return (Criteria) this;
        }

        public Criteria andSmallAreaGreaterThan(String value) {
            addCriterion("small_area >", value, "smallArea");
            return (Criteria) this;
        }

        public Criteria andSmallAreaGreaterThanOrEqualTo(String value) {
            addCriterion("small_area >=", value, "smallArea");
            return (Criteria) this;
        }

        public Criteria andSmallAreaLessThan(String value) {
            addCriterion("small_area <", value, "smallArea");
            return (Criteria) this;
        }

        public Criteria andSmallAreaLessThanOrEqualTo(String value) {
            addCriterion("small_area <=", value, "smallArea");
            return (Criteria) this;
        }

        public Criteria andSmallAreaLike(String value) {
            addCriterion("small_area like", value, "smallArea");
            return (Criteria) this;
        }

        public Criteria andSmallAreaNotLike(String value) {
            addCriterion("small_area not like", value, "smallArea");
            return (Criteria) this;
        }

        public Criteria andSmallAreaIn(List<String> values) {
            addCriterion("small_area in", values, "smallArea");
            return (Criteria) this;
        }

        public Criteria andSmallAreaNotIn(List<String> values) {
            addCriterion("small_area not in", values, "smallArea");
            return (Criteria) this;
        }

        public Criteria andSmallAreaBetween(String value1, String value2) {
            addCriterion("small_area between", value1, value2, "smallArea");
            return (Criteria) this;
        }

        public Criteria andSmallAreaNotBetween(String value1, String value2) {
            addCriterion("small_area not between", value1, value2, "smallArea");
            return (Criteria) this;
        }

        public Criteria andSmallAreaNameIsNull() {
            addCriterion("small_area_name is null");
            return (Criteria) this;
        }

        public Criteria andSmallAreaNameIsNotNull() {
            addCriterion("small_area_name is not null");
            return (Criteria) this;
        }

        public Criteria andSmallAreaNameEqualTo(String value) {
            addCriterion("small_area_name =", value, "smallAreaName");
            return (Criteria) this;
        }

        public Criteria andSmallAreaNameNotEqualTo(String value) {
            addCriterion("small_area_name <>", value, "smallAreaName");
            return (Criteria) this;
        }

        public Criteria andSmallAreaNameGreaterThan(String value) {
            addCriterion("small_area_name >", value, "smallAreaName");
            return (Criteria) this;
        }

        public Criteria andSmallAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("small_area_name >=", value, "smallAreaName");
            return (Criteria) this;
        }

        public Criteria andSmallAreaNameLessThan(String value) {
            addCriterion("small_area_name <", value, "smallAreaName");
            return (Criteria) this;
        }

        public Criteria andSmallAreaNameLessThanOrEqualTo(String value) {
            addCriterion("small_area_name <=", value, "smallAreaName");
            return (Criteria) this;
        }

        public Criteria andSmallAreaNameLike(String value) {
            addCriterion("small_area_name like", value, "smallAreaName");
            return (Criteria) this;
        }

        public Criteria andSmallAreaNameNotLike(String value) {
            addCriterion("small_area_name not like", value, "smallAreaName");
            return (Criteria) this;
        }

        public Criteria andSmallAreaNameIn(List<String> values) {
            addCriterion("small_area_name in", values, "smallAreaName");
            return (Criteria) this;
        }

        public Criteria andSmallAreaNameNotIn(List<String> values) {
            addCriterion("small_area_name not in", values, "smallAreaName");
            return (Criteria) this;
        }

        public Criteria andSmallAreaNameBetween(String value1, String value2) {
            addCriterion("small_area_name between", value1, value2, "smallAreaName");
            return (Criteria) this;
        }

        public Criteria andSmallAreaNameNotBetween(String value1, String value2) {
            addCriterion("small_area_name not between", value1, value2, "smallAreaName");
            return (Criteria) this;
        }

        public Criteria andTicketOrgIdIsNull() {
            addCriterion("ticket_org_id is null");
            return (Criteria) this;
        }

        public Criteria andTicketOrgIdIsNotNull() {
            addCriterion("ticket_org_id is not null");
            return (Criteria) this;
        }

        public Criteria andTicketOrgIdEqualTo(String value) {
            addCriterion("ticket_org_id =", value, "ticketOrgId");
            return (Criteria) this;
        }

        public Criteria andTicketOrgIdNotEqualTo(String value) {
            addCriterion("ticket_org_id <>", value, "ticketOrgId");
            return (Criteria) this;
        }

        public Criteria andTicketOrgIdGreaterThan(String value) {
            addCriterion("ticket_org_id >", value, "ticketOrgId");
            return (Criteria) this;
        }

        public Criteria andTicketOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_org_id >=", value, "ticketOrgId");
            return (Criteria) this;
        }

        public Criteria andTicketOrgIdLessThan(String value) {
            addCriterion("ticket_org_id <", value, "ticketOrgId");
            return (Criteria) this;
        }

        public Criteria andTicketOrgIdLessThanOrEqualTo(String value) {
            addCriterion("ticket_org_id <=", value, "ticketOrgId");
            return (Criteria) this;
        }

        public Criteria andTicketOrgIdLike(String value) {
            addCriterion("ticket_org_id like", value, "ticketOrgId");
            return (Criteria) this;
        }

        public Criteria andTicketOrgIdNotLike(String value) {
            addCriterion("ticket_org_id not like", value, "ticketOrgId");
            return (Criteria) this;
        }

        public Criteria andTicketOrgIdIn(List<String> values) {
            addCriterion("ticket_org_id in", values, "ticketOrgId");
            return (Criteria) this;
        }

        public Criteria andTicketOrgIdNotIn(List<String> values) {
            addCriterion("ticket_org_id not in", values, "ticketOrgId");
            return (Criteria) this;
        }

        public Criteria andTicketOrgIdBetween(String value1, String value2) {
            addCriterion("ticket_org_id between", value1, value2, "ticketOrgId");
            return (Criteria) this;
        }

        public Criteria andTicketOrgIdNotBetween(String value1, String value2) {
            addCriterion("ticket_org_id not between", value1, value2, "ticketOrgId");
            return (Criteria) this;
        }

        public Criteria andTicketOrgNameIsNull() {
            addCriterion("ticket_org_name is null");
            return (Criteria) this;
        }

        public Criteria andTicketOrgNameIsNotNull() {
            addCriterion("ticket_org_name is not null");
            return (Criteria) this;
        }

        public Criteria andTicketOrgNameEqualTo(String value) {
            addCriterion("ticket_org_name =", value, "ticketOrgName");
            return (Criteria) this;
        }

        public Criteria andTicketOrgNameNotEqualTo(String value) {
            addCriterion("ticket_org_name <>", value, "ticketOrgName");
            return (Criteria) this;
        }

        public Criteria andTicketOrgNameGreaterThan(String value) {
            addCriterion("ticket_org_name >", value, "ticketOrgName");
            return (Criteria) this;
        }

        public Criteria andTicketOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_org_name >=", value, "ticketOrgName");
            return (Criteria) this;
        }

        public Criteria andTicketOrgNameLessThan(String value) {
            addCriterion("ticket_org_name <", value, "ticketOrgName");
            return (Criteria) this;
        }

        public Criteria andTicketOrgNameLessThanOrEqualTo(String value) {
            addCriterion("ticket_org_name <=", value, "ticketOrgName");
            return (Criteria) this;
        }

        public Criteria andTicketOrgNameLike(String value) {
            addCriterion("ticket_org_name like", value, "ticketOrgName");
            return (Criteria) this;
        }

        public Criteria andTicketOrgNameNotLike(String value) {
            addCriterion("ticket_org_name not like", value, "ticketOrgName");
            return (Criteria) this;
        }

        public Criteria andTicketOrgNameIn(List<String> values) {
            addCriterion("ticket_org_name in", values, "ticketOrgName");
            return (Criteria) this;
        }

        public Criteria andTicketOrgNameNotIn(List<String> values) {
            addCriterion("ticket_org_name not in", values, "ticketOrgName");
            return (Criteria) this;
        }

        public Criteria andTicketOrgNameBetween(String value1, String value2) {
            addCriterion("ticket_org_name between", value1, value2, "ticketOrgName");
            return (Criteria) this;
        }

        public Criteria andTicketOrgNameNotBetween(String value1, String value2) {
            addCriterion("ticket_org_name not between", value1, value2, "ticketOrgName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andLastStationIsNull() {
            addCriterion("last_station is null");
            return (Criteria) this;
        }

        public Criteria andLastStationIsNotNull() {
            addCriterion("last_station is not null");
            return (Criteria) this;
        }

        public Criteria andLastStationEqualTo(String value) {
            addCriterion("last_station =", value, "lastStation");
            return (Criteria) this;
        }

        public Criteria andLastStationNotEqualTo(String value) {
            addCriterion("last_station <>", value, "lastStation");
            return (Criteria) this;
        }

        public Criteria andLastStationGreaterThan(String value) {
            addCriterion("last_station >", value, "lastStation");
            return (Criteria) this;
        }

        public Criteria andLastStationGreaterThanOrEqualTo(String value) {
            addCriterion("last_station >=", value, "lastStation");
            return (Criteria) this;
        }

        public Criteria andLastStationLessThan(String value) {
            addCriterion("last_station <", value, "lastStation");
            return (Criteria) this;
        }

        public Criteria andLastStationLessThanOrEqualTo(String value) {
            addCriterion("last_station <=", value, "lastStation");
            return (Criteria) this;
        }

        public Criteria andLastStationLike(String value) {
            addCriterion("last_station like", value, "lastStation");
            return (Criteria) this;
        }

        public Criteria andLastStationNotLike(String value) {
            addCriterion("last_station not like", value, "lastStation");
            return (Criteria) this;
        }

        public Criteria andLastStationIn(List<String> values) {
            addCriterion("last_station in", values, "lastStation");
            return (Criteria) this;
        }

        public Criteria andLastStationNotIn(List<String> values) {
            addCriterion("last_station not in", values, "lastStation");
            return (Criteria) this;
        }

        public Criteria andLastStationBetween(String value1, String value2) {
            addCriterion("last_station between", value1, value2, "lastStation");
            return (Criteria) this;
        }

        public Criteria andLastStationNotBetween(String value1, String value2) {
            addCriterion("last_station not between", value1, value2, "lastStation");
            return (Criteria) this;
        }

        public Criteria andTransferCityIsNull() {
            addCriterion("transfer_city is null");
            return (Criteria) this;
        }

        public Criteria andTransferCityIsNotNull() {
            addCriterion("transfer_city is not null");
            return (Criteria) this;
        }

        public Criteria andTransferCityEqualTo(String value) {
            addCriterion("transfer_city =", value, "transferCity");
            return (Criteria) this;
        }

        public Criteria andTransferCityNotEqualTo(String value) {
            addCriterion("transfer_city <>", value, "transferCity");
            return (Criteria) this;
        }

        public Criteria andTransferCityGreaterThan(String value) {
            addCriterion("transfer_city >", value, "transferCity");
            return (Criteria) this;
        }

        public Criteria andTransferCityGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_city >=", value, "transferCity");
            return (Criteria) this;
        }

        public Criteria andTransferCityLessThan(String value) {
            addCriterion("transfer_city <", value, "transferCity");
            return (Criteria) this;
        }

        public Criteria andTransferCityLessThanOrEqualTo(String value) {
            addCriterion("transfer_city <=", value, "transferCity");
            return (Criteria) this;
        }

        public Criteria andTransferCityLike(String value) {
            addCriterion("transfer_city like", value, "transferCity");
            return (Criteria) this;
        }

        public Criteria andTransferCityNotLike(String value) {
            addCriterion("transfer_city not like", value, "transferCity");
            return (Criteria) this;
        }

        public Criteria andTransferCityIn(List<String> values) {
            addCriterion("transfer_city in", values, "transferCity");
            return (Criteria) this;
        }

        public Criteria andTransferCityNotIn(List<String> values) {
            addCriterion("transfer_city not in", values, "transferCity");
            return (Criteria) this;
        }

        public Criteria andTransferCityBetween(String value1, String value2) {
            addCriterion("transfer_city between", value1, value2, "transferCity");
            return (Criteria) this;
        }

        public Criteria andTransferCityNotBetween(String value1, String value2) {
            addCriterion("transfer_city not between", value1, value2, "transferCity");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("product_type is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("product_type is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(String value) {
            addCriterion("product_type =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(String value) {
            addCriterion("product_type <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(String value) {
            addCriterion("product_type >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("product_type >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(String value) {
            addCriterion("product_type <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(String value) {
            addCriterion("product_type <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLike(String value) {
            addCriterion("product_type like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotLike(String value) {
            addCriterion("product_type not like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<String> values) {
            addCriterion("product_type in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<String> values) {
            addCriterion("product_type not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(String value1, String value2) {
            addCriterion("product_type between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(String value1, String value2) {
            addCriterion("product_type not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andCustTypeIsNull() {
            addCriterion("cust_type is null");
            return (Criteria) this;
        }

        public Criteria andCustTypeIsNotNull() {
            addCriterion("cust_type is not null");
            return (Criteria) this;
        }

        public Criteria andCustTypeEqualTo(String value) {
            addCriterion("cust_type =", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeNotEqualTo(String value) {
            addCriterion("cust_type <>", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeGreaterThan(String value) {
            addCriterion("cust_type >", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cust_type >=", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeLessThan(String value) {
            addCriterion("cust_type <", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeLessThanOrEqualTo(String value) {
            addCriterion("cust_type <=", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeLike(String value) {
            addCriterion("cust_type like", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeNotLike(String value) {
            addCriterion("cust_type not like", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeIn(List<String> values) {
            addCriterion("cust_type in", values, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeNotIn(List<String> values) {
            addCriterion("cust_type not in", values, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeBetween(String value1, String value2) {
            addCriterion("cust_type between", value1, value2, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeNotBetween(String value1, String value2) {
            addCriterion("cust_type not between", value1, value2, "custType");
            return (Criteria) this;
        }

        public Criteria andCustGradeIsNull() {
            addCriterion("cust_grade is null");
            return (Criteria) this;
        }

        public Criteria andCustGradeIsNotNull() {
            addCriterion("cust_grade is not null");
            return (Criteria) this;
        }

        public Criteria andCustGradeEqualTo(String value) {
            addCriterion("cust_grade =", value, "custGrade");
            return (Criteria) this;
        }

        public Criteria andCustGradeNotEqualTo(String value) {
            addCriterion("cust_grade <>", value, "custGrade");
            return (Criteria) this;
        }

        public Criteria andCustGradeGreaterThan(String value) {
            addCriterion("cust_grade >", value, "custGrade");
            return (Criteria) this;
        }

        public Criteria andCustGradeGreaterThanOrEqualTo(String value) {
            addCriterion("cust_grade >=", value, "custGrade");
            return (Criteria) this;
        }

        public Criteria andCustGradeLessThan(String value) {
            addCriterion("cust_grade <", value, "custGrade");
            return (Criteria) this;
        }

        public Criteria andCustGradeLessThanOrEqualTo(String value) {
            addCriterion("cust_grade <=", value, "custGrade");
            return (Criteria) this;
        }

        public Criteria andCustGradeLike(String value) {
            addCriterion("cust_grade like", value, "custGrade");
            return (Criteria) this;
        }

        public Criteria andCustGradeNotLike(String value) {
            addCriterion("cust_grade not like", value, "custGrade");
            return (Criteria) this;
        }

        public Criteria andCustGradeIn(List<String> values) {
            addCriterion("cust_grade in", values, "custGrade");
            return (Criteria) this;
        }

        public Criteria andCustGradeNotIn(List<String> values) {
            addCriterion("cust_grade not in", values, "custGrade");
            return (Criteria) this;
        }

        public Criteria andCustGradeBetween(String value1, String value2) {
            addCriterion("cust_grade between", value1, value2, "custGrade");
            return (Criteria) this;
        }

        public Criteria andCustGradeNotBetween(String value1, String value2) {
            addCriterion("cust_grade not between", value1, value2, "custGrade");
            return (Criteria) this;
        }

        public Criteria andCountOrderIsNull() {
            addCriterion("count_order is null");
            return (Criteria) this;
        }

        public Criteria andCountOrderIsNotNull() {
            addCriterion("count_order is not null");
            return (Criteria) this;
        }

        public Criteria andCountOrderEqualTo(Integer value) {
            addCriterion("count_order =", value, "countOrder");
            return (Criteria) this;
        }

        public Criteria andCountOrderNotEqualTo(Integer value) {
            addCriterion("count_order <>", value, "countOrder");
            return (Criteria) this;
        }

        public Criteria andCountOrderGreaterThan(Integer value) {
            addCriterion("count_order >", value, "countOrder");
            return (Criteria) this;
        }

        public Criteria andCountOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_order >=", value, "countOrder");
            return (Criteria) this;
        }

        public Criteria andCountOrderLessThan(Integer value) {
            addCriterion("count_order <", value, "countOrder");
            return (Criteria) this;
        }

        public Criteria andCountOrderLessThanOrEqualTo(Integer value) {
            addCriterion("count_order <=", value, "countOrder");
            return (Criteria) this;
        }

        public Criteria andCountOrderIn(List<Integer> values) {
            addCriterion("count_order in", values, "countOrder");
            return (Criteria) this;
        }

        public Criteria andCountOrderNotIn(List<Integer> values) {
            addCriterion("count_order not in", values, "countOrder");
            return (Criteria) this;
        }

        public Criteria andCountOrderBetween(Integer value1, Integer value2) {
            addCriterion("count_order between", value1, value2, "countOrder");
            return (Criteria) this;
        }

        public Criteria andCountOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("count_order not between", value1, value2, "countOrder");
            return (Criteria) this;
        }

        public Criteria andCountNumberIsNull() {
            addCriterion("count_number is null");
            return (Criteria) this;
        }

        public Criteria andCountNumberIsNotNull() {
            addCriterion("count_number is not null");
            return (Criteria) this;
        }

        public Criteria andCountNumberEqualTo(Integer value) {
            addCriterion("count_number =", value, "countNumber");
            return (Criteria) this;
        }

        public Criteria andCountNumberNotEqualTo(Integer value) {
            addCriterion("count_number <>", value, "countNumber");
            return (Criteria) this;
        }

        public Criteria andCountNumberGreaterThan(Integer value) {
            addCriterion("count_number >", value, "countNumber");
            return (Criteria) this;
        }

        public Criteria andCountNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_number >=", value, "countNumber");
            return (Criteria) this;
        }

        public Criteria andCountNumberLessThan(Integer value) {
            addCriterion("count_number <", value, "countNumber");
            return (Criteria) this;
        }

        public Criteria andCountNumberLessThanOrEqualTo(Integer value) {
            addCriterion("count_number <=", value, "countNumber");
            return (Criteria) this;
        }

        public Criteria andCountNumberIn(List<Integer> values) {
            addCriterion("count_number in", values, "countNumber");
            return (Criteria) this;
        }

        public Criteria andCountNumberNotIn(List<Integer> values) {
            addCriterion("count_number not in", values, "countNumber");
            return (Criteria) this;
        }

        public Criteria andCountNumberBetween(Integer value1, Integer value2) {
            addCriterion("count_number between", value1, value2, "countNumber");
            return (Criteria) this;
        }

        public Criteria andCountNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("count_number not between", value1, value2, "countNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightIsNull() {
            addCriterion("goods_weight is null");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightIsNotNull() {
            addCriterion("goods_weight is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightEqualTo(BigDecimal value) {
            addCriterion("goods_weight =", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotEqualTo(BigDecimal value) {
            addCriterion("goods_weight <>", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightGreaterThan(BigDecimal value) {
            addCriterion("goods_weight >", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_weight >=", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightLessThan(BigDecimal value) {
            addCriterion("goods_weight <", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_weight <=", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightIn(List<BigDecimal> values) {
            addCriterion("goods_weight in", values, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotIn(List<BigDecimal> values) {
            addCriterion("goods_weight not in", values, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_weight between", value1, value2, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_weight not between", value1, value2, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsCubeIsNull() {
            addCriterion("goods_cube is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCubeIsNotNull() {
            addCriterion("goods_cube is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCubeEqualTo(BigDecimal value) {
            addCriterion("goods_cube =", value, "goodsCube");
            return (Criteria) this;
        }

        public Criteria andGoodsCubeNotEqualTo(BigDecimal value) {
            addCriterion("goods_cube <>", value, "goodsCube");
            return (Criteria) this;
        }

        public Criteria andGoodsCubeGreaterThan(BigDecimal value) {
            addCriterion("goods_cube >", value, "goodsCube");
            return (Criteria) this;
        }

        public Criteria andGoodsCubeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_cube >=", value, "goodsCube");
            return (Criteria) this;
        }

        public Criteria andGoodsCubeLessThan(BigDecimal value) {
            addCriterion("goods_cube <", value, "goodsCube");
            return (Criteria) this;
        }

        public Criteria andGoodsCubeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_cube <=", value, "goodsCube");
            return (Criteria) this;
        }

        public Criteria andGoodsCubeIn(List<BigDecimal> values) {
            addCriterion("goods_cube in", values, "goodsCube");
            return (Criteria) this;
        }

        public Criteria andGoodsCubeNotIn(List<BigDecimal> values) {
            addCriterion("goods_cube not in", values, "goodsCube");
            return (Criteria) this;
        }

        public Criteria andGoodsCubeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_cube between", value1, value2, "goodsCube");
            return (Criteria) this;
        }

        public Criteria andGoodsCubeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_cube not between", value1, value2, "goodsCube");
            return (Criteria) this;
        }

        public Criteria andFreightTotalIsNull() {
            addCriterion("freight_total is null");
            return (Criteria) this;
        }

        public Criteria andFreightTotalIsNotNull() {
            addCriterion("freight_total is not null");
            return (Criteria) this;
        }

        public Criteria andFreightTotalEqualTo(BigDecimal value) {
            addCriterion("freight_total =", value, "freightTotal");
            return (Criteria) this;
        }

        public Criteria andFreightTotalNotEqualTo(BigDecimal value) {
            addCriterion("freight_total <>", value, "freightTotal");
            return (Criteria) this;
        }

        public Criteria andFreightTotalGreaterThan(BigDecimal value) {
            addCriterion("freight_total >", value, "freightTotal");
            return (Criteria) this;
        }

        public Criteria andFreightTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_total >=", value, "freightTotal");
            return (Criteria) this;
        }

        public Criteria andFreightTotalLessThan(BigDecimal value) {
            addCriterion("freight_total <", value, "freightTotal");
            return (Criteria) this;
        }

        public Criteria andFreightTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_total <=", value, "freightTotal");
            return (Criteria) this;
        }

        public Criteria andFreightTotalIn(List<BigDecimal> values) {
            addCriterion("freight_total in", values, "freightTotal");
            return (Criteria) this;
        }

        public Criteria andFreightTotalNotIn(List<BigDecimal> values) {
            addCriterion("freight_total not in", values, "freightTotal");
            return (Criteria) this;
        }

        public Criteria andFreightTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_total between", value1, value2, "freightTotal");
            return (Criteria) this;
        }

        public Criteria andFreightTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_total not between", value1, value2, "freightTotal");
            return (Criteria) this;
        }

        public Criteria andSumTotalIsNull() {
            addCriterion("sum_total is null");
            return (Criteria) this;
        }

        public Criteria andSumTotalIsNotNull() {
            addCriterion("sum_total is not null");
            return (Criteria) this;
        }

        public Criteria andSumTotalEqualTo(BigDecimal value) {
            addCriterion("sum_total =", value, "sumTotal");
            return (Criteria) this;
        }

        public Criteria andSumTotalNotEqualTo(BigDecimal value) {
            addCriterion("sum_total <>", value, "sumTotal");
            return (Criteria) this;
        }

        public Criteria andSumTotalGreaterThan(BigDecimal value) {
            addCriterion("sum_total >", value, "sumTotal");
            return (Criteria) this;
        }

        public Criteria andSumTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_total >=", value, "sumTotal");
            return (Criteria) this;
        }

        public Criteria andSumTotalLessThan(BigDecimal value) {
            addCriterion("sum_total <", value, "sumTotal");
            return (Criteria) this;
        }

        public Criteria andSumTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_total <=", value, "sumTotal");
            return (Criteria) this;
        }

        public Criteria andSumTotalIn(List<BigDecimal> values) {
            addCriterion("sum_total in", values, "sumTotal");
            return (Criteria) this;
        }

        public Criteria andSumTotalNotIn(List<BigDecimal> values) {
            addCriterion("sum_total not in", values, "sumTotal");
            return (Criteria) this;
        }

        public Criteria andSumTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_total between", value1, value2, "sumTotal");
            return (Criteria) this;
        }

        public Criteria andSumTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_total not between", value1, value2, "sumTotal");
            return (Criteria) this;
        }

        public Criteria andIncrementFeeIsNull() {
            addCriterion("increment_fee is null");
            return (Criteria) this;
        }

        public Criteria andIncrementFeeIsNotNull() {
            addCriterion("increment_fee is not null");
            return (Criteria) this;
        }

        public Criteria andIncrementFeeEqualTo(BigDecimal value) {
            addCriterion("increment_fee =", value, "incrementFee");
            return (Criteria) this;
        }

        public Criteria andIncrementFeeNotEqualTo(BigDecimal value) {
            addCriterion("increment_fee <>", value, "incrementFee");
            return (Criteria) this;
        }

        public Criteria andIncrementFeeGreaterThan(BigDecimal value) {
            addCriterion("increment_fee >", value, "incrementFee");
            return (Criteria) this;
        }

        public Criteria andIncrementFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("increment_fee >=", value, "incrementFee");
            return (Criteria) this;
        }

        public Criteria andIncrementFeeLessThan(BigDecimal value) {
            addCriterion("increment_fee <", value, "incrementFee");
            return (Criteria) this;
        }

        public Criteria andIncrementFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("increment_fee <=", value, "incrementFee");
            return (Criteria) this;
        }

        public Criteria andIncrementFeeIn(List<BigDecimal> values) {
            addCriterion("increment_fee in", values, "incrementFee");
            return (Criteria) this;
        }

        public Criteria andIncrementFeeNotIn(List<BigDecimal> values) {
            addCriterion("increment_fee not in", values, "incrementFee");
            return (Criteria) this;
        }

        public Criteria andIncrementFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("increment_fee between", value1, value2, "incrementFee");
            return (Criteria) this;
        }

        public Criteria andIncrementFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("increment_fee not between", value1, value2, "incrementFee");
            return (Criteria) this;
        }

        public Criteria andTibaoFeeIsNull() {
            addCriterion("tibao_fee is null");
            return (Criteria) this;
        }

        public Criteria andTibaoFeeIsNotNull() {
            addCriterion("tibao_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTibaoFeeEqualTo(BigDecimal value) {
            addCriterion("tibao_fee =", value, "tibaoFee");
            return (Criteria) this;
        }

        public Criteria andTibaoFeeNotEqualTo(BigDecimal value) {
            addCriterion("tibao_fee <>", value, "tibaoFee");
            return (Criteria) this;
        }

        public Criteria andTibaoFeeGreaterThan(BigDecimal value) {
            addCriterion("tibao_fee >", value, "tibaoFee");
            return (Criteria) this;
        }

        public Criteria andTibaoFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tibao_fee >=", value, "tibaoFee");
            return (Criteria) this;
        }

        public Criteria andTibaoFeeLessThan(BigDecimal value) {
            addCriterion("tibao_fee <", value, "tibaoFee");
            return (Criteria) this;
        }

        public Criteria andTibaoFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tibao_fee <=", value, "tibaoFee");
            return (Criteria) this;
        }

        public Criteria andTibaoFeeIn(List<BigDecimal> values) {
            addCriterion("tibao_fee in", values, "tibaoFee");
            return (Criteria) this;
        }

        public Criteria andTibaoFeeNotIn(List<BigDecimal> values) {
            addCriterion("tibao_fee not in", values, "tibaoFee");
            return (Criteria) this;
        }

        public Criteria andTibaoFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tibao_fee between", value1, value2, "tibaoFee");
            return (Criteria) this;
        }

        public Criteria andTibaoFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tibao_fee not between", value1, value2, "tibaoFee");
            return (Criteria) this;
        }

        public Criteria andJiehuoFeeIsNull() {
            addCriterion("jiehuo_fee is null");
            return (Criteria) this;
        }

        public Criteria andJiehuoFeeIsNotNull() {
            addCriterion("jiehuo_fee is not null");
            return (Criteria) this;
        }

        public Criteria andJiehuoFeeEqualTo(BigDecimal value) {
            addCriterion("jiehuo_fee =", value, "jiehuoFee");
            return (Criteria) this;
        }

        public Criteria andJiehuoFeeNotEqualTo(BigDecimal value) {
            addCriterion("jiehuo_fee <>", value, "jiehuoFee");
            return (Criteria) this;
        }

        public Criteria andJiehuoFeeGreaterThan(BigDecimal value) {
            addCriterion("jiehuo_fee >", value, "jiehuoFee");
            return (Criteria) this;
        }

        public Criteria andJiehuoFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("jiehuo_fee >=", value, "jiehuoFee");
            return (Criteria) this;
        }

        public Criteria andJiehuoFeeLessThan(BigDecimal value) {
            addCriterion("jiehuo_fee <", value, "jiehuoFee");
            return (Criteria) this;
        }

        public Criteria andJiehuoFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("jiehuo_fee <=", value, "jiehuoFee");
            return (Criteria) this;
        }

        public Criteria andJiehuoFeeIn(List<BigDecimal> values) {
            addCriterion("jiehuo_fee in", values, "jiehuoFee");
            return (Criteria) this;
        }

        public Criteria andJiehuoFeeNotIn(List<BigDecimal> values) {
            addCriterion("jiehuo_fee not in", values, "jiehuoFee");
            return (Criteria) this;
        }

        public Criteria andJiehuoFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jiehuo_fee between", value1, value2, "jiehuoFee");
            return (Criteria) this;
        }

        public Criteria andJiehuoFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jiehuo_fee not between", value1, value2, "jiehuoFee");
            return (Criteria) this;
        }

        public Criteria andSonghuoFeeIsNull() {
            addCriterion("songhuo_fee is null");
            return (Criteria) this;
        }

        public Criteria andSonghuoFeeIsNotNull() {
            addCriterion("songhuo_fee is not null");
            return (Criteria) this;
        }

        public Criteria andSonghuoFeeEqualTo(BigDecimal value) {
            addCriterion("songhuo_fee =", value, "songhuoFee");
            return (Criteria) this;
        }

        public Criteria andSonghuoFeeNotEqualTo(BigDecimal value) {
            addCriterion("songhuo_fee <>", value, "songhuoFee");
            return (Criteria) this;
        }

        public Criteria andSonghuoFeeGreaterThan(BigDecimal value) {
            addCriterion("songhuo_fee >", value, "songhuoFee");
            return (Criteria) this;
        }

        public Criteria andSonghuoFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("songhuo_fee >=", value, "songhuoFee");
            return (Criteria) this;
        }

        public Criteria andSonghuoFeeLessThan(BigDecimal value) {
            addCriterion("songhuo_fee <", value, "songhuoFee");
            return (Criteria) this;
        }

        public Criteria andSonghuoFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("songhuo_fee <=", value, "songhuoFee");
            return (Criteria) this;
        }

        public Criteria andSonghuoFeeIn(List<BigDecimal> values) {
            addCriterion("songhuo_fee in", values, "songhuoFee");
            return (Criteria) this;
        }

        public Criteria andSonghuoFeeNotIn(List<BigDecimal> values) {
            addCriterion("songhuo_fee not in", values, "songhuoFee");
            return (Criteria) this;
        }

        public Criteria andSonghuoFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("songhuo_fee between", value1, value2, "songhuoFee");
            return (Criteria) this;
        }

        public Criteria andSonghuoFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("songhuo_fee not between", value1, value2, "songhuoFee");
            return (Criteria) this;
        }

        public Criteria andDaishouFeeIsNull() {
            addCriterion("daishou_fee is null");
            return (Criteria) this;
        }

        public Criteria andDaishouFeeIsNotNull() {
            addCriterion("daishou_fee is not null");
            return (Criteria) this;
        }

        public Criteria andDaishouFeeEqualTo(BigDecimal value) {
            addCriterion("daishou_fee =", value, "daishouFee");
            return (Criteria) this;
        }

        public Criteria andDaishouFeeNotEqualTo(BigDecimal value) {
            addCriterion("daishou_fee <>", value, "daishouFee");
            return (Criteria) this;
        }

        public Criteria andDaishouFeeGreaterThan(BigDecimal value) {
            addCriterion("daishou_fee >", value, "daishouFee");
            return (Criteria) this;
        }

        public Criteria andDaishouFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("daishou_fee >=", value, "daishouFee");
            return (Criteria) this;
        }

        public Criteria andDaishouFeeLessThan(BigDecimal value) {
            addCriterion("daishou_fee <", value, "daishouFee");
            return (Criteria) this;
        }

        public Criteria andDaishouFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("daishou_fee <=", value, "daishouFee");
            return (Criteria) this;
        }

        public Criteria andDaishouFeeIn(List<BigDecimal> values) {
            addCriterion("daishou_fee in", values, "daishouFee");
            return (Criteria) this;
        }

        public Criteria andDaishouFeeNotIn(List<BigDecimal> values) {
            addCriterion("daishou_fee not in", values, "daishouFee");
            return (Criteria) this;
        }

        public Criteria andDaishouFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("daishou_fee between", value1, value2, "daishouFee");
            return (Criteria) this;
        }

        public Criteria andDaishouFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("daishou_fee not between", value1, value2, "daishouFee");
            return (Criteria) this;
        }

        public Criteria andDaishoushouxuFeeIsNull() {
            addCriterion("daishoushouxu_fee is null");
            return (Criteria) this;
        }

        public Criteria andDaishoushouxuFeeIsNotNull() {
            addCriterion("daishoushouxu_fee is not null");
            return (Criteria) this;
        }

        public Criteria andDaishoushouxuFeeEqualTo(BigDecimal value) {
            addCriterion("daishoushouxu_fee =", value, "daishoushouxuFee");
            return (Criteria) this;
        }

        public Criteria andDaishoushouxuFeeNotEqualTo(BigDecimal value) {
            addCriterion("daishoushouxu_fee <>", value, "daishoushouxuFee");
            return (Criteria) this;
        }

        public Criteria andDaishoushouxuFeeGreaterThan(BigDecimal value) {
            addCriterion("daishoushouxu_fee >", value, "daishoushouxuFee");
            return (Criteria) this;
        }

        public Criteria andDaishoushouxuFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("daishoushouxu_fee >=", value, "daishoushouxuFee");
            return (Criteria) this;
        }

        public Criteria andDaishoushouxuFeeLessThan(BigDecimal value) {
            addCriterion("daishoushouxu_fee <", value, "daishoushouxuFee");
            return (Criteria) this;
        }

        public Criteria andDaishoushouxuFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("daishoushouxu_fee <=", value, "daishoushouxuFee");
            return (Criteria) this;
        }

        public Criteria andDaishoushouxuFeeIn(List<BigDecimal> values) {
            addCriterion("daishoushouxu_fee in", values, "daishoushouxuFee");
            return (Criteria) this;
        }

        public Criteria andDaishoushouxuFeeNotIn(List<BigDecimal> values) {
            addCriterion("daishoushouxu_fee not in", values, "daishoushouxuFee");
            return (Criteria) this;
        }

        public Criteria andDaishoushouxuFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("daishoushouxu_fee between", value1, value2, "daishoushouxuFee");
            return (Criteria) this;
        }

        public Criteria andDaishoushouxuFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("daishoushouxu_fee not between", value1, value2, "daishoushouxuFee");
            return (Criteria) this;
        }

        public Criteria andHuidanFeeIsNull() {
            addCriterion("huidan_fee is null");
            return (Criteria) this;
        }

        public Criteria andHuidanFeeIsNotNull() {
            addCriterion("huidan_fee is not null");
            return (Criteria) this;
        }

        public Criteria andHuidanFeeEqualTo(BigDecimal value) {
            addCriterion("huidan_fee =", value, "huidanFee");
            return (Criteria) this;
        }

        public Criteria andHuidanFeeNotEqualTo(BigDecimal value) {
            addCriterion("huidan_fee <>", value, "huidanFee");
            return (Criteria) this;
        }

        public Criteria andHuidanFeeGreaterThan(BigDecimal value) {
            addCriterion("huidan_fee >", value, "huidanFee");
            return (Criteria) this;
        }

        public Criteria andHuidanFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("huidan_fee >=", value, "huidanFee");
            return (Criteria) this;
        }

        public Criteria andHuidanFeeLessThan(BigDecimal value) {
            addCriterion("huidan_fee <", value, "huidanFee");
            return (Criteria) this;
        }

        public Criteria andHuidanFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("huidan_fee <=", value, "huidanFee");
            return (Criteria) this;
        }

        public Criteria andHuidanFeeIn(List<BigDecimal> values) {
            addCriterion("huidan_fee in", values, "huidanFee");
            return (Criteria) this;
        }

        public Criteria andHuidanFeeNotIn(List<BigDecimal> values) {
            addCriterion("huidan_fee not in", values, "huidanFee");
            return (Criteria) this;
        }

        public Criteria andHuidanFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("huidan_fee between", value1, value2, "huidanFee");
            return (Criteria) this;
        }

        public Criteria andHuidanFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("huidan_fee not between", value1, value2, "huidanFee");
            return (Criteria) this;
        }

        public Criteria andXinxifuwuFeeIsNull() {
            addCriterion("xinxifuwu_fee is null");
            return (Criteria) this;
        }

        public Criteria andXinxifuwuFeeIsNotNull() {
            addCriterion("xinxifuwu_fee is not null");
            return (Criteria) this;
        }

        public Criteria andXinxifuwuFeeEqualTo(BigDecimal value) {
            addCriterion("xinxifuwu_fee =", value, "xinxifuwuFee");
            return (Criteria) this;
        }

        public Criteria andXinxifuwuFeeNotEqualTo(BigDecimal value) {
            addCriterion("xinxifuwu_fee <>", value, "xinxifuwuFee");
            return (Criteria) this;
        }

        public Criteria andXinxifuwuFeeGreaterThan(BigDecimal value) {
            addCriterion("xinxifuwu_fee >", value, "xinxifuwuFee");
            return (Criteria) this;
        }

        public Criteria andXinxifuwuFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("xinxifuwu_fee >=", value, "xinxifuwuFee");
            return (Criteria) this;
        }

        public Criteria andXinxifuwuFeeLessThan(BigDecimal value) {
            addCriterion("xinxifuwu_fee <", value, "xinxifuwuFee");
            return (Criteria) this;
        }

        public Criteria andXinxifuwuFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("xinxifuwu_fee <=", value, "xinxifuwuFee");
            return (Criteria) this;
        }

        public Criteria andXinxifuwuFeeIn(List<BigDecimal> values) {
            addCriterion("xinxifuwu_fee in", values, "xinxifuwuFee");
            return (Criteria) this;
        }

        public Criteria andXinxifuwuFeeNotIn(List<BigDecimal> values) {
            addCriterion("xinxifuwu_fee not in", values, "xinxifuwuFee");
            return (Criteria) this;
        }

        public Criteria andXinxifuwuFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("xinxifuwu_fee between", value1, value2, "xinxifuwuFee");
            return (Criteria) this;
        }

        public Criteria andXinxifuwuFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("xinxifuwu_fee not between", value1, value2, "xinxifuwuFee");
            return (Criteria) this;
        }

        public Criteria andTongzhiFeeIsNull() {
            addCriterion("tongzhi_fee is null");
            return (Criteria) this;
        }

        public Criteria andTongzhiFeeIsNotNull() {
            addCriterion("tongzhi_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTongzhiFeeEqualTo(BigDecimal value) {
            addCriterion("tongzhi_fee =", value, "tongzhiFee");
            return (Criteria) this;
        }

        public Criteria andTongzhiFeeNotEqualTo(BigDecimal value) {
            addCriterion("tongzhi_fee <>", value, "tongzhiFee");
            return (Criteria) this;
        }

        public Criteria andTongzhiFeeGreaterThan(BigDecimal value) {
            addCriterion("tongzhi_fee >", value, "tongzhiFee");
            return (Criteria) this;
        }

        public Criteria andTongzhiFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tongzhi_fee >=", value, "tongzhiFee");
            return (Criteria) this;
        }

        public Criteria andTongzhiFeeLessThan(BigDecimal value) {
            addCriterion("tongzhi_fee <", value, "tongzhiFee");
            return (Criteria) this;
        }

        public Criteria andTongzhiFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tongzhi_fee <=", value, "tongzhiFee");
            return (Criteria) this;
        }

        public Criteria andTongzhiFeeIn(List<BigDecimal> values) {
            addCriterion("tongzhi_fee in", values, "tongzhiFee");
            return (Criteria) this;
        }

        public Criteria andTongzhiFeeNotIn(List<BigDecimal> values) {
            addCriterion("tongzhi_fee not in", values, "tongzhiFee");
            return (Criteria) this;
        }

        public Criteria andTongzhiFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tongzhi_fee between", value1, value2, "tongzhiFee");
            return (Criteria) this;
        }

        public Criteria andTongzhiFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tongzhi_fee not between", value1, value2, "tongzhiFee");
            return (Criteria) this;
        }

        public Criteria andGaidanFeeIsNull() {
            addCriterion("gaidan_fee is null");
            return (Criteria) this;
        }

        public Criteria andGaidanFeeIsNotNull() {
            addCriterion("gaidan_fee is not null");
            return (Criteria) this;
        }

        public Criteria andGaidanFeeEqualTo(BigDecimal value) {
            addCriterion("gaidan_fee =", value, "gaidanFee");
            return (Criteria) this;
        }

        public Criteria andGaidanFeeNotEqualTo(BigDecimal value) {
            addCriterion("gaidan_fee <>", value, "gaidanFee");
            return (Criteria) this;
        }

        public Criteria andGaidanFeeGreaterThan(BigDecimal value) {
            addCriterion("gaidan_fee >", value, "gaidanFee");
            return (Criteria) this;
        }

        public Criteria andGaidanFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gaidan_fee >=", value, "gaidanFee");
            return (Criteria) this;
        }

        public Criteria andGaidanFeeLessThan(BigDecimal value) {
            addCriterion("gaidan_fee <", value, "gaidanFee");
            return (Criteria) this;
        }

        public Criteria andGaidanFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("gaidan_fee <=", value, "gaidanFee");
            return (Criteria) this;
        }

        public Criteria andGaidanFeeIn(List<BigDecimal> values) {
            addCriterion("gaidan_fee in", values, "gaidanFee");
            return (Criteria) this;
        }

        public Criteria andGaidanFeeNotIn(List<BigDecimal> values) {
            addCriterion("gaidan_fee not in", values, "gaidanFee");
            return (Criteria) this;
        }

        public Criteria andGaidanFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gaidan_fee between", value1, value2, "gaidanFee");
            return (Criteria) this;
        }

        public Criteria andGaidanFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gaidan_fee not between", value1, value2, "gaidanFee");
            return (Criteria) this;
        }

        public Criteria andShanglouFeeIsNull() {
            addCriterion("shanglou_fee is null");
            return (Criteria) this;
        }

        public Criteria andShanglouFeeIsNotNull() {
            addCriterion("shanglou_fee is not null");
            return (Criteria) this;
        }

        public Criteria andShanglouFeeEqualTo(BigDecimal value) {
            addCriterion("shanglou_fee =", value, "shanglouFee");
            return (Criteria) this;
        }

        public Criteria andShanglouFeeNotEqualTo(BigDecimal value) {
            addCriterion("shanglou_fee <>", value, "shanglouFee");
            return (Criteria) this;
        }

        public Criteria andShanglouFeeGreaterThan(BigDecimal value) {
            addCriterion("shanglou_fee >", value, "shanglouFee");
            return (Criteria) this;
        }

        public Criteria andShanglouFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shanglou_fee >=", value, "shanglouFee");
            return (Criteria) this;
        }

        public Criteria andShanglouFeeLessThan(BigDecimal value) {
            addCriterion("shanglou_fee <", value, "shanglouFee");
            return (Criteria) this;
        }

        public Criteria andShanglouFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shanglou_fee <=", value, "shanglouFee");
            return (Criteria) this;
        }

        public Criteria andShanglouFeeIn(List<BigDecimal> values) {
            addCriterion("shanglou_fee in", values, "shanglouFee");
            return (Criteria) this;
        }

        public Criteria andShanglouFeeNotIn(List<BigDecimal> values) {
            addCriterion("shanglou_fee not in", values, "shanglouFee");
            return (Criteria) this;
        }

        public Criteria andShanglouFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shanglou_fee between", value1, value2, "shanglouFee");
            return (Criteria) this;
        }

        public Criteria andShanglouFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shanglou_fee not between", value1, value2, "shanglouFee");
            return (Criteria) this;
        }

        public Criteria andYunfeichongjianFeeIsNull() {
            addCriterion("yunfeichongjian_fee is null");
            return (Criteria) this;
        }

        public Criteria andYunfeichongjianFeeIsNotNull() {
            addCriterion("yunfeichongjian_fee is not null");
            return (Criteria) this;
        }

        public Criteria andYunfeichongjianFeeEqualTo(BigDecimal value) {
            addCriterion("yunfeichongjian_fee =", value, "yunfeichongjianFee");
            return (Criteria) this;
        }

        public Criteria andYunfeichongjianFeeNotEqualTo(BigDecimal value) {
            addCriterion("yunfeichongjian_fee <>", value, "yunfeichongjianFee");
            return (Criteria) this;
        }

        public Criteria andYunfeichongjianFeeGreaterThan(BigDecimal value) {
            addCriterion("yunfeichongjian_fee >", value, "yunfeichongjianFee");
            return (Criteria) this;
        }

        public Criteria andYunfeichongjianFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yunfeichongjian_fee >=", value, "yunfeichongjianFee");
            return (Criteria) this;
        }

        public Criteria andYunfeichongjianFeeLessThan(BigDecimal value) {
            addCriterion("yunfeichongjian_fee <", value, "yunfeichongjianFee");
            return (Criteria) this;
        }

        public Criteria andYunfeichongjianFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("yunfeichongjian_fee <=", value, "yunfeichongjianFee");
            return (Criteria) this;
        }

        public Criteria andYunfeichongjianFeeIn(List<BigDecimal> values) {
            addCriterion("yunfeichongjian_fee in", values, "yunfeichongjianFee");
            return (Criteria) this;
        }

        public Criteria andYunfeichongjianFeeNotIn(List<BigDecimal> values) {
            addCriterion("yunfeichongjian_fee not in", values, "yunfeichongjianFee");
            return (Criteria) this;
        }

        public Criteria andYunfeichongjianFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yunfeichongjian_fee between", value1, value2, "yunfeichongjianFee");
            return (Criteria) this;
        }

        public Criteria andYunfeichongjianFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yunfeichongjian_fee not between", value1, value2, "yunfeichongjianFee");
            return (Criteria) this;
        }

        public Criteria andChacheFeeIsNull() {
            addCriterion("chache_fee is null");
            return (Criteria) this;
        }

        public Criteria andChacheFeeIsNotNull() {
            addCriterion("chache_fee is not null");
            return (Criteria) this;
        }

        public Criteria andChacheFeeEqualTo(BigDecimal value) {
            addCriterion("chache_fee =", value, "chacheFee");
            return (Criteria) this;
        }

        public Criteria andChacheFeeNotEqualTo(BigDecimal value) {
            addCriterion("chache_fee <>", value, "chacheFee");
            return (Criteria) this;
        }

        public Criteria andChacheFeeGreaterThan(BigDecimal value) {
            addCriterion("chache_fee >", value, "chacheFee");
            return (Criteria) this;
        }

        public Criteria andChacheFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("chache_fee >=", value, "chacheFee");
            return (Criteria) this;
        }

        public Criteria andChacheFeeLessThan(BigDecimal value) {
            addCriterion("chache_fee <", value, "chacheFee");
            return (Criteria) this;
        }

        public Criteria andChacheFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("chache_fee <=", value, "chacheFee");
            return (Criteria) this;
        }

        public Criteria andChacheFeeIn(List<BigDecimal> values) {
            addCriterion("chache_fee in", values, "chacheFee");
            return (Criteria) this;
        }

        public Criteria andChacheFeeNotIn(List<BigDecimal> values) {
            addCriterion("chache_fee not in", values, "chacheFee");
            return (Criteria) this;
        }

        public Criteria andChacheFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("chache_fee between", value1, value2, "chacheFee");
            return (Criteria) this;
        }

        public Criteria andChacheFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("chache_fee not between", value1, value2, "chacheFee");
            return (Criteria) this;
        }

        public Criteria andHuikouFeeIsNull() {
            addCriterion("huikou_fee is null");
            return (Criteria) this;
        }

        public Criteria andHuikouFeeIsNotNull() {
            addCriterion("huikou_fee is not null");
            return (Criteria) this;
        }

        public Criteria andHuikouFeeEqualTo(BigDecimal value) {
            addCriterion("huikou_fee =", value, "huikouFee");
            return (Criteria) this;
        }

        public Criteria andHuikouFeeNotEqualTo(BigDecimal value) {
            addCriterion("huikou_fee <>", value, "huikouFee");
            return (Criteria) this;
        }

        public Criteria andHuikouFeeGreaterThan(BigDecimal value) {
            addCriterion("huikou_fee >", value, "huikouFee");
            return (Criteria) this;
        }

        public Criteria andHuikouFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("huikou_fee >=", value, "huikouFee");
            return (Criteria) this;
        }

        public Criteria andHuikouFeeLessThan(BigDecimal value) {
            addCriterion("huikou_fee <", value, "huikouFee");
            return (Criteria) this;
        }

        public Criteria andHuikouFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("huikou_fee <=", value, "huikouFee");
            return (Criteria) this;
        }

        public Criteria andHuikouFeeIn(List<BigDecimal> values) {
            addCriterion("huikou_fee in", values, "huikouFee");
            return (Criteria) this;
        }

        public Criteria andHuikouFeeNotIn(List<BigDecimal> values) {
            addCriterion("huikou_fee not in", values, "huikouFee");
            return (Criteria) this;
        }

        public Criteria andHuikouFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("huikou_fee between", value1, value2, "huikouFee");
            return (Criteria) this;
        }

        public Criteria andHuikouFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("huikou_fee not between", value1, value2, "huikouFee");
            return (Criteria) this;
        }

        public Criteria andZhongzhuanFeeIsNull() {
            addCriterion("zhongzhuan_fee is null");
            return (Criteria) this;
        }

        public Criteria andZhongzhuanFeeIsNotNull() {
            addCriterion("zhongzhuan_fee is not null");
            return (Criteria) this;
        }

        public Criteria andZhongzhuanFeeEqualTo(BigDecimal value) {
            addCriterion("zhongzhuan_fee =", value, "zhongzhuanFee");
            return (Criteria) this;
        }

        public Criteria andZhongzhuanFeeNotEqualTo(BigDecimal value) {
            addCriterion("zhongzhuan_fee <>", value, "zhongzhuanFee");
            return (Criteria) this;
        }

        public Criteria andZhongzhuanFeeGreaterThan(BigDecimal value) {
            addCriterion("zhongzhuan_fee >", value, "zhongzhuanFee");
            return (Criteria) this;
        }

        public Criteria andZhongzhuanFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("zhongzhuan_fee >=", value, "zhongzhuanFee");
            return (Criteria) this;
        }

        public Criteria andZhongzhuanFeeLessThan(BigDecimal value) {
            addCriterion("zhongzhuan_fee <", value, "zhongzhuanFee");
            return (Criteria) this;
        }

        public Criteria andZhongzhuanFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("zhongzhuan_fee <=", value, "zhongzhuanFee");
            return (Criteria) this;
        }

        public Criteria andZhongzhuanFeeIn(List<BigDecimal> values) {
            addCriterion("zhongzhuan_fee in", values, "zhongzhuanFee");
            return (Criteria) this;
        }

        public Criteria andZhongzhuanFeeNotIn(List<BigDecimal> values) {
            addCriterion("zhongzhuan_fee not in", values, "zhongzhuanFee");
            return (Criteria) this;
        }

        public Criteria andZhongzhuanFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zhongzhuan_fee between", value1, value2, "zhongzhuanFee");
            return (Criteria) this;
        }

        public Criteria andZhongzhuanFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zhongzhuan_fee not between", value1, value2, "zhongzhuanFee");
            return (Criteria) this;
        }

        public Criteria andQitaFeeIsNull() {
            addCriterion("qita_fee is null");
            return (Criteria) this;
        }

        public Criteria andQitaFeeIsNotNull() {
            addCriterion("qita_fee is not null");
            return (Criteria) this;
        }

        public Criteria andQitaFeeEqualTo(BigDecimal value) {
            addCriterion("qita_fee =", value, "qitaFee");
            return (Criteria) this;
        }

        public Criteria andQitaFeeNotEqualTo(BigDecimal value) {
            addCriterion("qita_fee <>", value, "qitaFee");
            return (Criteria) this;
        }

        public Criteria andQitaFeeGreaterThan(BigDecimal value) {
            addCriterion("qita_fee >", value, "qitaFee");
            return (Criteria) this;
        }

        public Criteria andQitaFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("qita_fee >=", value, "qitaFee");
            return (Criteria) this;
        }

        public Criteria andQitaFeeLessThan(BigDecimal value) {
            addCriterion("qita_fee <", value, "qitaFee");
            return (Criteria) this;
        }

        public Criteria andQitaFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("qita_fee <=", value, "qitaFee");
            return (Criteria) this;
        }

        public Criteria andQitaFeeIn(List<BigDecimal> values) {
            addCriterion("qita_fee in", values, "qitaFee");
            return (Criteria) this;
        }

        public Criteria andQitaFeeNotIn(List<BigDecimal> values) {
            addCriterion("qita_fee not in", values, "qitaFee");
            return (Criteria) this;
        }

        public Criteria andQitaFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qita_fee between", value1, value2, "qitaFee");
            return (Criteria) this;
        }

        public Criteria andQitaFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qita_fee not between", value1, value2, "qitaFee");
            return (Criteria) this;
        }

        public Criteria andLabaoFeeIsNull() {
            addCriterion("labao_fee is null");
            return (Criteria) this;
        }

        public Criteria andLabaoFeeIsNotNull() {
            addCriterion("labao_fee is not null");
            return (Criteria) this;
        }

        public Criteria andLabaoFeeEqualTo(BigDecimal value) {
            addCriterion("labao_fee =", value, "labaoFee");
            return (Criteria) this;
        }

        public Criteria andLabaoFeeNotEqualTo(BigDecimal value) {
            addCriterion("labao_fee <>", value, "labaoFee");
            return (Criteria) this;
        }

        public Criteria andLabaoFeeGreaterThan(BigDecimal value) {
            addCriterion("labao_fee >", value, "labaoFee");
            return (Criteria) this;
        }

        public Criteria andLabaoFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("labao_fee >=", value, "labaoFee");
            return (Criteria) this;
        }

        public Criteria andLabaoFeeLessThan(BigDecimal value) {
            addCriterion("labao_fee <", value, "labaoFee");
            return (Criteria) this;
        }

        public Criteria andLabaoFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("labao_fee <=", value, "labaoFee");
            return (Criteria) this;
        }

        public Criteria andLabaoFeeIn(List<BigDecimal> values) {
            addCriterion("labao_fee in", values, "labaoFee");
            return (Criteria) this;
        }

        public Criteria andLabaoFeeNotIn(List<BigDecimal> values) {
            addCriterion("labao_fee not in", values, "labaoFee");
            return (Criteria) this;
        }

        public Criteria andLabaoFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("labao_fee between", value1, value2, "labaoFee");
            return (Criteria) this;
        }

        public Criteria andLabaoFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("labao_fee not between", value1, value2, "labaoFee");
            return (Criteria) this;
        }

        public Criteria andKhdaishouFeeIsNull() {
            addCriterion("khdaishou_fee is null");
            return (Criteria) this;
        }

        public Criteria andKhdaishouFeeIsNotNull() {
            addCriterion("khdaishou_fee is not null");
            return (Criteria) this;
        }

        public Criteria andKhdaishouFeeEqualTo(BigDecimal value) {
            addCriterion("khdaishou_fee =", value, "khdaishouFee");
            return (Criteria) this;
        }

        public Criteria andKhdaishouFeeNotEqualTo(BigDecimal value) {
            addCriterion("khdaishou_fee <>", value, "khdaishouFee");
            return (Criteria) this;
        }

        public Criteria andKhdaishouFeeGreaterThan(BigDecimal value) {
            addCriterion("khdaishou_fee >", value, "khdaishouFee");
            return (Criteria) this;
        }

        public Criteria andKhdaishouFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("khdaishou_fee >=", value, "khdaishouFee");
            return (Criteria) this;
        }

        public Criteria andKhdaishouFeeLessThan(BigDecimal value) {
            addCriterion("khdaishou_fee <", value, "khdaishouFee");
            return (Criteria) this;
        }

        public Criteria andKhdaishouFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("khdaishou_fee <=", value, "khdaishouFee");
            return (Criteria) this;
        }

        public Criteria andKhdaishouFeeIn(List<BigDecimal> values) {
            addCriterion("khdaishou_fee in", values, "khdaishouFee");
            return (Criteria) this;
        }

        public Criteria andKhdaishouFeeNotIn(List<BigDecimal> values) {
            addCriterion("khdaishou_fee not in", values, "khdaishouFee");
            return (Criteria) this;
        }

        public Criteria andKhdaishouFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("khdaishou_fee between", value1, value2, "khdaishouFee");
            return (Criteria) this;
        }

        public Criteria andKhdaishouFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("khdaishou_fee not between", value1, value2, "khdaishouFee");
            return (Criteria) this;
        }

        public Criteria andFuwuFeeIsNull() {
            addCriterion("fuwu_fee is null");
            return (Criteria) this;
        }

        public Criteria andFuwuFeeIsNotNull() {
            addCriterion("fuwu_fee is not null");
            return (Criteria) this;
        }

        public Criteria andFuwuFeeEqualTo(BigDecimal value) {
            addCriterion("fuwu_fee =", value, "fuwuFee");
            return (Criteria) this;
        }

        public Criteria andFuwuFeeNotEqualTo(BigDecimal value) {
            addCriterion("fuwu_fee <>", value, "fuwuFee");
            return (Criteria) this;
        }

        public Criteria andFuwuFeeGreaterThan(BigDecimal value) {
            addCriterion("fuwu_fee >", value, "fuwuFee");
            return (Criteria) this;
        }

        public Criteria andFuwuFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fuwu_fee >=", value, "fuwuFee");
            return (Criteria) this;
        }

        public Criteria andFuwuFeeLessThan(BigDecimal value) {
            addCriterion("fuwu_fee <", value, "fuwuFee");
            return (Criteria) this;
        }

        public Criteria andFuwuFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fuwu_fee <=", value, "fuwuFee");
            return (Criteria) this;
        }

        public Criteria andFuwuFeeIn(List<BigDecimal> values) {
            addCriterion("fuwu_fee in", values, "fuwuFee");
            return (Criteria) this;
        }

        public Criteria andFuwuFeeNotIn(List<BigDecimal> values) {
            addCriterion("fuwu_fee not in", values, "fuwuFee");
            return (Criteria) this;
        }

        public Criteria andFuwuFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fuwu_fee between", value1, value2, "fuwuFee");
            return (Criteria) this;
        }

        public Criteria andFuwuFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fuwu_fee not between", value1, value2, "fuwuFee");
            return (Criteria) this;
        }

        public Criteria andBaojiaFeeIsNull() {
            addCriterion("baojia_fee is null");
            return (Criteria) this;
        }

        public Criteria andBaojiaFeeIsNotNull() {
            addCriterion("baojia_fee is not null");
            return (Criteria) this;
        }

        public Criteria andBaojiaFeeEqualTo(BigDecimal value) {
            addCriterion("baojia_fee =", value, "baojiaFee");
            return (Criteria) this;
        }

        public Criteria andBaojiaFeeNotEqualTo(BigDecimal value) {
            addCriterion("baojia_fee <>", value, "baojiaFee");
            return (Criteria) this;
        }

        public Criteria andBaojiaFeeGreaterThan(BigDecimal value) {
            addCriterion("baojia_fee >", value, "baojiaFee");
            return (Criteria) this;
        }

        public Criteria andBaojiaFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("baojia_fee >=", value, "baojiaFee");
            return (Criteria) this;
        }

        public Criteria andBaojiaFeeLessThan(BigDecimal value) {
            addCriterion("baojia_fee <", value, "baojiaFee");
            return (Criteria) this;
        }

        public Criteria andBaojiaFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("baojia_fee <=", value, "baojiaFee");
            return (Criteria) this;
        }

        public Criteria andBaojiaFeeIn(List<BigDecimal> values) {
            addCriterion("baojia_fee in", values, "baojiaFee");
            return (Criteria) this;
        }

        public Criteria andBaojiaFeeNotIn(List<BigDecimal> values) {
            addCriterion("baojia_fee not in", values, "baojiaFee");
            return (Criteria) this;
        }

        public Criteria andBaojiaFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baojia_fee between", value1, value2, "baojiaFee");
            return (Criteria) this;
        }

        public Criteria andBaojiaFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baojia_fee not between", value1, value2, "baojiaFee");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andOpUserIdIsNull() {
            addCriterion("op_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOpUserIdIsNotNull() {
            addCriterion("op_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpUserIdEqualTo(String value) {
            addCriterion("op_user_id =", value, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdNotEqualTo(String value) {
            addCriterion("op_user_id <>", value, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdGreaterThan(String value) {
            addCriterion("op_user_id >", value, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("op_user_id >=", value, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdLessThan(String value) {
            addCriterion("op_user_id <", value, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdLessThanOrEqualTo(String value) {
            addCriterion("op_user_id <=", value, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdLike(String value) {
            addCriterion("op_user_id like", value, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdNotLike(String value) {
            addCriterion("op_user_id not like", value, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdIn(List<String> values) {
            addCriterion("op_user_id in", values, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdNotIn(List<String> values) {
            addCriterion("op_user_id not in", values, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdBetween(String value1, String value2) {
            addCriterion("op_user_id between", value1, value2, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdNotBetween(String value1, String value2) {
            addCriterion("op_user_id not between", value1, value2, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserNameIsNull() {
            addCriterion("op_user_name is null");
            return (Criteria) this;
        }

        public Criteria andOpUserNameIsNotNull() {
            addCriterion("op_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andOpUserNameEqualTo(String value) {
            addCriterion("op_user_name =", value, "opUserName");
            return (Criteria) this;
        }

        public Criteria andOpUserNameNotEqualTo(String value) {
            addCriterion("op_user_name <>", value, "opUserName");
            return (Criteria) this;
        }

        public Criteria andOpUserNameGreaterThan(String value) {
            addCriterion("op_user_name >", value, "opUserName");
            return (Criteria) this;
        }

        public Criteria andOpUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("op_user_name >=", value, "opUserName");
            return (Criteria) this;
        }

        public Criteria andOpUserNameLessThan(String value) {
            addCriterion("op_user_name <", value, "opUserName");
            return (Criteria) this;
        }

        public Criteria andOpUserNameLessThanOrEqualTo(String value) {
            addCriterion("op_user_name <=", value, "opUserName");
            return (Criteria) this;
        }

        public Criteria andOpUserNameLike(String value) {
            addCriterion("op_user_name like", value, "opUserName");
            return (Criteria) this;
        }

        public Criteria andOpUserNameNotLike(String value) {
            addCriterion("op_user_name not like", value, "opUserName");
            return (Criteria) this;
        }

        public Criteria andOpUserNameIn(List<String> values) {
            addCriterion("op_user_name in", values, "opUserName");
            return (Criteria) this;
        }

        public Criteria andOpUserNameNotIn(List<String> values) {
            addCriterion("op_user_name not in", values, "opUserName");
            return (Criteria) this;
        }

        public Criteria andOpUserNameBetween(String value1, String value2) {
            addCriterion("op_user_name between", value1, value2, "opUserName");
            return (Criteria) this;
        }

        public Criteria andOpUserNameNotBetween(String value1, String value2) {
            addCriterion("op_user_name not between", value1, value2, "opUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIsNull() {
            addCriterion("creator_name is null");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIsNotNull() {
            addCriterion("creator_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorNameEqualTo(String value) {
            addCriterion("creator_name =", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotEqualTo(String value) {
            addCriterion("creator_name <>", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameGreaterThan(String value) {
            addCriterion("creator_name >", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("creator_name >=", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLessThan(String value) {
            addCriterion("creator_name <", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLessThanOrEqualTo(String value) {
            addCriterion("creator_name <=", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLike(String value) {
            addCriterion("creator_name like", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotLike(String value) {
            addCriterion("creator_name not like", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIn(List<String> values) {
            addCriterion("creator_name in", values, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotIn(List<String> values) {
            addCriterion("creator_name not in", values, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameBetween(String value1, String value2) {
            addCriterion("creator_name between", value1, value2, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotBetween(String value1, String value2) {
            addCriterion("creator_name not between", value1, value2, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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