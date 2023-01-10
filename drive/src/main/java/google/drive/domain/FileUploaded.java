package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String fileId;
    private String userId;
    private String fileName;
    private String filePath;
    private String fileType;
    private String ynVideo;
    private Long fileSize;
    private Boolean ynUpload;

    public FileUploaded(Drive aggregate){
        super(aggregate);
    }
    public FileUploaded(){
        super();
    }
}
