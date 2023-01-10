package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class StreamingProcessed extends AbstractEvent {

    private Long id;
    private String fileId;
    private String streamUri;
}


