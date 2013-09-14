package net.sxig.samples.service;


import java.util.List;
public interface ApplicationService <T>{

	/**
	 * Generate some data for our application.
	 * @return
	 */
	public List<T> generateData();
}
