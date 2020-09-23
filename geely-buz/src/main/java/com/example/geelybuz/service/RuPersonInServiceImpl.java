package com.example.geelybuz.service;

import com.geely.business.train.ticketapproval.client.RuPersonInService;
import com.geely.business.train.ticketcommon.approval.request.TrainApprovalDataRequest;
import com.geely.business.train.ticketcommon.approval.response.SceneDataResponse;
import com.geely.business.train.ticketcommon.approval.response.TrainApprovalDataResponse;
import com.geely.business.train.ticketcommon.approval.response.UserDefaultDataResponse;
import com.geely.business.train.ticketcommon.approval.result.approvalData.ApprovalLevelData;
import com.geely.business.train.ticketcommon.approval.result.approvalData.ApprovalUserData;
import com.geely.business.train.ticketcommon.approval.result.approvalData.TrainApprovalDataResult;
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

        TrainApprovalDataResult result = new TrainApprovalDataResult();
        result.setNotifyType("1");
        result.setSmsNotifier("");
        result.setSmsNotifierName("");

        // 0 no; 1 yes
        long time = System.currentTimeMillis();
        String needApproval;
        if (time % 2 == 0) {
             needApproval = "1";
        } else {
             needApproval = "0";
        }
        // 测试默认走审批
        result.setApprovalType("1");

        List<ApprovalLevelData> approvalLevelDataResults = new ArrayList<>();
        result.setApprovalLevelDataResults(approvalLevelDataResults);

        ApprovalLevelData approvalLevelData = new ApprovalLevelData();
        approvalLevelDataResults.add(approvalLevelData);
        approvalLevelData.setLevel("1");

        List<ApprovalUserData> approvalUserDatas = new ArrayList<>();
        ApprovalUserData approvalUserData = new ApprovalUserData();
        approvalUserData.setUserCode("userCode_111111");
        approvalUserData.setName("蔡振亚");
        approvalUserDatas.add(approvalUserData);

        approvalLevelData.setApprovalUserDatas(approvalUserDatas);

        response.setResult(result);
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
