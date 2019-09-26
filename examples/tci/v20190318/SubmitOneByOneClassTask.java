package tci.v20190318;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.tci.v20190318.TciClient;
import com.tencentcloudapi.tci.v20190318.models.SubmitOneByOneClassTaskResponse;
import com.tencentcloudapi.tci.v20190318.models.SubmitOneByOneClassTaskRequest;

public class SubmitOneByOneClassTask {
    public static void main(String[] args) {
        try {
            Credential cred = new Credential("", "");
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setReqMethod("POST"); 
            httpProfile.setConnTimeout(60); 
            httpProfile.setEndpoint("tci.ap-beijing.tencentcloudapi.com"); 
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setUnsignedPayload(true);
            clientProfile.setHttpProfile(httpProfile);
            TciClient client = new TciClient(cred, "",clientProfile);
            SubmitOneByOneClassTaskRequest req = new SubmitOneByOneClassTaskRequest();
            req.setFileContent("https://edu-test-1253131631.cos.ap-guangzhou.myqcloud.com/aieduautotest/autotest_vedio.mp4");
            req.setFileType("vod_url");
            long lang=0;
            req.setLang(lang);
            req.setLibrarySet(new String[] {"library_15603955264181591716"});
            req.setVocabLibNameList(new String[] {"testlib2"});
            long EncodeType=1;
            req.setVoiceEncodeType(EncodeType);
            long FileType=10;
            req.setVoiceFileType(FileType);
            SubmitOneByOneClassTaskResponse res = client.SubmitOneByOneClassTask(req);
            System.out.println(SubmitOneByOneClassTaskResponse.toJsonString(res));
            System.out.println(res.getRequestId());
        } catch (TencentCloudSDKException e) {
            e.printStackTrace();
        }
    }

}