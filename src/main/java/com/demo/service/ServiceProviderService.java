package com.demo.service;

import java.util.List;
import java.util.Optional;

import com.demo.bean.ServiceProvider;

public interface ServiceProviderService {

	List<ServiceProvider> getAllServiceProviders();

	Optional<ServiceProvider> getServiceProviderById(int pid);

	ServiceProvider updateServiceProvider(ServiceProvider p);

	int  deleteById(int id);

	void addServiceProvider(ServiceProvider p);

}
