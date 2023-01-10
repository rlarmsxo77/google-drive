package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class StreamingProcessed extends AbstractEvent {

    private Long id;
    private String fileId;
    private String streamUri;

    public StreamingProcessed(Video aggregate){
        super(aggregate);
    }
    public StreamingProcessed(){
        super();
    }
}
