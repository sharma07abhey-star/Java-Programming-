// protected - similar to default but also allows access from subclasses , even if those subclasses are in a
// differente package . (its real value becomes clear once inheritance is studied - for now , know it sits
// "between" default and public in terms of openness
// public - Accessible from anywhere , any class , any package

package Object_Oriented_Programming;

class students {
    public String name;
    public void displayinfo(){
        System.out.println("Name :" + name);
    }
}

public class oop_07 {
    students s1 = new students();
}