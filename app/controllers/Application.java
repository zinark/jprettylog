package controllers;

import org.joda.time.DateTime;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.HashMap;
import java.util.Map;

public class Application extends Controller
{
    static Map<String, Object> memory = new HashMap<>();

    static {
        memory.put("inited at", DateTime.now().toString());
    }



    public static Result index()
    {
        memory.put("index called at", DateTime.now().toString());

        Map<String, Object> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", "jack");
        for (int i = 0; i < 10; i++)
        {
            map.put("toStr " + i, Test.numberToString(i));
        }
        map.put("factorial of 5", Test.fact(5));

        Map<String, Object> merged = new HashMap<>();
        merged.putAll(map);
        merged.putAll(memory);

        return ok(Json.toJson(merged));
    }

    public static Result foo()
    {
        return ok(views.html.index.render("It works"));
    }
}
