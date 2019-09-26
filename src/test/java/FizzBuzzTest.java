import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void should_print_fizz_when_it_is_divided_by_three() {
        assert fizzBuzz.print(3).equals("Fizz");
    }

    @Test
    public void should_print_buzz_when_it_is_divided_by_five() {
        assert fizzBuzz.print(5).equals("Buzz");
    }

    @Test
    public void should_print_fizz_buzz_when_it_is_divided_by_three_and_five() {
        assert fizzBuzz.print(15).equals("FizzBuzz");
    }

    @Test
    public void should_print_fizz_when_it_includes_three() {
        assert fizzBuzz.print(31).equals("Fizz");
    }

    @Test
    public void should_print_buzz_when_it_includes_five() {
        assert fizzBuzz.print(52).equals("Buzz");
    }

    @Test
    public void should_print_fizz_buzz_when_it_includes_three_and_five() {
        assert fizzBuzz.print(53).equals("FizzBuzz");
    }
}
