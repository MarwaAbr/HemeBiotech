package com.hemebiotech;

import java.util.List;

/**
 * fAnything that will read symptom data from a source The important part is,
 * the return value from the operation, which is a list of strings, that may
 * contain many duplications
 * 
 * The implementation does not need to order the list
 * 
 */
public interface ISymptomsReader {
	/**
	 * If no data is available, return an empty List
	 * 
	 * @return a raw listing of all Symptoms obtained from a data source, duplicates
	 *         are possible/probable
	 */
	List<String> GetSymptoms();
}