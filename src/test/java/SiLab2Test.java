import junit.framework.TestCase;
import org.junit.Test;

public class SiLab2Test extends TestCase {
    @Test
    void everyStatementTest(){
        RunLineExcetion ex;
        ex=assertThrows(RunLineException.class ->SiLab2.angleList.get(i)>angleList.size())
        assertTrue(ex.getMessage().contains("i e pogolemo od angleList,pagja vo for");
        ex=assertThrows(RunLineException.class ->SiLab2.getMinutes()<0 || SiLab2.getMinutes()>59)
        assertTrue(ex.getMessage().contains("The minutes of the angle are not valid!"));

    }

}