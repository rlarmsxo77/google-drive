package google.drive.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="DashBoardAttr_table")
@Data
public class DashBoardAttr {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String userId;
        private String fileId;
        private String fileSize;
        private String fileName;
        private Boolean ynIndexed;
        private Boolean ynUploaded;
        private String videoUrl;


}
