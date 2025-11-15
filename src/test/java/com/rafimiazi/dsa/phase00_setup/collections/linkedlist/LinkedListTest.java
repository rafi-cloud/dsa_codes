package com.rafimiazi.dsa.phase00_setup.collections.linkedlist;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    LinkedList<Integer> list = new LinkedList<>();

    @Test
    void check () {
        assertEquals(list, list);
    }
    @Test
    void checkk () {
        System.out.println("rafi");
    }

    @Test
    void itShouldAddTwoNumbers () {
        //given
        int x = 10;
        int y = 20;

        //when 
        int result = x + y;

        
        //then
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }
    
}