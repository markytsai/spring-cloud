package com.example.geelybuz.controller;

import com.geely.business.train.ticketapproval.client.RuPersonInService;
import com.geely.business.train.ticketcommon.approval.request.TrainApprovalDataRequest;
import com.geely.business.train.ticketcommon.approval.response.SceneDataResponse;
import com.geely.business.train.ticketcommon.approval.response.TrainApprovalDataResponse;
import com.geely.business.train.ticketcommon.approval.response.UserDefaultDataResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author caizhenya
 * @Date 2020/9/10
 * @Descrition
 **/
@RestController
public class RuPersonInController {

    @Autowired
    private RuPersonInService ruPersonInService;

    /**
     * 火车票审批流获取接口
     * @param request
     * @return
     */
    @GetMapping(value = "/ruPersonIn/getTrainApprovalData")
    TrainApprovalDataResponse getTrainApprovalData(TrainApprovalDataRequest request) {
        return ruPersonInService.getTrainApprovalData(request);
    }

    /**
     * 根据场景ID获取场景相关的数据
     * @param request
     */
    @PostMapping("/ruPersonIn/getSceneResultById")
    SceneDataResponse getSceneResultById(TrainApprovalDataRequest request) {
        return ruPersonInService.getSceneResultById(request);
    }

    /**
     * 用户默认场景
     * @param busType
     * @param passengerCode
     * @return
     */
    @GetMapping(value = "/ruPerson/getUserDefaultScenes")
    UserDefaultDataResponse getUserDefaultScenes(@RequestParam(value = "busyType") String busType, @RequestParam(value = "passengerCode") String passengerCode) {
        return ruPersonInService.getUserDefaultScenes(busType, passengerCode);
    }


}