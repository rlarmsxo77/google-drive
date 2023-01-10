package google.drive.infra;

import google.drive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="dashBoardAttrs", path="dashBoardAttrs")
public interface DashBoardAttrRepository extends PagingAndSortingRepository<DashBoardAttr, Long> {

    

    
}
