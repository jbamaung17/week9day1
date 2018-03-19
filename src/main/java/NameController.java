import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import static spark.Spark.get;

public class NameController {
    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        get("/randomName/one", (req, res) -> {
            ArrayList<Name> names = new ArrayList<Name>();

            Name name1 = new Name("Homer Simpson");
            Name name2 = new Name("Marge Simpson");
            Name name3 = new Name("Bart Simpson");
            Name name4 = new Name("Lisa Simpson");
            Name name5 = new Name("Maggie Simpson");

            names.add(name1);
            names.add(name2);
            names.add(name3);
            names.add(name4);
            names.add(name5);

            Collections.shuffle(names);
            Name result = names.get(0);

            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result);

            return new ModelAndView(model, "one.vtl");
        }, velocityTemplateEngine);

        get("/randomName/two", (req, res) -> {
            ArrayList<Name> names = new ArrayList<Name>();

            Name name1 = new Name("Homer Simpson");
            Name name2 = new Name("Marge Simpson");
            Name name3 = new Name("Bart Simpson");
            Name name4 = new Name("Lisa Simpson");
            Name name5 = new Name("Maggie Simpson");

            names.add(name1);
            names.add(name2);
            names.add(name3);
            names.add(name4);
            names.add(name5);

            Collections.shuffle(names);
            Name result1 = names.get(0);
            Name result2 = names.get(1);

            HashMap<String, Object> model = new HashMap<>();
            model.put("result1", result1);
            model.put("result2", result2);

            return new ModelAndView(model, "two.vtl");
        }, velocityTemplateEngine);


    }
}

