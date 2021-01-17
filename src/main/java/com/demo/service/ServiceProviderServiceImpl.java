package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.ServiceProvider;
import com.demo.dao.ServiceProviderDao;

@Service
public class ServiceProviderServiceImpl implements ServiceProviderService {
	@Autowired
	ServiceProviderDao serviceProviderDao;


	@Override
	public List<ServiceProvider> getAllServiceProviders() {
		return serviceProviderDao.findAll();		
	}


	@Override
	public Optional<ServiceProvider> getServiceProviderById(int Pid) {
		return serviceProviderDao.findById(Pid);
	}

	@Override
	public ServiceProvider updateServiceProvider(ServiceProvider p) {
		return  serviceProviderDao.save(p);
		//return 1;
	}	
	@Override
	public int deleteById(int id) {
		ServiceProvider p=new ServiceProvider();
		serviceProviderDao.delete(p);
		 return 1;
	
	}

	@Override
	public void addServiceProvider(ServiceProvider p) {
		serviceProviderDao.save(p);
		
	}

	

}
