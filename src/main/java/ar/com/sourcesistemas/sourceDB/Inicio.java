package ar.com.sourcesistemas.sourceDB;

import java.util.ArrayList;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

public class Inicio {

	public Inicio(){
		

    	Box<String> box = new Box<String>();
    	box.setObject("martin");
    	Box<Integer> box2 = new Box<>();
    	box2.setObject(123);
    	List<Box> listBox = new ArrayList<>();
    	listBox.add(box);
    	listBox.add(box2);
    	listBox.forEach(System.out::println);
    
    	

	}
}
