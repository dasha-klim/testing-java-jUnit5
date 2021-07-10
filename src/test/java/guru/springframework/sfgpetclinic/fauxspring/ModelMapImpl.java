package guru.springframework.sfgpetclinic.fauxspring;

import java.util.HashMap;
import java.util.Map;

public class ModelMapImpl implements Model{
    Map<String, Object> innerMap = new HashMap<>();
    @Override
    public void addAttribute(String key, Object o) {
        innerMap.put(key, o);
    }

    @Override
    public void addAttribute(Object o) {
        //do nothing
    }

    public Map<String, Object> getInnerMap() {
        return innerMap;
    }
}
