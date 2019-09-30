import java.util.HashMap;
import com.google.gson.Gson;

public class Handler {
    public Object handler(Object event) {
        Gson gson = new Gson();
        System.out.println(gson.toJson(event));
	System.out.println('hi');

        return new HashMap();
    }
}
