package google.drive.domain;

import google.drive.domain.StreamingProcessed;
import google.drive.VideoStreamingApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Video_table")
@Data

public class Video  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String fileId;
    
    
    
    
    
    private String streamUri;

    @PostPersist
    public void onPostPersist(){


        StreamingProcessed streamingProcessed = new StreamingProcessed(this);
        streamingProcessed.publishAfterCommit();

    }

    public static VideoRepository repository(){
        VideoRepository videoRepository = VideoStreamingApplication.applicationContext.getBean(VideoRepository.class);
        return videoRepository;
    }




    public static void videoStreamingProc(FileUploaded fileUploaded){

        /** Example 1:  new item 
        Video video = new Video();
        repository().save(video);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(video->{
            
            video // do something
            repository().save(video);


         });
        */

        
    }


}
