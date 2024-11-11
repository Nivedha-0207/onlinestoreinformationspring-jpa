package com.onlineStoreInformation.db_demo.Repository;


import com.onlineStoreInformation.db_demo.Entity.OnlineStoreInformation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OnlineStoreInformationRepository extends CrudRepository<OnlineStoreInformation ,Integer> {
    List<OnlineStoreInformation> findBystoreName(String name);
    List<OnlineStoreInformation> findByphoneNumber(String phoneNum);
    List<OnlineStoreInformation> findBystoreDetails(String details);
}
