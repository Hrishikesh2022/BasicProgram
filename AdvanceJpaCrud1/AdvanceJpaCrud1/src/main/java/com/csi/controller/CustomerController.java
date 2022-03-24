package com.csi.controller;

import com.csi.model.Customer;
import com.csi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    CustomerService customerServiceImpl;

    @PostMapping("/savedata")
    public Customer saveData(@RequestBody Customer customer) {
        return customerServiceImpl.saveData(customer);

    }

    @GetMapping("/getdata")
    public List<Customer> getAllData() {
        return customerServiceImpl.getAllData();

    }

    @PutMapping("/updatedata/{custId}")
    public Customer updateData(@PathVariable int custId, @RequestBody Customer customer) {
        return customerServiceImpl.updateData(custId, customer);
    }

    @PostMapping("/savebulkofdata")
    public List<Customer> saveBulkOfData(@RequestBody List<Customer> customers) {
        return customerServiceImpl.saveBulkOfCustomerData(customers);
    }

    @GetMapping("/getdatabyid/{custId}")
    public Optional<Customer> getDataById(@PathVariable int custId) {
        return customerServiceImpl.getDataById(custId);
    }

    @GetMapping("/getdatabyname/{custName}")
    public Customer getDataByCustomerName(@PathVariable String custName) {
        return customerServiceImpl.getDataByCustomerName(custName);
    }

    @GetMapping("/getdatabylaunchdate/{custLaunchDate}")
    public Customer getDataByLaunchDate(@PathVariable @DateTimeFormat(pattern = "dd-MM-yyyy") Date custLaunchDate) {
        return customerServiceImpl.getDataByLaunchDate(custLaunchDate);
    }

    @GetMapping("/getdatabycode/{custCode}")
    public Customer getDataByCode(@PathVariable long custCode) {
        return customerServiceImpl.getDataByCode(custCode);
    }

    @DeleteMapping("/deletedatabyid/{custId}")
    public void deleteDataById(@PathVariable int custId) {
         customerServiceImpl.deleteDataById(custId);
    }

    @GetMapping("/filterdata/{custPrice}")
    public List<Customer> filterData(@PathVariable double custPrice) {
        return customerServiceImpl.filterData(custPrice);

    }


    @DeleteMapping("/deletealldata")
    public String deleteAllData() {
        customerServiceImpl.deleteAllData();
        return "Data Deleted Successfully";
    }
}






