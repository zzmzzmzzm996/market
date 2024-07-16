package cn.bugstack.trigger.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description:抽奖奖品列表 请求接口
 * Author: zzm2516582@163.com
 * Date: 2024/6/15 21:36
 */
@Data

public class RaffleAwardListRequestDTO {
    // 用户ID
    private String userId;
    // 抽奖活动ID
    private Long activityId;

}
