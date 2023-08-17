package com.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.exception.InvalidElectorException;
import com.model.ElectorDetails;

public class ElectionCommission {

	List<ElectorDetails> electorList = new ArrayList<>();

	public List<ElectorDetails> getElectorList() {
		return electorList;
	}

	public void setElectorList(List<ElectorDetails> ElectorList) {
		this.electorList = ElectorList;
	}

	public boolean validateElectorId(String id) throws InvalidElectorException  {
		if(id.matches("[A-Z]{3}[/][0-9]{7}"))
			return true;
		else
			throw new InvalidElectorException("Elector Id is invalid");
	}

	public ElectorDetails viewElectorDetailsByElectorId(String electorId) throws InvalidElectorException {
		if(electorList.size()==0){
			throw new InvalidElectorException("List is empty");
		}
		else {
			for(ElectorDetails b : electorList){
				if(b.getElectorId().equals(electorId))
					return b;
			}
			throw new InvalidElectorException("Elector Id is invalid");	
		}
	}

	public List<ElectorDetails> viewElectorsByGender(String gender) throws InvalidElectorException {
		if(electorList.size()==0){
			throw new InvalidElectorException("List is empty");
		}
		else {
			List<ElectorDetails> result = new ArrayList<>();
			for(ElectorDetails b : electorList){
				if(b.getGender().equals(gender))
					result.add(b);
			}
			return result;	
		}
	}

	public Map<String,List<ElectorDetails>>viewElectorsByAddressWise() throws InvalidElectorException {
		if(electorList.size()==0){
			throw new InvalidElectorException("List is empty");
		}
		else {
			Map<String,List<ElectorDetails>> result = new LinkedHashMap<>();

			for(ElectorDetails b : electorList){
				if(!result.containsKey(b.getAddress())){
					result.put(b.getAddress(),new ArrayList<ElectorDetails>());
				}
				List<ElectorDetails> temp=result.get(b.getAddress());
				temp.add(b);
				result.put(b.getAddress(), temp);			
			}
			return result;
		}
	}

	public Map<Integer,Integer> countTotalElectorsForEachAgeGroup() throws InvalidElectorException {
		if(electorList.size()==0){
			throw new InvalidElectorException("List is empty");
		}
		else {
			Map<Integer,Integer> result = new LinkedHashMap<>();

			for(ElectorDetails b : electorList){
				if(!result.containsKey(b.getAge())){
					result.put(b.getAge(),1);
				}
				else
				{
					int temp=result.get(b.getAge());					
					result.put(b.getAge(), temp+1);
				}				
			}
			return result;
		}
	}

	public int countElectorsByDateOfBirth(String dob) throws InvalidElectorException, ParseException {
		if(electorList.size()==0){
			throw new InvalidElectorException("List is empty");
		}
		else {
			int count=0;
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
			for(ElectorDetails b : electorList){
				
				if(b.getDateOfBirth().equals(sdf.parse(dob)))
					count++;
			}
			return count;
		}
	}


}