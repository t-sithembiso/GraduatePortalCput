package za.ac.cput.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.CareerFair;
import za.ac.cput.factory.CareerFairFactory;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
class CareerFairServiceTest {
    @Autowired
    private CareerFairService careerFairService;

    private static CareerFair careerFair1;
    private static CareerFair careerFair2;
    private static CareerFair careerFair3;
    @BeforeAll
    static void setUp() {
        System.out.println("----------------------------Setup---------------------------------------------");
        careerFair1 = CareerFairFactory.buildCareerFairWithoutId(
                "Engineering Expo",
                "Engineering-focused career fair",
                "Engineering Hall",
                LocalDate.of(2024, 6, 15),
                true,
                LocalDate.of(2024, 6, 10),
                "Alice Johnson",
                "1234567890",
                "alice.johnson@engexpo.com"
        );

        careerFair2 = CareerFairFactory.buildCareerFairWithoutId(
                "Health Sciences Fair",
                "Health sciences career opportunities",
                "Medical School Auditorium",
                LocalDate.of(2024, 7, 20),
                true,
                LocalDate.of(2024, 7, 10),
                "Bob Smith",
                "0987654321",
                "bob.smith@healthfair.com"
        );

        careerFair3 = CareerFairFactory.buildCareerFairWithoutId(
                "Tech Innovations Summit",
                "A platform for showcasing technology career options",
                "Tech Park",
                LocalDate.of(2024, 8, 10),
                true,
                LocalDate.of(2024, 8, 5),
                "Clara Brown",
                "1122334455",
                "clara.brown@techsummit.com"
        );
    }

    @Test
    void a_saveFair() {
        CareerFair savedFair1 = careerFairService.saveFair(careerFair1);
        CareerFair savedFair2 = careerFairService.saveFair(careerFair2);
        CareerFair savadFair3 = careerFairService.saveFair(careerFair3);

        assertNotNull(savedFair1);
        assertNotNull(savedFair2);
        assertNotNull(savadFair3);

        assertEquals("Engineering Expo", savedFair1.getEventName());
        assertEquals("Health Sciences Fair", savedFair2.getEventName());
        assertEquals("Tech Innovations Summit", savadFair3.getEventName());

        System.out.println(savedFair1);
        System.out.println(savedFair2);
        System.out.println(savadFair3);

    }

    @Test
    void b_updateFair() {
        CareerFair savedFair = careerFairService.saveFair(careerFair3);
        assertNotNull(savedFair);

        savedFair.setDescription("Updated description for Tech Summit");
        CareerFair updatedFair = careerFairService.updateFair(savedFair);

        assertNotNull(updatedFair);
        assertEquals("Updated description for Tech Summit", updatedFair.getDescription());
        System.out.println("Updated Career fair: " + updatedFair);
    }

    @Test
    void c_findAllFair() {
        careerFairService.saveFair(careerFair1);
        careerFairService.saveFair(careerFair2);

        List<CareerFair> allFairs = careerFairService.findAllFair();
        assertNotNull(allFairs);
        System.out.println("All Career Fairs: " + allFairs);

    }

    @Test
    void d_findFairByName() {
        careerFairService.saveFair(careerFair1);
        CareerFair foundFair = careerFairService.findFairByName("Engineering Expo");

        assertNotNull(foundFair);
        assertEquals("Engineering Expo", foundFair.getEventName());
        System.out.println("Career Found: " + foundFair);
    }
}