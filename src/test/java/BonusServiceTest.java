import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateNotRegisrteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test

    void shouldCalculateNotRegisrteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = false;
        long expected = 100;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }


}