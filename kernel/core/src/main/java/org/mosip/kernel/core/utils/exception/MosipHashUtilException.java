package org.mosip.kernel.core.utils.exception;

import org.mosip.kernel.core.exception.BaseCheckedException;

/**
 * HashUtilException class wraps the Java BaseCheckedException class to provide
 * checkedexception code for HashUtil
 * 
 * @version 1.0 14 August 2018
 * @author Jyoti Prakash Nayak
 */
public class MosipHashUtilException extends BaseCheckedException {
	/** Serializable version Id. */
	private static final long serialVersionUID = 924722202110630628L;

	/**
	 * @param arg0
	 *            Error Code Corresponds to Particular Exception
	 * @param arg1
	 *            Message providing the specific context of the error.
	 */
	public MosipHashUtilException(String arg0, String arg1) {
		super(arg0, arg1);

	}
}
