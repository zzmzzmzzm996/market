package cn.bugstack.trigger.api;

import cn.bugstack.trigger.api.dto.*;
import cn.bugstack.types.model.Response;

import java.util.List;

/**
 * Description:
 * Author: zzm2516582@163.com
 * Date: 2024/6/13 17:01
 */
public interface IRaffleStrategyService {
    /**
     * 策略装配
     * @param strategyId 策略ID
     * @return 装配是否成功
     */
    Response<Boolean> strategyArmory(Long strategyId);

    /**
     * 查询奖品列表
     * @param requestDTO
     * @return 奖品列表
     */

    Response<List<RaffleAwardListReponseDTO>> queryRaffleAwardList(RaffleAwardListRequestDTO requestDTO);

    /**
     * 随机抽奖接口
     * @param requestDTO
     * @return
     */
    Response<RaffleReponseDTO> randomRaffle(RaffleRequestDTO requestDTO);
    /**
     *
     */
    Response<List<RaffleStrategyRuleWeightResponseDTO>> queryRaffleStrategyRuleWeight(RaffleStrategyRuleWeightRequestDTO request);
}
