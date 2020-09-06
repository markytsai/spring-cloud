package com.example.geelybuz.client;

import com.geely.business.train.ticketcommon.approval.request.TrainApprovalDataRequest;
import com.geely.business.train.ticketcommon.approval.response.SceneDataResponse;
import com.geely.business.train.ticketcommon.approval.response.TrainApprovalDataResponse;
import com.geely.business.train.ticketcommon.approval.response.UserDefaultDataResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author caizhenya
 * @Date 2020/9/3
 * @Descrition 差规模块
 **/
@FeignClient(name = "regulation-v06")
public interface RuPersonInService {


    /**
     * 火车票审批流获取接口
     * @param request
     * @return
     */
    @GetMapping("/ruPersonIn/getTrainApprovalData")
    TrainApprovalDataResponse getTrainApprovalData(TrainApprovalDataRequest request);

    /**
     * 根据场景ID获取场景相关的数据
     * @param request
     */
    @GetMapping("/ruPersonIn/getSceneResultById")
    SceneDataResponse getSceneResultById(TrainApprovalDataRequest request);

    @GetMapping("/ruPerson/getUserDefaultScenes")
    UserDefaultDataResponse getUserDefaultScenes(@RequestParam String busyType, @RequestParam String passengerCode);

}
