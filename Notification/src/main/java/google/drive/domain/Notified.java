package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Notified extends AbstractEvent {

    private Long id;
    private String userId;
    private String fileId;
    private Date notiDate;
    private String message;

    public Notified(Notification aggregate){
        super(aggregate);
    }
    public Notified(){
        super();
    }
}
