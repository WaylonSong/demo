package com.example.demo.repository;

/**
 * Created by song on 2017/10/23.
 */

import com.example.demo.model.EnterpriseDirectory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource
public interface EnterpriseDirectoryRepository extends BaseRepository<EnterpriseDirectory, Long> {
    @PreAuthorize("hasRole('ROLE_ADMIN') or #name == authentication?.name")
    public Page<EnterpriseDirectory> findByUsername(@Param("name") String username, Pageable pageable);
    @PreAuthorize("hasRole('ROLE_ADMIN') or #enterpriseDirectory.name == authentication?.name")
    public EnterpriseDirectory save(EnterpriseDirectory enterpriseDirectory);

//    spel
}