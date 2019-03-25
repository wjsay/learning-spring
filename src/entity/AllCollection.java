package entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class AllCollection {
    private List<String> list;
    private String[] strings;
    private Set<String> set;
    private Map<String, String> map;
    private Properties props;


    public List<String> getList() {
        return list;
    }

    public String[] getStrings() {
        return strings;
    }

    public Set<String> getSet() {
        return set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public Properties getProps() {
        return props;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public String showInfo() {
        String s = "";
        for (String str : strings) {
            s += str + ", ";
        }
        return s + "\n" + this.list + "\n" + this.map + "\n" + this.set + "\n" + this.props;
    }
}
