import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testAddContact() {
		ContactService service = new ContactService();
		
		Contact contact = new Contact(
				"123",
				"Jason",
				"Perez",
				"1234567890",
				"123 First St");
		assertTrue(service.addContact(contact));
	}
	
	@Test
	void testAddDuplicateContact() {
		ContactService service = new ContactService();
		
		Contact contact1 = new Contact(
				"123",
				"Jason",
				"Perez",
				"1234567890",
				"123 First St");
		
		Contact contact2 = new Contact(
				"123",
				"Bill",
				"Gates",
				"0987654321",
				"456 Main St");
		
		service.addContact(contact1);
		
		assertFalse(service.addContact(contact2));
	}
	
	@Test
	void testDeleteContact() {
		ContactService service = new ContactService();
		
		Contact contact = new Contact(
				"123",
				"Jason",
				"Perez",
				"1234567890",
				"123 First St");
		
		service.addContact(contact);
		
		assertTrue(service.deleteContact("123"));
	}
	
	@Test
	void testUpdateFirstName() {
		ContactService service = new ContactService();
		
		Contact contact = new Contact(
				"123",
				"Jason",
				"Perez",
				"1234567890",
				"123 First St");
		
		service.addContact(contact);
		
		assertTrue(service.updateFirstName("123","Jake"));
	}
	
	@Test
	void testUpdateLastName() {
		ContactService service = new ContactService();
		
		Contact contact = new Contact (
				"123",
				"Jason",
				"Perez",
				"1234567890",
				"123 First St");
		
		service.addContact(contact);
		
		assertTrue(service.updateLastName("123", "Ortega"));
	}
	
	@Test
	void testUpdatePhoneNumber() {
		ContactService service = new ContactService();
		
		Contact contact = new Contact (
				"123",
				"Jason",
				"Perez",
				"1234567890",
				"123 First St");
		
		service.addContact(contact);
		
		assertTrue(service.updatePhoneNumber("123", "0987654321"));
	}
	
	@Test
	void testUpdateAddress() {
		ContactService service = new ContactService();
		
		Contact contact = new Contact (
				"123",
				"Jason",
				"Perez",
				"1234567890",
				"123 First St");
		
		service.addContact(contact);
		
		assertTrue(service.updateAddress("123", "456 Main St"));
	}

}
