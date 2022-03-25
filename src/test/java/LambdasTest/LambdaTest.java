package LambdasTest;

import com.ibm.academy.lambdas.ChallengeLambda;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class LambdaTest {



    @ParameterizedTest
    @ValueSource(ints = {45,3,5})
    void esImpar(int numero){
        assertTrue(ChallengeLambda.esImpar(numero));
    }


    @ParameterizedTest
    @ValueSource(ints = {113,6,5})
    void esPrimo(int numero){
        assertTrue(ChallengeLambda.esPrimo(numero));
    }

    @Test
    void suma(){
        assertEquals(15 ,ChallengeLambda.sumar(8, 7));
    }

    @Test
    void resta(){
        assertEquals(27 , ChallengeLambda.restar(50,23));
    }

    //@Test
    @ParameterizedTest
    @ValueSource(ints = {3})
    void factorial(int numero){
        assertEquals(6, ChallengeLambda.factorial(numero));
    }
}
