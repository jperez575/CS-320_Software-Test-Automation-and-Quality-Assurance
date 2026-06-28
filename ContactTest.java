import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContactCreation() {
		Contact contact = new Contact(
				"123",
				"Jason",
				"Perez",
				"1234567890",
				"123 First St");
		
		assertEquals("123", contact.getId());
		assertEquals("Jason", contact.getFirstName());
		assertEquals("Perez", contact.getLastName());
		assertEquals("1234567890", contact.getPhoneNumber());
		assertEquals("123 First St", contact.getAddress());
	}
	
	@Test
	void testInvalidId() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(
					null,
					"Jason",
					"Perez",
					"1234567890",
					"123 First St");
		});
	}
	
	@Test
	void testInvalidFirstName() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact (
					"123",
					"ExcessiveCharacters",
					"Perez",
					"1234567890",
					"123 First St");
		});
	}
	
	@Test
	void testInvalidLastName() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact (
					"123",
					"Jason",
					"ExcessiveCharacters",
					"1234567890",
					"123 First St");
		});
	}
	
	@Test
	void testInvalidPhoneNnumber() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact (
					"123",
					"Jason",
					"Perez",
					"12345",
					"123 First St");
		});
	}
	
	@Test
	void testInvalidAddress() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact (
					"123",
					"Jason",
					"Perez",
					"1234567890",
					"Excessively long address that is more than thirty characters");
		});
	}
	
	@Test
    void testSetFirstName() {

        Contact contact = new Contact(
                "123",
                "Jason",
                "Perez",
                "1234567890",
                "123 First St");

        contact.setFirstName("Mike");

        assertEquals("Mike", contact.getFirstName());
    }

    @Test
    void testSetLastName() {

        Contact contact = new Contact(
                "123",
                "Jason",
                "Perez",
                "1234567890",
                "123 First St");

        contact.setLastName("Jones");

        assertEquals("Jones", contact.getLastName());
    }

    @Test
    void testSetPhoneNumber() {

        Contact contact = new Contact(
                "123",
                "Jason",
                "Perez",
                "1234567890",
                "123 First St");

        contact.setPhoneNumber("0987654321");

        assertEquals("0987654321", contact.getPhoneNumber());
    }

    @Test
    void testSetAddress() {

        Contact contact = new Contact(
                "123",
                "Jason",
                "Perez",
                "1234567890",
                "123 First St");

        contact.setAddress("456 Main St");

        assertEquals("456 Main St", contact.getAddress());
    }
}

