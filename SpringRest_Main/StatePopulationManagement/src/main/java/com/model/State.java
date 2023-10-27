package com.model;

public class State {

		private int stateId;
		private String stateName;
		private long population;
		private String countryName;
		public State() {
			
		}
		public State(int stateId, String stateName, long population, String countryName) {
			this.stateId = stateId;
			this.stateName = stateName;
			this.population = population;
			this.countryName = countryName;
		}
		public int getStateId() {
			return stateId;
		}
		public void setStateId(int stateId) {
			this.stateId = stateId;
		}
		public String getStateName() {
			return stateName;
		}
		public void setStateName(String stateName) {
			this.stateName = stateName;
		}
		public long getPopulation() {
			return population;
		}
		public void setPopulation(long population) {
			this.population = population;
		}
		public String getCountryName() {
			return countryName;
		}
		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}		
}
