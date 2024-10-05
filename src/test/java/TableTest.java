import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {

    @Test
    void getValue() {
        Table table = new Table(5, 4);
        table.setValue(0,1,10);
        assertEquals(10, table.getValue(0, 1));
    }

    @Test
    void rows() {
        Table table = new Table(3, 3);
        assertEquals(3, table.rows());
    }

    @Test
    void cols() {
        Table table = new Table(3, 2);
        assertEquals(2, table.cols());
    }

    @Test
    void average() {
        Table table = new Table(2, 2);
        table.setValue(0,1,10);
        assertEquals(2.5, table.average());
    }
}