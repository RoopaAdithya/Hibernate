/**
 * 
 */
package com.roopa;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author pc
 *
 */
@Component
@Qualifier("cbook")
public class CBook implements Book {

	/* (non-Javadoc)
	 * @see com.roopa.Book#getBookIngo()
	 */
	public void getBookIngo() {


		System.out.println("C Book");
	}

}
