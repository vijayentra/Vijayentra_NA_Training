package com.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.model.State;

@Service
public class StateService {
	
	private ArrayList<State> stateList=new ArrayList<State>();
	
	
	public ArrayList<State> getStateList() {
		return stateList;
	}


	public void setStateList(ArrayList<State> stateList) {
		this.stateList = stateList;
	}


	public StateService()
	{
		State stateObj1=new State(1,"Kerala",34732356, "India");
		State stateObj2=new State(2,"Orissa",46172447, "India");
		State stateObj3=new State(3,"Tamil Nadu",80288487,"India");
		State stateObj4=new State(4,"Bahia",14930634, "Brazil");
		State stateObj5=new State(5,"Hamburg",1841179, "Germany");
 		State stateObj6=new State(6,"Karnataka",68159821, "India");
		State stateObj7=new State(7,"Rio de Janeiro",17366189, "Brazil");
		State stateObj8=new State(8,"Berlin",3644826, "Germany");
			
		stateList.add(stateObj1);
		stateList.add(stateObj2);
		stateList.add(stateObj3);
		stateList.add(stateObj4);
		stateList.add(stateObj5);
		stateList.add(stateObj6);
		stateList.add(stateObj7);
		stateList.add(stateObj8);		

	}
	
	
	public boolean addState(State stateObj)
	{
		return stateList.add(stateObj);
	}
	
	public State viewStateById(int stateId){
		State state = null;
		for(State s : getStateList()) {
			if(s.getStateId()==stateId) {
				state = s;
			}
		}
		return state;
	}

	public ArrayList<State> viewStateByCountry(String countryName)
	{
		ArrayList<State> list = new ArrayList<>();
		for(State s : getStateList()) {
			if(s.getCountryName()==countryName) {
				list.add(s);
			}
		}
		return list;
	}
	
	public boolean updateStatePopulation(int stateId,long population)
	{
		boolean flag = false;
		for(State s : getStateList()) {
			if(s.getStateId()==stateId) {
				s.setPopulation(population);
				flag = true;
			}
		}
		return flag;
	}
		
	public boolean deleteState(int stateId ) {
		boolean flag = false;
		ArrayList<State> list = getStateList();
		for(State s : getStateList()) {
			if(s.getStateId()==stateId) {
				list.remove(s);
				setStateList(list);
				flag =  true;
			}
		}
		return flag;		
	}
}