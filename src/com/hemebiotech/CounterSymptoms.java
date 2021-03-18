
package com.hemebiotech;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author marwa
 * 
 * 
 * 
 *         <p>
 *         Counter is the main class for trend analysis allowing:
 *         </p>
 *         <ul>
 *         <li><b>read the symptoms</b> from a text file</li>
 *         <li><b>count </b> the number of occurrences of each symptom</li>
 *         <li><b>create a new text file </b> that lists each symptom in <b>
 *         alphabetical order </b>, followed by the number of occurrences</li>
 *         </ul>
 * 
 * 
 */
public class CounterSymptoms {
	/**
	 * Calls the ReadSymptoms class to read symptoms from "Symptoms.txt" and count
	 * the occurrences, then calls the SymptomsResult class to put the symptoms in
	 * alphabetical order and list them in a file "result.out".
	 * 
	 * @param args main program parameters
	 * 
	 * @see ReadSymptoms#ReadSymptoms(String)
	 * 
	 * @see ReadSymptoms#GetSymptoms()
	 * 
	 * @see SymptomsWriteResult#SymptomsFileResult(Map, String, String)
	 */

	public static void main(String[] args) {

		ReadSymptoms Reads = new ReadSymptoms("Symptoms.txt"); // reading symptoms

		List<String> liste = Reads.GetSymptoms(); // symptom list

		Set<String> unique = new HashSet<String>(liste); // list of symptoms without recurrence
		Map<String, Integer> MyMap = new HashMap<String, Integer>();// dictionary (symptom, occurrences number)

		for (String elem : unique) {

			int i = Collections.frequency(liste, elem);

			MyMap.put(elem, i);
		}

		SymptomsWriteResult result = new SymptomsWriteResult();// writing symptoms in alphabetical order

		result.SymptomsFileResult(MyMap, "result.out.txt", "UTF-8");
		// "C:\\Users\\marwa\\eclipse-workspace\\HemebiotechRescue\\result.out.txt"
	}

}
