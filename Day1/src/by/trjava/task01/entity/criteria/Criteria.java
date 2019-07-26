package by.trjava.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

/**
 * This class create Map and add key-value from class Main
 *
 * @author Kaloshych Katsiaryna
 * @version 2.0
 * @since JDK1.0
 */
public class Criteria {
    private String groupSearchName;
    private Map<String, Object> criteria = new HashMap<String, Object>();

    public Criteria(String groupSearchName) {
        this.groupSearchName = groupSearchName;
    }

    public String getGroupSearchName() {
       return groupSearchName;
    }
    /**
     * This method add values in Map
     *
     * @param searchCriteria for appliance
     * @param value for appliance
     */
    public void add(String searchCriteria, Object value) {
        criteria.put(searchCriteria, value);
    }

    public Map<String, Object> getCriteriaMap() {
        return criteria;
    }

}


