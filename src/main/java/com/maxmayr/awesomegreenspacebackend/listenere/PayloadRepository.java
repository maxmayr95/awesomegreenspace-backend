package com.maxmayr.awesomegreenspacebackend.listenere;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PayloadRepository extends PagingAndSortingRepository<PayloadEntity, Long>{

	Page<PayloadEntity> findAllByDeviceId(Long deviceId,Pageable page);

}
