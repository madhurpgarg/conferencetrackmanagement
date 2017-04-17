/**
 * 
 */
package madhur.thoughtworks.ctm;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * @author garggmad
 *
 */
public class TimeTest {
	
	private Time time;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testToString() {
		this.time = new Time("09:30AM");
		assertEquals("09:30AM", this.time.toString());
	}
	
	@Test
	public void testIncrementMinutesBy() {
		this.time = new Time("09:30AM");
		this.time.incrementMinutesBy(15);
		assertEquals("09:45AM", this.time.toString());
	}
	
	@Test
	public void testIncrementHourBy() {
		this.time = new Time("09:30AM");
		this.time.incrementHoursBy(2);
		assertEquals("11:30AM", this.time.toString());
	}

}
