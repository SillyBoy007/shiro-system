package cc.mrbird.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_test")
public class TEST {
    @Id
    @Column(name = "TEST_ID")
    private Long testId;

    @Column(name = "TEST_NAME")
    private String testName;

    @Column(name = "TEST_DESCRIPTION")
    private String testDescription;

    @Column(name = "TEST_TIME")
    private Date testTime;

    /**
     * @return TEST_ID
     */
    public Long getTestId() {
        return testId;
    }

    /**
     * @param testId
     */
    public void setTestId(Long testId) {
        this.testId = testId;
    }

    /**
     * @return TEST_NAME
     */
    public String getTestName() {
        return testName;
    }

    /**
     * @param testName
     */
    public void setTestName(String testName) {
        this.testName = testName == null ? null : testName.trim();
    }

    /**
     * @return TEST_DESCRIPTION
     */
    public String getTestDescription() {
        return testDescription;
    }

    /**
     * @param testDescription
     */
    public void setTestDescription(String testDescription) {
        this.testDescription = testDescription == null ? null : testDescription.trim();
    }

    /**
     * @return TEST_TIME
     */
    public Date getTestTime() {
        return testTime;
    }

    /**
     * @param testTime
     */
    public void setTestTime(Date testTime) {
        this.testTime = testTime;
    }
}