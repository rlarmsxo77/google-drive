package google.drive.domain;

import google.drive.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String FileID;
    private String userID;
    private String FileName;
    private String FilePath;
    private String FileType;
    private String YN_Video;
    private Long FileSize;
    private Boolean YN_Upload;
}
