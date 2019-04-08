package learn.agile.demos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author pcooke
 *
 */
@SpringBootApplication
@Controller
public class DemoApplication {

    /**
     * The main method torun the spring demo testing.
     * @param args for the main method.
     */
    public static void main(final String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    /**
     * if HTTP request ends in "/" return index.
     * @return String The index.
     */
    @RequestMapping("/")
    public final String index() {
        return "index";
    }
}
