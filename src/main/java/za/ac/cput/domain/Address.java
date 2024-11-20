package za.ac.cput.domain;

import java.util.Objects;

public class Address {
    private long addressId;
    private String province;
    private String streetName;
    private String city;
    private int zipCode;

    public Address(Builder builder) {
        this.addressId = builder.addressId;
        this.province = builder.province;
        this.streetName =builder.streetName;
        this.city =builder.city;
        this.zipCode = builder.zipCode;

    }




    public long getAddressId() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return addressId == address.addressId && zipCode == address.zipCode && Objects.equals(province, address.province) && Objects.equals(streetName, address.streetName) && Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressId, province, streetName, city, zipCode);
    }

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
    public static class Builder{
        private long addressId;
        private String province;
        private String streetName;
        private String city;
        private int zipCode;

        public Builder setAddressId(long addressId) {
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

        public Builder copy(Address address) {
            this.addressId = address.addressId;
            this.province = address.province;
            this.streetName =address.streetName;
            this.city = address.city;
            this.zipCode = address.zipCode;
            return this;
        }

        public Address build(){
            return new Address(this);
        }
    }

}
