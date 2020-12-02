package bgu.spl.mics.application.messages;
import bgu.spl.mics.Event;

import java.util.List;

public class AttackEvent implements Event<Boolean> {
	private final List<Integer> serials;
	private final int duration;

	//empty constructor to check send event functionality in Test.
	public AttackEvent(){
	    serials=null;
	    duration=0;
    }
	public AttackEvent(List<Integer> serials, int duration){
	    this.serials=serials;
	    this.duration=duration;
    }
}
