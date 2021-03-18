package com.hemebiotech;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.Collator;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * 
 * @author marwa
 *         <p>
 *         the <b> SymptomsResult </b> class puts the elements of a dictionary
 *         in alphabetical order and creates a text file that lists theme.
 *         </p>
 */
public class SymptomsWriteResult {

	/**
	 * 
	 * <b>SymptomsFileResult</b> put the elements of the dictionary (symptoms) in
	 * alphabetical order and creates a text file from the "sortedMap" dictionary
	 * <b> key: Value </b>
	 * 
	 * @param MyMap
	 *                 <p>
	 *                 My dictionary
	 *                 </p>
	 * @param fileName
	 *                 <p>
	 *                 file name
	 *                 </p>
	 * @param encoding
	 *                 <p>
	 *                 file encoding type
	 *                 </p>
	 *
	 *
	 * @see SortedMap#keySet()
	 * @see SortedMap#get(Object)
	 * @see TreeMap#TreeMap(SortedMap)
	 * @see Collator#getInstance(Locale)
	 *
	 * @see PrintWriter#println(String)
	 * 
	 * 
	 */

	public void SymptomsFileResult(Map<String, Integer> MyMap, String fileName, String encoding) {

		SortedMap<String, Integer> sortedMap = new TreeMap<String, Integer>(Collator.getInstance(Locale.ENGLISH));

		sortedMap.putAll(MyMap); // Puts the dictionary in alphabetical order

		try {
			PrintWriter writer = new PrintWriter(fileName, encoding);// create a new file

			for (String mapkey : sortedMap.keySet()) {
				writer.println(mapkey + ": " + sortedMap.get(mapkey));
			}
			writer.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
