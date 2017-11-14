
import java.util.Comparator;

/**
 *
 * @author Marvin Dore
 */
public class ShapeComparator implements Comparator<ShapeIn3D>{

    public int compare(ShapeIn3D o1, ShapeIn3D o2) {
        if(o1.distnceFromOrigin() < o2.distnceFromOrigin())
        {
            return -1;
        }
        else if (o1.distnceFromOrigin() > o2.distnceFromOrigin())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
}
