package com.xworkz.enumarations.file;

public enum States {
    ANDHRA_PRADESH("Visakhapatnam", "Wipro"),
    DELHI("New Delhi", "TCS"),
    GUJARAT("Gandhinagar", "Infosys"),
    HARYANA("Gurugram", "Microsoft"),
    KARNATAKA("Bengaluru", "TCS"),
    KERALA("Thiruvananthapuram", "Wipro"),
    MADHYA_PRADESH("Bhopal", "TCS"),
    MAHARASHTRA("Pune", "Cognizant"),
    ODISHA("Bhubaneswar",  "Tech Mahindra"),
    PUNJAB("Mohali", "Infosys"),
    RAJASTHAN("Jaipur", "Genpact"),
    TAMIL_NADU("Chennai", "Zoho"),
    TELANGANA("Hyderabad", "Microsoft"),
    UTTAR_PRADESH("Noida", "HCL"),
    WEST_BENGAL("Kolkata", "wipro");

    public String city;
    public String companies;

    private States(String city, String companies) {
        this.city = city;
        this.companies = companies;
    }

    public String getCity() {

        return city;
    }

    public String getCompanies() {
        return companies;
    }
}
