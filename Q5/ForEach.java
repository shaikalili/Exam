package Q5;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class ForEach<T> implements Iterable<T> {

    private List<T> list;

    public ForEach(List<T> temp) {

        this.list = (List<T>)temp;
    }
    @Override
    public Iterator<T> iterator() {

        return list.iterator();
    }
}
