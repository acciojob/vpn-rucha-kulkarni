// Note: Do not write @Enumerated annotation above CountryName in this model.
package com.driver.model;

import javax.persistence.*;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private CountryName countryName;

    private String codes;

    //parent
    @OneToOne(mappedBy = "country" ,cascade = CascadeType.ALL)
    User user;

    @ManyToOne
    @JoinColumn
    ServiceProvider serviceProvider;

    public Country() {
    }

    public Country(int id, CountryName countryName, String codes, User user, ServiceProvider serviceProvider) {
        this.id = id;
        this.countryName = countryName;
        this.codes = codes;
        this.user = user;
        this.serviceProvider = serviceProvider;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CountryName getCountryName() {
        return countryName;
    }

    public void setCountryName(CountryName countryName) {
        this.countryName = countryName;
    }

    public String getCodes() {
        return codes;
    }

    public void setCodes(String codes) {
        this.codes = codes;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }
}
