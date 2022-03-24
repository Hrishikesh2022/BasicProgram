package com.csi.service;

import com.csi.model.Customer;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface CustomerService {

    public Customer saveData(Customer customer);

    public List<Customer> getAllData();

    public Customer updateData(int custId, Customer customer);

    public List<Customer> saveBulkOfCustomerData(List<Customer> customers );

    public Optional<Customer> getDataById(int custId);

    public Customer getDataByCustomerName(String custName);

    public Customer getDataByLaunchDate(Date custLaunchDate);

    public Customer getDataByCode(long custCode);

    public void deleteDataById(int custId);

    public List<Customer> filterData(double custPrice);


    public void deleteAllData();
}
