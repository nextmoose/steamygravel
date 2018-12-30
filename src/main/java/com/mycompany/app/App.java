import com.mycompany.app.Entry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@EnableAutoConfiguration
public class App {
    private final List<Entry> entries = new ArrayList<>();

    public App() {
        entries.add(new Entry(new Date(),"Hello World"));
        entries.add(new Entry(new Date(), "Good Bye"));
    }

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/health")
    Map<String,String> health(){
	    Map<String, String> health = new HashMap<>();
	    health.put("status", "good");
	    health.put("test", "it");
	    return health;
    }

    @GetMapping("/rest/api/entries")
    List<? extends Entry> getEntries() {
	    return entries;
    }

    @PostMapping("/rest/api/entry")
    void postEntry(Entry entry) {
        this.entries.add(new Entry(new Date(), "adsfadsfds"));
    }

	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

}
