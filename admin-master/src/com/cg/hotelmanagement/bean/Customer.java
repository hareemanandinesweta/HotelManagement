package com.cg.hotelmanagement.bean;

public class Customer {

    private long customerId;
    private String customerUsername;
    private String customerFirstName;
    private String customerLastName;
    private String gender;
    private String customerAddress;
    private String customerIdNo;
    private String customerPhoneNo;
    private String customerEmailId;
    private String customerPassword;

    public Customer(long customerId, String customerUsername, String customerFirstName, String customerLastName, String gender, String customerAddress, String customerIdNo, String customerPhoneNo, String customerEmailId, String customerPassword) {
        this.customerId = customerId;
        this.customerUsername = customerUsername;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.gender = gender;
        this.customerAddress = customerAddress;
        this.customerIdNo = customerIdNo;
        this.customerPhoneNo = customerPhoneNo;
        this.customerEmailId = customerEmailId;
        this.customerPassword = customerPassword;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", customerUsername='" + customerUsername + '\'' +
                ", customerFirstName='" + customerFirstName + '\'' +
                ", customerLastName='" + customerLastName + '\'' +
                ", gender='" + gender + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerIdNo='" + customerIdNo + '\'' +
                ", customerPhoneNo='" + customerPhoneNo + '\'' +
                ", customerEmailId='" + customerEmailId + '\'' +
                ", customerPassword='" + customerPassword + '\'' +
                '}';
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerUsername() {
        return customerUsername;
    }

    public void setCustomerUsername(String customerUsername) {
        this.customerUsername = customerUsername;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerIdNo() {
        return customerIdNo;
    }

    public void setCustomerIdNo(String customerIdNo) {
        this.customerIdNo = customerIdNo;
    }

    public String getCustomerPhoneNo() {
        return customerPhoneNo;
    }

    public void setCustomerPhoneNo(String customerPhoneNo) {
        this.customerPhoneNo = customerPhoneNo;
    }

    public String getCustomerEmailId() {
        return customerEmailId;
    }

    public void setCustomerEmailId(String customerEmailId) {
        this.customerEmailId = customerEmailId;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }
}
