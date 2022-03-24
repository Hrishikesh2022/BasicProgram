package com.csi.dao;

import com.csi.ProductRepository.ProductRepository;
import com.csi.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class CustomerDaoImpl implements CustomerDao {
    @Autowired
    ProductRepository productRepositoryImpl;


    @Override
    public Customer saveData(Customer customer) {
        return productRepositoryImpl.save(customer);
    }

    @Override
    public List<Customer> getAllData() {
        return productRepositoryImpl.findAll();

    }

    @Override
    public Customer updateData(int custId, Customer customer) {
        return productRepositoryImpl.save(customer);
    }

    @Override
    public List<Customer> saveBulkOfCustomerData(List<Customer> customers) {
        return productRepositoryImpl.saveAll(customers);
    }

    @Override
    public Optional<Customer> getDataById(int custId) {
        return productRepositoryImpl.findById(custId);
    }

    @Override
    public Customer getDataByCustomerName(String custName) {
        return productRepositoryImpl.findByCustName(custName);
    }

    @Override
    public Customer getDataByLaunchDate(Date custLaunchDate) {
        return productRepositoryImpl.findByCustLaunchDate(custLaunchDate);
    }

    @Override
    public Customer getDataByCode(long custCode) {
        return productRepositoryImpl.findByCustCode(custCode);
    }

    @Override
    public void deleteDataById(int custId) {
        productRepositoryImpl.deleteById(custId);
    }

    @Override
    public List<Customer> filterData(double custPrice) {
        return productRepositoryImpl.findAll().stream().filter(cust->cust.getCustPrice()>=custPrice).collect(Collectors.toList());
    }


    @Override
    public void deleteAllData() {
        productRepositoryImpl.deleteAll();

    }
}





