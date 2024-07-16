package cn.bugstack.trigger.api.dto;

import lombok.Data;

import java.util.List;

/**
 * Description:
 * Author: zzm2516582@163.com
 * Date: 2024/7/10 10:17
 */
@Data
public class RaffleStrategyRuleWeightResponseDTO {
    private Integer ruleWeightCount;

    private Integer userActivityAccountTotalUserCount;

    private List<RaffleStrategyRuleWeightResponseDTO.StrategyAward> strategyAwards;

    @Data
    public static class StrategyAward{
        private Integer awardId;
        private String awardTitle;

    }
}
