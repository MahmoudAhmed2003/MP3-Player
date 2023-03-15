/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicplayer;
import java.util.LinkedList;
/**
 *
 * @author zain
 */
public class playerList {
    
   public node Start;
   public node End;


    public playerList() {

          Start=null;
          End=null;
    }

    public boolean isEmpty(){
        return (Start == null);
    }

    public boolean isNextEmpty() {
            return (Start.next == null);
    }

    public boolean isPreviousEmpty(){
            return (Start.previous == null);
    }

    public void add(Object o) {

            node newMus = new node(o);

            if( isEmpty() ) {
                End = newMus;

            }else {
                Start.previous = newMus;
                newMus.next = Start;
                Start = newMus;
            }
    }


    public Object getStart(){
            return Start.data;
    }



    public Object delete() {
        Object current = Start.data;

        if (Start.next == null){
            End = null;
        }else {
                Start.next.previous = null;


                Start = Start.next;
        }
        return current;
    }

    public void insertEnd(Object o) {
        node newMusicNode = new node(o);
        if (isEmpty()){
            Start = newMusicNode;
        }else{
                End.next = newMusicNode;
                newMusicNode.previous = End;
            }

            End = newMusicNode;
        }

    public Object getEnd(){
            return End.data;
        }



    public Object removeEnd(){

            Object current = End.data;
            if(Start.next == null){
                Start = null;
            } else {
                End.previous.next = null;
                End = End.previous;
            }
        return current;
        }
}


