package com.example.batch7.group1.IBS.repo;

import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.batch7.group1.IBS.entity.ServiceProviderEntity;
import com.example.batch7.group1.IBS.model.ServiceProviderModel;
import com.example.batch7.group1.IBS.model.ServiceProviderRegistrationModel;

public interface SvcPvdrRepo extends JpaRepository<ServiceProviderEntity, Long>{
	
	@Modifying
	@Transactional
	@Query(value="update serviceprovider s set s.service_provider_status='approved',s.service_provider_id=:sid where s.uid=:uid",nativeQuery=true)
	void setUserStatus(@Param("uid") Integer uid, @Param("sid") Long sid);
		
	@Modifying
	@Transactional
	@Query(value="update serviceprovider s set s.service_provider_status='rejected' where s.uid=:uid",nativeQuery=true)
	void setUserRejectionStatus(@Param("uid") Integer uid);

	ServiceProviderEntity getByUserName(String userName);
	ServiceProviderEntity findByUserName(String userName);

	//List<ServiceProviderRegistrationModel> findAllAccounts();

	List<ServiceProviderEntity> findAll();

	//List<ServiceProviderEntity> findAccountNumber();

}
