package be.juvo.introductionarycourse.MockitoAndLombok.mockito;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class MockitoAnnotationsTest {

    @Mock
    List<String> mockList;

    @Spy
    List<String> spyList = new LinkedList<>();

    @Before
    public void setUp(){
        /*//we would have to do this, if we hadn't added @RunWith(MockitoJUnitRunner.class) to our testclass
        MockitoAnnotations.initMocks(this);*/
    }

    @Test //note that our test needs to be public!
    public void testThatMockAnnotationWork(){
        //given
        mockList.add("one");
        //when -we're verifying that "one" has been added to the mockList-
        Mockito.verify(mockList).add("one");
        //then -now we're asserting that our list was indeed mocked. Size has not increased-
        assertThat(0).isEqualTo(mockList.size());
    }

    @Test
    public void testThatSpyAnnotationWork(){
        //given
        spyList.add("one");
        //when -we're veryfying that "one" has been added to the spyList-
        Mockito.verify(spyList).add("one");
        //then -now we're asserting that our list was spied on. REAL add() method used!-
        assertThat(1).isEqualTo(spyList.size());
    }

    @Test
    public void testThatAddMethodIsCalledThreeTimes(){
        //given
        mockList.add("one");
        mockList.add("two");
        mockList.add("three");
        //when-then
        Mockito.verify(mockList, Mockito.times(3)).add(Mockito.any());
    }


}
