package za.ac.cput.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.factory.AddressFactory;
import za.ac.cput.domain.Address;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AddressServiceTest {

    private Address address1;
    private Address address2;
    private Address address3;

    @Autowired
    private AddressService service;

    @BeforeEach
    void setUp() {
        // Creating sample Address objects using the AddressFactory
        address1 = AddressFactory.buildAddress(1, "Western Cape", "Main St", "Cape Town", 8000);
        address2 = AddressFactory.buildAddress(2, "Gauteng", "Pine Rd", "Johannesburg", 2000);
        address3 = AddressFactory.buildAddress(3, "KwaZulu-Natal", "Beach Ave", "Durban", 4000);
    }

    @Test
    void create() {
        // Create address1 in the database
        Address createdAddress1 = service.create(address1);
        assertNotNull(createdAddress1); // Check that the created address is not null
        System.out.println(createdAddress1); // Print the created address
    }

    @Test
    void read() {
        // Assuming address1 was created earlier, now read address1 by ID
        Address readAddress1 = service.read(address1.getAddressId());
        assertNotNull(readAddress1); // Check that the address is found
        System.out.println(readAddress1); // Print the read address
    }

    @Test
    void update() {
        // Create an updated version of address2
        Address updatedAddress = new Address.Builder()
                .copy(address2)  // Copy values from address2
                .setStreetName("New Pine Rd") // Update street name
                .build();

        // Update address2 in the database
        Address objectUpdatedInDatabase = service.update(updatedAddress);
        assertNotNull(objectUpdatedInDatabase); // Check that the updated address is not null
        System.out.println(objectUpdatedInDatabase); // Print the updated address
    }

    @Test
    void getAll() {
        // Call getAll method to fetch all addresses
        List<Address> addresses = service.getAll();
        assertNotNull(addresses); // Check that the list of addresses is not null
        assertFalse(addresses.isEmpty()); // Check that the list is not empty
        System.out.println(addresses); // Print the list of all addresses
    }
}
