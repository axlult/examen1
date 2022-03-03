package testbean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import encripta.Encripta;


public class MySpringWriterBeanWithDependency {
    private Encripta encripta;
    @Autowired
    public void setEncripta (Encripta pencripta){
        this.encripta = pencripta;
    }
    public void run(){
        String s = "Samplestring";
        encripta.encripta(s);
    }


}
