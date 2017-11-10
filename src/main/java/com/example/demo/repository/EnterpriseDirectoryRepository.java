package com.example.demo.repository;

/**
 * Created by song on 2017/10/23.
 */

import com.example.demo.model.EnterpriseDirectory;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource
public interface EnterpriseDirectoryRepository extends PagingAndSortingRepository<EnterpriseDirectory, Long> {
    void deleteAll();
}