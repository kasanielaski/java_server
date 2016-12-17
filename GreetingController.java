package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private int[] ar;
    private Integer summ = 0;
    
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name,
    						@RequestParam(value="size", defaultValue="25") Integer size) {        
        ar = new int[size];
        for(int i = 0; i<size; i++){
        	ar[i] = (int)(Math.random()*100);
        }
        for(int i = 0; i<size; i++){
        	summ += ar[i];
        }

        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name), size, ar, summ);
    }
}
