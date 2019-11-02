package be.juvo.introductionarycourse.MockitoAndLombok.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MockitoStringWrapperTest {

    private StringWrapper stringWrapper;

    @BeforeEach
    void setUp() {
        this.stringWrapper = mock(StringWrapper.class);
    }

    @Test
    void testThatValueIsReturned() {
        //given
        String expected = "Hello World!";
        //when
        when(stringWrapper.getValue()).thenReturn(expected);
        //then
        assertThat(expected).isEqualTo(stringWrapper.getValue());
    }

    @Test
    void testThatExceptionIsThrown(){
        //given
        String message = "It appears an exception has been thrown";
        //when
        when(stringWrapper.getValue()).thenThrow(new IllegalArgumentException(message));
        //then
        assertThrows(IllegalArgumentException.class, () -> stringWrapper.getValue());
    }
}