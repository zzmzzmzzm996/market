package cn.bugstack.trigger.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description:
 * Author: zzm2516582@163.com
 * Date: 2024/6/15 21:54
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RaffleReponseDTO {
    // 奖品ID
    private Integer awardId;
    // 排序编号【策略奖品配置的奖品顺序编号】
    private Integer awardIndex;
}
