package Rest2;

import org.json.simple.JSONObject;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import javax.ws.rs.core.*;
import org.junit.*;

import static org.junit.Assert.*;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import static org.mockito.Mockito.*;

public class TestMockito {
    @Mock
    ICalc icalc;


    @Test
    public void SimpleTest(){
      Calculator mcalc = mock(Calculator.class);
      mcalc.getAnswer("plus",2,3);
      verify(mcalc).getAnswer("plus",2,3);
    }


    @Test
    public void Test2(){
    Calculator mcalc = mock(Calculator.class);

        when(mcalc.getAnswer("plus",3,3)).thenReturn(Response.status(201).entity("Answer: "+5).build());
    }

    @Test
    public void Test3(){
        Calculator calc = new Calculator();

        assertEquals("Answer: "+5,calc.getAnswer("plus",2,3).getEntity().toString());
   }



   @Test
    public void testSpy(){
       Calculator calc = spy(new Calculator());
       when(calc.getAnswer("plus",3,3)).thenReturn(Response.status(201).entity("Answer: "+5).build());
   }
}
