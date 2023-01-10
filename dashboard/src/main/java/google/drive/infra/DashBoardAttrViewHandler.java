package google.drive.infra;

import google.drive.domain.*;
import google.drive.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class DashBoardAttrViewHandler {

    @Autowired
    private DashBoardAttrRepository dashBoardAttrRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenFileUploaded_then_CREATE_1 (@Payload FileUploaded fileUploaded) {
        try {

            if (!fileUploaded.validate()) return;

            // view 객체 생성
            DashBoardAttr dashBoardAttr = new DashBoardAttr();
            // view 객체에 이벤트의 Value 를 set 함
            dashBoardAttr.setUserId(fileUploaded.getUserId());
            dashBoardAttr.setFileId(fileUploaded.getFileId());
            // view 레파지 토리에 save
            dashBoardAttrRepository.save(dashBoardAttr);

        }catch (Exception e){
            e.printStackTrace();
        }
    }




}

