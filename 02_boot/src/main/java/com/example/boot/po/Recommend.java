package com.example.boot.po;

public class Recommend {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recommend.user_id
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recommend.sight_id1
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    private Integer sightId1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recommend.sight_id2
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    private Integer sightId2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recommend.sight_id3
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    private Integer sightId3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recommend.sight_id4
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    private Integer sightId4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recommend.sight_id5
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    private Integer sightId5;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recommend.user_id
     *
     * @return the value of recommend.user_id
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recommend.user_id
     *
     * @param userId the value for recommend.user_id
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recommend.sight_id1
     *
     * @return the value of recommend.sight_id1
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    public Integer getSightId1() {
        return sightId1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recommend.sight_id1
     *
     * @param sightId1 the value for recommend.sight_id1
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    public void setSightId1(Integer sightId1) {
        this.sightId1 = sightId1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recommend.sight_id2
     *
     * @return the value of recommend.sight_id2
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    public Integer getSightId2() {
        return sightId2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recommend.sight_id2
     *
     * @param sightId2 the value for recommend.sight_id2
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    public void setSightId2(Integer sightId2) {
        this.sightId2 = sightId2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recommend.sight_id3
     *
     * @return the value of recommend.sight_id3
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    public Integer getSightId3() {
        return sightId3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recommend.sight_id3
     *
     * @param sightId3 the value for recommend.sight_id3
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    public void setSightId3(Integer sightId3) {
        this.sightId3 = sightId3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recommend.sight_id4
     *
     * @return the value of recommend.sight_id4
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    public Integer getSightId4() {
        return sightId4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recommend.sight_id4
     *
     * @param sightId4 the value for recommend.sight_id4
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    public void setSightId4(Integer sightId4) {
        this.sightId4 = sightId4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recommend.sight_id5
     *
     * @return the value of recommend.sight_id5
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    public Integer getSightId5() {
        return sightId5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recommend.sight_id5
     *
     * @param sightId5 the value for recommend.sight_id5
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    public void setSightId5(Integer sightId5) {
        this.sightId5 = sightId5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recommend
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Recommend other = (Recommend) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getSightId1() == null ? other.getSightId1() == null : this.getSightId1().equals(other.getSightId1()))
            && (this.getSightId2() == null ? other.getSightId2() == null : this.getSightId2().equals(other.getSightId2()))
            && (this.getSightId3() == null ? other.getSightId3() == null : this.getSightId3().equals(other.getSightId3()))
            && (this.getSightId4() == null ? other.getSightId4() == null : this.getSightId4().equals(other.getSightId4()))
            && (this.getSightId5() == null ? other.getSightId5() == null : this.getSightId5().equals(other.getSightId5()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recommend
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getSightId1() == null) ? 0 : getSightId1().hashCode());
        result = prime * result + ((getSightId2() == null) ? 0 : getSightId2().hashCode());
        result = prime * result + ((getSightId3() == null) ? 0 : getSightId3().hashCode());
        result = prime * result + ((getSightId4() == null) ? 0 : getSightId4().hashCode());
        result = prime * result + ((getSightId5() == null) ? 0 : getSightId5().hashCode());
        return result;
    }
}