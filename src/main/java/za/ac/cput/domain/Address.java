package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.Objects;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;
    private String province;
    private String streetName;
    private String city;
    private int zipCode;

    // Private constructor to enforce immutability and use Builder
    private Address(Builder builder) {
        this.addressId = builder.addressId;
        this.province = builder.province;
        this.streetName = builder.streetName;
        this.city = builder.city;
        this.zipCode = builder.zipCode;
    }

    // No-argument constructor required by JPA
    protected Address() {}

    // Getters
    public int getAddressId() {
        return addressId;
    }

    public String getProvince() {
        return province;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public int getZipCode() {
        return zipCode;
    }

    // Overriding equals for object comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return addressId == address.addressId &&
                zipCode == address.zipCode &&
                Objects.equals(province, address.province) &&
                Objects.equals(streetName, address.streetName) &&
                Objects.equals(city, address.city);
    }

    // Overriding hashCode for hash consistency
    @Override
    public int hashCode() {
        return Objects.hash(addressId, province, streetName, city, zipCode);
    }

    // Overriding toString for readability
    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", province='" + province + '\'' +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }

    // Builder class for constructing Address objects
    public static class Builder {
        private int addressId;
        private String province;
        private String streetName;
        private String city;
        private int zipCode;

        // Setter methods for configuring the builder
        public Builder setAddressId(int addressId) {
            this.addressId = addressId;
            return this;
        }

        public Builder setProvince(String province) {
            this.province = province;
            return this;
        }

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setZipCode(int zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        // Copy method for creating a builder based on an existing Address
        public Builder copy(Address address) {
            this.addressId = address.addressId;
            this.province = address.province;
            this.streetName = address.streetName;
            this.city = address.city;
            this.zipCode = address.zipCode;
            return this;
        }

        // Build method to create the Address object
        public Address build() {
            return new Address(this);
        }
    }
}
