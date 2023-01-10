package google.drive.domain;

import google.drive.domain.FileIndexed;
import google.drive.IndexApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Index_table")
@Data

public class Index  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String fileId;
    
    
    
    
    
    private Long index;
    
    
    
    
    
    private Boolean ynIndex;

    @PostPersist
    public void onPostPersist(){


        FileIndexed fileIndexed = new FileIndexed(this);
        fileIndexed.publishAfterCommit();

    }

    public static IndexRepository repository(){
        IndexRepository indexRepository = IndexApplication.applicationContext.getBean(IndexRepository.class);
        return indexRepository;
    }






}
