
package musicplayer;

public class node {

    public Object data;
    public node next;
    public node previous;


    public node(Object o)
    {
        data = o;
        next=null;
        previous=null;
    }

    public String toString() {
        return data.toString();
    }


}

