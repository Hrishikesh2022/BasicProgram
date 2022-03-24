package com.csi.ProductRepository;

import com.csi.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface ProductRepository extends JpaRepository<Customer,Integer> {

    public Customer findByCustLaunchDate(Date custLaunchDate);

    public  Customer findByCustCode(long custCode);

    public Customer findByCustName(String custName);
}
