package by.trjava.task01.entity;

import java.util.Objects;

/**
 * This is base class for different appliances
 *
 * @author Kaloshych Katsiaryna
 * @version 2.0
 * @since JDK1.0
 */
public class Appliance {
   private String name;

    public Appliance(String name) {
        this.name = name;
    }

    public Appliance() {
          }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {return true;}
        if (obj == null){ return false;}
        if (getClass()!=obj.getClass()){ return false;}
        Appliance other=(Appliance) obj;
        if(name==null){
            if(other.name!=null){ return false;}
            else if(!name.equals(other.name)){ return false;}
        }
        return true;
    }

    @Override
    public int hashCode() {
        return (int)(31*(name==null?0:name.hashCode()));
    }

    @Override
    public String toString() {
        return getClass().getName() + "@"+
                "name='" + name ;
    }
}


