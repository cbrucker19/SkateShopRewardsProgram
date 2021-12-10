import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class UnitTestingBrucker {
	//Testing the stack class and making sure it can create a stack
	@Test
	void testCreateStack() {
		// ARRANGE
		stackBrucker myStack = new stackBrucker(1);
		boolean actual;
		// ACT
		actual = myStack.isEmpty();
		// ASSERT
		assertTrue(actual);
	}
	//testing the isEmpty method when the value is true to make sure it is working correctly
	@Test
	void testIsEmptyTrue() {
		// ARRANGE
		stackBrucker myStack = new stackBrucker(1);
		boolean actual, expected;
		// ACT
		actual = myStack.isEmpty();
		expected = true;
		// ASSERT
		assertEquals(expected, actual);
	}
	//testing the isEmpty method when the value is false to make sure it is working correctly
	@Test
	void testIsEmptyFalse() throws StackFullException {
		// ARRANGE
		stackBrucker myStack = new stackBrucker(1);
		String item = "Java is Fun!";
		boolean actual, expected;
		// ACT
		myStack.push(item);
		actual = myStack.isEmpty();
		expected = false;
		// ASSERT
		assertEquals(expected, actual);
	}
	//testing the isFull method when the value is true to make sure it is working correctly

	@Test
	void testIsFullTrue() throws StackFullException {
		// ARRANGE
		stackBrucker myStack = new stackBrucker(1);
		String item = "Java is Fun!";
		boolean actual, expected;
		// ACT
		myStack.push(item);
		actual = myStack.isFull();
		expected = true;
		// ASSERT
		assertEquals(expected, actual);
	}
	//testing the isFull method when the value is false to make sure it is working correctly
	@Test
	void testIsFullFalse() throws StackFullException {
		// ARRANGE
		stackBrucker myStack = new stackBrucker(1);
		boolean actual, expected;
		// ACT
		actual = myStack.isFull();
		expected = false;
		// ASSERT
		assertEquals(expected, actual);
	}
	//Testing the push method to make sure it is working correctly 
	@Test
	void testPushStack() throws StackFullException, StackEmptyException {
		// ARRANGE
		stackBrucker myStack = new stackBrucker(2);
		String item = "StackItem";
		String expected, actual;
		expected = "StackItem2";
		// ACT
		myStack.push(item + "1");
		myStack.push(item + "2");
		actual = myStack.peek(); 
		// ASSERT
		assertEquals(expected, actual);
		assertFalse(myStack.isEmpty());
	}
	//Testing the pop method to make sure it is working correctly
	@Test
	void testPopStack() throws StackFullException, StackEmptyException {
		// ARRANGE
		stackBrucker myStack = new stackBrucker(2);
		String item = "StackItem";
		String actual1, actual2, expected1, expected2;
		expected1 = "StackItem2";
		expected2 = "StackItem1"; 
		myStack.push(item + "1");
		myStack.push(item + "2");
		// ACT
		actual1 = myStack.pop();
		actual2 = myStack.pop();
		// ASSERT
		assertEquals(expected1, actual1);
		assertEquals(expected2, actual2);
		assertTrue(myStack.isEmpty());
	}
	//testing the stack size at zero
	@Test
	void testStackSizeZero() {
		// ARRANGE
		stackBrucker myStack = new stackBrucker(2);
		int actual, expected;
		expected = 0;
		// ACT
		actual = myStack.size();
		// ASSERT
		assertEquals(expected, actual);
	}
	//testing the stack size and making sure it isn't zero. 
	@Test
	void testStackSizeNonZero() throws StackFullException {
		// ARRANGE
		stackBrucker myStack = new stackBrucker(2);
		String item = "StackItem";
		int actual, expected;
		expected = 1;
		// ACT
		myStack.push(item + "1");
		actual = myStack.size();
		// ASSERT
		assertEquals(expected, actual);
	}
	//testing the peek method
	@Test
	void testPeekStack() throws  StackEmptyException, StackFullException {
		// ARRANGE
		stackBrucker myStack = new stackBrucker(1);
		String item = "StackItem";
		String actual, expected;
		// ACT
		myStack.push(item);
		expected = item;
		actual = myStack.peek();
		// ASSERT
		assertEquals(expected, actual);
	}
	//Testing the printStackup method 
	@Test
	void testPrintStackUp() throws StackEmptyException, StackFullException {
		// ARRANGE
		stackBrucker myStack = new stackBrucker(1);
		String item = "StackItem";
		String actual, expected;
		expected = "";
		// ACT
		myStack.push(item + "");
		//myStack.push(item + "2");
		actual = myStack.printStackUp();
		// ASSERT
		assertEquals(expected, actual);
		assertFalse(myStack.isEmpty());
	}
}