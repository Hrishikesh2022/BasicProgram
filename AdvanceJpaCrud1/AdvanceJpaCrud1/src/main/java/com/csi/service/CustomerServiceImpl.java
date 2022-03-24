package com.csi.service;

import com.csi.dao.CustomerDao;
import com.csi.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerDao customerDaoImpl;
    @Override
    public Customer saveData(Customer customer) {
        return customerDaoImpl.saveData(customer);
    }

    @Override
    public List<Customer> getAllData() {

        return customerDaoImpl.getAllData();
    }

    @Override
    public Customer updateData(int custId, Customer customer) {
        return customerDaoImpl.updateData(custId, customer);
    }

    @Override
    public List<Customer> saveBulkOfCustomerData(List<Customer> customers) {
        return customerDaoImpl.saveBulkOfCustomerData(customers);
    }

    @Override
    public Optional<Customer> getDataById(int custId) {
        return customerDaoImpl.getDataById(custId);
    }

    @Override
    public Customer getDataByCustomerName(String custName) {
        return customerDaoImpl.getDataByCustomerName(custName);
    }

    @Override
    public Customer getDataByLaunchDate(Date custLaunchDate) {
        return customerDaoImpl.getDataByLaunchDate(custLaunchDate);
    }

    @Override
    public Customer getDataByCode(long custCode) {
        return customerDaoImpl.getDataByCode(custCode);
    }

    @Override
    public void deleteDataById(int custId) {
         customerDaoImpl.deleteDataById(custId);

    }

    @Override
    public List<Customer> filterData(double custPrice) {
        return customerDaoImpl.filterData(custPrice);
    }



    @Override
    public void deleteAllData() {
        customerDaoImpl.deleteAllData();
    }
}
