import java.util.ArrayList;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayListNameTest {

	static ArrayList<Integer> alFinal = new ArrayList<Integer>();

	@BeforeClass
	public static void addDataInArray() {
		alFinal.add(2);
		alFinal.add(2);
		alFinal.add(2);
		alFinal.add(3);

	}

	@Test
	public void addDataTest() {
		Assert.assertEquals(alFinal, ArrayListName.addData());
	}

}
