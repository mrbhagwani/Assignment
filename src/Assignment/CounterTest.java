package Assignment;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CounterTest {

    @Test
    public void testCountRows() {
        //Arrange
        Counter myRows = new Counter();
        //Act
        int expected = 0;
        int actual = myRows.getRowCount();
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    public void testCountRows1() {
        //Arrange
        Counter textCounter = new Counter();
        //Act
        textCounter.setText("hej");
        int expected = 1;
        int actual = textCounter.getRowCount();
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    public void testCountRows2() {
        //Arrange
        Counter textCounter = new Counter();
        //Act
        textCounter.setText("hej");
        textCounter.setText("hejhej");
        int expected = 2;
        int actual = textCounter.getRowCount();
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    public void testCountSigns() {
        //Arrange
        Counter textCounter = new Counter();
        //Act
        int expected = 0;
        int actual = textCounter.getSignCount();
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    public void testCountSigns1() {
        //Arrange
        Counter textCounter = new Counter();
        //Act
        textCounter.setText("hej");
        int expected = 3;
        int actual = textCounter.getSignCount();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void testCountWords() {
        //Arrange
        Counter textCounter = new Counter();
        //Act
        textCounter.setText("hej");
        int expected = 1;
        int actual = textCounter.getWordCount();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void testCountWords1() {
        //Arrange
        Counter textCounter = new Counter();
        //Act
        textCounter.setText("hej");
        textCounter.setText("hej");
        int expected = 2;
        int actual = textCounter.getWordCount();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void testStopFunction() {
        //Arrange
        Counter myRows = new Counter();
        //Act
        myRows.setText("stop");
        boolean expected = false;
        boolean actual = myRows.running();
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    public void testStopFunction1() {
        //Arrange
        Counter myRows = new Counter();
        //Act
        myRows.setText("hej");
        boolean expected = true;
        boolean actual = myRows.running();
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    public void testgettheLongestWord() {
        //Arrange
        Counter textCounter = new Counter();
        //Act
        textCounter.setText("hej");
        textCounter.setText("hej hemant");
        String expected = "hemant";
        String actual = textCounter.gettheLongestWord();
        //Assert
        assertEquals(expected,actual);
    }

}
