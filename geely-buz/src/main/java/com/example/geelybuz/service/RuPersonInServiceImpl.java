package com.example.geelybuz.service;

import com.geely.business.train.ticketapproval.client.RuPersonInService;
import com.geely.business.train.ticketcommon.approval.request.TrainApprovalDataRequest;
import com.geely.business.train.ticketcommon.approval.response.SceneDataResponse;
import com.geely.business.train.ticketcommon.approval.response.TrainApprovalDataResponse;
import com.geely.business.train.ticketcommon.approval.response.UserDefaultDataResponse;
import com.geely.business.train.ticketcommon.approval.result.defaultScene.UserDefaultDataResult;
import com.geely.business.train.ticketcommon.approval.result.scene.SceneDataResult;
import com.geely.business.train.ticketcommon.approval.result.scene.TrainPolicy;
import javafx.scene.shape.TriangleMesh;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author caizhenya
 * @Date 2020/9/10
 * @Descrition
 **/
@Service
public class RuPersonInServiceImpl implements RuPersonInService {
    @Override
    public TrainApprovalDataResponse getTrainApprovalData(TrainApprovalDataRequest request) {
        TrainApprovalDataResponse response = new TrainApprovalDataResponse();
        return response;
    }

    @Override
    public SceneDataResponse getSceneResultById(TrainApprovalDataRequest request) {
        SceneDataResponse response = new SceneDataResponse();
        SceneDataResult sceneDataResult = new SceneDataResult();
        sceneDataResult.setBusinessCode("11111");

        List<TrainPolicy> trainPolicies = new ArrayList<>();
        TrainPolicy trainPolicy = new TrainPolicy();
        trainPolicy.setSeatType("硬座");
        trainPolicy.setTrainType("D");
        trainPolicy.setViolationBookable("超标可预订");
        trainPolicies.add(trainPolicy);
        sceneDataResult.setTrainPolicies(trainPolicies);
        response.setResult(sceneDataResult);
        return response;
    }

    @Override
    public UserDefaultDataResponse getUserDefaultScenes(String busType, String passengerCode) {
        UserDefaultDataResponse response = new UserDefaultDataResponse();
        UserDefaultDataResult result = new UserDefaultDataResult();
        if (System.currentTimeMillis() / 2 == 0) {
            result.setHasDefaultScene(1);
        } else {
            result.setHasDefaultScene(0);
        }
        response.setResult(result);
        return response;
    }

}
