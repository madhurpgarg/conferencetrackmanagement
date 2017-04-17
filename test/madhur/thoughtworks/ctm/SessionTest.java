package madhur.thoughtworks.ctm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SessionTest {
	
	private Session session;

	@Test
	public void testSession() {
		//Given 
		session = null;
		
		//when
		session = new Session(180, "09:30AM");
		
		//Then
		assertNotNull(session);
	}

	@Test
	public void testGetDuration() {
		//Given
		session = null;
		
		//When
		session = new Session(180, "09:30AM");
		
		//Then
		assertEquals(180, session.getDuration());
	}


	@Test
	public void testCanAccomodate() {
		session = new Session(90, "09:30AM");
		assertTrue(session.canAccomodate(new Talk("accomodatable talk", 80)));
	}
	
	@Test
	public void testCannotAccomodate() {
		session = new Session(90, "09:30AM");
		assertFalse(session.canAccomodate(new Talk("Not accomodatable talk", 110)));
	}

}
