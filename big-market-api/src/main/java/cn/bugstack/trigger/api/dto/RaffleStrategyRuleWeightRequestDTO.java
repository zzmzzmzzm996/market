package cn.bugstack.trigger.api.dto;

import lombok.Data;

/**
 * Description:
 * Author: zzm2516582@163.com
 * Date: 2024/7/10 10:17
 */
@Data
public class RaffleStrategyRuleWeightRequestDTO {
    /**
     * 用户ID
     */
    private String userId;

    /**
     * 活动ID
     */
    private Long activityId;
}
